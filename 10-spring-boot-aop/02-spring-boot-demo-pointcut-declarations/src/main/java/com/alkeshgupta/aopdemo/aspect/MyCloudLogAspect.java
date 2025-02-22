package com.alkeshgupta.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyCloudLogAspect {

    @Before("com.alkeshgupta.aopdemo.aspect.AopExpressions.myPackageNoGetterSetterPointCut()")
    public void logToCloud() {
        System.out.println("\n=====>>>> Logging to Cloud\n");
    }
}
