import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImportance {
    // Definition for Employee.
    static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }

    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/employee-importance/solution/yuan-gong-de-zhong-yao-xing-by-leetcode-h6xre/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    Map<Integer,Employee> map = new HashMap<Integer,Employee>();

    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return dfs(id);
    }

    public int dfs(int id) {
        Employee employee = map.get(id);
        int total = employee.importance;
        List<Integer> subordinates = employee.subordinates;
        for (int subId : subordinates) {
            total += dfs(subId);
        }
        return total;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        List<Integer> integers1 = new ArrayList<>();
        integers1.add(2);
        integers1.add(3);
        employee1.id = 1;
        employee1.importance = 5;
        employee1.subordinates = integers1;
        Employee employee2 = new Employee();
        List<Integer> integers2 = new ArrayList<>();
        employee2.id = 2;
        employee2.importance = 3;
        employee2.subordinates = integers2;
        Employee employee3 = new Employee();
        List<Integer> integers3 = new ArrayList<>();
        employee3.id = 3;
        employee3.importance = 3;
        employee3.subordinates = integers3;
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        EmployeeImportance employeeImportance = new EmployeeImportance();
        int importance = employeeImportance.getImportance(employees, 1);
        System.out.println(importance);
    }
}
