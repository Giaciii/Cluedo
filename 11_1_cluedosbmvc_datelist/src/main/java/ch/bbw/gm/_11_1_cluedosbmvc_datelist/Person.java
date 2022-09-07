package ch.bbw.gm._11_1_cluedosbmvc_datelist;

/**
 * @author Giacun
 * @version 07.09.2022
 */
public class Person {
    private String name;
    private String anrede;
    private String haarfarbe;
    private int alter;
    private double groesse;
    private String merkmal;

    public Person(String name, String anrede, String haarfarbe, int alter, double groesse, String merkmal) {
        this.name = name;
        this.anrede = anrede;
        this.haarfarbe = haarfarbe;
        this.alter = alter;
        this.groesse = groesse;
        this.merkmal = merkmal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public void setHaarfarbe(String haarfarbe) {
        this.haarfarbe = haarfarbe;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public void setMerkmal(String merkmal) {
        this.merkmal = merkmal;
    }

    public String getName() {
        return name;
    }

    public String getAnrede() {
        return anrede;
    }

    public String getHaarfarbe() {
        return haarfarbe;
    }

    public int getAlter() {
        return alter;
    }

    public double getGroesse() {
        return groesse;
    }

    public String getMerkmal() {
        return merkmal;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", anrede='" + anrede + '\'' +
                ", haarfarbe='" + haarfarbe + '\'' +
                ", alter=" + alter +
                ", groesse=" + groesse +
                ", merkmal='" + merkmal + '\'' +
                '}';
    }
}
