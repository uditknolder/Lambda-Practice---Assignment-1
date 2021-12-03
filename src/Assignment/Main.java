package Assignment;

import java.util.Scanner;
public class Main{

        public static void main(String[] args) {

            Interface result= (a,b) -> Math.max(a,b);


            Scanner sc =new Scanner(System.in);
            System.out.println("Enter first numbers: ");
            int a= sc.nextInt();
            System.out.println("\nEnter second numbers: ");
            int b=sc.nextInt();
            System.out.println("\nMaximum from two numbers is: ");
            System.out.println(result.maxcheck(a,b));
        }






}
