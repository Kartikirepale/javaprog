package basicsofjava;
import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("first number");
        int a=sc.nextInt();
        System.out.println("second number");
        int b=sc.nextInt();
        System.out.println("third number");
        int c=sc.nextInt();
        if(a+b>c&& a+c>b && b+c>a){
            System.out.println("these number are sides of triangle");
        }
        else{
            System.out.println("not triangle");


    }
}}
