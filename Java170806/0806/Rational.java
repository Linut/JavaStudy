public class Rational{
	int numerator;
	int denominator;
	Rational(int a,int b){
		if (a == 0) {
			numerator = 0;
			denominator = 1;
		}else{
			setNumeratorAndDenomintor(a,b);
		}
	}

	void setNumeratorAndDenomintor(int a,int b){	//���÷��ӷ�ĸ
		int c = f(Math.abs(a),Math.abs(b));		//�����Լ������ת�����
		numerator = a/c;
		denominator = b/c;

		if (numerator<0 && denominator<0) {
			numerator = -numerator;
			denominator = -denominator;
		}
	}

	int f(int a,int b){		//��ת�����
		int result = 0;
		if (a<b) {
			int c=a;
			a = b;
			b = c;
		}

		result = a%b;
		while (result!=0) {
			a = b;
			b = result;
			result = a%b;
		}

		return b;
	}
}