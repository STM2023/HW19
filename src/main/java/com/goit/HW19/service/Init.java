package com.goit.HW19.service;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Init {
     @Autowired
    private SumCalculator sumCalculator;

   // public Init (SumCalculator sumCalculator){
    //    this.sumCalculator=sumCalculator;
    //}
    @PostConstruct
    private void init() {
        log.info("---POST CONSTRUCT");
        int var;
        var=  SumCalculator.sum(3);
    }

}
