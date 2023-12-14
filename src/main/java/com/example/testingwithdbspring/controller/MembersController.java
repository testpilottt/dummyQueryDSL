package com.example.testingwithdbspring.controller;

import com.example.testingwithdbspring.entities.MembersTestEntity;
import com.example.testingwithdbspring.entities.QMembersTestEntity;
import com.example.testingwithdbspring.payloads.request.MembersRequest;
import com.example.testingwithdbspring.payloads.response.CommonResponse;
import com.example.testingwithdbspring.service.MembersService;
import com.example.testingwithdbspring.service.impl.MembersServiceImpl;
import com.querydsl.jpa.impl.JPAQuery;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Transactional
@RestController
@RequestMapping("/learninghere")
public class MembersController {

    @Autowired
    private EntityManager em;

    private MembersService membersService;

    @GetMapping("/membersTest/{userId}")
    public ResponseEntity<MembersTestEntity> memberLoginByUsernamePassword(@PathVariable Long userId) {

        MembersTestEntity member = findMembers(userId);

        return new ResponseEntity<>(member, HttpStatus.ACCEPTED);
    }

    public MembersTestEntity findMembers(Long userId) {
        QMembersTestEntity membersTestEntity = QMembersTestEntity.membersTestEntity;

        return new JPAQuery<MembersTestEntity>(em)
                .select(membersTestEntity)
                .from(membersTestEntity)
                .where(membersTestEntity.memberId.eq(1L))
                .fetchFirst();
    }
}
