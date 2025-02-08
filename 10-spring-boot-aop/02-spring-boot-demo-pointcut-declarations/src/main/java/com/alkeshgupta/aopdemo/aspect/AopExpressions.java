package com.alkeshgupta.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopExpressions {

    // create a pointcut to include packager
    @Pointcut("execution(* com.alkeshgupta.aopdemo.dao.*.*(..))")
    public void myPackagePointcut() {}

    // create a pointcut for getter methods
    @Pointcut("execution(* com.alkeshgupta.aopdemo.dao.*.get*(..))")
    public void myGetterPointcut() {}

    // create a pointcut for setter methods
    @Pointcut("execution(* com.alkeshgupta.aopdemo.dao.*.set*(..))")
    public void mySetterPointcut() {}

    // create a pointcut: to include package ... exclude getter/setter
    @Pointcut("myPackagePointcut() && !(myGetterPointcut() || mySetterPointcut())")
    public void myPackageNoGetterSetterPointCut() {}

}
