package ProjetoPack;

public interface RepositorioLivros {
      void inserir(Livro livro);
      void remover(String titulo, int quant);
      //return how much books you have;
      int procurar(String titulo);
      //If u have the book on library
      boolean existe(String titulo);
      boolean disponibilidade(String titulo);
}
