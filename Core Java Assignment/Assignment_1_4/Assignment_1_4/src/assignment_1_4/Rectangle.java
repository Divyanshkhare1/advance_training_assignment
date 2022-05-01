package assignment_1_4;

class Rectangle_rectangle{
	private float length;
	private float breadth;
	Rectangle_rectangle()
	{
	length=1;
	breadth=1;
	}
	public void set(float x,float y)
	{
	if(x<=0 || x>=20 || y<=0 || y>=20)
	{
	 System.out.println("Length and breath should be > 0 and < 20");
	 length=1;
	 breadth=1;
	}
	else
	{
	 length=x;
	 breadth=y;
	}
	}
	public float getl()
	{
	return length;
	}
	public float getb()
	{
	return breadth;
	}
	public float area()
	{
	return length*breadth;
	}
	public float perimeter()
	{
	return (2*length)+(2*breadth);
	}
	}


public class Rectangle {

	public static void main(String[] args) {
		
		Rectangle_rectangle r1=new Rectangle_rectangle();
		Rectangle_rectangle r2=new Rectangle_rectangle();
		r1.set(9,3);
		System.out.println("Length of r1 ="+r1.getl());
		System.out.println("Breadth of r1="+r1.getb());
		System.out.println("Area of r1 ="+r1.area());
		System.out.println("Perimeter of r1="+r1.perimeter());
		System.out.println();
		r2.set(23,3);
		System.out.println("Length of r2 ="+r2.getl());
		System.out.println("Breadth of r2="+r2.getb());
		System.out.println("Area of r2 ="+r2.area());
		System.out.println("Perimeter of r2="+r2.perimeter());

	}

}
