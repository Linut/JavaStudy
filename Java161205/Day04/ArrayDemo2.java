/*
数组常见问题
1、静态初始化
2、遍历

*/
class ArrayDemo2 {

	public static void main(String[] args) {
		//1、静态初始化
		int[] a = new int[5];
		int b[] = new int[5];
		int[] c = new int[]{1,2,3,4,5};
		int[] d = {1,2,3,4,5};

		printArray(d);
	}


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