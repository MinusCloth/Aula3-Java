import java.util.Iterator;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores de uma matriz 3x3:");
		int[][] vetor = new int[3][3];
		
		for(int i = 0;i <3;i++) {
			for(int j = 0;j<3;j++) {
				vetor[i][j]=sc.nextInt();
			}
		}
		
		for(int i = 0;i <3;i++) {
			for(int j = 0;j<3;j++) {
				System.out.print(vetor[i][j]+" ");
			}
			System.out.println();
		}	
		
		
		
		
		
		
		
		
		
		
	}
}
