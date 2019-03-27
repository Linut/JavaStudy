/*
需求：
1、由于十进制转二进制、十进制转八进制、十进制转十六进制功能函数包含很多相似代码，
故将其抽取出来封装成一个函数。

思路：
1、这些转换函数大体包括以下几部分：
	1).定义要转换进制的表
	2).临时存储数组
	3).操作数组的指针
	4).对十进制的数进行转换操作
	5).输出或者return最终结果
2、但有三点不同。
	1).表的规格不一样，解决办法是用大的表包含小的表
	2).所&的基数、二进制位偏移量不一样，这个可以当做函数参数传进去

步骤：
1、定义转换进制表，char类型初始值为0~F
2、定义临时存储数组，char类型长度为32
3、定义int类型指针pos,初始值为数组长度
4、定义循环，对十进制数进行循环位移操作
5、输出或返回结果
*/

class ArrayTest7 {

	public static void main(String[] args) {

		toBin(-6);

		toOct(60);

		toHex(60);
		
	}

	//抽取的功能函数
	public static void trans(int num,int base,int offset){

		char[] chs = {'0','1','2','3',
					'4','5','6','7',
					'8','9','A','B',
					'C','D','E','F'};

		char[] arr = new char[32];

		int pos = arr.length;

		while(num!=0){
			int temp = num & base;

			arr[--pos]= chs[temp];

			num = num >>> offset;

		}

		for (int i=pos; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}


	//十进制转二进制
	public static void toBin(int num){
		trans(num,1,1);
	}
	//十进制转八进制
	public static void toOct(int num){
		trans(num,7,3);
	}
	//十进制转十六进制
	public static void toHex(int num){
		trans(num,15,4);
	}
}