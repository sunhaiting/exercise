package com.sht.exercise.demo20180208.thread;

public class B {
	
	public synchronized void bar(A a) {
		System.out.println("��ǰ�߳�����\t"+Thread.currentThread().getName()+"\t������Bʵ����bar����");
		try {
			Thread.sleep(200);
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("��ǰ�߳�����\t"+Thread.currentThread().getName()+"\t��ͼ����Aʵ����last����");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("���뵽Bʵ����last����");
	}

}
