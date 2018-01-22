public class LivroBiblioteca extends Livro {
	private boolean emprestado;
	private int numeroEmprestimos;
	public LivroBiblioteca(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
		super(titulo, autor, anoPublicacao, numeroPaginas);
		this.numeroEmprestimos=0;
	}
	
	public boolean estaEmprestado( ) {
		return emprestado;
	}
	
	public int getNumeroEprestimos( ) {
		return numeroEmprestimos;
	}
	
	public void emprestar( ) {
		this.numeroEmprestimos++;
		this.emprestado=true;
	}
	
	public void devolver( ) {
		this.emprestado=false;
	}
}

