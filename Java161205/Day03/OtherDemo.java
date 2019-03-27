/*
利用break 标号;跳出制定循环。
*/

class OtherDemo {

	public static void main(String[] args) {
		
		q:for (int i =0; i<3; i++) {
			
			w:for (int j=0;j<3; j++) {

				System.out.println(i);
				break q;
				
			}
			
		}

		char a = '中';

		System.out.println(a);
	}
	
}