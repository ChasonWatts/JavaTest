package com.wc.reflect;

import com.wc.proxy.dynamicProxy.ConcreteClass;

public class ReflectionExample {
	
	public static void main(String[] args) {
		Reflection ref = new Reflection();
		ConcreteClass cc = new ConcreteClass();
		ref.getAllMethods(cc);
	}

}
