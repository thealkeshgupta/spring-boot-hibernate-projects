package com.alkeshgupta.aopdemo.aspect;

import com.alkeshgupta.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(3)
public class MyDemoLoggingAspect {

    @Around("execution(* com.alkeshgupta.aopdemo.service.*.getFortune(..))")
    public Object aroundGetFortuneAdvice(ProceedingJoinPoint theProceedingJoinPoint) throws Throwable {

        // print out method we are advising on
        String method = theProceedingJoinPoint.getSignature().toShortString();
        System.out.println("\n====>>>> Executing @Around on method: " + method);

        // get begin timestamp
        long begin = System.currentTimeMillis();

        // now, let's execute the method
        Object result = null;

        try {
            result = theProceedingJoinPoint.proceed();
        }
        catch (Exception theException) {

            // log the exception
            System.out.println(theException.getMessage());

            // give user a custom message
            // result = "No worries, your private AOP helicopter is on the way!";
            //
            // OR
            //
            // rethrow the exception
               throw theException;
        }

        // get end timestamp
        long end = System.currentTimeMillis();

        // compute duration and display it
        long duration = end - begin;
        System.out.println("\n====>>>> Duration: " + (duration/1000.0) + " seconds");

        return result;
    }

    @After("execution(* com.alkeshgupta.aopdemo.dao.AccountDAO.findAccounts(..))")
    public void afterFinallyFindAccountsAdvice(JoinPoint theJoinPoint) {

        // print out which method we are advising on
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n====>>>> Executing @After (finally) on method: " + method);

    }

    @AfterThrowing(
            pointcut = "execution(* com.alkeshgupta.aopdemo.dao.AccountDAO.findAccounts(..))",
            throwing = "theException"
    )
    public void afterThrowingFindAccountsAdvice(JoinPoint theJoinPoint, Throwable theException) {

        // print out which method we are advising on
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n====>>>> Executing @AfterThrowing on method: " + method);

        // log the exception
        System.out.println("\n====>>>> The exception is: " + theException);
    }

    // add a new advice for@AfterReturning on the findAccounts method
    @AfterReturning(
            pointcut = "execution(* com.alkeshgupta.aopdemo.dao.AccountDAO.findAccounts(..))",
            returning = "myMethodResult"
    )
    public void afterReturningFindAccountsAdvice(JoinPoint theJoinPoint, List<Account> myMethodResult) {

        // print out which method we are advising on
        String method = theJoinPoint.getSignature().toShortString();
        System.out.println("\n====>>>> Executing @AfterReturning on method: " + method);

        // print out the results of the method called
        System.out.println("\n====>>>> result is: " + myMethodResult);

        // let's post-process the data ... let's modify it

        // convert the account names to uppercase
        convertAccountNameToUpperCase(myMethodResult);

        // print out the results of the method called
        System.out.println("\n====>>>> result is: " + myMethodResult);
    }

    private void convertAccountNameToUpperCase(List<Account> result) {

        // loop through accounts
        for(Account tempAccount : result) {
            // get uppercase version of name
            String theUpperName = tempAccount.getName().toUpperCase();

            // update the name on the account
            tempAccount.setName((theUpperName));
        }

    }

    @Before("com.alkeshgupta.aopdemo.aspect.AopExpressions.myPackageNoGetterSetterPointCut()")
    public void beforeAddAccountAdvice(JoinPoint theJoinPoint) {

        System.out.println("\n=====>>>> Executing @Before advice on addAccount()");

        // display the method signature
        MethodSignature methodSignature = (MethodSignature) theJoinPoint.getSignature();
        System.out.println("Method: " + methodSignature);

        // display method arguments
        Object[] args = theJoinPoint.getArgs();

        for(Object tempArg : args){
            System.out.println(tempArg);

            if(tempArg instanceof Account) {

                // downcast and print Account specific stuff
                Account theAccount = (Account) tempArg;
                System.out.println("account name: " + theAccount.getName());
                System.out.println("account level: " + theAccount.getLevel());
            }
        }

    }

}
