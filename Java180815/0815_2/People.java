public class People{
	int age = 1;

	public void setAge(int age) throws IntegerException{
		if (age<0||age>160) {
			throw new IntegerException(age);
		}
		else{
			this.age = age;
		}
	}

	public int getAge(){
		System.out.println("年龄合理，年龄为："+age);
		return age;
	}
}