package ProjetoPack;
//a list of Spells
public class ListaMagia {

	private Magia magia;
	private ListaMagia proximo;

	public ListaMagia() {
		this.magia = null;
		this.proximo = null;
	}
//insert a spell on the list
	public void inserir(Magia magia) {
		if(this.proximo == null) {
			this.magia = magia;
			this.proximo = new ListaMagia();
		} else {
			this.proximo.inserir(magia);
		}
	}
	//remove a spell
	public void remover(Magia magia) {
		if(this.proximo != null) {
			if(this.magia == magia) {
				this.magia = this.proximo.magia;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(magia);
			}
		}
	}
//Search for a spell and says if it exist or not
	public boolean existe(Magia magia) {
		boolean b = false;
		if(this.proximo != null) {
		if(this.magia == magia) {
			b = true;
		} else {
			this.proximo.existe(magia);
		}
		}
		return b;
	}
	//how much power has on this list
	public int poder() {
		int resposta = 0;
		if(this.proximo != null) {
		resposta = this.magia.getPoderTotal() + this.proximo.poder();
		}
		return resposta;
	}
	//Look if this list of magic is forbidden
	public boolean proibicao() {
		boolean b = false;
		if(this.proximo != null) {
			if (this.magia.isProibido()){
				b = true;
			} else {
				this.proximo.proibicao();
			}
		}
		return b;
	}
	public String getMagia() {
		String resposta = "";
		if(this.proximo.proximo != null) {
		resposta = this.magia.getNomeMagia() + "\n" + this.proximo.getMagia();
		} else if(this.proximo != null) {
			resposta = this.magia.getNomeMagia();
		}
		return resposta;
	}

	public void setMagia(Magia magia) {
		this.magia = magia;
	}

	public ListaMagia getProximo() {
		return proximo;
	}

	public void setProximo(ListaMagia proximo) {
		this.proximo = proximo;
	}
	
}
