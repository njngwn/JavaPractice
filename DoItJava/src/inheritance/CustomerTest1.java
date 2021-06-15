package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("ÀÌ¼ø½Å");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(1001, "È«±æµ¿", 2001);
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("±èÀ¯½Å");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerKim.showVIPInfo());
	}
}
