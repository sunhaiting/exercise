package com.sht.exercise.demo20180208.thread;

public class A {
	
	public synchronized void foo(B b) {
		System.out.println("��ǰ�߳�����\t"+Thread.currentThread().getName()+"\t������Aʵ����foo����");
		try {
			Thread.sleep(200);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("��ǰ�߳�����\t"+Thread.currentThread().getName()+"\t��ͼ����Bʵ����last����");
		b.last();
	}
	
	public synchronized void last() {
		System.out.println("���뵽Aʵ����last����");
	}
}
