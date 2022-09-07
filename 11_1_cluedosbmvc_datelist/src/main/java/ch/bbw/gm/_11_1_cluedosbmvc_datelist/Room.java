package ch.bbw.gm._11_1_cluedosbmvc_datelist;

/**
 * @author Giacun
 * @version 07.09.2022
 */
public class Room {
    private String bezeichnung;
    private double groesse;
    private int tueren;
    private int fenster;
    private String bodenmuster;
    private String helligkeit;

    //Constructor
    public Room(String bezeichnung, double groesse, int tueren, int fenster, String bodenmuster, String helligkeit) {
        this.bezeichnung = bezeichnung;
        this.groesse = groesse;
        this.tueren = tueren;
        this.fenster = fenster;
        this.bodenmuster = bodenmuster;
        this.helligkeit = helligkeit;
    }

    //Getter und Setter
    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getGroesse() {
        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public int getTueren() {
        return tueren;
    }

    public void setTueren(int tueren) {
        this.tueren = tueren;
    }

    public int getFenster() {
        return fenster;
    }

    public void setFenster(int fenster) {
        this.fenster = fenster;
    }

    public String getBodenmuster() {
        return bodenmuster;
    }

    public void setBodenmuster(String bodenmuster) {
        this.bodenmuster = bodenmuster;
    }

    public String getHelligkeit() {
        return helligkeit;
    }

    public void setHelligkeit(String helligkeit) {
        this.helligkeit = helligkeit;
    }

    //toString
    @Override
    public String toString() {
        return "Room{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", groesse=" + groesse +
                ", tueren=" + tueren +
                ", fenster=" + fenster +
                ", bodenmuster='" + bodenmuster + '\'' +
                ", helligkeit='" + helligkeit + '\'' +
                '}';
    }
}
