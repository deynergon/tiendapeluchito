package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //entradas del problema
        String nombre;
        String cedula;
        Integer opcion;
        Integer cantidadproducto;
        Double sumatoriacostos=0.0;
        Double costototal=0.0;


        Scanner teclado= new Scanner(System.in);
        //proceso
        //1. CREAR UN MENU DE OPCIONES
        System.out.println("*****PELUCHITOS*****");
        System.out.println("1.cumpleaños");
        System.out.println("2.dia de la mujer");
        System.out.println("3.baby showers");
        System.out.println("4.SALIR");

        //2.construir un ciclo para permitir que el ususario escoja
        do {
            System.out.println("digita la opcion deseada");
            opcion= teclado.nextInt();

            //3.evaluando las opciones del menu
            if (opcion==1){
                System.out.println("digita cuantos kit de cumpleaños deseas");
                cantidadproducto=teclado.nextInt();
                sumatoriacostos=sumatoriacostos+costototal;
                costototal=180000.0*cantidadproducto;
                System.out.println("el costo es de:"+costototal);
            } else if (opcion==2) {
                System.out.println("digita cuantos kit de mujer deseas");
                cantidadproducto=teclado.nextInt();
                costototal=60000.0*cantidadproducto;
                sumatoriacostos=sumatoriacostos+costototal;
            } else if (opcion==3) {
                System.out.println("digita cuantos kit de baby showers deseas");
                cantidadproducto=teclado.nextInt();
                costototal=250000.0*cantidadproducto;
                sumatoriacostos=sumatoriacostos+costototal;
            } else if (opcion==4) {
                System.out.println("gracias,hasta pronto");
            }else{
                System.out.println("digita una opcion valida");

            }

        }while (opcion!=4);

        System.out.println("el costo es de:"+sumatoriacostos);

    }
}