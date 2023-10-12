import java.util.Scanner;

public class FirstDegreeEquation{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in) ;
        // ax + b = 0 ;

        System.out.print("Input valid of a ") ;
        double a = scanner.nextDouble() ;

        System.out.print("Input valid of b ") ;
        double b = scanner.nextDouble() ;

        if(a == 0 && b != 0) System.out.print("The equation has no solution ") ;
         else if (a == 0 && b == 0) System.out.print("Infinitely many roots") ;
          else {
            System.out.print("The equation has an equation " + (b/a)  ) ;
        }

    }
}