import java.io.*;
import java.util.Scanner;

class Employee

{
    double salary; 
int hours;


public void getInfo()

{
Scanner in = new Scanner(System.in);


System.out.println("Enter your salary");

 salary = in.nextDouble();

System.out.println("Enter the no.of working hours");

 hours = in.nextInt();

}


public void AddSal()

{


if(salary < 500)

salary = salary + 10;

System.out.println("Salary: " + salary);

}

public void AddWork()

{


if(hours > 6)

salary =salary + 5;

System.out.println("Salary: " + salary);

}

public static void main(String[] args)

{

Scanner in = new Scanner(System.in);

Employee obj = new Employee();

obj.getInfo();

obj.AddSal();

obj.AddWork();

}

}

