package assignment_3_2;

import java.util.Random;

class medicine
{
String companyName;
String address;
medicine(String x,String y)
{
companyName=x;
address=y;
}
public void displayLabel()
{
System.out.println("Company Name:"+companyName);
System.out.println("Address:"+address);
}
}
class tablet extends medicine
{
tablet(String x,String y)
{
super(x,y);
}
public void displayLabel()
{
super.displayLabel();
System.out.println("Store in a cool place");
}
}
class syrup extends medicine
{
syrup(String x,String y)
{
super(x,y);
}
public void displayLabel()
{
super.displayLabel();
System.out.println("Use: As prescribed by the medical practitioner");
}
}
class ointment extends medicine
{
ointment(String x,String y)
{
super(x,y);
}
public void displayLabel()
{
super.displayLabel();
System.out.println("For external use only");
}
}
public class testmedicine
{
public static void main(String [] args)
{
medicine med[]=new medicine[10];
Random rnd=new Random();
int num=0;
for(int i=0;i<10;i++)
{
num=rnd.nextInt(3);
if(num==0)
med[i]=new tablet("Tech Pharmaceuticals","Pune");
else if(num==1)
med[i]=new syrup("Mahindra Pharmaceuticals","Banglore");
else
med[i]=new ointment("MBT Pharmaceuticals","Mumbai");
med[i].displayLabel();
System.out.println();
}
}
}