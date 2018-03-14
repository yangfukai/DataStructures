package com.james.data.structures.algorithm;

public class ShellSort {
	public static void main(String[] args) {
		int[] arr = { 82, 31, 29, 71, 72, 42, 64, 5, 110 };
		sort(arr);
	}

	public static void sort(int[] arrays) {
		if (arrays == null || arrays.length <= 1) {
			return;
		}
		// 增量
		int incrementNum = arrays.length / 2;
		while (incrementNum >= 1) {
			for (int i = 0; i < arrays.length; i++) {
				// 进行插入排序
   				for (int j = i; j < arrays.length - incrementNum; j = j + incrementNum) {
					if (arrays[j] > arrays[j + incrementNum]) {
						int temple = arrays[j];
						arrays[j] = arrays[j + incrementNum];
						arrays[j + incrementNum] = temple;
					}
				}
			}
			// 设置新的增量
			incrementNum = incrementNum / 2;
			for (int num : arrays) {
				System.out.print(num + " ");
			}
			System.out.println("");
		}
	}
}
