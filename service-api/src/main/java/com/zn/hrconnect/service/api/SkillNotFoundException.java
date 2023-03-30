package com.zn.hrconnect.service.api;

public class SkillNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -3891534644498426670L;

    public SkillNotFoundException(String accountId) {
        super("No such account with id: " + accountId);
    }
}

