/*
需求：
1、打印99乘法表
2、打印制定数值的99乘法表

思路：
1、利用函数，传入参数即给定值，实现打印固定数值的99乘法表
2、利用重载在新建函数里调用上一个函数，实现代码复用。

步骤：
1、定义一个含参函数print99(int num),利用for循环嵌套，打印固定值的99乘法表。
2、定义一个重载函数print99(),调用上一个函数实现打印固定值为9的九九乘法表。
*/

class FunctionOverload {
	public static void main(String[] args) {
		print99();
		print99(4);
	}

	public static void print99(int num){

		for (int i=1; i<=num; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}

	public static void print99(){

		print99(9);
	}
	
}