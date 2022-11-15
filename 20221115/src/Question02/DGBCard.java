package Question02;

public class DGBCard extends Card{
	
	//필드
	String company = "대구은행";
	String cardStaff;
	
	//생성자
	public DGBCard(String cardNo, String validDate, String CVC, String cardStaff) {
		super(cardNo, validDate, CVC);
		this.cardStaff = cardStaff;
	}

	
	//메소드
	@Override
	public void showCardInfor() {
		super.showCardInfor();
		System.out.println("카드정보 (Card NO : " + cardNo + ", 유효기간 : " + validDate + ", CVC : " + CVC + ")");
		System.out.println("담당직원 - " + cardStaff +", " + company);
	}
	
	
	
}
