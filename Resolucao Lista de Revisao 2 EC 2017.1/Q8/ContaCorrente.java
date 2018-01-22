public class ContaCorrente extends Conta {
	public ContaCorrente (String numero, double saldo) { 
		super(numero, saldo); 
	}
	//� 
}



/*
O primeiro problema est� na chamada do construtor da superclasse Conta, uma vez que essa classe s� tem um �nico
construtor que recebe dois par�metros (numero e saldo). A classe ContaCorrente deve, ent�o, chamar o construtor
da superclasse com a seguinte assinatura super(numero, saldo). O outro problema � utilizar as atribui��es que 
seguem abaixo da linha do construtor, uma vez que atributos com o moodificador de visibilidade private s� podem
ser acessados internamente pela pr�pria classe.
*/