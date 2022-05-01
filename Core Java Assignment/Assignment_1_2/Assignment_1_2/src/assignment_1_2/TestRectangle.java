package assignment_1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;



class Rectangle {
	float length ;
	float breadth ;
	
 		public Rectangle(){
 			
 		}
 		
 		public Rectangle(int a,int b){
 			this.length = a;
 			this.breadth = b;
 		}
 		
 		
 		
 		public float getLength() {
			return length;
		}

		public void setLength(float f) {
			this.length = f;
		}

		public float getBreadth() {
			return breadth;
		}

		public void setBreadth(float breadth) {
			this.breadth = breadth;
		}

 		public float calculate_area(){
 			 float area = length * breadth;
 			 return area;
 		}
 		
 		public String display(){
 			return("Length of Rectangle : " + length + "\nBreadth of Rectangle : "+ breadth + "\nArea of Rectangle : " + calculate_area() );
	
	
		
	}
}
 		
 		class TestRectangle{
 			public static void main(String[] args)
 					throws IOException
 					{
 					Rectangle Rect[] = new Rectangle[6];
 					for (int i=1; i<Rect.length ; i++ )
 					{
 					Rect[i] = new Rectangle();
 					System.out.println("\nEnter the length and breadth of rectangle for "+i+" object : ");
 					BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
 					System.out.println("\nLength : ");
 					String str=b.readLine();
 					float f = Float.parseFloat(str);
 					Rect[i].setLength(f);
 					BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
 					System.out.println("Breadth : ");
 					String str1=b1.readLine();
 					float f1 = Float.parseFloat(str1);
 					Rect[i].setBreadth(f1);
 					System.out.println(Rect[i].display());
 					}
 					}
	
		
		
		
	}