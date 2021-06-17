package polymorphism;

public class Engineer extends Employee {
	public Engineer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private String skillset;
	
	public String getSkillset() {
		return skillset;
	}
	
	public void setSkillSet(String skillSet) {
		this.skillset = skillset;
	}
}
