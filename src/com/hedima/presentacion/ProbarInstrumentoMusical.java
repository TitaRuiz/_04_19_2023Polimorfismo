package com.hedima.presentacion;

import com.hedima.modelo.Bateria;
import com.hedima.modelo.Flauta;
import com.hedima.modelo.Guitarra;
import com.hedima.modelo.InstrumentoMusical;

public class ProbarInstrumentoMusical {

    public static void main(String[] args) {
        InstrumentoMusical guido = new Guitarra("Yamaha","Nylon");
        InstrumentoMusical bataca = new Bateria("XXX",3);
        InstrumentoMusical ham = new Flauta("Ham","madera");

        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];
        instrumentos[0] =guido;
        instrumentos[1]=bataca;
        instrumentos[2]= ham;



        for (int i=0; i<instrumentos.length;i++){
            System.out.println(instrumentos[i].emitirSonido());
        }
    }
}
