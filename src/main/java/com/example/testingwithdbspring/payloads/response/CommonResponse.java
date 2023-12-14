package com.example.testingwithdbspring.payloads.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponse {
    private String message;
    private boolean isValid = true;

    public CommonResponse(String message) {
        this.message = message;
    }
}
