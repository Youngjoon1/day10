package constructor;

public class MainClass02 {

	public static void main(String[] args) {
		String msg = "나의 회사";
		TestClass02 t = new TestClass02(msg);
		
//		t.setOfficeName(msg);
		System.out.println("회사 이름은 : " + t.getOfficeName());
		
		
	}

}
