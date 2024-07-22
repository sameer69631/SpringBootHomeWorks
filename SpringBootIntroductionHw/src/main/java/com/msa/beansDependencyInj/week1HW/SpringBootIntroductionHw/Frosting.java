package com.msa.beansDependencyInj.week1HW.SpringBootIntroductionHw;

import org.springframework.stereotype.Component;

@Component
public class Frosting {

    FrostingType frostingType;

    public Frosting(FrostingType frostingType){
        this.frostingType=frostingType;
    }

    public void frost(){
        frostingType.getFrostingType();
    }

}
