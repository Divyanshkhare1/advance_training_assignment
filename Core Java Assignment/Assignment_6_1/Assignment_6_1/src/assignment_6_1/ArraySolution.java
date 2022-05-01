package assignment_6_1;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class ArraySolution{
	static void solve()
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    ArrayList<String> Names=new ArrayList<String>();
	    int option=-1;
	    System.out.println("_____Assignment_6.1 ArrayList Program_____");
	    try{
	    
	    while(option!=3)
	    {
	        System.out.println("\nEnter the option\n1.Add a name\n2.Check a name\n3.Exit");
	        option=Integer.parseInt(br.readLine());
	        switch(option)
	        {
	            case 1:
	            {
	                System.out.println("Enter the name :");
	                String temp=br.readLine();
	                Names.add(temp);
	                System.out.println(temp+" had been added to List");
	                break;
	            }
	            case 2:
	            {
	                System.out.println("Enter the name to he searched :");
	                String temp=br.readLine();
	                if(Names.indexOf(temp)>=0)
	                System.out.println(temp+" is present in List");
	                else System.out.println(temp+" is not found in List");
	                break;
	            }
	        }
	    }
	    
	    }
	    catch(Exception e)
	    {
	        System.out.println(e);
	    }
	    finally
	    {
	        System.out.println("Program Complete");
	    }
	}
	public static void main(String[] args) {
		solve();
	}
}