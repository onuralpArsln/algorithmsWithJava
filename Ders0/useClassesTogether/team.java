public class Team{
	public static void main(String[] args){
	TeamMember person1= new TeamMember("Ahmet","Mehmer");
	System.out.println("Team member is " + person1.name );	
	}
}

private class TeamMember{

  private TeamMember(String name, String lastName){
  name=name;
  lastName=lastName;}
}
