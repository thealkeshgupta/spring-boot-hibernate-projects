package com.alkeshgupta.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class MyApiAnalyticsAspect {

    @Before("com.alkeshgupta.aopdemo.aspect.AopExpressions.myPackagePointcut()")
    public void performAPIAnalytics() {
        System.out.println("\n=====>>>> Performing API analytics\n");
    }
}
