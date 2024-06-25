package teamBuilder1;

// Bir dosyada iki adet class var ve bunlar birlikte kullanılıyor
public class Team {
	public static void main(String[] args) {
		// Bir TeamMember Objesi yaratılıyor
		TeamMember person1 = new TeamMember("Ahmet", "Mehmet");
		System.out.println("Team member is " + person1.name);
	}
}

class TeamMember {
	// Team member için isim ve soy isim için alanlar oluşuyor
	String name;
	String lastName;

	// constructor yapısı sayesinde team member üretiliyor.
	public TeamMember(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

}