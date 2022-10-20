package com.example.sqbtask.repository;

import com.example.sqbtask.entity.WalletEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WalletRepository extends JpaRepository<WalletEntity, Long> {
    Optional<WalletEntity> findByWalletNumber(String walletNumber);
    Optional<WalletEntity> findByPhone(String phone);
}
