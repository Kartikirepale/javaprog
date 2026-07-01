package basicsofjava;

import java.util.Scanner;

public class inputwala {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sp = sc.nextInt();
        int cp=sc.nextInt();
        if(sp>cp){
            System.out.println("the profit is :");
            System.out.println(sp-cp);
        }
        else{
            System.out.println("the loss is ");
            System.out.println(cp-sp);
        }

    }
}
