package com.sht.exercise.demo20180208.thread;

public class DeadLock implements Runnable {
	
	A a = new A();
	B b = new B();
	
	public void init() {
		Thread.currentThread().setName("���߳�");
		a.foo(b);
		System.out.println("�������߳�֮��");
	}
	
	@Override
	public void run() {
		Thread.currentThread().setName("���߳�");
		b.bar(a);
		System.out.println("���븱�߳�֮��");
	}
	
	public static void main(String[] args) {
		DeadLock lock = new DeadLock();
		new Thread(lock).start();
		lock.init();
	}

}
