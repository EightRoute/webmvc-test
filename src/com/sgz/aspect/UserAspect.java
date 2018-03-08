package com.sgz.aspect;

import com.webmvc.annotation.After;
import com.webmvc.annotation.AfterReturning;
import com.webmvc.annotation.AfterThrowing;
import com.webmvc.annotation.Aspect;
import com.webmvc.annotation.Before;
import com.webmvc.annotation.Pointcut;

@Aspect
public class UserAspect {
	@Pointcut("execution(* com.sgz.service.impl.UserServiceImpl.say())")
    public void pointcutOne() {
    }
    @Before("pointcutOne()")
    public void before1(){
        System.out.println("----before1----");
    }

    @Before("execution(* com.sgz.service.impl.UserServiceImpl.say())")
    public void before2() {
        System.out.println("----before2----");
    }
    
    @After("pointcutOne()")
    public void after() {
        System.out.println("----after----");
    }

    @AfterReturning("pointcutOne()")
    public void afterReturning(Object result) {
        System.out.println("---afterReturning---- result is " + result);
    }


    @AfterThrowing("pointcutOne()")
    public void afterThrowing(Exception e) {
        System.out.println("---afterThrowing---- Exception is " + e);
    }
}
