import java.util.Scanner;
public class Q2 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the co-efficient of x^2: ");
        int a = s.nextInt();
        System.out.print("Enter the co-efficient of x: ");
        int b = s.nextInt();
        System.out.print("Enter the value of Constant: ");
        int c = s.nextInt();
        double res1 = 0;
        double res2 = 0;
        double sqrt_part = (b*b) - (4*a*c); 
        if(sqrt_part>0){
            res1 = (-b+Math.sqrt(sqrt_part))/2*a;
            res1 = (-b-Math.sqrt(sqrt_part))/2*a;
            System.out.println("The roots are different and real, the values are: "+res1+" and "+res2);
        }
        else if(sqrt_part==0){
            res1 = -b/(2*a);
            System.out.println("The roots are same and real, the values is: "+res1);
        }
        else if(sqrt_part<0){
            double real_part = -b/(2*a);
            double imaginary_Part = sqrt_part/(2*a);
            System.out.println("The roots are different and un-real, the values are: "+ real_part+"+"+(imaginary_Part*-1)+"i & " + real_part+"-"+(imaginary_Part*-1)+"i");
        }
    }
}
