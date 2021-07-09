import java.io.*;
import java.util.*;

public class Rectangle1{
    int lenght;
    int breath;

    Rectangle1(int l, int b) {
        this.lenght = l;
        this.breath = b;
    }

    public int area()
    {
        return lenght * breath;
    }

    public static void main(String[] args) {
        Rectangle1 obj = new Rectangle1(4,5);
        Rectangle1 obj1 = new Rectangle1(5,8);

        System.out.println(obj.area());
        System.out.println(obj1.area());





    }


}