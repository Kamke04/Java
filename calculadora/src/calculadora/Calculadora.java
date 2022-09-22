package calculadora;

import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);
    double num1;
    double num2;

    public static void menu(){
        System.out.println("Primeiro numero:?");
        double num1 = sc.nextDouble();
        System.out.println("Segundo numero:?");
        double num2 = sc.nextDouble();
    }


    public double soma() {
    	System.out.println("Primeiro numero:?");
        double num1 = sc.nextDouble();
        System.out.println("Segundo numero:?");
        double num2 = sc.nextDouble();
        return num1 + num2;
    }

    public double subtracao(){
    	System.out.println("Primeiro numero:?");
        double num1 = sc.nextDouble();
        System.out.println("Segundo numero:?");
        double num2 = sc.nextDouble();
        return num1 - num2;
    }

    public double multiplicacao(){
    	System.out.println("Primeiro numero:?");
        double num1 = sc.nextDouble();
        System.out.println("Segundo numero:?");
        double num2 = sc.nextDouble();
        return num1 * num2;
        
    } 
   
        public double porcentagem(){
        	System.out.println("Primeiro numero:?");
            double num1 = sc.nextDouble();
            System.out.println("Segundo numero:?");
            double num2 = sc.nextDouble();
            return Math.pow(num1, num2);
    }
        
        public double raizQuadrada(){
            System.out.println("Primeiro numero:?");
            double num1 = sc.nextDouble();
            return Math.sqrt(num1);
    }

    public double potenciacao(){
    	System.out.println("Primeiro numero:?");
        double num1 = sc.nextDouble();
        System.out.println("Segundo numero:?");
        double num2 = sc.nextDouble();
        return Math.pow(num1, num2);
    }
    
    public double divisao() {
    	System.out.println("Primeiro numero:?");
    	double num1 = sc.nextDouble();
    	System.out.println("Segundo numero:?");
    	double num2 = sc.nextDouble();
    	return num1/num2;
    	
    }
    
}