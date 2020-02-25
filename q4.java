
interface EmployeeI {
    Employee getDetails(String name, int age, String city);
}

class Employee {
    String  name;
    int age;
    String city;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public Employee(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
}


public class q4 {
    public static void main(String[] args) {
        EmployeeI e = Employee::new;
        System.out.println( e.getDetails("Utkarsh", 22, "Bareilly").getName());



    }
}