package es.iessoterhernandez.daw.endes.fibonacciMain;
import java.util.Scanner;
import es.iessoterhernandez.daw.endes.fibonacci.fibonacci;

public class fibonacciMain {
    public static void main( String[] args ) {
    	 Scanner sc = new Scanner(System.in);
    	 int numero;
    	 do{
             System.out.print("Introduce numero mayor que 1: ");
             numero = sc.nextInt();
         }while(numero<=1);
    	 fibonacci f = new fibonacci(numero);
    	 f.calculoFibonacci();
    	 
    	 sc.close();
    }
}