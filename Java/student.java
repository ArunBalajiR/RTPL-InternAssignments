import java.io.*;
import java.util.*;


public class student {
    String name,address;
    int roll_no;
    double phno;
public static void main (String[] args) {
        student st1=new student();
        student st2=new student();
        st1.get();
        st2.get();
        st1.print();
        st2.print();
        
    }
    public void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name:");
        name=sc.nextLine();
        System.out.println("enter rollno:");
        roll_no=sc.nextInt();
        System.out.println("enter address:");
        address=sc.nextLine();
        System.out.println("enter phno:");
        phno=sc.nextDouble();
    }
    public void print(){
        System.out.println(" name:"+ name);
        System.out.println(" address:"+address);
        System.out.println("roll no:"+ roll_no);
        System.out.println("phone no:"+phno);
    }
}
