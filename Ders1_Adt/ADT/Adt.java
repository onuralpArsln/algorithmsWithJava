package Ders1.ADT;

public class Adt {
    public static void main(String[] args) {

        // bizim adtmiz ile yeni bir obje oluşturalım
        Employee employee1 = new Employee(0, "İsim", "Soyad", 10);
        employee1.represent();
        employee1.showInnerDetails();

        // salaryi yetkisiz olarak değiştiriyorum
        employee1.salary = -10;
        // idyi yetkisi olarak değiştiriyorum
        employee1.id = 9999;

        System.out.println(" kafama göre degisiklikler yaptım");
        employee1.showInnerDetails();

    }

}

class Employee {
    int id;
    String name;
    String lastName;
    int salary;

    public Employee(int id, String name, String lastName, int salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void represent() {
        System.out.println(this.name + " " + this.lastName);
    }

    public void showInnerDetails() {
        System.out.println("id :" + this.id);
        System.out.println("Salary :" + this.salary);
    }

}