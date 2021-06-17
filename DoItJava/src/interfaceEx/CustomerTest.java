package interfaceEx;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// Customer 클래스형인 customer를 Buy 인터페이스 형인 buyer 에 대입하여 형 변환
		// buyer는 Buy 인터페이스의 메서드만 호출 가능
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		// Customer 클래스형인 customer를 Sell 인터페이스형인 seller에 대입하여 형 변환
		// seller는 Sell 인터페이스의 메서드만 호출 가능
		Sell seller = customer;
		seller.sell();
		seller.order();
		
		if (seller instanceof Customer) {
			Customer customer2 = (Customer)seller;
			customer2.buy();
			customer2.sell();
		}
		
		customer.order();
	}
}
