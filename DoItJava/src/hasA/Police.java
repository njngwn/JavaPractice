package hasA;

public class Police {
	Cudgel cud;
	
	public Police() {
		cud = new Cudgel();
	}
	
	public void useWeapon() {
		cud.swing();
	}
	
	public static void main(String[] args) {
		Police pol = new Police();
		pol.useWeapon();
	}
}
