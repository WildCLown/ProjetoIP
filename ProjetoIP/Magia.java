package ProjetoPack;

public class Magia {
    private String nomeMagia;
    private int mana;
    private int poderTotal;
    private int poderNecessario;
    private boolean proibido;
   
   
    public Magia(String nomeMagia, int mana, int poderTotal, int poderNecessario, boolean proibido) {
        super();
        this.nomeMagia = nomeMagia;
        this.mana = mana;
        this.poderTotal = poderTotal;
        this.poderNecessario = poderNecessario;
        this.proibido = proibido;
    }
 
    public String getNomeMagia() {
        return nomeMagia;
    }
 
    public int getMana() {
        return mana;
    }
 
    public int getPoderTotal() {
        return poderTotal;
    }
 
    public int getPoderNecessario() {
        return poderNecessario;
    }
 
    public boolean isProibido() {
        return proibido;
    }
 
    public void setNomeMagia(String nomeMagia) {
        this.nomeMagia = nomeMagia;
    }
 
    public void setMana(int mana) {
        this.mana = mana;
    }
 
    public void setPoderTotal(int poderTotal) {
        this.poderTotal = poderTotal;
    }
 
    public void setPoderNecessario(int poderNecessario) {
        this.poderNecessario = poderNecessario;
    }
 
    public void setProibido(boolean proibido) {
        this.proibido = proibido;
    }
   
   
}
