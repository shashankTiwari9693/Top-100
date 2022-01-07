//Sum of digits of a number

/* 
while(a!=0)
        {
            last=a%10;
            sum=sum+last;
            a=a/10;
        }
*/


import javax.sound.midi.SysexMessage;
import java.util.*;
public class Q2_Even_or_Odd_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter a no");
        int a=sc.nextInt();
        int sum=0;
        int last=0;
        while(a!=0)
        {
            last=a%10;
            sum=sum+last;
            a=a/10;
        }
System.out.println(sum);
    }

}
