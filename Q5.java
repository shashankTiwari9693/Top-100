//Sum of numbers in a given range

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
            sum=i+sum;
        }
        System.out.println(sum);
    }
}
