public class Example5_6{
	public static void main(String[] args) {
		MarriagePeople mp = new MarriagePeople(1345536126,"zhangfeng",true);
		int number  = mp.getNumber();
		String name = mp.getName();
		boolean b = mp.getIsMarriage();
		System.out.println(number+" "+name);
		if (b == true) {
			System.out.println("�ѽ�飡");
		}else{
			System.out.println("δ��飡");
		}

	}
}