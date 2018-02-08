package com.sht.exercise.demo20180208.thread;

public class A {
	
	public synchronized void foo(B b) {
		System.out.println("当前线程名：\t"+Thread.currentThread().getName()+"\t进入了A实例的foo方法");
		try {
			Thread.sleep(200);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("当前线程名：\t"+Thread.currentThread().getName()+"\t试图进入B实例的last方法");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("进入到A实例的last方法");
	}
}
