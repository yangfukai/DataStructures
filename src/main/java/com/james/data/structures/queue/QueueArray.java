package com.james.data.structures.queue;

public class QueueArray implements MyQueue {
	private static final int CAP = 7;// 队列默认大小
	private Object[] elements; // 数据元素数组
	private int capacity; // 数组的大小elements.length
	private int front; // 队首指针,指向队首
	private int rear; // 队尾指针,指向队尾后一个位置

	public QueueArray() {
		this(CAP);
	}

	public QueueArray(int cap) {
		capacity = cap + 1;
		elements = new Object[capacity];
		front = rear = 0;
	}

	// 返回队列的大小
	public int getSize() {
		//避免rear<front时会出现负数
		//比如数组长度capacity＝10； rear=9, front=3,那么从3到9为队列长度6， 计算为(9-3+10)%10 = 6
		return (rear - front + capacity) % capacity;
	}

	// 判断队列是否为空
	public boolean isEmpty() {
		return front == rear;
	}

	// 数据元素e入队
	public void enqueue(Object e) { 
		if (getSize() == capacity - 1) //如果当前队列的长度与数组的长度一致，需要扩展空间
			expandSpace();
		elements[rear] = e; //当队列为空时，rear＝＝front＝＝0；将新加的第一个元素e追加到队列rear（0）位置，并将原rear位置加1，供下个元素使用
		rear = (rear + 1) % capacity;
	}
    //扩展空间处理逻辑
	private void expandSpace() {
		Object[] a = new Object[elements.length * 2];
		int i = front;
		int j = 0;
		while (i != rear) {//从front到rear前一个存储单元的元素复制到新数组中
			a[j++] = elements[i];
			i = (i + 1) % capacity;
		}
		elements = a;
		capacity = elements.length;
		front = 0;  //设置新的队首位置
		rear = j;   //设置新的队尾位置
	}

	// 取队首元素，并将队首元素出队
	public Object dequeue() throws QueueEmptyException {
		if (isEmpty())
			throw new QueueEmptyException("错误：队列为空");
		Object obj = elements[front];
		elements[front] = null; // 置空表示出列了~~~~
		front = (front + 1) % capacity; //将front的元素出列后，front新的位置+1，指向第二个元素位置为队首
		return obj;
	}

	// 取队首元素
	public Object peek() throws QueueEmptyException {
		if (isEmpty())
			throw new QueueEmptyException("错误：队列为空");
		return elements[front];
	}
    public void print(){  
        for(int i=front;i<rear;i++){  
            System.out.print(" "+elements[i].toString());  
        }  
        System.out.println();  
    } 
}
