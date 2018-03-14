package com.james.data.structures.queue;

public class QueueTest {
	public static void main(String args[]){
		MyQueue queue = new QueueArray(10);
		int[] array = {0,1,2,3,4,5,6,7,8,9}; //也可以为其它类型
		//将数据加入列
		for(int i = 0 ;i < array.length; i++){
			System.out.println("准备加入队列：当前元素为 "+array[i]);//队首元素为0, 队尾元素为9
			queue.enqueue(array[i]);
		}

		queue.print(); //将该队列的数据元素取出来并打印
		
		//取队列首元素，并将首元素弹出队列
		for(int j = 0 ;j < array.length; j++){
			int node = (int) queue.dequeue();
			System.out.println(node);
		}

		System.out.println("--------------");
		queue.print();
		
		
		
		
		
		/*int i = 0;  
        for (int j = 0; j < 10; j++) {  
            i=++i;  
        }  
        System.out.println("i的最后结果"+i);  */
	}
}
