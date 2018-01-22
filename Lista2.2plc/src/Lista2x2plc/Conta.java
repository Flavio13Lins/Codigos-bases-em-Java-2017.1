package Lista2x2plc;
/**MATERIAL DOS SLIDES**/
public class Conta {
	private int numero, agencia;
	private double saldo, limite;
	private String nomeDono;
	
	Conta(){
		saldo = 0;
	}
	Conta(int numeroInicial){
		numero = numeroInicial;
		saldo = 0;
	}
	Conta(int numeroInicial, double saldoInicial){
		numero = numeroInicial;
		saldo = saldoInicial;
	}
	public void deposita(double valor){
		this.saldo += valor;
	}
	public void debita(double valor){
		this.saldo -= valor;
	}
	public void saca(double valor) throws ContaExcecao2 {/*DETALHE: NA QUESTAO O METODO SE CHAMA "saca", MAS NO SLIDE O CODIGO TINHA "sacar"*/
		if(valor >  this.saldo + this.limite){
			throw new ContaExcecao2(this.saldo);/**1. letra c) /**throw new ContaExcecao2(valor);**/
		}else{
			this.saldo = this.saldo - valor;
		}
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNomeDono() {
		return nomeDono;
	}
	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}
}