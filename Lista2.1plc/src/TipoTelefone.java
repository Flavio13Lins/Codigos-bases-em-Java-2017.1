import java.util.*;
import java.lang.*;
/**TIPO ENUMERAVEL PARA TIPOS DE TELEFONES**/
public enum TipoTelefone {
	R("Residencial"), CE("Celular"), CO("Comercial"), F("Fax");
	
	private String tipotelefone;
	
	TipoTelefone(String tipo){
		tipotelefone = tipo;
	}
	
	public String getTipoTelefone(){
		return this.tipotelefone;
	}
	
	private void setTipoTelefone(String novonome){/*APENAS CASO EM NECESSIDADE DE ALTERAR NOMES DOS TIPOS, POR ISSO PRIVATE*/
		this.tipotelefone = novonome;
	}
	
	/**MAIN PARA TESTES**/
	public static void main(String[] args){
		System.out.printf("Tudo ok aqui\n");
	}
	
}