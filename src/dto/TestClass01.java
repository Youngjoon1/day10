package dto;

/*
 * TestClass
 * - 데이터 저장 및 연산
 * 
 */

public class TestClass01 {
	private String name;
	private int k, e, sum;
	
	
	public TestClass01() {
		
		System.out.println(name);
		System.out.println(sum);
		System.out.println("기본 생성자 실행");
	}
	public void display() {
		name = "홍길동";
		k = 100; e = 100; sum = k + e;
	}
	//set,getter 추가할수도 있다.
	
	public String getName() {
		return name;
	}
}
