package day04.Bai1_4;

public class Employee {
    private int id, salary;
    private String firstName, lastName;

    public Employee(int id, String firstName, String lastName, int salary ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        salary = salary + salary/100;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + firstName +  lastName + '\'' +
                '}';
    }

    public String getName() {
        return firstName + lastName;
    }
}
