package com.msa.beansDependencyInj.week1HW.SpringBootIntroductionHw;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "sam.env",havingValue = "strawberryCake")
public class StrawberryFlavour implements FrostingType,SyrupingType{

    public void getFrostingType(){
        System.out.println("frosting strawberry flavour cake");
    }

    public void getSyrupingType(){
        System.out.println("syruping strawberry flavour cake");
    }

}
