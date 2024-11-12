import java.io.*;
import java.util.*;

class Main
  {
    public static void main(string[] args)
    {
      Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    if(n==0)
    {
      System.out.println("Neither Even nor Odd");
    }
    else if(n%2==0)
    {
      System.out.println("Even");
    }
    else
    {
      System.out.println("Odd");
    }
    }
  }
