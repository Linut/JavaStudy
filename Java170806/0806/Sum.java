public class Sum{
	public static void main(String[] args) {
		//��1-10֮��ż��֮��
		int sum = 0;
		for (int i =1;i<=10 ;i++ ) {
			if (i%2 != 0) {
				continue;
			}
			sum+=i;
		}
		System.out.println(sum);

		//��1-50֮�������
		int j =0;
		for (int i=2;i<=50 ;i++ ) {
			for (j=2;j<=i/2 ;j++ ) {
				if (i%j == 0) {
					break;
				}
			}
			if (j>i/2) {
				System.out.print(i+" ");
			}
			
		}

		var();

		People p = new People("zhangfeng");
		System.out.println(p);
		System.out.println(31%4);
	}

	static void var(){
		
		String s = "Hello";
		System.out.println(s);
	}
}

class People{
	String name;
	People(String name){
		this.name = name;
	}
}