import java.util.*;
import java.lang.*;

public class Telefone {
	/**ATRIBUTOS**/
	private TipoTelefone tipo;/*TIPO DO ARQUIVO TipoTelefone.java*/
	private int DDD;
	private int DDI;
	private String Numero;
	
	/**CONSTRUTORES**/
	public Telefone(String d){
		this (TipoTelefone.CE, 55, 81, d);
	}

	public Telefone(TipoTelefone a, int c, String d){
		this (a, 55, c, d);
	}
	
	public Telefone(TipoTelefone a, String d){
		this (a, 55, 81, d);
	}
	
	/*CONSTRUTOR 1 BASE*/
	public Telefone(TipoTelefone a, int b, int c, String d) {
		tipo = a;
		DDI = b;
		DDD = c;
		Numero = d;
	}

	/**GETTERS E SETTERS**/
	public void setTipo(TipoTelefone novotipo){/*PARA ALTERAR APENAS O TIPO DE UM OBJETO*/
		tipo = novotipo;
	}
	
	public int getDDI(){
		return this.DDI;
	}
	
	public void setDDI(int DDI){
		this.DDI = DDI;
	}
	
	public int getDDD(){
		return this.DDD;
	}
	
	public void setDDD(int DDD){
		this.DDD = DDD;
	}
	
	public String getNumero(){
		return this.Numero;
	}
	
	public void setNumero(String Numero){
		this.Numero = Numero;
	}
	
	/**EQUALS E TOSTRING**/
	public boolean equals(Telefone a){
		
		if(a.tipo instanceof TipoTelefone && a.DDD == this.DDD && a.DDI == this.DDI && a.Numero == this.Numero && a.tipo.getTipoTelefone() == this.tipo.getTipoTelefone()){
			return true;
		}
		else{
			return false;
		}	
	}
	
	public String toString(){
		return this.DDI + "" + this.DDD + "" + this.Numero;
	}
	
	/**MAIN PARA TESTE**/
	public static void main(String[] args){
		Telefone jose, joao, maria;
		jose = new Telefone("98888-5555");/*USANDO CONSTRUTOR 4*/
		maria= new Telefone(TipoTelefone.R , 55, 43, "3682-3090" );/*USANDO CONSTRUTOR 1*/
		joao = new Telefone(TipoTelefone.CE, 55, 81, "98888-5555");/*USANDO CONSTRUTOR 4*/
		
		/*UTILIZANDO EQUALS, TOSTRING E GETTERS*/
		if(jose.equals(joao)){
			System.out.printf("O numero de jose %s e numero de joao %s sao iguais,\n", jose.toString(), joao.toString());
			System.out.printf("pois os codigos ddi sao %d e %d; os ddd's sao %d e %d;\n", jose.getDDI(), joao.getDDI(), jose.getDDD(), joao.getDDD());
			System.out.printf("os numeros sao %s e %s e os dois são dos tipos %s e %s\n", jose.getNumero(), joao.getNumero(), jose.tipo.getTipoTelefone(), joao.tipo.getTipoTelefone());
		}
		
		/*ALTERANDO TELEFONE DE JOAO COM SETTERS*/
		joao.setDDI(43);
		joao.setDDD(10);
		joao.setNumero("1234-5678");
		joao.setTipo(TipoTelefone.F);
		
		System.out.printf("Numero de joao alterado\n");
		System.out.printf("Numero %s de joao %s\n", joao.tipo.getTipoTelefone(), joao.toString());
		System.out.printf("Numero %s de jose %s\n", jose.tipo.getTipoTelefone(), jose.toString());
		System.out.printf("Numero %s de maria %s\n", maria.tipo.getTipoTelefone(), maria.toString());
	}
}
