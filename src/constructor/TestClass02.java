package constructor;

public class TestClass02 {
	

	private String officeName;
	
	public TestClass02(String office) {
		System.out.println("생성자 실행");
		officeName = office;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	
	
}
