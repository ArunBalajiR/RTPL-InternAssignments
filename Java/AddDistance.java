import java.io.*;
import java.util.*;

class AddDistance
{

double feet , inches;

void getdistance() {

Scanner in = new Scanner(System.in);

System.out.print("Enter feet> ");

feet = in.nextDouble();

System.out.print("Enter inches> ");

inches = in.nextDouble();

}
void addDist(Distance d1, Distance d2)

{

double sumofFeet = d1.feet + d2.feet;

double sumofInch = d1.inches + d2.inches;

System.out.println(sumofFeet + " " + sumofInch);

}



public static void main (String[] args)

{

   AddDistance d1 = new AddDistance();

   AddDistance d2 = new AddDistance();


System.out.println("Enter first distance ");

d1.getdistance();
System.out.println("Enter second distance ");

d2.getdistance(); 
d1.addDist(d1,d2); 

} }