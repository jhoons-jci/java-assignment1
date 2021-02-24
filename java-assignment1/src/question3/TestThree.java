package question3;

import java.util.Scanner;

public class TestThree 
{

		    public static void main(String[] args) {
		         ReverseString res=new ReverseString();
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the string");
		        String str;
		        str = sc.nextLine();
		        String res1 = res.reverses(str);
		       res. reverseWords(res1);
		        sc.close();
		    }

		}

