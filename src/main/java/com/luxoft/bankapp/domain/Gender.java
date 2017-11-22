package com.luxoft.bankapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Gender {
    MALE("Mr."), FEMALE("Ms.");

    @Getter
    private String greeting;
}
