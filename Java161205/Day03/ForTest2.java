/*
要求：
1、打印
	*****
	****
	***
	**
	*

2、打印
	*
	**
	***
	****
	*****

3、打印九九乘法表


思路：
1、使用嵌套循环，外循环控制行数，内循环控制列数。
2、内循环的列数是变化的，应改变循环条件
3、内外循环之间应打印换行。

步骤：
1、定义两层嵌套循环语句，使用for循环。
2、内循环列数随外循环条件变化而变化
*/

class ForTest2 {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			
			for (int j=0;j<=i ;j++ ) {

				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("----------------");



		for (int i=0; i<5; i++) {
			
			for (int j=i; j<5;j++ ) {

				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("----------------");



		for (int i=1; i<=9; i++) {
			
			for (int j=1; j<=i; j++) {
				
				System.out.print(j+"*"+i+"="+j*i+'\t');
			}

			System.out.println();
		}

	}
	
}