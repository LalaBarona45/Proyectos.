package com.mycompany.listasdobles;
public class Nodo {
   
   
    String dato;
    Nodo ant;
    Nodo sig;
    static Nodo prinodo;
    

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
 
   
}

