package lombok_test;

public class MainClass {
	public static void main(String[] args) {
		TestDTO dto = new TestDTO();
		dto.setName("홍길동");
		System.out.println("name : " + dto.getName());
		System.out.println("dto : " + dto);

		TestDTO dto2 = new TestDTO("1111", 2222);
		System.out.println("dto2 : " + dto2);
	}
}