package exception;

public class IDFormatTest {
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) throws IDFormatException {
		if (userId == null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");
		} else if (userId.length()<8 || userId.length()>20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���ϸ� ������.");
		}
		this.userId = userId;
	}
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		try {
			test.setUserId(userID);
		} catch (IDFormatException e) {
			System.out.println();
		}
	}
}
