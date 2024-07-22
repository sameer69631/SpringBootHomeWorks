package com.msa.beansDependencyInj.week1HW.SpringBootIntroductionHw;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootIntroductionApplication implements CommandLineRunner {

	CakeBaker cakeBaker;

	public SpringBootIntroductionApplication(CakeBaker cakeBaker){
		this.cakeBaker=cakeBaker;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIntroductionApplication.class, args);

	}

	public void run(String[] args){
		cakeBaker.bakeCake();
	}

}
