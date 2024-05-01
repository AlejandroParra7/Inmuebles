package Clasess;

public class Casas {
    private String inmob;
    private String area;//metros cuadrados
    private String direc;
    private String nHabi;
    private String baño;
    private String zona;//rural o urbana
    private String distCM;
    private String altitud;
    private String conj;
    private String inde;
    private String valAdmi;
    private String areCom;
    
    public Casas(String inmob, String area, String direc, String nHabi, String baño, String zona, String distCM, String altitud, String conj, String inde, String valAdmi, String areCom) {
        this.inmob = "";
        this.area = "";
        this.direc = "";
        this.nHabi = "";
        this.baño = "";
        this.zona = "";
        this.distCM = "";
        this.altitud = "";
        this.conj = "";
        this.inde = "";
        this.valAdmi = "";
        this.areCom = "";
    }

    public Casas(String text, String text0, String text1, String text2, String text3, String toString, String text4, String text5, String toString0, String text6, String text7) {
    }

    // Getters y Setters
    public String getInmob() {
        return inmob;
    }

    public void setInmob(String inmob) {
        this.inmob = inmob;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getNHabi() {
        return nHabi;
    }

    public void setNHabi(String nHabi) {
        this.nHabi = nHabi;
    }

    public String getBaño() {
        return baño;
    }

    public void setBaño(String baño) {
        this.baño = baño;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getDistCM() {
        return distCM;
    }

    public void setDistCM(String distCM) {
        this.distCM = distCM;
    }

    public String getAltitud() {
        return altitud;
    }

    public void setAltitud(String altitud) {
        this.altitud = altitud;
    }

    public String getConj() {
        return conj;
    }

    public void setConj(String conj) {
        this.conj = conj;
    }

    public String getInde() {
        return inde;
    }

    public void setInde(String inde) {
        this.inde = inde;
    }

    public String getValAdmi() {
        return valAdmi;
    }

    public void setValAdmi(String valAdmi) {
        this.valAdmi = valAdmi;
    }

    public String getAreCom() {
        return areCom;
    }

    public void setAreCom(String areCom) {
        this.areCom = areCom;
    }
}
