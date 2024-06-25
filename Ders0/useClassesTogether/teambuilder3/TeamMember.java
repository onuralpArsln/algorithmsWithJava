package teambuilder3;

public class TeamMember {
    String name;
    String lastName;

    // class ve method ismini aynı tutarak constructor yaparsın
    // rreturn typei bu class olduğu için bişi yazma
    public TeamMember(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String represent() {
        return this.name + " " + this.lastName;
    }
}
