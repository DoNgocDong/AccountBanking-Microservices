package com.ngocd.microaccountservice.entities.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AccountTypes {
    CHECKING(Values.CHECKING),
    CREDIT(Values.CREDIT),
    SAVING(Values.SAVING);

    private final String value;

    public static class Values {
        public static final String CHECKING= "CHECKING";
        public static final String CREDIT= "CREDIT";

        public static final String SAVING= "SAVING";
    }
}
