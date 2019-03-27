class OperateDemo {

	public static void main(String[] args) {

		int num = 60;
		System.out.println(num);

		int n1 = num & 15;
		System.out.println(n1>9?(char)(n1-10+'A'):n1);

		int temp = num >>> 4; 

		int n2 = temp & 15;
		System.out.println(n2>9?(char)(n2-10+'A'):n2);

	}
}