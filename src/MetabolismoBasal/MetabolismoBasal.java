package MetabolismoBasal;

import java.util.Scanner;

public class MetabolismoBasal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
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
        sc.close();
	}
}
