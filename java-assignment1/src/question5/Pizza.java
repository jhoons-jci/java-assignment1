package question5;

import java.util.*;
public class Pizza {
static ArrayList<String>A=new ArrayList<String>();
static HashMap<String,List<String>>list=new HashMap<String,List<String>>();
static HashMap<String,String>list1=new HashMap<String,String>();
static  void value()
{
	list.put("chandigarh", Arrays.asList("24seven", "PizzaLover", "dark bite" ));
	list.put("dehradun", Arrays.asList( "Pizza Hub", "dominos", "Chicago pizza" ));
	list.put("rohtak",Arrays.asList("Italiano", "Pizza Hut", "Dominik"));
	list.put("delhi", Arrays.asList( "US pizza", "crunchy bite", "pizza place" ));
	list.put("banglore", Arrays.asList( "sams pizza", "La Pinoz", "Bon pizza" ));
	list1.put("24seven", "32 krishan nagar, Chandigarh");
	list1.put("PizzaLover", "55 Rajpur Road, Chandigarh");
	list1.put("dark bite", "kaulagarh road, Chandigarh");
	list1.put("Pizza Hub", "Ballupur Road, Dehradun");
	list1.put("dominos", "sector 17, Dehradun");
	list1.put("Chicago pizza", "18 Jakkhan, Dehradun ");
	list1.put("Italiano", "Kishan road, Rohtak");
	list1.put("Pizza Hut", "Sector 15, Rohtak");
	list1.put("Dominik", "Karanpur road, Rohtak");
	list1.put("US pizza", "Connaught Place, Delhi");
	list1.put("crunchy bite", "Ambience Mall, Delhi");
	list1.put("pizza place", "Connaught Place, Delhi");
	list1.put("sams pizza", "Pacific mall, Banglore");
	list1.put("La Pinoz", "Vasanth Nagar, Banglore");
	list1.put("Bon pizza", "Binnamangala Extension, Banglore");	
}
 List<String> getPizzaShop(String str)
{
	 if(str==null || str.isEmpty())
		   throw new RuntimeException("City cannot be null");
     if(list.size()==0)
    	 value();
     
  if(list.containsKey(str)) {
	  
	  return   list.get(str);
  }  
  ArrayList<String>A1=new ArrayList<String>();
  A1.add("Not Present");
  return A1 ;
}

public String   location(String str){
	 if(str==null || str.isEmpty())
		   throw new RuntimeException("Restaurant name cannot be null");
	 
     if(list==null && A==null)
   	 value();

for(Map.Entry<String,String>e: list1.entrySet()) 
{
	String A1=e.getKey();
	if(A1.contains(str)) 
	{
		return e.getValue();
	}
}
return "Not Present";
    }


}





