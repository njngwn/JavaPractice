package quizInheritance;

public class IPTV extends ColorTV {
	private String address;
	
	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void printProperty() {
		System.out.println("���� IP TV�� " + address + " �ּ��� " + getSize() + "��ġ " + getColor() + "�÷�");
	}
	
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
