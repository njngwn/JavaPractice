package practice210607;

public class OrderTest {
	public static void main(String[] args) {
		Order o1 = new Order();
		
		o1.orderCode = "201803120001";
		o1.orderID = "abc123";
		o1.orderDate = "2018년 3월 12일";
		o1.orderName = "홍길순";
		o1.orderProduct = "PD0345-12";
		o1.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		o1.showOrderInfo();
	}
}
