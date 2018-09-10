public class Sorcier extends Personnage {

    private double pouvoir = Math.random();

    public Sorcier(String nom_sorcier, int vie){
        super(nom_sorcier, vie);
    }

    public void attaque(Personnage p){
        if (!p.mort()){
            this.addVie(p.subitCharme((int)(pouvoir*pdv)));
        }
    }

    public int subitCharme(int coup){
        return 0;
    }

    public void riposte(Personnage p){
        if (!this.mort()) {
            p.addVie(-(int)(pouvoir*pdv));
        }
    }
}