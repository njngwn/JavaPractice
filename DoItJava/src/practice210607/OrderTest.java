package practice210607;

public class OrderTest {
	public static void main(String[] args) {
		Order o1 = new Order();
		
		o1.orderCode = "201803120001";
		o1.orderID = "abc123";
		o1.orderDate = "2018�� 3�� 12��";
		o1.orderName = "ȫ���";
		o1.orderProduct = "PD0345-12";
		o1.orderAddress = "����� �������� ���ǵ��� 20����";
		
		o1.showOrderInfo();
	}
}
