/*
����break ���;�����ƶ�ѭ����
*/

class OtherDemo {

	public static void main(String[] args) {
		
		q:for (int i =0; i<3; i++) {
			
			w:for (int j=0;j<3; j++) {

				System.out.println(i);
				break q;
				
			}
			
		}

		char a = '��';

		System.out.println(a);
	}
	
}