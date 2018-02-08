package com.sht.exercise.demo20180208.thread;

public class B {
	
	public synchronized void bar(A a) {
		System.out.println("当前线程名：\t"+Thread.currentThread().getName()+"\t进入了B实例的bar方法");
		try {
			Thread.sleep(200);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("当前线程名：\t"+Thread.currentThread().getName()+"\t试图进入A实例的last方法");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("进入到B实例的last方法");
	}

}
