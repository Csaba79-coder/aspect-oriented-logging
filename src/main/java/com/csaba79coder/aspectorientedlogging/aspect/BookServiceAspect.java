package com.csaba79coder.aspectorientedlogging.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BookServiceAspect {

    @Before("execution(public String getName())")
    public void getNameAdvice() {
        System.out.println("Execution Advice on getName()");
    }

    @Before("execution(* com.csaba79coder.aspectorientedlogging.book.service.*.get*())")
    public void getAllAdvice() {
        System.out.println("Service method getter called");
    }
}
