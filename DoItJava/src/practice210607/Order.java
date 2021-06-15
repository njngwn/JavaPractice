package practice210607;

public class Order {
	String orderCode;	// 계산을 위한 것이 아니므로 String 사용
	String orderID;
	String orderDate;
	String orderName;
	String orderProduct;
	String orderAddress;
	
	public void showOrderInfo() {
		System.out.println("주문 번호: " + orderCode);
		System.out.println("주문자 아이디: " + orderID);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문자 이름: " + orderName);
		System.out.println("주문 상품 번호: " + orderProduct);
		System.out.println("배송 주소: " + orderAddress);
	}
}
