package newpackage;
// Made By Uli Delgado el 23 de junio del 2021
public class NodoD {
    private String info;
    private NodoD sigui, ante;
    
    public NodoD(String info) {
        this.info = info;
        ante = sigui = null; 
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public NodoD getSigui() {
        return sigui;
    }

    public void setSigui(NodoD sigui) {
        this.sigui = sigui;
    }

    public NodoD getAnte() {
        return ante;
    }

    public void setAnte(NodoD ante) {
        this.ante = ante;
    }
    
    
}
