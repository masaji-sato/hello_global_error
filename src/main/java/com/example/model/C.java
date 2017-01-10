package com.example.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class C {

    @Size(min = 4)
    @Pattern(regexp = "abcd")
    private String value = "c";

    @Size(min = 4)
    @Pattern(regexp = "abcd")
    private String value2 = "c";

    public C() {
        System.out.println("c");
    }

    public String getValue() {
        return value;
    }

    public String getValue2() {
        return value2;
    }
}
