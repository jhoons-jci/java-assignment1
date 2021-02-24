package question1;

import java.util.ArrayList;
	class Depart 
	{
		
		
		 String departmentName;
		static String deptid;
		
		public Depart(String departmentName) {
		this.departmentName=departmentName;
		}

		    public void setDepartmentName(String departmentName) {
		       this.departmentName=departmentName;
		 }
			
		
	    public String getDeptId() 
	    {
	        return deptid;
	    }
	    public String getDepartmentName()
	    {
	    	return departmentName;
	    }
	    public static ArrayList<Employee> getEmployeeList() 
	    {
	        ArrayList<Employee> employeeList= new ArrayList<Employee>();
	        employeeList.add(new Employee("10", "simran", "1" , 85000.0));
	        employeeList.add(new Employee("120", "ani", "2", 45000.0));
	        employeeList.add(new Employee("210", "aish", "1", 16000.0));
	        employeeList.add(new Employee("150", "ananya", "3" , 34000.0));
	        employeeList.add(new Employee("150", "deeshu", "2" , 12000.0));
	        employeeList.add(new Employee("150", "ankit", "4" , 52000.0));
	        employeeList.add(new Employee("150", "malvika", "1" , 63000.0));
	        employeeList.add(new Employee("150", "muskan", "1" , 22000.0));
	        employeeList.add(new Employee("150", "shalini", "2" , 36000.0));
	        employeeList.add(new Employee("150", "aniket", "4" , 37000.0));
	        employeeList.add(new Employee("150", "tanmay", "3" , 24000.0));
	        return employeeList;
	    }
	    @Override
	    public String toString() 
	    {
	        return "departmaneName : "+departmentName
	                ;
	    }
	      
	    }






