package com.hedima.modelo;

public class Bateria extends InstrumentoMusical{

    private int numPlatillos;
    @Override
    public String emitirSonido() {
        return "taca taca";
    }

    public Bateria() {
    }

    public Bateria(String marca, int numPlatillos) {
        super(marca);
        this.numPlatillos = numPlatillos;
    }

    public int getNumPlatillos() {
        return numPlatillos;
    }

    public void setNumPlatillos(int numPlatillos) {
        this.numPlatillos = numPlatillos;
    }
}
