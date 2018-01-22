package Lista2x2plc;/**FORMA MAIS DETALHADA**/
/**1. letra c) FEITA COM A DEPENDENCIA DA CLASSE CONTA**/
//1. letra d)
public class ContaExcecao2 extends Exception {
	/**public ContaExcecao2 (double valorsaque){
		super("Nao foi possivel sacar: R$" + valorsaque);
	}**/
	public ContaExcecao2 (double saldoatual){//necessário passar saldo como parametro na excecao do metodo 'saca' da Conta
		super("Impossivel sacar! Saldo atual: R$" + saldoatual);
	}
	public static void main(String[] args){	//PODERIA USAR 'throw ContaExcecao2'
		Conta minhaConta = new Conta();		//sem usar o try e catch
		minhaConta.deposita(100);
		minhaConta.setLimite(100);
		try {
			minhaConta.saca(1000);
		} catch (ContaExcecao2 e) {
			System.out.println("Erro :" + e);
		}
	}
}
