package ProjetoPack;

public class RepositorioLivroLista implements RepositorioLivros {

	private Livro livro;
	private String status;
	//quantidade;
	private int quant;
	private RepositorioLivroLista proximo;

	public RepositorioLivroLista() {
		this.livro = null;
		this.status = null;
		this.proximo = null;
		this.quant = 0;
	}

	public void inserir(Livro livro) {
		if(this.proximo != null) {
			if(this.livro == livro) {
				quant++;
			}
		} else {
			if(this.proximo == null) {
				this.livro = livro;
				this.status = "available";
				this.quant = this.quant + 1;
				this.proximo = new RepositorioLivroLista();
			} else {
				this.proximo.inserir(livro);
			}
		}
	}
	public void remover(String titulo, int quant) {
		if(this.proximo != null) {
			if(this.livro.getTitulo().equals(titulo)) {
				this.quant = this.quant - quant;
				if(this.quant <= 0) {
					this.livro = this.proximo.livro;
					this.status = this.proximo.status;
					this.proximo = this.proximo.proximo;
				}
			}
		}
	}
	public boolean existe(String titulo) {
		boolean b = false;
		if(this.proximo != null) {
			if(this.livro.getTitulo().equals(titulo)) {
				b = true;
			} else {
				this.proximo.existe(titulo);
			}
		}
		return b;
	}
	public int procurar(String titulo) {
		int resposta = 0;
		if(existe(titulo)) {
			if(this.proximo != null) {
				if(this.livro.equals(titulo)) {
					resposta = this.quant;
				} else {
					resposta = this.proximo.procurar(titulo);
				}
			}
		}
		return resposta;
	}
	public boolean disponibilidade(String titulo) {
		boolean b = false;
		if(existe(titulo)) {
			if(this.proximo != null) {
				if(this.livro.getTitulo().equals(titulo)) {
					if(this.quant > 0) {
						b = true;
					}
				} else {
					this.proximo.disponibilidade(titulo);
				}
			}
		}
		return b;
	}
}
