public class IntegerException extends Exception{
	String message;

	public IntegerException(int n){
		message = "年龄"+n+"不合理！";
	}
	
	public String toString(){
		return message;
	}
}