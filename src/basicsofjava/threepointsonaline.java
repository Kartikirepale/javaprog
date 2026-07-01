package basicsofjava;
import java.util.Scanner;
public class threepointsonaline {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x= sc.nextDouble(),
                y=sc.nextDouble(),
                x1=sc.nextDouble()
                ,y1=sc.nextDouble(),
                r=sc.nextDouble();
        double distance = (x1 -x ) * (x1 - x) + (y1 - y) * (y1 - y);

        if (distance < r * r) {
            System.out.println("Point is INSIDE the circle");
        } else if (distance == r * r) {
            System.out.println("Point is ON the circle");
        } else {
            System.out.println("Point is OUTSIDE the circle");
        }

        sc.close();
    }
}