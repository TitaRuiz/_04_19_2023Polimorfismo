package com.hedima.presentacion;


import com.hedima.modelo.Cuadrado;
import com.hedima.modelo.Figura;
import com.hedima.modelo.Triangulo;

public class ProbarPolimorfismoFigura {
    public static void main(String[] args) {

        Figura f1 = new Triangulo(4,4,3,5);
        System.out.println("Desde f1 sólo se ven los atributos de Figura x :" + f1.getX() + " y " + f1.getY() );
        Triangulo t1 = (Triangulo) f1;
        System.out.println("Desde t1 se ven todos los atributos de triangulo  x :" + t1.getX() + " y " + t1.getY() + " base " + t1.getBase() + " altura " + t1.getAltura());
        System.out.println(f1.mostrarPosicion());
        System.out.println(t1.mostrarPosicion());



        Figura f2 = new Cuadrado(0,0,5);
        System.out.println("Desde f2 sólo se miran los atributos de figura x "+ f2.getY() + " y " + f2.getY());
        Cuadrado c1 = (Cuadrado)  f2;
        System.out.println("Se puede visualizar todos lo de Cuadrado lado " + c1.getLado());
        System.out.println(f2.mostrarPosicion());
        System.out.println(c1.mostrarPosicion());

        Figura[] figuras = new Figura[2];
        figuras[0] = f1;
        figuras[1] = f2;
        System.out.println("Bucle");
        for(int i=0; i<figuras.length;i++){
            System.out.println(figuras[i].mostrarPosicion());
            System.out.println(figuras[i].calcularArea());
        }




    }
}
