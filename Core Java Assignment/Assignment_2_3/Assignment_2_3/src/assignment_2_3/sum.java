package assignment_2_3;

public class sum {

	public static void main(String[] args) {
		
		int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
		A[17]=A[0];
		for(int i=0;i<15;i++)
		{
		A[15]=A[15]+A[i];
		if(A[i]<A[17]) A[17]=A[i];
		}
		A[16]=A[15]/15;
		System.out.println("Sum of elements : "+A[15]);
		System.out.println("Avg of elements : "+A[16]);
		System.out.println("Min of elements : "+A[17]);

	}

}
