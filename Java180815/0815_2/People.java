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
		System.out.println("�����������Ϊ��"+age);
		return age;
	}
}