
import java.util.Comparator;
import java.util.*;

class Employee {
    public String name;
    public int age;
    public double salary;

    public Employee(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class bipredicate{
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("roopini", 30, 70000));
        employees.add(new Employee("yash", 25, 50000));
        employees.add(new Employee("bob", 35, 60000));
        employees.add(new Employee("alice", 32, 60000));

        employees.sort((e1, e2) -> {

            int equalsal = Double.compare(e1.getSalary(), e2.getSalary());
            if(equalsal==0)
            {
                return Integer.compare(e2.getAge(),e1.getAge());
            }
            return equalsal;
        });

        for(Employee employee:employees)
        {
            System.out.println(employee);
        }
    }
}
