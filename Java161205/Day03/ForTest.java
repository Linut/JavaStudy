/*
要求：1、打印1~100之间7的倍数个数

思路：
1、先对1~100进行遍历操作
2、在遍历过程中，定义条件，只对7的倍数进行操作。
3、然后通过一个变量记录变化的次数。

步骤：
1、定义循环语句，选择for语句。
2、在循环中定义判断，使用if语句。条件：7的倍数 x % 7 == 0 ;
3、定义变量，该变量随着7的倍数的出现而自增。变量 ：int count；


哪里错了？？

*/

class ForTest {

	public static void main(String[] args) {
		
		int count = 0;

		for(int i= 7;i<=100;i+=7){

			if(i % 7 == 0){

				System.out.println(i);
				count++;
			}
				
		}

		System.out.println(count);

	}
}