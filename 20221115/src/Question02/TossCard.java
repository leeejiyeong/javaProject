package Question02;

public class TossCard extends Card{
	//필드
	String company = "Toss";
	String cardStaff;
	
	//생성자	
	public TossCard(String cardNo, String validDate, String CVC, String cardStaff) {
		super(cardNo, validDate, CVC);
		this.cardStaff = cardStaff;
	}
	
	//메소드
	@Override
	public void showCardInfor() {
		super.showCardInfor();
		System.out.println("카드정보 - Card NO, " + cardNo);
		System.out.println("담당직원 - " + cardStaff + "," + company);
	}
	
	
	
}
