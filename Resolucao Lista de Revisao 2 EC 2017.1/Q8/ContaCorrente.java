public class ContaCorrente extends Conta {
	public ContaCorrente (String numero, double saldo) { 
		super(numero, saldo); 
	}
	//… 
}



/*
O primeiro problema está na chamada do construtor da superclasse Conta, uma vez que essa classe só tem um único
construtor que recebe dois parâmetros (numero e saldo). A classe ContaCorrente deve, então, chamar o construtor
da superclasse com a seguinte assinatura super(numero, saldo). O outro problema é utilizar as atribuições que 
seguem abaixo da linha do construtor, uma vez que atributos com o moodificador de visibilidade private só podem
ser acessados internamente pela própria classe.
*/