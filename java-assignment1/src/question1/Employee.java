package question1;

class Employee implements Comparable<Employee>
{
	
	    String name;
	    String id;
	    double salary;
	     String deptid;
	  

		public Employee(String id, String name, String deptid, double salary) {
			// TODO Auto-generated constructor stub
			this.id = id;
	        this.name = name;
	        this.deptid=deptid;
	        this.salary = salary;
		}

		public String getId() 
	    {
	        return id;
	    }
	     
	    public String getName() 
	    {
	        return name;
	    }
	     
	    public String getDeptId() 
	    {
	        return deptid;
	    }
	    public double getSalary() 
	    {
	        return salary;
	    }
	   
	    @Override
	    public String toString() 
	    {
	        return "Id : "+id
	                +", Name : "+name
	                +", deptid : "+deptid
	                +", Salary : "+salary
	       ;
	    }

		@Override
		public int compareTo(Employee o) {
			// TODO Auto-generated method stub
			return 0;
			
		}
   
}