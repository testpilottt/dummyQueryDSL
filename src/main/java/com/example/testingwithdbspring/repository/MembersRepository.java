package com.example.testingwithdbspring.repository;

import com.example.testingwithdbspring.entities.MembersTestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends JpaRepository<MembersTestEntity, Long> {

}
