package Question02;

public class CardExample {
	public static void main(String[] args) {
		//Card 클래스 출력
		Card cd = new Card("5432-4567-9534-3657","20251203","253");
		
		System.out.printf("카드정보 (Card NO : %s, 유효기간 : %s, CVC : %s) \n",cd.cardNo, cd.validDate, cd.CVC);
		System.out.println();
		
		//TossCard 클래스 출력
		TossCard tc = new TossCard("5432-4567-9534-3657","20251203","253","신빛용");
		
		System.out.println("카드정보 - Card NO, " + tc.cardNo);
		System.out.println("담당직원 - " + tc.cardStaff + ", " + tc.company);
		System.out.println();
		
		//DGBCard 클래스 출력
		DGBCard dc = new DGBCard("5432-4567-9534-3657","20251203","253","신빛용");
		
		System.out.printf("카드정보 (Card NO : %s, 유효기간 : %s, CVC : %s) \n",dc.cardNo, dc.validDate, dc.CVC);
		System.out.printf("담당직원 - %s, %s \n", dc.cardStaff, dc.company);
	}
}
