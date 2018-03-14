package com.james.data.structures.queue;

public interface MyQueue {
	//返回队列的大小
	public int getSize();
	
	//判断队列是否为空
	public boolean isEmpty();
	
	//数据元素e入队
	public void enqueue(Object e);
	
	//队首元素出队
	public Object dequeue() throws QueueEmptyException;
	
	//取队首元素
	public Object peek() throws QueueEmptyException;
	
	//获取队列元素，并打印出来
	public void print() throws QueueEmptyException;
}