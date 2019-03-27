/*
需求：
1、在有序数组中利用折半查找目标元素。分别用两种查找条件实现。
	1).查找条件为:arr[i]!=key
	2).查找条件为：min<=max
2、在有序数组中插入目标元素并使插入过的数组依然有序。

思路：
1、首先设置三个变量min、max、mid，分别代表数组开始坐标、数组尾坐标，数组中间坐标。
2、根据查找条件以及查找结果不同，改变min\max值。
3、当查找到目标元素后返回数组坐标，否则返回-1.

步骤：
1、定义含参函数halfSearch(int[] arr,key),key是要查询的元素。
2、定义三个变量min、max、mid，初始化min、max.
3、每次用key值与中间坐标元素比较，根据比较结果大小改变min\max\mid值，具体为：
	如果key>mid,则min=mid+1;mid=(min+max)/2;
	如果key<mid,则max=min-1;mid=(min+max)/2;
*/

class ArraySearch {
	public static void main(String[] args){
		int[] arr = new int[]{2,4,5,7,8,9};
		int index = halfSearch_2(arr,8);
		System.out.println(index);
		int index_2 = insertKey(arr,4);
		System.out.println(index_2);
	}

	//折半查找法一
	public static int halfSearch_1(int[] arr,int key){

		int min=0;
		int max=arr.length-1;
		int mid=(min+max)>>1;//位运算整除2

		while(arr[mid]!=key){

			if (arr[mid]>key) {
				max=mid-1;
			}else if (arr[mid]<key) {
				min=mid+1;
			}

			if(min>max)
				return -1;

			mid = (min+max)/2;

		}

		return mid;
	}

	//折半查找法二
	public static int halfSearch_2(int[] arr,int key){

		int min=0;
		int max=arr.length-1;
		int mid=(min+max)/2;

		while(min<=max){
			if (key<arr[mid]) {
				max = mid-1;
			}else if (key>arr[mid]) {
				min = mid+1;
			}else{
				return mid;
			}
			mid=(min+max)/2;
		}

		return -1;
	}

	//插入指定元素不改变数组有序性
	//利用折半查找原理，找到该数则返回mid值，找不到则返回min值即可。
	public static int insertKey(int[] arr,int key){

		int min = 0 ;
		int max = arr.length-1;
		int mid = (min+max)/2;

		while(min<=max){
			if(key<arr[mid]){
				max = mid -1;
			}else if(key>arr[mid]){
				min = mid + 1;
			}else{
				return mid;
			}
			mid = (min+max)/2;
		}

		return min;
	}


}