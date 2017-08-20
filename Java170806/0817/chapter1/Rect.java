public class Rect{
    double width;
    double height;
    double getArea(){
	return width*height;
    }
    
}

class Example_2{
    public static void main(String args[]){
	Rect rectangle = new Rect();
	rectangle.width = 10;
	rectangle.height = 20;
	System.out.println(rectangle.getArea());
    }
}
