package newpackage;
// Made By Uli Delgado el 23 de junio del 2021
public class TDAListaDoble {
    private NodoD inicio;
    private int total = 0;
    
    public TDAListaDoble() {
        inicio = null;
    }
    
    public void agregarElementoInicial(String dato) {
        NodoD nuevo = new NodoD(dato);
        total++;
        if(inicio == null) {
            inicio = nuevo;           
        }
        else {
            nuevo.setSigui(inicio);
            inicio.setAnte(nuevo); //--------
            inicio = nuevo;
        }        
    }
    
    public void agregarElementoFinal(String dato) {
        NodoD nuevo = new NodoD(dato);
        total++;
        if(inicio==null) {
            inicio = nuevo;
        }
        else {
            NodoD aux = inicio;
            while(aux.getSigui() != null) {
                aux = aux.getSigui(); 
            }
            aux.setSigui(nuevo);
            nuevo.setAnte(aux); //--------
        }
    }
    
    public boolean eliminarElementoInicial() {       
        if(inicio != null) {
            total--;
            if(inicio.getSigui() == null) {
                inicio = null;
            }
            else {
                NodoD aux = inicio;
                inicio = inicio.getSigui();
                inicio.setAnte(null); //---------------
                aux.setSigui(null);
                aux = null;
            }
            System.gc();
            return true;
        }
        return false;
    }
    
    public boolean eliminarElementoFinal() {       
        if(inicio != null) {    
            total--;
            if(inicio.getSigui() == null) {
                inicio = null;
            }
            else {
                NodoD aux2 = null, aux = inicio;
                while(aux.getSigui() != null) {
                    aux2 = aux;
                    aux = aux.getSigui();
                }
            aux2.setSigui(null);
            aux.setAnte(null); //---------------
            aux = null;
            }
            System.gc();
            return true;
        }
        return false;
    }
    
    public String getElementos() {
        String cadena = "";
        NodoD aux = inicio;
        while(aux != null) {                        
            cadena = cadena + aux.getInfo() + ", ";
            aux = aux.getSigui();
        }
        return cadena;
    }
    
    public String getElementosElevadoALaMenosUno() {
        String cadena = "";
        NodoD aux = inicio;
        if(inicio == null) {
            return " - ";
        }
        else {
            while(aux.getSigui() != null) {
                aux = aux.getSigui();
            }
        }
        
        while(aux != null) {
            cadena = cadena + aux.getInfo() + ", ";
            aux = aux.getAnte();
        }
        
        return cadena;
    }
    
    public int search(String dato) {
        NodoD aux = inicio;
        int place = 1;
        
        while(aux != null) {
            if(aux.getInfo().equals(dato)) {
                return place;
            }
            else {    
                aux = aux.getSigui();
                place++;
            }
        }
        return -1;
    }
    
    public int getTotal() {
        return total;
    }
}
