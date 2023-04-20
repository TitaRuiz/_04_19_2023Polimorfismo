package com.hedima.modelo;

import java.time.LocalDate;

public class Gerente extends Empleado{
    private String departamento;

    //Metodo sobreescribir el método

    @Override
    public String mostrarInfo() {
        //Se tienen dos opciones
        //1. Modificar todo
        //2. Añadir funcionalidad
        return super.mostrarInfo() + " Departamento " + departamento;
    }


    //Constructores no se heredan
    //Si puedo llamarlos - super


    public Gerente() {
    }

    public Gerente(String nombre, double sueldo, LocalDate fNacimiento, String departamento) {
        super(nombre, sueldo, fNacimiento);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
