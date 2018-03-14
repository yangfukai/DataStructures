package com.james.data.structures.stack;

public class StackTest {
	public static void main(String args[]){
		MyStack stack = new StackArray();
		int[] array = {0,1,2,3,4,5,6,7,8,9}; //也可以为其它类型
		//将数据加入栈
		for(int i = 0 ;i < array.length; i++){
			System.out.println("准备加入栈：当前元素为 "+array[i]);//先进后出：栈首元素为9, 栈尾元素为0
			stack.push(array[i]);
		}
		
		//取队列首元素，并将首元素弹出队列
		for(int j = 0 ;j < array.length; j++){
			int node = (int) stack.pop();
			System.out.println(node);
		}

		System.out.println("--------------");
		
	}
}
