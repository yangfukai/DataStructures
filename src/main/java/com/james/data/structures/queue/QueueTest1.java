package com.james.data.structures.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest1 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>(); // linkedlist父接口继承了queue接口

		queue.add("0");
		queue.add("1");
		queue.add("2");
		queue.add("3");
		queue.add("4");
		queue.add("5");
		queue.add("6");
		queue.add("7");
		queue.add("8");
		queue.add("9");

		String pollEle = queue.poll(); //先进先出,弹出了0
		System.out.println(pollEle); //0
		System.out.println(queue);   //[1,2,3,4,5,6,7,8,9]
		for (int i = 0; i < queue.size(); i++) {
			System.out.println(queue.poll()); //0
		}
	}
}
