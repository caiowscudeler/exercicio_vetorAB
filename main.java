import java.util.Arrays;

public class ExercicioVetoresAB {

	public static void main(String[] args) {

		int A[] = { 4, 6, 7, 1, 0 }, B[] = { 7, 1, 3, 1, 2 };
		int C = 0;
		int D = 0; // declarar variaveis dos vetores

		System.out.print("Valores do vetor A maiores que 4 sao: ");// exibir texto ao usuario
		for (D = 0; D < 5; D++) { //estrutura de repeticao do vetor 

			if (A[D] > 4) { //Estrutura de repeticao

				System.out.printf("%d ", A[D]); //numeros maiores que 4 do vetor serao exibidos
			}
		}
		System.out.printf("\n"); // Pular linha

		for (D = 0; D < 5; D++) { // Estrutura de repeticao do vetor B

			if (B[D] > 4) { //estrutura de decisao 


				System.out.printf("Valores do vetor B maiores que 4 sao: %d", B[D]); //Exibir texto ao usuario
			}
		}

		System.out.printf("\n"); //Pular linha
		System.out.print("Valores do vetor A menores ou iguais a 5 sao: ");//Exibir texto ao usuario

		for (D = 0; D<5; D++) {//estrutura de repeticao do vetor

			if (A[D] <= 5) {//estrutura de decisao

				System.out.printf("%d ", A[D]); //exibir valores ao usuario
			}
		}
		System.out.printf("\n");// Pular linha
		System.out.print("Valores do vetor B menores ou iguais a 5 sao: ");//numeros menores que 5 do vetor serao exibidos

		for (D = 0; D < 5; D++) {// estrutura de repeticao
			if (B[D] <= 5) {//Estrutura de decisao

				System.out.printf("%d ", B[D]);//numeros menores que 5 do vetor serao exibidos
				C = A[D] * B[D];//Fazer calculo dos vetores na variavel C
			}
		}
