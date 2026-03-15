import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
class Employee {
    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {
        System.out.println(id + " " + name + " " + department);
    }
}
public class EmployeeHashMapDemo{
    public static void main(String[] args){
        HashMap<Integer,Employee>empMap=new HashMap<>();
        empMap.put(101,new Employee(101,"Raksha","IT"));
        empMap.put(102,new Employee(102,"surabhi","HR"));
        empMap.put(103,new Employee(103,"suma","Finance"));
        empMap.put(104,new Employee(104,"shivani","Marketing"));
        System.out.println("employee with ID 102:");
        Employee e=empMap.get(102);
        e.display();
        if(empMap.containsKey(103)) {
            System.out.println("\nEmployee 103 exists in the system");
        }
        System.out.println("\n All Employee:");
        for(Map.Entry<Integer,Employee>entry:empMap.entrySet()){
            entry.getValue().display();
        }
        empMap.remove(101);

        System.out.println("\nAfter removing employee 101: ");
        for(Employee emp: empMap.values()){
            emp.display();
        }
        System.out.println("\nTotal Employees: "+empMap.size());
    }
}
