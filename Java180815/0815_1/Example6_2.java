abstract class Speak{
	public abstract void speakHello(); 
}

class Student{
	void f(Speak sp){
		sp.speakHello();
	}
}

public class Example6_2{
	public static void main(String[] args) {
		Speak speak = new Speak(){
			public void speakHello(){
				System.out.println("Hello 01");
			}
		};
		speak.speakHello();

		Student stu = new Student();
		stu.f(new Speak(){
			public void speakHello(){
				System.out.println("Hello 02");
			}
		});
	}
}