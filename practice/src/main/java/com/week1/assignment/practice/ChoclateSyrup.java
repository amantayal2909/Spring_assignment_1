package com.week1.assignment.practice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "syrup-type" ,havingValue = "chocolate")
public class ChoclateSyrup implements Syrup{

    @Override
    public String getSyrup() {
        return "choclatesyrup";
    }
}
