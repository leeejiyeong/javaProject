package homework.answer;

public class Goods {
	// field
	private String pName; //상품 이름
	private int stocks;// 재고
	private int price;// 상품 가격
	
	// constructor
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getStocks() {
		return stocks;
	}
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	// method
	public void getInfo() {
		System.out.println("상품이름 : " + pName);
		System.out.println("상품가격 : " + price);
		System.out.println("상품재고 : " + stocks);
	}
}
