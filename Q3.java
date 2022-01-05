//Sum of First N Natural numbers
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=i+sum;
        }
        System.out.println(sum);
    }
}
