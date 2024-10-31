package Integracao;

import java.util.Scanner;

public class Integracao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;
        
        do {
            // Exibe o menu de opções
            System.out.println("Menu:");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular Metabolismo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.next();

            switch (opcao) {
                case "1":
                    calcularIMC(sc);
                    break;
                case "2":
                    calcularMetabolismo(sc);
                    break;
                case "3":
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        } while (!opcao.equals("3"));
        
        sc.close();
    }

    // Método para calcular o IMC
    public static void calcularIMC(Scanner sc) {
		
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
    }

    // Método fictício para calcular o metabolismo (substitua pela fórmula correta)
    public static void calcularMetabolismo(Scanner sc) {
for (boolean i = true; i;) {
			
			System.out.print("Informe o seu gênero, 1 para Homem e 2 para Mulher. ");
			int genero = sc.nextInt();
			
			if (genero == 1 || genero == 2) {
				System.out.print("Informe uma idade em anos acima de 17: ");
				int idade = sc.nextInt();
				if (idade >= 18) {
					System.out.print("Informe seu peso: ");
					float peso = sc.nextFloat();
					
					if (genero == 1) {
						if (idade >= 18 && idade <= 30) {
							float M_B_H = (float)15.057 * peso + 697;
							System.out.println("Seu metabolismo Basal e de "+M_B_H);
						}
						else if (idade > 30 && idade <= 60) {
							float M_B_H = (float)11.6 * peso + 879;
							System.out.println("Seu metabolismo Basal e de "+M_B_H);
						}
						else if (idade > 60) {
							float M_B_H = (float)13.5 * peso + 487;
							System.out.println("Seu metabolismo Basal e de "+M_B_H);
						}
					}
						else if (genero == 2) {
							if (idade >= 18 && idade <= 30) {
								float M_B_H = (float)14.7 * peso + (float)486.6;
								System.out.println("Seu metabolismo Basal e de "+M_B_H);
							}
							else if (idade > 30 && idade <= 60) {
								float M_B_H = (float)8.7 * peso + 829;
								System.out.println("Seu metabolismo Basal e de "+M_B_H);
							}
							else if (idade > 60) {
								float M_B_H = (float)10.5 * peso + 596;
								System.out.println("Seu metabolismo Basal e de "+M_B_H);
							}
						}
				}
				else {
					System.out.println("Essa idade "+idade+" não é valida. Informe uma idade valida.");
				}
			}
			else {
				System.out.println("Essa opção "+genero+" não é valida. Digite 1 para Homem e 2 para Mulher.");
			}
			System.out.print("Deseja realizar outro cálculo? (s/n): ");
			char resposta = sc.next().charAt(0);
			if (resposta == 'n' || resposta == 'N') {
				i = false;
			}
		}
    }
}

