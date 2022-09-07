package ch.bbw.gm._11_1_cluedosbmvc_datelist;

/**
 * @author Giacun
 * @version 07.09.2022
 */
public class Weapon {
    private String bezeichnung;
    private String material;
    private double laenge;
    private double gewicht;

    public Weapon(String bezeichnung, String material, double laenge, double gewicht) {
        this.bezeichnung = bezeichnung;
        this.material = material;
        this.laenge = laenge;
        this.gewicht = gewicht;
    }

    //Getter
    public String getBezeichnung() {
        return bezeichnung;
    }

    public String getMaterial() {
        return material;
    }

    public double getLaenge() {
        return laenge;
    }

    public double getGewicht() {
        return gewicht;
    }

    //Setter
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    //toString

    @Override
    public String toString() {
        return "Weapon{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", material='" + material + '\'' +
                ", laenge=" + laenge +
                ", gewicht=" + gewicht +
                '}';
    }
}
