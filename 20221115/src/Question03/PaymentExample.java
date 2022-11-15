package Question03;

public class PaymentExample {
	public static void main(String[] args) {
		
		int price = 10000;
		
		Payment card = new CardPayment(0.08);
		System.out.println("*** 카드로 결제 시 할인정보");
		card.showInfo();
		System.out.println("온라인 결제 금액 : " + card.online(price));
		System.out.println("오프라인 결제 금액 : " + card.offline(price));
		
		System.out.println();
		
		Payment simple = new SimplePayment(0.05);
		System.out.println("*** 간편결제 시 할인정보");
		simple.showInfo();
		System.out.println("온라인 결제 금액 : " + simple.online(price));
		System.out.println("오프라인 결제 금액 : " + simple.offline(price));
	}
}
