import java.io.*;
import java.util.*;



 class triangle1{
     int a=3,b=4,c=5;
     
     double s,area;
     public static void main (String[] args){
         triangle1 tri=new triangle1();
         
     }
     public  triangle1(){
         s=((a+b+c)/2.0);
         area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
         System.out.println("Area of triangle:"+area);
         System.out.println("perimeter of triangle:"+ (a+b+c)/2);
         
         
     }
 }