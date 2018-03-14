package com.james.data.structures.queue;


public class QueueSLinked implements MyQueue {
	private SLNode front; 
	private SLNode rear;
	private int size;
	public QueueSLinked() {
		front = new SLNode();
		rear = front;
		size = 0;
	}

	//返回队列的大小
	public int getSize() {
		return size;
	}

	//判断队列是否为空
	public boolean isEmpty() {
		return size==0;
	}

	//数据元素e入队列，放到队尾rear
	public void enqueue(Object e) {
		SLNode p = new SLNode(e,null); //结点 p的 next 域指向 null
		rear.setNext(p); //队尾指针(rear)指向队列当前队尾元素所在的结点p
		rear = p; //将结点p作为新的队尾结点
		size++;   //长度增1
	}


	//取队首元素
	public Object peek() throws QueueEmptyException {
		if (size<1)
			throw new QueueEmptyException("错误：队列为空");
		return front.getNext().getData();
	}

	//队首元素出队
	public Object dequeue() throws QueueEmptyException {
		if (size<1)
			throw new QueueEmptyException("错误：队列为空");
		SLNode p = front.getNext(); //获取队首结点p(front始终指向链表空的头结点，front下一节点才为队列真正的首结点)
		front.setNext(p.getNext()); //将front结点指向首结点p的下一结点， 其实就是指定p的下一结点为新的首结点，相当于把p出队删除
		size--; //整个长度减1
		if (size<1) rear = front;	//如果队列为空,rear指向头结点
		return p.getData();
	}
	@Override
	public void print() throws QueueEmptyException {
		// TODO Auto-generated method stub
		
	}	
}
