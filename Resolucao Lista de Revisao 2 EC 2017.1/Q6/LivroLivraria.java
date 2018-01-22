public class LivroLivraria extends Livro {
	private double preco;
	public LivroLivraria(String titulo, String autor, int anoPublicacao, int numeroPaginas, double preco) {
		super(titulo, autor, anoPublicacao, numeroPaginas);
		this.preco=preco;
	}
	
	public double getPreco( ) {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
