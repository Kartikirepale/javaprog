import java.util.Scanner;

public class big {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a =sc.nextInt();
        System.out.println("enter another number");
        int b =sc.nextInt();
        System.out.println("enter a number");
        int c =sc.nextInt();
        if (a>b &&a>c){
            System.out.println("the number a is greater");

        }
        else if (b>a && b>c){
            System.out.println("the number b is greater");
        }
        else if (c>a&&c>b){
            System.out.println("the number c is greater");
        }


    }
}

