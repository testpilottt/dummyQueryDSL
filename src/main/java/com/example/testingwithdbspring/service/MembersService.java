package com.example.testingwithdbspring.service;

import com.example.testingwithdbspring.entities.MembersTestEntity;
import com.example.testingwithdbspring.payloads.request.MembersRequest;
import com.example.testingwithdbspring.payloads.response.CommonResponse;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface MembersService {
    MembersTestEntity findMembers(Long userId);

}
