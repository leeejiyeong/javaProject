package Question02;

public class Card {
	
	//필드
	String cardNo;
	String validDate;
	String CVC;
	
	//생성자
	public Card(String cardNo, String validDate, String CVC){
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.CVC = CVC;
	}

	
	//메소드
	public String getCardNo() {
		return cardNo;
	}
	
	public String getValidDate() {
		return validDate;
	}
	
	public String getCVC() {
		return CVC;
	}
	
	public void showCardInfor() {
		System.out.println("Card NO : " + this.cardNo);
		System.out.println("유효기간 : " + this.validDate);
		System.out.println("CVC : " + this.CVC);
	}
	
	
}
