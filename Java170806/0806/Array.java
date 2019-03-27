import java.util.Arrays;
public class Array{
	public static void main(String[] args) {
/*		int a[] = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[02] = 3;
		char b[] = {'a','b','c'};

		char c = ' ';
		String s = "";
		float f= 0.0f;

		System.out.println(c);
		System.out.println(s);
		System.out.println(f);

		System.out.println(a);
		System.out.println(b);
		System.out.println(b+"");
		System.out.println(Arrays.toString(a));
		*/
/*		
		int[] a = {1,2,3,4,5,6,7},b,c,d;
		b = Arrays.copyOf(a,9);
		c = Arrays.copyOfRange(a,2,9);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));

*/	
		int[] a = {12,34,9,23,45,6,45,90,123,19,34};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int number  = 4;
		int index  = Arrays.binarySearch(a,number);
		if (index >= 0) {
			System.out.println(number+"   "+index);
		}
		float f = 123f;
		double d = 1234;
		System.out.println(f);
		System.out.println(d);

	}
}