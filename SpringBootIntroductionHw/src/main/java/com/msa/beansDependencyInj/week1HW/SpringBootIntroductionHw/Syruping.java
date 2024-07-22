package com.msa.beansDependencyInj.week1HW.SpringBootIntroductionHw;

import org.springframework.stereotype.Component;

@Component
public class Syruping {

    SyrupingType syrupingType;

    public Syruping(SyrupingType syrupingType){
        this.syrupingType=syrupingType;
    }

    public void syrup(){
        syrupingType.getSyrupingType();
    }

}
