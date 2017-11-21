package ProjetoPack;

public class RepositorioLivroArray implements RepositorioLivros {

	private int tamanho = 100;
	private Livro[] array = new Livro[tamanho];
	//how many books have from one type on library
	private int[] arrayQ = new int[tamanho];
	private int index = 0;

	public void inserir(Livro livro) {
		boolean b = false;
		//just will add something just if doesn't exist any other book equal;
		for(int i = 0; i < index; i++) {
			if(array[i].getTitulo().equals(livro.getTitulo())) {
				if(array[i].getMagia().equals(livro.getMagia()) && array[i].getDescription().equals(livro.getDescription())) {
				b = true;
				arrayQ[i]+=1;
				} else {
				}
			}
		}
		if(!b) {
		if(index < 100) {
			array[index] = livro;
			arrayQ[index] = 1;
			index++;
		} else {
			tamanho = 2*tamanho;
			Livro[] arrayAux = new Livro[tamanho];
			int[] arrayQAux = new int[tamanho];
			for(int i = 0; i < index; i++) {
				arrayAux[i] = this.array[i];
				arrayQAux[i] = this.arrayQ[i];
			}
			this.array = arrayAux;
			this.arrayQ = arrayQAux;
		}
		}
	}
	public void remover(String titulo, int quant) {
		for(int i = 0; i < index; i++) {
			if(array[i].getTitulo().equals(titulo)) {
				arrayQ[i] = arrayQ[i] - quant;
				if(arrayQ[i] <= 0) {
				this.array[i] = this.array[index];
				this.array[index] = null;
				index-=1;
				}
			}
		}
	}
	public boolean existe(String titulo) {
		boolean b = false;
		for(int i = 0; i < index; i++) {
			if(array[i].getTitulo().equals(titulo)) {
				b = true;
			}
		}
		return b;
	}
	public int procurar(String titulo) {
		int resposta = 0;
		for(int i = 0; i < index; i++) {
			if(array[i].getTitulo().equals(titulo)) {
				resposta = arrayQ[i];
			}
		}
		return resposta;
	}
	public boolean disponibilidade(String titulo) {
		boolean b = false;
		if(existe(titulo)) {
		for(int i = 0; i < index; i++) {
			if(array[i].getTitulo().equals(titulo)) {
				if(arrayQ[i] > 0) {
					b = true;
				}
			}
		}
	}
		return b;
	}

}
