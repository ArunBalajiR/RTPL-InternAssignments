import java.io.*;
import java.util.Scanner;
class area{
    int length;
    int breadth;
    area(int a, int b)
    {
         length = a;
         breadth = b;
    }
    public int returnarea()
    {
        return length * breadth;
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the lenght of Recatangle");
         a = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the breadth of Recatangle");
        b = obj.nextInt();
        area ob1 = new area(a,b);
        System.out.println("Area = "+ ob1.returnarea());
    }
}