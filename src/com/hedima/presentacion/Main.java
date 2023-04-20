package com.hedima.presentacion;

import com.hedima.modelo.Empleado;
import com.hedima.modelo.Gerente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Gerente("Juan López", 5_000, LocalDate.of(1972,2,10), "Ventas");
        System.out.println("Desde la variable de referencia de empleado sólo se ve los atributos de empleado " + e1.getfNacimiento() + " nombre " + e1.getNombre() + " sueldo "+ e1.getSueldo() );
        Gerente g1 =(Gerente) e1; //Casting
        System.out.println("Desde la variable de referencia de gerente se ven tdos los datos "+g1.getDepartamento());
        System.out.println(e1.mostrarInfo());
        System.out.println(g1.mostrarInfo());
    }
}