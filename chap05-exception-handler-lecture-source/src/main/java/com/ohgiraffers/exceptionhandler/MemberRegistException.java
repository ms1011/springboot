package com.ohgiraffers.exceptionhandler;

import org.springframework.web.bind.annotation.GetMapping;

public class MemberRegistException extends Exception {

    public MemberRegistException(String message) {
        super(message);
    }
}

