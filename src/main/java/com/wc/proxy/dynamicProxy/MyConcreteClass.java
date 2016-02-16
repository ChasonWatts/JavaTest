package com.wc.proxy.dynamicProxy;

public class MyConcreteClass implements TargetInterface {

	public MyConcreteClass(){
		System.out.println("我自己的类的构造函数----");
	}
	
	@Override
	public int targetMethodA(int number) {
		System.out.println("我自己的类调用方法:targetMethodA...");  
        System.out.println("我来操作-打印数字:"+number);  
        System.out.println("我自己的类调用方法:targetMethodA...");  
        return number;
	}

	@Override
	public int targetMethodB(int number) {
		System.out.println("我自己的类调用方法:targetMethodB...");  
        System.out.println("我来操作-打印数字:"+number);  
        System.out.println("我自己的类调用方法:targetMethodB...");  
        return number;
	}

}
