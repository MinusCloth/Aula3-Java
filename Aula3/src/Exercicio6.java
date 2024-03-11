import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   Scanner sc2 = new Scanner(System.in);
	   System.out.println("Digite o numero de alunos");
	   
	   int n =sc.nextInt();
	   String[] nomes = new String[n];
	   float[][] notas = new float[n][4];
	   for(int i = 0;i<n;i++) {
		   System.out.println("Nome:");
		   nomes[i]=sc.nextLine();
		   for(int j = 0;j<n;j++) {
			   System.out.println("notas:");
			   notas[i][j]=sc2.nextInt();
	   }
		   
     }
    }
   }
