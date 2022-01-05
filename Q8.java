//Leap year or not:
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("year");
    int a=sc.nextInt();
    if(a%100==0)
    {
        if(a%400==0)
        {
        System.out.println("yes leap yearr");
    }
    else{
        System.out.println("no leap yearr");
    }
    }
    else if (a%4==0){
        System.out.println("yes leap yearr");
    }
    else{
        System.out.println("no leap yearr");
    }
    }
}
