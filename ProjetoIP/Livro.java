package ProjetoPack;

public class Livro {

	private String titulo;
	private ListaMagia magia;
	//the description about the book
	private String description;
	//how much power this book has
	private int poder;
	private boolean proibicao;
	
	public Livro(String titulo, ListaMagia magia, String description) {
		this.titulo = titulo;
		this.magia = magia;
		this.description = description;
		this.poder = this.magia.poder();
		this.proibicao = this.magia.proibicao();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ListaMagia getMagia() {
		return magia;
	}

	public void setMagia(ListaMagia magia) {
		this.magia = magia;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public boolean isProibicao() {
		return proibicao;
	}

	public void setProibicao(boolean proibicao) {
		this.proibicao = proibicao;
	}
	
}
