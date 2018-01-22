package Lista2x2plc;
//1. letra b)
import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args){
		try{
			Scanner teclado = new Scanner(System.in);
			System.out.println("Eu sei dividir INTEIROS!");
			System.out.println("Informe o primeiro valor: ");
			int x = teclado.nextInt();
			System.out.println("Informe o segundo valor: ");
			
			int y = teclado.nextInt();
			while(y==0){
				System.out.println("Voce nao pode dividir por 0, digite outro numero:");
				y = teclado.nextInt();
			}
			double r = (x / y);
			if(x%y != 0 || x<y){
				r = (double) x / y;
			}
			System.out.println("O resultado da soma(OOPS, QUIS DIZER DIVISAO) é " + r);
		} catch(java.util.InputMismatchException e){
			System.out.println("Voce tentou digitar algo que nao e' inteiro, tente de novo na proxima...");
		}
	}
}
