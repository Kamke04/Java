package calculadora;

import java.util.Scanner;

		public class Main {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				Calculadora calculadora = new Calculadora();



				System.out.println("Calculadora:"+
									"\n1-Soma"+
									"\n2-Subtração"+
									"\n3-Multiplicação"+
									"\n4-Porcentagem"+
									"\n5-Raiz Quadrada"+
									"\n6-Divisão"+
									"\n7-Potenciação");
				int escolha = sc.nextInt();

				if(escolha == 1) {
					System.out.println(calculadora.soma());
				}else if(escolha == 2) {
					System.out.println(calculadora.subtracao());
				}else if(escolha == 3) {
					System.out.println(calculadora.multiplicacao());
				}else if(escolha == 4) {
					System.out.println(calculadora.porcentagem());
				}else if(escolha == 5) {
					System.out.println(calculadora.raizQuadrada());
				}else if(escolha == 6) {
					System.out.println(calculadora.divisao());
				}else if(escolha == 7) {
					System.out.println(calculadora.potenciacao());
				}else {
					System.out.println("Numero inválido digite de 1 a 7!");
				}
			}

		}