package com.gagechan.base;

/**
 * @program: seckilling
 *
 * @author: GageChan
 *
 * @create: 2018年07月20日 12:37
 *
 * @description:
 **/
public class lock {

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			new Thread(() -> {
				Count c = new Count();
				c.count();
			}).start();
		}
		System.out.println("end");
	}
}

class Count {
	int num;
	public void count() {
		for (int i = 1; i <= 10; i++) {
			num += i;
		}
		if (num != 55)
		System.out.println(Thread.currentThread().getName() + "---"+num);
	}
}