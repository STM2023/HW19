package com.goit.HW19.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SumCalculator {
    public static int sum(int n) {
        //System.out.println("Method sum n= "+n);
        log.info("Method sum n= "+n);
        if(n>0 ) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            //System.out.println("sum= " + sum);
            log.info("sum= " + sum);
            return sum;
        } else {
            throw new IllegalArgumentException("argument is incorect");
        }
    }
}
