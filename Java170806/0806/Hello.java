public class Hello{
	public static void main (String args[]){
		System.out.println("这是一个简单的Java应用程序");

		Student stu  = new Student();
		stu.speak("我是学生");
		
		Student2 stu2 = new Student2();
		stu2.speak("I'm student too.");
	}
}

class Student{
	public void speak(String s){
		System.out.println(s);
	}
}