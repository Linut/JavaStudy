/*
进制转换：
1、十进制转二进制
2、十进制转十六进制
*/

class ArrayTest5 {
	public static void main(String[] args) {
		toBin(6);
		System.out.println(Integer.toBinaryString(60));
		toHex(60);
	}

	public static void toBin(int num){
		StringBuffer sb = new StringBuffer();

		while(num>0){
			sb.append(num%2);
			num/=2;
		}

		System.out.println(sb.reverse());
	}

/*	public static void toHex(int num){

		StringBuffer sb  = new StringBuffer();

		while(num!=0){
			int temp = num & 15;
			if(temp>9)
				sb.append((char)(temp-10+'A'));
			else
				sb.append(temp);
			num = num >>> 4;
		}

		System.out.println(sb.reverse());
	}
*/
/*
	public static void toHex(int num){

		StringBuffer sb  = new StringBuffer();

		for(int x= 0;x<8;x++){

			int temp = num & 15;
			if(temp>9)
				sb.append((char)(temp-10+'A'));
			else
				sb.append(temp);
			num = num >>> 4;
		}

		System.out.println(sb.reverse());
	}
*/
	public static void toHex(int num){

		char[] chs = new char[8];
		int pos = chs.length;

		System.out.println(pos);
		while(num!=0){
			int temp = num & 15;
			if(temp>9)
				chs[--pos]=(char)(temp-10+'A');
			else
				chs[--pos]=(char)(temp+'0');//这里易出bug：直接把int型temp赋给char型的数组，导致转换错误。
			num = num >>> 4;
		}

		for (int i =pos; i<chs.length; i++) {
			System.out.print(chs[i]);
		}
		
	}

}