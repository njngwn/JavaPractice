package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
//		System.out.println("VIPCustomer() ������ ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "��� ���� ���̵�� " + agentID + "�Դϴ�.";
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		System.out.println("---- �������̵� calcPrice() ----");
		return price-(int)(price * saleRatio);
	}
}
