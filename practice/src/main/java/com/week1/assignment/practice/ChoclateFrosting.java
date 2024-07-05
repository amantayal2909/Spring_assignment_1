package com.week1.assignment.practice;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "frost-type" ,havingValue = "chocolate")
public class ChoclateFrosting implements Frosting{

    @Override
    public String getFrostingType() {
        return "ChoclateFrost";
    }
}
