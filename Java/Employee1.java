import java.io.*;
import java.util.*;

class Employee1{
  private String name, address;
  private int year, salary;
  public Employee1(String n, int y, int sal, String add){
    name = n;
    year = y;
    salary = sal;
    address = add;
  }
  public String getName(){
    return name;
  }
  public int getYear(){
    return year;
  }
  public int getSalary(){
    return salary;
  }
  public String getAddress(){
    return address;
  }

  public static void main(String[] args){
    Employee1 e1 = new Employee1("Robert", 1994, 500000, "64C- WallsStreet");
    Employee1 e2 = new Employee1("Sam", 2000, 740000, "68d- WallsStreet");
    Employee1 e3 = new Employee1("John", 1999, 600000, "26B- WallsStreet");
    System.out.println("Name\tYear of joining\tSalary\tAddress");
    System.out.println(e1.getName()+"\t"+e1.getYear()+"\t\t\t"+e1.getSalary()+"\t"+e1.getAddress());  // printing details of employee 1
    System.out.println(e2.getName()+"\t"+e2.getYear()+"\t\t\t"+e2.getSalary()+"\t"+e2.getAddress());  // printing details of employee 2
    System.out.println(e3.getName()+"\t"+e3.getYear()+"\t\t\t"+e3.getSalary()+"\t"+e3.getAddress());  // printing details of employee 3
  }
}
