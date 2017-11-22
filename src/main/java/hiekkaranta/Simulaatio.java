
package hiekkaranta;

public class Simulaatio {
    private int leveys = 0;
    private int korkeus = 0;
    
    public Simulaatio(int leveys, int korkeus) {
        this.korkeus = korkeus;
        this.leveys = leveys;
    }
    
    public void lisaa(int x, int y, Tyyppi tyyppi) {
        //new Element(x, y, tyyppi);
    }
    
    public Tyyppi sisalto(int x, int y) {
        return Tyyppi.METALLI;
    }
    
    public void paivita() {
        ;
    }
}
