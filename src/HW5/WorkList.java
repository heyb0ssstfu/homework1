package HW5;

public class WorkList {
    public static void main(String[] args) {
        Employee[] arrayOfEmployees = new Employee[5];
        arrayOfEmployees[0] = new Employee("Ivanov Ivan", "Engineer", "ivanovi@mail.ru", "89123473889", "80000", 41);
        arrayOfEmployees[1] = new Employee("Born Gustav", "Top manager", "bornG@mail.ru", "8956295866", "110000", 35);
        arrayOfEmployees[2] = new Employee("Gagarin Sergey", "Cosmonaut", "gagas@mail.ru", "89183602595", "90000", 42);
        arrayOfEmployees[3] = new Employee("Sraiber Evgeniy", "Coder", "evgenss@mail.ru", "89124589262", "160000", 24);
        arrayOfEmployees[4] = new Employee("Vernov Alex", "Designer", "verna@mail.ru", "89285576728", "120000", 41);

        System.out.println(arrayOfEmployees[0]);
        arrayOfEmployees[0].printEmployee();

        for (Employee employee : arrayOfEmployees) {
            if (employee.getAge() > 40 ) {
                System.out.println(employee);
            }
        }

    }
}