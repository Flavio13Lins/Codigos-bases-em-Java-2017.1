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
}