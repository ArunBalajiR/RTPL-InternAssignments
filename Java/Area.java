import java.io.*;
import java.util.*;


public class Area{
	int lenght,breadth;
	public   void setDim(int a,int b){
         	lenght=a;
			 breadth=b;
			 
	}
	public  int getArea() {
	
	int res=lenght*breadth;
	return res;
	}	
	public static void main(String[] args){
	Scanner sc=new Scanner (System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();

	Area obj=new Area();
	obj.setDim(a,b);
	System.out.print("Area="+ obj.getArea());
	}
	
}