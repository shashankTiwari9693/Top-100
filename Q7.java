//Greatest of the Three numbers:
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("a ");
    int a=sc.nextInt();
    System.out.println("b");
    int b=sc.nextInt();
    System.out.println("c");
    int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("a is greather");
    }
        else if(b>a && b>c){
            System.out.println("b is greather");
        }
        else{
            System.out.println("c is greather");
        }
    }
}
