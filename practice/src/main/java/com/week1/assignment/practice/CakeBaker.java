package com.week1.assignment.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    @Autowired
    Frosting f;

    @Autowired
    Syrup s;

   public void bakecake(){
       System.out.println(f.getFrostingType());
       System.out.println(s.getSyrup());

   }
}
