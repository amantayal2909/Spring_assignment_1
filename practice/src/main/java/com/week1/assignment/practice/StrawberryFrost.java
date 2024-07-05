package com.week1.assignment.practice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frost-type" ,havingValue = "strawberry")
public class StrawberryFrost implements Frosting{
    @Override
    public String getFrostingType() {
        return "StrawberryFrost";
    }
}
