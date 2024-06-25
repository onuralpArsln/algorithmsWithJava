package teamBuilder1;
public class Team {
	public static void main(String[] args) {
		TeamMember person1 = new TeamMember("Ahmet", "Mehmet");
		System.out.println("Team member is " + person1.name);
	}
}

class TeamMember {
	String name;
	String lastName;

	public TeamMember(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

}