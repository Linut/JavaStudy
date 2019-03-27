/*
需求：
1、把数组进行选择排序
2、把数组进行冒泡排序

1、选择排序
	思路：
	1、定义一个含参函数，实现选择排序功能。利用循环语句遍历数组进行比较。
	2、循环条件是：从数组第一个元素起，分别用每个元素与数组其他元素比较。
	3、在循环中判断是否有其他元素比当前元素小，如果有则交换两个元素位置。

	步骤：
	1、定义一个含参函数selectSort(int[] arr)，主要功能是实现选择排序
	2、利用for循环嵌套语句遍历数组，条件：外循环:i<arr.length-1;内循环(j=i+1;j<arr.length;j++);
	3、判断两个元素大小，条件：a[i]>a[j],交换。否则不交换。
	4、用数组输出语句比较排序前后的数组。

2、冒泡排序
	思路+步骤：
	1、利用嵌套for循环实现冒泡排序，方法是外循环控制排序次数所以为(int i =0 ;i<arr.length-1;i++);
	内循环控制每次排序需要比较的次数，从0开始，相邻两个元素进行比较，条件为(int j=0;j<arr.length-i-1;j++);
	其中-1是为了下面交换两个数组元素时不至于越界。

	发现无论什么排序都需要将满足条件的两个元素进行交换，所以将这部分代码提取出来单独封装成一个函数。


*/
import java.util.*;

class ArraySort {
	public static void main(String[] args) {

		int[] arr = new int[]{5,7,3,9,2,6,1,4};
		printArray(arr);
		//selectSort(arr);
		bubbleSort(arr);
		 
		printArray(arr);

		Arrays.sort(arr);//开发时用的排序
	}

	//交换数组中指定角标的两个元素
	public static void swap(int[] arr, int a ,int b){

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

	//选择排序
	public static void selectSort(int[] arr){

		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					swap(arr,i,j);
				}
			}
		}

	}

	//冒泡排序
	public static void bubbleSort(int[] arr){

		for (int i=0 ; i<arr.length-1; i++) {
			for (int j =0 ; j<arr.length-i-1;j++ ) {
				if (arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}


	//输出数组
	public static void printArray(int[] a){
		
		System.out.print("[");
		for (int i=0; i<a.length; i++) {

			if(i!=a.length-1)
				System.out.print(a[i]+",");
			else
				System.out.println(a[i]+"]");
		}
	}


}