package HW5;

public class Employee {
    private final String name;
    private final String position;
    private final String eMail;
    private final String phone;
    private final String salary;
    private int age;

    public Employee(String name, String position, String email, String phone, String salary, int age) {
        this.name = name;
        this.position = position;
        this.eMail = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public  void printEmployee(){
        System.out.println(this.eMail + ": " + this.name);
    }

    public String toString(){
        return this.name + " " + this.position;
    }

    public int getAge() {
        return this.age;
    }
}
