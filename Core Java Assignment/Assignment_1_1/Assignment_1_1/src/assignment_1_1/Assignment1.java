package assignment_1_1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
        int n;
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2 == 0)
            {
                System.out.println(i); 
            }
        }
	}
}
