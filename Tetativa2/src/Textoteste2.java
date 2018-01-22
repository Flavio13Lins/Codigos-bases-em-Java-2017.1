import java.util.*;

class Textoteste2{
	String[] palavra;
	int tamanho;
	
	Textoteste2(String[] tal, int tam){
		for(int i=0; i<tam; i++){
			palavra[i] = tal[i];
		}
		tamanho = tam;
	}
	
	void imprime(int tam){
		System.out.printf(palavra[0]);
		for(int i=1; i<tam; i++){
			System.out.printf(" ");
			System.out.printf(palavra[i]);
		}
		//.charAt(i)
	}
	
	int posicao(String tal){
		return 0;
	}
	
	void trocapalavra(String uma, String outra){
		
	}
	
	public static void main(String[] args) {
		 Textoteste2 a;
		 String[] teste = {"Frase", "nao", "muito", "grande!"};
		 System.out.println("oi");
		 //a = new Textoteste2("Frase", 1);
		 //a.imprime(4);
	}
}