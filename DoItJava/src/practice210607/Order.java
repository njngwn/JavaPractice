package practice210607;

public class Order {
	String orderCode;	// ����� ���� ���� �ƴϹǷ� String ���
	String orderID;
	String orderDate;
	String orderName;
	String orderProduct;
	String orderAddress;
	
	public void showOrderInfo() {
		System.out.println("�ֹ� ��ȣ: " + orderCode);
		System.out.println("�ֹ��� ���̵�: " + orderID);
		System.out.println("�ֹ� ��¥: " + orderDate);
		System.out.println("�ֹ��� �̸�: " + orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + orderProduct);
		System.out.println("��� �ּ�: " + orderAddress);
	}
}
