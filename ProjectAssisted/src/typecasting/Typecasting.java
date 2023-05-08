package typecasting;
import java.util.Scanner; 
public class Typecasting {
	 public static void main(String[] args) 
	  {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        int i=sc.nextInt();
	        long l = i;  
	        float f = l;  
	        double d= f;
	        System.out.println("widening type:");
	        System.out.println("Int value "+i); 
	        System.out.println("Long value "+l); 
	        System.out.println("Float value "+f); 
	        System.out.println("Double value "+d); 
	        Scanner sc1 = new Scanner(System.in);
	        System.out.println("Enter the number: ");
	        double a=sc1.nextDouble();
	        float b=(float)a;
	        long c = (long)a; 
	        int e = (int)c;
	        System.out.println("narrowing type: ");
	        System.out.println("Double value: "+a); 
	        System.out.println("Float value: "+b);
	        System.out.println("Long value: "+c);  
	        System.out.println("Int value: "+e);  

	  }
}
