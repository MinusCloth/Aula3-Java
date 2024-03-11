import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a ordem da matriz:");
		int k = sc.nextInt();
		int[][] matriz=new int[k][k];
		//receber matriz
		for(int i = 0;i<k;i++) {
			for(int j = 0;j<k;j++) {
				System.out.println("Digite o valor da posição["+i+"]["+j+"]: ");
				matriz[i][j]=sc.nextInt();
			}
		}
		//imprimir matriz
		for(int i = 0;i<k;i++) {
			for(int j = 0;j<k;j++) {
				System.out.print(matriz[i][j]+" ");
			}System.out.println();
		}
		//somar diagonal principal
		int somaP = 0;
		for(int i =0;i<k;i++) {
			somaP+=matriz[i][i];
		}
		int somaS = 0;
		for(int i =0;i<k;i++) {
			somaS+=matriz[i][-i];
		}
		
		
		
		
	}
}
