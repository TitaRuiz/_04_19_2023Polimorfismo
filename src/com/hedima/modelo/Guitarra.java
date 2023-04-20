package com.hedima.modelo;

import com.hedima.modelo.InstrumentoMusical;

public class Guitarra extends InstrumentoMusical {
    private String tipoCuerdas;
    @Override
    public String emitirSonido() {
        
        return "gli gli ..." + marca;
    }

    public Guitarra() {
    }

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }
}
