package IMC;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.next();
		
		System.out.print("Informe sua altura em metros: ");
		float altura = sc.nextFloat();
		
		System.out.print("Informe seu peso em Kg: ");
		float peso = sc.nextFloat();
		
		float imc = peso / (altura * altura);
		
		if (imc < 19) {
			System.out.println(nome+", obrigado por fornecer suas informações, seu IMC é: "+ imc+" portanto você está abaixo do peso.");
		} 
		else if (imc >= 19 && imc < 25) {
			System.out.println(nome+", obrigado por fornecer suas informações, seu IMC é: "+ imc+" portanto você está no peso ideal.");
			} 
		else if (imc >= 25 && imc < 30) {
			System.out.println(nome+", obrigado por fornecer suas informações, seu IMC é: "+ imc+" portanto você está com sobrepeso.");
			}
		else if (imc >= 30 && imc < 40) {
			System.out.println(nome+", obrigado por fornecer suas informações, seu IMC é: "+ imc+" portanto você está com obesidade tipo 1.");
			}
		else if (imc >= 40) {
			System.out.println(nome+", obrigado por fornecer suas informações, seu IMC é: "+ imc+" portanto você está com obesidade mórbida.");
			}
		
        sc.close();
	}

}
