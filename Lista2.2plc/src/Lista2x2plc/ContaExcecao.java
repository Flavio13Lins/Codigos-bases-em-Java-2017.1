/*package Lista2x2plc;
//1. letra c) FEITA SEM A PREOCUPAÇAO DA ESTRUTURA DE CONTA
public class ContaExcecao extends Exception {
	//..
	//A CLASSE CONTA DO SLIDE NÃO TEM A MESMA ESTRUTURA DA CLASSE CONTA DO CODIGO DA LETRA C, POR ISSO ESSE CODIGO NÃO IRÁ COMPILAR)
	public boolean saca (double valor){//DETALHE: NA CLASSE CONTA O METODO SE CHAMA "sacar"
		if (valor > this.saldo + this.limite){
			return false;
		}
		else{
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	public static void main(String[] args) throws ContaExcecao{
		Conta minhaConta = new Conta();
		minhaConta.deposita(100);
		minhaConta.setLimite(100);
		if(!minhaConta.saca();){
			System.out.println("Nao foi possivel sacar esse valor");
		}
	}
}*/
