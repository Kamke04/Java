package aplication;
import java.util.Scanner;

import entities.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Sexo: ");
		String sexo = sc.nextLine();
		
		System.out.println("Biotipo: ");
		String biotipo = sc.nextLine();
		
		System.out.println("Meta: ");
		String meta = sc.nextLine();
		

		System.out.println("Email: ");
		String email = sc.nextLine();
		
		
		System.out.println("Senha: ");
		String senha = sc.nextLine();
		
		System.out.println("Idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Peso: ");
		double peso = sc.nextInt();
		
		System.out.println("Altura: ");
		double altura = sc.nextDouble();
		
		Pessoa p1 = new Pessoa(nome, sexo, biotipo, meta, email, senha, idade, peso, altura);
		p1.calcularIMC(peso, altura);
		
		

	sc.close();
		

	}

}
