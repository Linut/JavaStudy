public class IntegerException extends Exception{
	String message;

	public IntegerException(int n){
		message = "����"+n+"������";
	}
	
	public String toString(){
		return message;
	}
}