/*
����
1������ʮ����ת�����ơ�ʮ����ת�˽��ơ�ʮ����תʮ�����ƹ��ܺ��������ܶ����ƴ��룬
�ʽ����ȡ������װ��һ��������

˼·��
1����Щת����������������¼����֣�
	1).����Ҫת�����Ƶı�
	2).��ʱ�洢����
	3).���������ָ��
	4).��ʮ���Ƶ�������ת������
	5).�������return���ս��
2���������㲻ͬ��
	1).��Ĺ��һ��������취���ô�ı����С�ı�
	2).��&�Ļ�����������λƫ������һ����������Ե���������������ȥ

���裺
1������ת�����Ʊ�char���ͳ�ʼֵΪ0~F
2��������ʱ�洢���飬char���ͳ���Ϊ32
3������int����ָ��pos,��ʼֵΪ���鳤��
4������ѭ������ʮ����������ѭ��λ�Ʋ���
5������򷵻ؽ��
*/

class ArrayTest7 {

	public static void main(String[] args) {

		toBin(-6);

		toOct(60);

		toHex(60);
		
	}

	//��ȡ�Ĺ��ܺ���
	public static void trans(int num,int base,int offset){

		char[] chs = {'0','1','2','3',
					'4','5','6','7',
					'8','9','A','B',
					'C','D','E','F'};

		char[] arr = new char[32];

		int pos = arr.length;

		while(num!=0){
			int temp = num & base;

			arr[--pos]= chs[temp];

			num = num >>> offset;

		}

		for (int i=pos; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}


	//ʮ����ת������
	public static void toBin(int num){
		trans(num,1,1);
	}
	//ʮ����ת�˽���
	public static void toOct(int num){
		trans(num,7,3);
	}
	//ʮ����תʮ������
	public static void toHex(int num){
		trans(num,15,4);
	}
}