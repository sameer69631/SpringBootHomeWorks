package com.msa.beansDependencyInj.week1HW.SpringBootIntroductionHw;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "sam.env",havingValue = "chocolateCake")
public class ChocolateFlavour implements FrostingType,SyrupingType{

    public void getFrostingType(){
        System.out.println("frosting chocolate flavour cake");
    }

    public void getSyrupingType(){
        System.out.println("syruping chocolate flavour cake");
    }

}
