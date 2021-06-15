package arrayQuiz;

public class Player {
	String name;
	String country;
	String position;
	
	public Player(String name, String country, String position) {
		this.name = name;
		this.country = country;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void showProfile() {
		System.out.println(name + ", " + country + ", " + position);
	}
	
}
