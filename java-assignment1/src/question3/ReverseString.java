package question3;
import java.util.Stack;
import java.util.regex.Pattern;

	public class ReverseString 
	{
			     String reverses(String str)
			     {
			    	 if(str == null || str.isEmpty())
			    	 {
			    	        throw new RuntimeException("Cannot Have Null String");

			    	    }
			    	    else
			    	    {
			         Pattern pattern = Pattern.compile("\\s"); 
			      
			            String[] temp = pattern.split(str); 
			            String result = ""; 
			       
			            for (int i = 0; i < temp.length; i++)
			            { 
			                if (i == temp.length - 1) 
			                    result = temp[i] + result; 
			                else
			                    result = " " + temp[i] + result; 
			            } 
			            return result; 
			    }
			    	 }
			    
			   void reverseWords(String str) 
			    { 
			        Stack<Character> st=new Stack<Character>(); 
			        for (int i = 0; i < str.length(); ++i) { 
			            if (str.charAt(i) != ' ') 
			                st.push(str.charAt(i));  
			            else 
			            { 
			                while (st.empty() == false) { 
			                    System.out.print(st.pop()); 
			                      
			                } 
			                System.out.print(" "); 
			            } 
			        } 
			        while (st.empty() == false) { 
			            System.out.print(st.pop()); 
			              
			        } 
			    }


			}





