public class MarriagePeople extends People{
	boolean isMarriage;
	MarriagePeople(int number,String name,boolean isMarriage){
		super(number,name);
		this.isMarriage = isMarriage;
	}
	public boolean getIsMarriage(){
		return isMarriage;
	}
}