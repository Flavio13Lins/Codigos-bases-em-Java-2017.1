import java.util.*;
import java.lang.*;
import java.io.*;

public class Texto{
	private String palavras;

	public Texto(String taispalavras){
		palavras = taispalavras;
	}

	public void imprime(){
		System.out.println(palavras);
	}

	public int numeropalavras(){
		int total=1;
		for(int i=0; i<palavras.length(); i++){
			if(palavras.charAt(i) == ' '){
				total++;
			}
		}
		return total;
	}

	public int posicao(String tal){
		int i=0, ini=0, fim=0, num=1;
		String a;
		while(i<=(palavras.length()+1)){
			if(i==palavras.length()){
				ini =fim+1;
				fim=i;
				a=palavras.substring(ini, fim);
				if(a.equals(tal)){
					return num;
				}
				else{
					return -1;
				}
			}
			else if(palavras.charAt(i) == ' '){
				ini=fim+1;
				if(num==1){
					ini=0;
				}
				fim=i;
				a=palavras.substring(ini, fim);
				if(a.equals(tal)){
					return num;
				}
				else{
					num++;
					i++;
				}
			}
			else{
				i++;
			}
		}
		return -1;
	}

	public void trocapalavra(String uma, String outra){
		int i=0, ini=0, fim=0, num=1;
		String a, iniciotexto, fimtexto;
		while(i<=(palavras.length()+1)){
			if(i==palavras.length()){
				ini =fim+1;
				fim=i;
				a=palavras.substring(ini, fim);
				if(a.equals(uma)){
					//ENCONTROU A PALAVRANO FIM DO TEXTO
					iniciotexto = palavras.substring(0, ini);
					palavras = iniciotexto.concat(outra);
					return;
					//FEZ TROCA
				}
				return;
			}
			else if(palavras.charAt(i) == ' '){
				ini=fim+1;
				if(num==1){
					ini=0;
				}
				fim=i;
				a=palavras.substring(ini, fim);
				if(a.equals(uma)){
					if(ini==0){
						//ENCONTROU PALAVRA NO INICIO DO TEXTO
						fimtexto = palavras.substring(fim, palavras.length());
						palavras = outra.concat(fimtexto);
						//FEZ TROCA
					}
					else{
						//ENCONTROU PALAVRA NO MEIO DO TEXTO
						iniciotexto = palavras.substring(0, ini);
						fimtexto = palavras.substring(fim, palavras.length());
						palavras = iniciotexto.concat(outra);
						palavras = palavras.concat(fimtexto);
						//FEZ TROCA
					}
					return;
				}
				else{
					num++;
					i++;
				}
			}
			else{
				i++;
			}
		}
		return;
	}

	public static void main(String[] args) {
		 Texto a;
		 a = new Texto("Texto escrito num dedo para teste muito grande");
		 a.imprime();
		 System.out.printf("tamanho do texto: %d\n", a.palavras.length());
		 System.out.printf("numero de palavras: %d\n", a.numeropalavras());
		 System.out.printf("palavra \"para\" na posicao: %d\n", a.posicao("para"));//caso nao ache = -1
		 a.trocapalavra("num", "uma");
		 System.out.printf("trocando \"mao\" por \"dedos\": %s\n", a.palavras);

	}
}
