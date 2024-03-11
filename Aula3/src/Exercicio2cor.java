
public class Exercicio2cor {
	public static void main(String[] args) {
		int[] vetor = {1,2,3,4,5,6};
		int k = 3;
		int n = vetor.length;
		
		System.out.println();
		
		for(int i = 0;i<n;i++) {
			System.out.println(vetor[i]+" ");
		}
		int[] temp = new int[n];
		for(int i =0;i<n;i++) {//k=k%n
			temp[(i+k)%n]=vetor[i];
		}
		for(int i=0;i<n;i++) {
			vetor[i]=temp[i];
		}
		System.out.println("");
		System.out.println("Vetor rotacionado "+ k+" vezes");
		for(int i = 0 ;i<n;i++) {
			System.out.println(vetor[i]+" ");
		}
		
		
		
		
		
	}

}
