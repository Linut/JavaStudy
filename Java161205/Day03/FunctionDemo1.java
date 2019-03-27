class FunctionDemo1 {

	public static void main(String[] args) {
		
		boolean x = compare(3,4);
		System.out.println(x);
	}

	public static boolean compare(int a,int b){

		/*
		if(a>b)
			return true;

		return false;
		*/

		//return (a>b)?true:false;

		return a>b;


	}
	
}