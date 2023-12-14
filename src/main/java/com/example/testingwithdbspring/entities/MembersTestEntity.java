package com.example.testingwithdbspring.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MembersTestEntity {

    @Id
    @GeneratedValue
    private Long memberId;
    private String firstName;
    private String lastName;
    private String password;
}
