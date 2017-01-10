package com.example.model;

import javax.validation.Valid;

public class B {

    @Valid
    private C c = new C();

    public B() {
        System.out.println("b");
    }

    public C getC() {
        return c;
    }
}
