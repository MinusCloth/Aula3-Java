
public class Exercicio4 {
	public static void main(String[] args) {
		int[][] matriz= {{1,0,0},{0,1,0},{0,0,1}};
		int linha = 3;
		int coluna = 3;
		
		//Validação da matriz identidade
		for(int i = 0; i < linha;i++) {
			for(int j = 0; j <coluna;j++) {
				if(matriz[i][i] !=1) {System.out.println("A matriz não é uma matriz identidade");break;}
				else if(i!=j && matriz[i][j]!=0) {System.out.println("A matriz não é uma matriz identidade");break;}
		   }
		}System.out.println("A matriz é uma matriz identidade");
		for(int i = 0;i<linha;i++) {
		for(int j = 0;j<coluna;j++) {
			System.out.print(matriz[i][j]+" ");
			}System.out.println();
		}
		
		
		
	}

}
