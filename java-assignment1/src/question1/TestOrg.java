package question1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

	public class TestOrg 
	{ 
			    public static void main(String args[])
			    {	         
			        List<Employee> employeeList = Depart.getEmployeeList();   	    	
			        Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);
			        Map<String, Optional<Employee>> collect = 
			                employeeList.stream().collect(
			                    Collectors.groupingBy(
			                        Employee::getDeptId,
			                        Collectors.reducing(BinaryOperator.maxBy(bySalary))
			            )
			        );
			      
			        Depart address = new Depart(null);
			                address.setDepartmentName("1=HR , 2=Technical , 3=Finance , 4=Training ");
			                
			      System.out.println(address);
			        collect.entrySet().stream().forEach(System.out::println);
			        Handling obj=new Handling();
			        Handling obj1=new Handling();
			        try (Scanner sc = new Scanner (System.in)) {
						System.out.println("Enter the Name of the employee ");
						String name=sc.nextLine();
      
						String a=obj.getEmployeesInEachDepart(name);
						
						System.out.println("found employee with name : "+a);
						System.out.println("Enter the department ID of employee to know the department");
						String id=sc.nextLine();
						String b=obj1.getOrganizationNameOfEmployee(id);
      
						System.out.println("employee with id : "+id+" has department : "+b);
					}
			    
			    
		}
}	


