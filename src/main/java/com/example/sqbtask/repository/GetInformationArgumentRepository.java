package com.example.sqbtask.repository;

import com.example.sqbtask.entity.GetInformationArgumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GetInformationArgumentRepository extends JpaRepository<GetInformationArgumentEntity,Long > {

}
