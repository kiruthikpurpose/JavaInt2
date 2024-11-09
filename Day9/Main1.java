class Employee1 {
    private String name;
    private int id;
    private Department department;

    public Employee1(String name, int id, String departmentName, String location) {
        this.name = name;
        this.id = id;
        this.department = new Department(departmentName, location);
    }

    public String getEmployeeDetails() {
        return "Employee Name: " + name + ", ID: " + id + ", Department: " + department.departmentName + ", Location: " + department.location;
    }

    private class Department {
        private String departmentName;
        private String location;

        public Department(String departmentName, String location) {
            this.departmentName = departmentName;
            this.location = location;
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        Employee1 employee1 = new Employee1("Alice", 101, "HR", "New York");
        System.out.println(employee1.getEmployeeDetails());

        Employee1 employee2 = new Employee1("Bob", 102, "IT", "San Francisco");
        System.out.println(employee2.getEmployeeDetails());

        Employee1 employee3 = new Employee1("Charlie", 103, "Finance", "Chicago");
        System.out.println(employee3.getEmployeeDetails());
    }
}
