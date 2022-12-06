package entities;
import java.util.Scanner;
public class CalculoIMC extends Pessoa{

		Scanner ler = new Scanner(System.in);
	     
	      double imc1;
	      String classifica1;
	 
	  /*    System.out.println("Nome da Pessoa 1: ");
	      String nome = ler.nextLine();
	      System.out.println("Peso da Pessoa 1 (kg): ");
	      double peso= ler.nextDouble();
	      System.out.println("Altura da Pessoa 1 (m): ");
	      double altura = ler.nextDouble();
	      ler.nextLine();
	      
	      imc1 = calcularIMC(peso,altura);
	 
	      classifica1 = resultadoIMC(imc1);
	 
	      System.out.printf("IMC da Pessoa 1 = %.1f - %s\n",imc1,classifica1);
	 
	     System.out.println("A Pessoa \""+nome+"\" tem Maior IMC");
	      
	      }*/
	 
	   
	  public CalculoIMC(Scanner ler, double imc1, String classifica1) {
		super();
		this.ler = ler;
		this.imc1 = imc1;
		this.classifica1 = classifica1;
	}

	   public double calcularIMC(double peso, double altura)
	   {
	      return peso/(altura*altura);
	   }


	  

	static String resultadoIMC(double imc)
	   {
	      String result;
	      if (imc <= 19)
	         result = "Abaixo do Peso";
	      else
	         if (imc <= 25)
	            result = "Peso ideal";
	         else
	            if (imc <= 30)
	               result = "Acima do Peso";
	            else
	               if (imc <= 35)
	                  result = "Obesidade Leve";
	               else
	                  result = "Obesidade"; 
	      
	      return result;

	}

}
