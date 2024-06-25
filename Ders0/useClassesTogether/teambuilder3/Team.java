// file name also becomes package name
package teambuilder3;

public class Team {
    TeamMember person1 = new TeamMember("Ahmet", "Mehmet");
    TeamMember person2 = new TeamMember("Ahmedinov", "Mehmedinov");

    public static void main(String[] args) {
        Team basicTeam = new Team();
        System.out.println("takım Oluştu");
        System.out.println(basicTeam.person1.represent());
        System.out.println(basicTeam.person2.represent());
    }

}
