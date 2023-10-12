import java.util.Scanner;
import java.lang.Math;

public class SystemFirstDegreeEquations{

    public static void main(String[] args)
    {
        Menu() ; 
    }

    static void Menu() {
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("This is Menu\n") ;
        System.out.print("1.First-Degree-Equation\n") ;
        System.out.print("2.System-First-Degree-Equation\n") ;
        System.out.print("3.SecondDegreeEquation\n") ;
        System.out.print("Please choose the fuction ") ;
        int menu = scanner.nextInt() ;

        if(menu == 1) FirstDegreeEquation() ;
         else if (menu == 2) SystemFirstDegreeEquation() ;
          else if (menu == 3) SecondDegreeEquation() ;

    }

    static void FirstDegreeEquation()
    {

        // ax + b = 0 ;
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Input valid of a ") ;
        double a = scanner.nextDouble() ;

        System.out.print("Input valid of b ") ;
        double b = scanner.nextDouble() ;

        if(a == 0 && b != 0) System.out.print("The equation has no solution ") ;
        else if (a == 0 && b == 0) System.out.print("Infinitely many roots") ;
        else {
            System.out.print("The equation has an equation " + (b/a)) ;
        }
    }

    static void SystemFirstDegreeEquation()
    {
        Scanner scanner = new Scanner(System.in) ;
        Double a[][] = new Double[2][2] ;
        Double b[] = new Double[2] ;

        System.out.print("Input matrix a ") ;

        for(int i=0; i < 2; i++)
        {
            for(int j=0 ; j<2; j++)
            {
                a[i][j] = scanner.nextDouble() ;
            }
        }

        System.out.print("Input b1 b2 ") ;

        for(int i=0; i<2; i++)
        {
            b[i] = scanner.nextDouble() ;
        }

        Double D = a[0][0]*a[1][1] - a[1][0]*a[0][1] ;
        Double D1 = b[0]*a[1][1] - b[1]*a[0][1] ;
        Double D2 = a[0][0]*b[1] - a[1][0]*b[0] ;

        if(D != 0) System.out.print("The system has an equation " + "(" + (D1/D) + ";" + (D2/D)  + ")") ;
         else if ( D==0 && (D1 != 0 || D2 != 0) ) System.out.print("The system has no sulution") ;
          else if ( D == 0 && D1 == 0 && D2 == 0) System.out.print("Infinitely many roots") ;
    }

       static void SecondDegreeEquation()
       {
           Scanner scanner = new Scanner(System.in) ;
           System.out.print("Input a ") ;
           Double a = scanner.nextDouble() ;
           System.out.print("Input b ") ;
           Double b = scanner.nextDouble() ;
           System.out.print("Input c ") ;
           Double c = scanner.nextDouble() ;

           if(a == 0) FirstDegreeEquation() ;
           double delta = b*b - 4*a*c ;

           if(delta < 0) System.out.print("The equation has no solution") ;
            else if (delta == 0) System.out.print("The equation has an solution x1 = x2 = " + (-b/(2*a)) ) ;
             else
           {
                System.out.print("The equation has two solution\n") ;
                System.out.print("x1 = " + ((-b+Math.sqrt(delta))/(2*a)) + "\n") ;
                System.out.print("x2 = " + ((-b-Math.sqrt(delta))/(2*a))) ;
           }

       }
    
}