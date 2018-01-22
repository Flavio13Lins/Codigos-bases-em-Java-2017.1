public class Poupanca extends Conta {
	private final double taxaJuros = 0.005;
	
	public Poupanca(String numero, double saldo) {
		super(numero, saldo);
	}
	
	public void renderJuros( ) {
		this.creditar(this.getSaldo( )*taxaJuros);
	}
	
	void renderJurosContas(Conta[] contas) { 
		for(int i=0; i<contas.length; i++){ 
			Conta c = contas[i]; 
			if (c instanceof Poupanca) {
				((Poupanca) c).renderJuros( );
			} else {
				System.out.println("A conta " + i + " nao eh uma Poupanca");
			}
		} 
	}
}
