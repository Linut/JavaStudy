public class Example6_4{
	public static void main(String[] args) {
		int n =0,m =0,t = 6666;
		try{
			m = Integer.parseInt("8888");
			n = Integer.parseInt("ab67");
			t = 7777;
		}
		catch(NumberFormatException e){
			System.out.println(e.getMessage());
			//System.out.println(e.printStackTrace());
			System.out.println(e.toString());
			t = 8888;
		}

		System.out.println("n = "+n+" m = "+m+" t = "+t);
	}
}