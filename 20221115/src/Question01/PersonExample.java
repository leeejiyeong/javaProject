package Question01;

public class PersonExample {
	public static void main(String[] args) {
		Person ps = new Person();
		
		ps.setName("김또치");
		ps.setSsn("123456-1234567");
		ps.setAddress("대구");
		
		System.out.println("이름 : " + ps.getName());
		System.out.println("주민등록번호 : " + ps.getSsn());
		System.out.println("주소 : " + ps.getAddress());
	}
}
