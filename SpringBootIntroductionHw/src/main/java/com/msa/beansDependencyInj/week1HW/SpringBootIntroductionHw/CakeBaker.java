package com.msa.beansDependencyInj.week1HW.SpringBootIntroductionHw;

import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    Frosting frosting;
    Syruping syruping;

    public CakeBaker(Frosting frosting, Syruping syruping) {
        this.frosting = frosting;
        this.syruping = syruping;
    }

    public void bakeCake(){
        frosting.frost();
        syruping.syrup();
    }

}
