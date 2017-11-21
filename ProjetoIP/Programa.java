package ProjetoPack;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepositorioLivroArray teste = new RepositorioLivroArray();
		ListaMagia teste1 = new ListaMagia();
		int  N = 10;
		while(N > 0) {
			Magia testeM = new Magia("Bola de fogo", 100, 1000, 500, true);
			teste1.inserir(testeM);
			N--;
		}
		Livro pudim = new Livro("A vingaca do pudim", teste1, "Bem merda mesmo");
		teste.inserir(pudim);
		System.out.println(teste.disponibilidade("A vingaca do pudim"));
		System.out.println(teste.procurar("A vingaca do pudim"));
	}
}
