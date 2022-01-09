// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//Reverse of a number
class HelloWorld {
    public static void main(String[] args) {
        int a=345;
        int rem=0;
        int rev=0;
        while(a!=0)
        {
            rem = a%10;
            rev = rev*10+rem;
            a=a/10;
        }
        System.out.println(rev);
    }
}
