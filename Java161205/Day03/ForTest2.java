/*
Ҫ��
1����ӡ
	*****
	****
	***
	**
	*

2����ӡ
	*
	**
	***
	****
	*****

3����ӡ�žų˷���


˼·��
1��ʹ��Ƕ��ѭ������ѭ��������������ѭ������������
2����ѭ���������Ǳ仯�ģ�Ӧ�ı�ѭ������
3������ѭ��֮��Ӧ��ӡ���С�

���裺
1����������Ƕ��ѭ����䣬ʹ��forѭ����
2����ѭ����������ѭ�������仯���仯
*/

class ForTest2 {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			
			for (int j=0;j<=i ;j++ ) {

				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("----------------");



		for (int i=0; i<5; i++) {
			
			for (int j=i; j<5;j++ ) {

				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("----------------");



		for (int i=1; i<=9; i++) {
			
			for (int j=1; j<=i; j++) {
				
				System.out.print(j+"*"+i+"="+j*i+'\t');
			}

			System.out.println();
		}

	}
	
}