public class Livro {
	private String titulo, autor;
	private int numeroPaginas, anoPublicacao;
	
	public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
		this.titulo=titulo;
		this.autor=autor;
		this.anoPublicacao=anoPublicacao;
		this.numeroPaginas=numeroPaginas;
	}
	
	public String getTitulo( ) {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor( ) {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getNumeroPaginas( ) {
		return numeroPaginas;
	}
	
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	public int getAnoPublicacao( ) {
		return anoPublicacao;
	}
	
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
}
