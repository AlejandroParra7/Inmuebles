package Clasess;

public class Apartamentos {
    private String inmob1;
    private String area1;//metros cuadrados
    private String direc1;
    private String nHabi1;
    private String baño1;
    private String tAparta;//rural o urbana
    private String vAdmin;
    
    public Apartamentos(String inmob1, String area1, String direc1, String nHabi1, String baño1, String tAparta, String vAdmin) {
        this.inmob1 = "";
        this.area1 = "";
        this.direc1 = "";
        this.nHabi1 = "";
        this.baño1 = "";
        this.tAparta = "";
        this.vAdmin = "";
    }
      // Getters
    public String getInmob1() {
        return inmob1;
    }

    public String getArea1() {
        return area1;
    }

    public String getDirec1() {
        return direc1;
    }

    public String getNHabi1() {
        return nHabi1;
    }

    public String getBaño1() {
        return baño1;
    }

    public String getTAparta() {
        return tAparta;
    }

    public String getVAdmin() {
        return vAdmin;
    }

    // Setters
    public void setInmob1(String inmob1) {
        this.inmob1 = inmob1;
    }

    public void setArea1(String area1) {
        this.area1 = area1;
    }

    public void setDirec1(String direc1) {
        this.direc1 = direc1;
    }

    public void setNHabi1(String nHabi1) {
        this.nHabi1 = nHabi1;
    }

    public void setBaño1(String baño1) {
        this.baño1 = baño1;
    }

    public void setTAparta(String tAparta) {
        this.tAparta = tAparta;
    }

    public void setVAdmin(String vAdmin) {
        this.vAdmin = vAdmin;
    }
}
