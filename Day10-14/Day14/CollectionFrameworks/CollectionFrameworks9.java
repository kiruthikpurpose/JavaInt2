import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CollectionFrameworks9 {
    public static void main(String[] args) {
        Map<Employee, Double> employeeSalaries = new HashMap<>();
        employeeSalaries.put(new Employee(1, "Alice"), 50000.0);
        employeeSalaries.put(new Employee(2, "Bob"), 60000.0);
        System.out.println(employeeSalaries);
    }
}

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id && name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}
