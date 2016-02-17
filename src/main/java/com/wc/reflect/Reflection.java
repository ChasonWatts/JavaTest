package com.wc.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
	
	/**
	 * 
	 * @Description: 得到某个对象的公共属性
	 * @param owner
	 * @param fieldName
	 * @return
	 * @throws Exception Object
	 * @author: chao.wen<a href="mailto:chao.wen@haiwan.com">chao.wen</a>
	 * @since: chao.wen-2016年2月17日
	 *
	 */
	public Object getProperty(Object owner, String fieldName) throws Exception {
		
		Class ownerClass = owner.getClass();
		Field field = ownerClass.getField(fieldName);
		Object property = field.get(owner);
		
		return property;
	}
	
	/**
	 * 
	 * @Description: 得到某类的静态公共属性
	 * @param className
	 * @param fieldName
	 * @return
	 * @throws Exception Object
	 * @author: chao.wen<a href="mailto:chao.wen@haiwan.com">chao.wen</a>
	 * @since: chao.wen-2016年2月17日
	 *
	 */
	public Object getStaticProperty(String className, String fieldName) throws Exception {
		
		Class ownerClass = Class.forName(className);
		Field field = ownerClass.getField(fieldName);
		Object property = field.get(ownerClass);
		
		return property;
	}

	/**
	 * 
	 * @Description: 执行某对象方法
	 * @param owner
	 * @param methodName
	 * @param args
	 * @return
	 * @throws Exception Object
	 * @author: chao.wen<a href="mailto:chao.wen@haiwan.com">chao.wen</a>
	 * @since: chao.wen-2016年2月17日
	 *
	 */
	public Object invokeMethod(Object owner, String methodName, Object[] args) throws Exception {

		Class ownerClass = owner.getClass();
		Class[] argsClass = new Class[args.length];
		for (int i = 0, j = args.length; i < j; i++) {
			argsClass[i] = args[i].getClass();
		}
		Method method = ownerClass.getMethod(methodName, argsClass);
		return method.invoke(owner, args);
	}

	/**
	 * 
	 * @Description: 执行某类的静态方法
	 * @param className 类名
	 * @param methodName 方法名
	 * @param args
	 * @return
	 * @throws Exception Object
	 * @author: chao.wen<a href="mailto:chao.wen@haiwan.com">chao.wen</a>
	 * @since: chao.wen-2016年2月17日
	 *
	 */
	public Object invokeStaticMethod(String className, String methodName, Object[] args) throws Exception {
		
		Class ownerClass = Class.forName(className);
		Class[] argsClass = new Class[args.length];
		for (int i = 0, j = args.length; i < j; i++) {
			argsClass[i] = args[i].getClass();
		}
		Method method = ownerClass.getMethod(methodName, argsClass);

		return method.invoke(null, args);
	}

	/**
	 * 
	 * @Description: 新建实例
	 * @param className 类名
	 * @param args 构造函数的参数
	 * @return
	 * @throws Exception Object
	 * @author: chao.wen<a href="mailto:chao.wen@haiwan.com">chao.wen</a>
	 * @since: chao.wen-2016年2月17日
	 *
	 */
	public Object newInstance(String className, Object[] args) throws Exception {
		
		Class newoneClass = Class.forName(className);
		Class[] argsClass = new Class[args.length];
		for (int i = 0, j = args.length; i < j; i++) {
			argsClass[i] = args[i].getClass();
		}
		Constructor cons = newoneClass.getConstructor(argsClass);

		return cons.newInstance(args);
	}

	/**
	 * 
	 * @Description: 是不是某个类的实例
	 * @param obj 实例
	 * @param cls 类
	 * @return boolean
	 * @author: chao.wen<a href="mailto:chao.wen@haiwan.com">chao.wen</a>
	 * @since: chao.wen-2016年2月17日
	 *
	 */
	public boolean isInstance(Object obj, Class cls) {
		return cls.isInstance(obj);
	}

	/**
	 * 
	 * @Description: 返回指定数组对象中索引组件的值
	 * @param array 数组
	 * @param index 索引
	 * @return Object
	 * @author: chao.wen<a href="mailto:chao.wen@haiwan.com">chao.wen</a>
	 * @since: chao.wen-2016年2月17日
	 *
	 */
	public Object getByArray(Object array, int index) {
		return Array.get(array, index);
	}
	
	/**
	 * 
	 * @Description: 获得该类的所有方法
	 * @param obj 
	 * @author: chao.wen<a href="mailto:chao.wen@haiwan.com">chao.wen</a>
	 * @since: chao.wen-2016年2月17日
	 *
	 */
	public void getAllMethods(Object obj){
		Method[] methods = obj.getClass().getDeclaredMethods();
		for(int i = 0; i < methods.length; i++){
			System.out.println(methods[i].toString());
		}
	}
}
