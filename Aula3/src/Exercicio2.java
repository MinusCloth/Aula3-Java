import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		System.out.println("Digite quantas vezes vai rotacionar");
		int k = sc.nextInt();
		int[] vetor = new int[k];
		
		for(int i = 0;i<n;i++) {vetor[i]=sc.nextInt();}
		
		for(int i = 0; i < k ; i++) {
			if(i<k-1) {
				int x=vetor[i];
				vetor[i+1]=x;
			if(i<k-1) {
				i=0;
				
			   }
			
			}
		}
		for(int i = 0;i<vetor.length;i++) {
		System.out.println(vetor[i]+" ");}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
