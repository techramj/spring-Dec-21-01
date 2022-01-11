package com.easylearning;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Car extends Vehicle implements BeanNameAware, BeanFactoryAware, 
BeanPostProcessor, InitializingBean, DisposableBean{
	
	private String name;
	
	public Car() {
		System.out.println("car default constructor");
	}

	public Car(String name) {
		System.out.println("car parameterized constructor");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Name property class");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("beanName: "+beanName);
		
	}

	@Override
	public void setBeanFactory(BeanFactory factory) throws BeansException {
		System.out.println("BeanFatorAware.setBeanFactory called");
		System.out.println(factory.containsBean("car"));
		System.out.println(factory.isSingleton("car"));
		System.out.println("--------------------------------------------");
		
	}
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor.postProcessAfterInitialization called");
		System.out.println("bean: "+bean+"    beanName: "+beanName);
		
		System.out.println("class name: "+bean.getClass());
		System.out.println("------------------------------------");
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("BeanPostProcessor.postProcessBeforeInitialization called");
		System.out.println("bean: "+bean+"    beanName: "+beanName);
		/*
		 * if(bean instanceof Car) { Car c=(Car)bean;
		 * c.setName(c.getName().toLowerCase()); }
		 */
		System.out.println("class name: "+bean.getClass());
		System.out.println("------------------------------------");
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet called");
		System.out.println("-------------------------------------------------");
		
	}
	
	public void myInit() {
		System.out.println("custom init method called");
		System.out.println("--------------------------------------");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destory method called");
	}
	
	public void mydestory() {
		System.out.println("custom destroy method called");
	}

	
	
}
