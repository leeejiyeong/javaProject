package Question03;

public class SimplePayment implements Payment{
	//필드
	public double SimplePaymentRatio;

	
	//생성자

	
	public SimplePayment(double SimplePaymentRatio) {
		this.SimplePaymentRatio = SimplePaymentRatio;
	}

	//메소드
	@Override
	public int online(int price) {
		return (int)(price - price *(this.SimplePaymentRatio+ONLINE_PAYMENT_RATIO));
	}
	
	@Override
	public int offline(int price) {
		return (int)(price - price *(this.SimplePaymentRatio+OFFLINE_PAYMENT_RATIO));
	}
	
	@Override
	public void showInfo() {
		System.out.println("온라인 결제시 총 할인율 : " + (this.SimplePaymentRatio + ONLINE_PAYMENT_RATIO));
		System.out.println("오프라인 결제시 총 할인율 : " + (this.SimplePaymentRatio + OFFLINE_PAYMENT_RATIO));
	}
	
	
}
