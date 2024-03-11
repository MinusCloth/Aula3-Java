import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a qtd de numeros que deseja inserir: ");
		int qtd = sc.nextInt();
		int[] vetor = new int[qtd];
		for(int i = 0;i <qtd;i++) {
			System.out.println("Digite os numeros que deseja inserir:");
			vetor[i]=sc.nextInt();
		}
		for(int i = 0; i < vetor.length ; i++) {
			int chave=vetor[i];
			int j = i - 1;
			
			while(j>=0 && vetor[i]>chave) {
				vetor[j+1]=vetor[j];
				j=j-1;	
			}
			vetor[j+1]=chave;
		}
		for(int i = 0;i<vetor.length;i++) {
			
			System.out.println(vetor[i]+" ");
		}
		
		
		
		
		
		
		
	}
}
