package Homwork;

public class Goods {
		// 문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구하는 프로그램을 작성하세요.
				
		// 1 )상품 수
		// 2) 상품 및 가격입력
		// 3) 분석 -> 총합

		// 상품 수 - 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 분석기능은 (최고 가격을 가지는 제품과 해당 제품을 제외한) 제품들의 총합을 구합니다.(총합만 구하면 됨)
		//---------------------------------
		
		//필드
		String gdName;
		int gdPrice;
		
		//생성자
		
		//메소드
		
		public void getInfo() {
			System.out.println("==입력한 상품 정보==");
			System.out.println("상품명 : " + gdName);
			System.out.println("가격 : " + gdPrice);
		}

		public String getGdName() {
			return gdName;
		}

		public void setGdName(String gdName) {
			this.gdName = gdName;
		}

		public int getGdPrice() {
			return gdPrice;
		}

		public void setGdPrice(int gdPrice) {
			this.gdPrice = gdPrice;
		}
		
		public void sumResult() {
			
		}
	
}
