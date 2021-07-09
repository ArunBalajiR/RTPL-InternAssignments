import java.io.*;
import java.util.*;

class Matrix1{
  public static void main(String[] args){
  int[][] a=new int[100][100];
  
  int r;
  int c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter No of rows:");
    r=sc.nextInt();
  System.out.println("Enter No of column:");
  c=sc.nextInt();
  System.out.println(" Enter Matr4ix for "+r+","+c);
    
    for(int i = 0;i<r;i++){
        for(int j = 0;j<c;j++){
          a[i][j]=sc.nextInt();
        }
        
      }
System.out.println("Matrix is:");
  for(int i = 0;i<r;i++){
      
      System.out.println("\n");
        for(int j = 0;j<c;j++){
          System.out.print("\t"+a[i][j]);
        }
        
      }
    
 
  
  
  }
  
}