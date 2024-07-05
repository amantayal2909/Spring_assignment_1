package com.week1.assignment.practice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup-type" ,havingValue = "strawberry")
public class StrawbeerySyrup implements Syrup{
    @Override
    public String getSyrup() {
        return "strwberrysyrup";
    }
}
