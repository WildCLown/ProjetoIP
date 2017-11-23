package Elemental;
 
import Exceptions.CNEException;
 
interface InterfaceElemental {
    public void inserir(Elemental elemental);
 
    public void remover(String nomeElemental) throws CNEException;
 
    public void atualizar(Elemental elemental)throws CNEException;
 
    public boolean existe(String nome);
}