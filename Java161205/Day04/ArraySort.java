/*
����
1�����������ѡ������
2�����������ð������

1��ѡ������
	˼·��
	1������һ�����κ�����ʵ��ѡ�������ܡ�����ѭ��������������бȽϡ�
	2��ѭ�������ǣ��������һ��Ԫ���𣬷ֱ���ÿ��Ԫ������������Ԫ�رȽϡ�
	3����ѭ�����ж��Ƿ�������Ԫ�رȵ�ǰԪ��С��������򽻻�����Ԫ��λ�á�

	���裺
	1������һ�����κ���selectSort(int[] arr)����Ҫ������ʵ��ѡ������
	2������forѭ��Ƕ�����������飬��������ѭ��:i<arr.length-1;��ѭ��(j=i+1;j<arr.length;j++);
	3���ж�����Ԫ�ش�С��������a[i]>a[j],���������򲻽�����
	4��������������Ƚ�����ǰ������顣

2��ð������
	˼·+���裺
	1������Ƕ��forѭ��ʵ��ð�����򣬷�������ѭ�����������������Ϊ(int i =0 ;i<arr.length-1;i++);
	��ѭ������ÿ��������Ҫ�ȽϵĴ�������0��ʼ����������Ԫ�ؽ��бȽϣ�����Ϊ(int j=0;j<arr.length-i-1;j++);
	����-1��Ϊ�����潻����������Ԫ��ʱ������Խ�硣

	��������ʲô������Ҫ����������������Ԫ�ؽ��н��������Խ��ⲿ�ִ�����ȡ����������װ��һ��������


*/
import java.util.*;

class ArraySort {
	public static void main(String[] args) {

		int[] arr = new int[]{5,7,3,9,2,6,1,4};
		printArray(arr);
		//selectSort(arr);
		bubbleSort(arr);
		 
		printArray(arr);

		Arrays.sort(arr);//����ʱ�õ�����
	}

	//����������ָ���Ǳ������Ԫ��
	public static void swap(int[] arr, int a ,int b){

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;

	}

	//ѡ������
	public static void selectSort(int[] arr){

		for (int i=0; i<arr.length-1; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i]>arr[j]) {
					swap(arr,i,j);
				}
			}
		}

	}

	//ð������
	public static void bubbleSort(int[] arr){

		for (int i=0 ; i<arr.length-1; i++) {
			for (int j =0 ; j<arr.length-i-1;j++ ) {
				if (arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}


	//�������
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