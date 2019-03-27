/*
需求：
1、求数组最值：法一：初始化最值为数组中某个数；法二：初始化一个值为数组的角标。
2、分别求最大值和最小值
3、复用代码，不仅求int类型还要求求double类型。

思路：
1、求数组最值，首先要设置一个变量来保存最值，而这个变量初始化可以为数组中任意一个值，
然后遍历数组，与其他的值进行比较。或者这个变量保存的是数组的角标，然后遍历比较过程中
用这个变量保存最值得角标。

步骤：
1、定义一个变量，初始化为数组中的一个数。
2、通过循环语句对数组进行遍历。
3、在遍历过程中定义判断条件，如果遍历到的元素比该变量大，就将该元素值赋给变量；
*/

class ArrayDemo3 {
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5};
		double[] b = new double[]{1.3,4.5,5.7,8.5,4.3};

//		System.out.println(getMax(a));
		System.out.println(getMax_2(a));
		System.out.println(getMin(a));
		System.out.println(getMax(b));


	}

	public static int getMax(int[] a){

		int x = a[0];

		for (int i=0; i<a.length; i++) {
			if (x<a[i]) {
				x=a[i];
			}
		}
		return x;
	}

	public static int getMax_2(int[] a){

		int x = 0;

		for (int i=0; i<a.length; i++) {
			if (a[x]<a[i]) {
				x=i;	
			}
		}
		return a[x];
	}

	public static int getMin(int[] a){
		int x = 0;
		 for (int i=0; i<a.length; i++) {
		 	if (a[x]>a[i]) {
		 		x=i;
		 	}
		 }

		 return a[x];
	}

	public static double getMax(double[] a){
		int x = 0;

		for (int i=0; i<a.length; i++) {
			if (a[x]<a[i]) {
				x=i;	
			}
		}
		return a[x];
	}
}