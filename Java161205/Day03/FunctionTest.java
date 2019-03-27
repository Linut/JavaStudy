/*
需求：
1、利用函数打印矩形
2、利用函数打印分割线
3、利用函数打印九九乘法表

思路：
1、分别建立函数实现对应功能

步骤：
1、定义printSquare函数实现打印矩形功能，利用for循环嵌套。
2、定义printHr函数实现打印分割线功能。
3、定义print99函数实现打印九九乘法表功能，利用for循环嵌套实现。
*/

class FunctionTest {

	public static void main(String[] args) {

		printSquare(5,5);
		printHr();
		print99();
		printHr();
		
	}


	public static void printSquare(int row,int col){   //row代表行，col代表列
		for (int i=0; i<row; i++) {
			
			for (int j=0; j<col; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	
	}


	public static void printHr(){

		System.out.println("--------------------");
	}


	public static void print99(){

		for (int i=1; i<=9; i++) {

			for (int j=1; j<=i; j++) {

				System.out.print(j+"*"+i+"="+j*i+"\t");
			}

			System.out.println();
		}

	}
}