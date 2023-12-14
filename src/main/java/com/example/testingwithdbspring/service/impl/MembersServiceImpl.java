package com.example.testingwithdbspring.service.impl;

import com.example.testingwithdbspring.entities.MembersTestEntity;
import com.example.testingwithdbspring.entities.QMembersTestEntity;
import com.example.testingwithdbspring.repository.MembersRepository;
import com.example.testingwithdbspring.service.MembersService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContextType;
import org.springframework.beans.factory.annotation.Autowired;
import com.querydsl.jpa.impl.JPAQuery;

public class MembersServiceImpl implements MembersService {

    @Autowired
    private EntityManager em;

    @Override
    public MembersTestEntity findMembers(Long userId) {
        QMembersTestEntity membersTestEntity = QMembersTestEntity.membersTestEntity;

        return new JPAQuery<MembersTestEntity>(em)
                .select(membersTestEntity)
                .from(membersTestEntity)
                .where(membersTestEntity.memberId.eq(userId))
                .fetchFirst();
    }

}
