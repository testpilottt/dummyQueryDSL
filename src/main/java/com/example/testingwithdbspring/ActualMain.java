package com.example.testingwithdbspring;

import com.example.testingwithdbspring.entities.MembersTestEntity;
import com.example.testingwithdbspring.entities.QMembersTestEntity;
import com.querydsl.jpa.impl.JPAQuery;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;
import java.sql.SQLException;
@Component
public class ActualMain {

    @Autowired
    private EntityManager em;

    public void executeMainMethod() throws SQLException {
        Optional<MembersTestEntity> lastestAddressInfo =
                Optional.ofNullable(findMembers(5L));
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
