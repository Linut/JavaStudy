/*
����
1����������ֵ����һ����ʼ����ֵΪ������ĳ��������������ʼ��һ��ֵΪ����ĽǱꡣ
2���ֱ������ֵ����Сֵ
3�����ô��룬������int���ͻ�Ҫ����double���͡�

˼·��
1����������ֵ������Ҫ����һ��������������ֵ�������������ʼ������Ϊ����������һ��ֵ��
Ȼ��������飬��������ֵ���бȽϡ�����������������������ĽǱ꣬Ȼ������ȽϹ�����
���������������ֵ�ýǱꡣ

���裺
1������һ����������ʼ��Ϊ�����е�һ������
2��ͨ��ѭ������������б�����
3���ڱ��������ж����ж������������������Ԫ�رȸñ����󣬾ͽ���Ԫ��ֵ����������
*/

class ArrayDemo3 {
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5};
		double[] b = new double[]{1.3,4.5,5.7,8.5,4.3};

//		System.out.println(getMax(a));
		System.out.println(getMax_2(a));
		System.out.println(getMin(a));
		System.out.println(getMax(b));


	}

	public static int getMax(int[] a){

		int x = a[0];

		for (int i=0; i<a.length; i++) {
			if (x<a[i]) {
				x=a[i];
			}
		}
		return x;
	}

	public static int getMax_2(int[] a){

		int x = 0;

		for (int i=0; i<a.length; i++) {
			if (a[x]<a[i]) {
				x=i;	
			}
		}
		return a[x];
	}

	public static int getMin(int[] a){
		int x = 0;
		 for (int i=0; i<a.length; i++) {
		 	if (a[x]>a[i]) {
		 		x=i;
		 	}
		 }

		 return a[x];
	}

	public static double getMax(double[] a){
		int x = 0;

		for (int i=0; i<a.length; i++) {
			if (a[x]<a[i]) {
				x=i;	
			}
		}
		return a[x];
	}
}