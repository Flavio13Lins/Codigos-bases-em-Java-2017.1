public class Conta { 
	private String numero; 
	private double saldo; 
	
	public Conta (String numero, double saldo) { 
		this.numero = numero; 
		this.saldo = saldo; 
	} 
	
	public void creditar(double valor) { 
		saldo = saldo + valor; 
	} 
	
	public void debitar(double valor) { 
		saldo = saldo - valor; 
	} 
	
	public double getSaldo( ) { 
		return saldo; 
	}
	
	public void debitarComCPMF(double valor, double taxaCPMF, Conta c) {
		if(c!=null && valor>0 && valor<=saldo){
			this.debitar(valor*(1 + taxaCPMF));
			c.creditar(valor*taxaCPMF);
		}
	}
}