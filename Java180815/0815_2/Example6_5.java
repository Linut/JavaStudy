public class Example6_5{
	public static void main(String[] args) {
		int m;
		People p1 = new People(),p2 = new People();
		try{
			p1.setAge(180);
			m = p1.getAge();
		}
		catch(IntegerException e){
			System.out.println(e.toString());
		}
		try{
			p2.setAge(37);
			m = p2.getAge();
		}
		catch(IntegerException e){
			System.out.println(e.toString());
			
		}
	}
	
}