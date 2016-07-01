package com.kaishengit.apo;

public class MyAdvice {
    public void beforeAdvice(){
        System.out.println("前置通知~~~~");
    }
    public void afterRutuningAdvice(Object result){
        System.out.println("后置通知~~~"+result);
    }
    public void exceptionAdvice(Exception e){
        System.out.println("异常通知"+e.getMessage());
    }
    public void finallyAdvice(){
        System.out.println("最终通知");
    }

}
