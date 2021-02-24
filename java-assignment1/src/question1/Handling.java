package question1;
import java.util.List;
import java.util.NoSuchElementException;
public class Handling 
{

	List<Employee> employeeList = Depart.getEmployeeList(); 
	
	public String getOrganizationNameOfEmployee(String Id) {
	   	   
			if(Id.compareTo("1")==0) 
			{	
				return "HR";
			}
			else if(Id.compareTo("2")==0)
			{
				return "Technical";
			}
			else if(Id.compareTo("3")==0)
			{
				return "Finance";
			}
			else if(Id.compareTo("4")==0)
			{
				return "Training";
			}
				
			else 
			{
				throw new NoSuchElementException ("No Employee Found with ID : "+Id);
			}

}
		public String  getEmployeesInEachDepart(String name)
	{
		   	   
			boolean found=false;

			for(Employee obj : employeeList) {

			   if(obj.getName().equals(name)) {

			      found = true;
			   }
			}
			if(found==true) {
				return name;
			}
			else {
		throw new NoSuchElementException ("No Employee Found with name : "+name);
			}

	}
}
	
	
	
	


