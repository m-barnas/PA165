package cz.muni.fi.pa165;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import javax.inject.Named;

@Named
@Aspect
public class ExecutionAspect {

    @Around("execution(public * *(..))")
    public Object logMethodCall(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.nanoTime();
        System.err.println("Calling method start: " + joinPoint.getSignature());
        Object result = joinPoint.proceed();
        System.err.println("Method execution finished: " + joinPoint.getSignature());
        long end = System.nanoTime();
        System.out.println((end - start) / Math.pow(10, 9));
        return result;
    }
}