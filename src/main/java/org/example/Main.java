package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*//ESTRUCTURAS DE DATOS EN JAVA
        //Lista (Arreglo)
        //Hashmap (diccionario)

        //PARA GUARDAR DATOS
        //Variables
        //1. Variables primitivas
        int precio=5000;
        double peso=2.5;
        boolean estaPodrida=false;

        //2. Variables tipo envoltura
        String nombre="manzana";
        Double pesoNuevo=2.5;
        Integer precioNuevo=4000;*/

        String nombre="Manzana";
        Integer precio=4000;
        String descripción="Deliciosa manzana importada de donde traen las mejores manazanas";
        Integer codigo=3322110;

        //ARREGLO PRIMITIVO
        String[] frutas=new String[5];

        //ARREGLO EVOLUCIONADO (LISTA)
        ArrayList<String> frutasDos=new ArrayList<>();
        frutasDos.add("Manzana");
        frutasDos.add("pera");
        frutasDos.add("Sandía");
        System.out.println(frutasDos);

        //arreglo o lista de nombres de clientes (5)-->String
        //arreglo o lista de nombres de proveedores (10)-->String
        //arreglo o lista de valores de servicios publicos (5 meses)-->Integer/Double




    }
}