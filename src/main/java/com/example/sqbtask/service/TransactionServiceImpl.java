package com.example.sqbtask.service;

import com.example.sqbtask.datatype.*;
import com.example.sqbtask.entity.WalletEntity;
import com.example.sqbtask.exception.customexception.IncorrectCredentialsException;
import com.example.sqbtask.exception.customexception.InvalidWalletOrPhone;
import com.example.sqbtask.exception.customexception.WalletNotFound;
import com.example.sqbtask.repository.WalletRepository;
import com.example.sqbtask.utils.Utils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class TransactionServiceImpl implements TransactionService{

    private final WalletRepository walletRepository;
    /**
     * @param performTransactionArgument
     * @return
     */
    @Override
    public PerformTransactionResult performTransaction(PerformTransactionArgument performTransactionArgument) {
        String phone = performTransactionArgument.getParameters().getOrDefault("phone", "");
        String walletNumber = performTransactionArgument.getParameters().getOrDefault("walletNumber", "");

        boolean isWalletNumberCorrect = Utils.isWalletNumberCorrect(walletNumber);
        boolean isPhoneCorrect = Utils.isPhoneCorrect(phone);

        if ((!isWalletNumberCorrect && !isPhoneCorrect)) {
            throw new InvalidWalletOrPhone("phone number or wallet number is invalid");
        }
        // either wallet number or phone is valid:
        if (isWalletNumberCorrect) {
            WalletEntity walletEntityByWalletNumber = walletRepository
                                                        .findByWalletNumber(walletNumber)
                                                        .orElseThrow(() -> new WalletNotFound("wallet not found with the given wallet number"));
            if(!(performTransactionArgument.getUsername().equals(walletEntityByWalletNumber.getUsername())
                    && performTransactionArgument.getPassword().equals(walletEntityByWalletNumber.getPassword()))) {
                throw new IncorrectCredentialsException("username or password does not match to the wallet");
            }
            walletEntityByWalletNumber.setBalance(walletEntityByWalletNumber.getBalance() + performTransactionArgument.getAmount());
            walletRepository.save(walletEntityByWalletNumber);
        } else {
            // use phone to proceed with transaction
            WalletEntity walletEntityByPhone = walletRepository
                                                        .findByPhone(phone)
                                                        .orElseThrow(() -> new WalletNotFound("wallet not found with the given phone number"));

            if(!(performTransactionArgument.getUsername().equals(walletEntityByPhone.getUsername())
                    && performTransactionArgument.getPassword().equals(walletEntityByPhone.getPassword()))) {
                throw new IncorrectCredentialsException("username or password does not match to the wallet");
            }
            walletEntityByPhone.setBalance(walletEntityByPhone.getBalance() + performTransactionArgument.getAmount());
            walletRepository.save(walletEntityByPhone);
        }
        return new PerformTransactionResult(List.of(new GenericParam("status", "success")), 1);
    }

    /**
     * @param checkTransactionRequest
     * @return
     */
    @Override
    public CheckTransactionResponse checkTransaction(CheckTransactionRequest checkTransactionRequest) {
        return null; // Not implemented
    }

    /**
     * @param cancelTransactionRequest
     * @return
     */
    @Override
    public CancelTransactionResponse cancelTransaction(CancelTransactionRequest cancelTransactionRequest) {
        return null; // Not implemented
    }
}
