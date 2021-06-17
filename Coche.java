
package poop5;

/**
 *
 * @author nikte
 */
public class Coche {
    private String [] lugares = {"NULL", "Chofer", "Copiloto", "Pasajero 1", "Pasajero 2"};
    private int lugp;
    private Persona pos;
    public Coche() {
    }
    public Coche(int lugp, Persona per) {
        this.lugp = lugp;
        this.pos = pos;
    }
    public int getLugp() {
        return lugp;
    }
    public void setLugp(int lugp) {
        this.lugp = lugp;
    }
    public Persona getPps() {
        return pos;
    }
    public void setPer(Persona pos) {
        this.pos = pos;
    }
    public String miLugp(){
        return lugares[this.lugp];
    }
    @Override
    public String toString() {
        return "Coche{" + "lugares=" + lugares + ", lugar=" + lugp + ", per=" + pos+ '}';
    }   
}
