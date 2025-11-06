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

        /*String nombre="Manzana";
        Integer precio=4000;
        String descripción="Deliciosa manzana importada de donde traen las mejores manazanas";
        Integer codigo=3322110;

        //ARREGLO PRIMITIVO
        String[] frutas=new String[5];*/

        //Darle color
        String colorBlanco="\u001B[38m";
        String colorVerde="\u001B[32m";
        String colorMorado="\u001B[35m";
        String colorCeleste="\u001B[36m";

        //ARREGLO EVOLUCIONADO (LISTA)
        ArrayList<String> frutasDos=new ArrayList<>();
        frutasDos.add("Manzana");
        frutasDos.add("pera");
        frutasDos.add("Sandía");
        frutasDos.add("Fresa");
        frutasDos.add("Zapote");
        System.out.println(colorVerde+frutasDos);

        //arreglo o lista de nombres de clientes (5)-->String
        //arreglo o lista de nombres de proveedores (10)-->String
        //arreglo o lista de valores de servicios publicos (5 meses)-->Integer/Double

        ArrayList<String> clientes=new ArrayList<>();
        clientes.add("Capitan Ginyu");
        clientes.add("Recoom");
        clientes.add("Burter");
        clientes.add("Jeice");
        clientes.add("Guldo");
        System.out.println(colorMorado+clientes);

        ArrayList<String> proveedores=new ArrayList<>();
        proveedores.add("Freezer");
        proveedores.add("Beerus");
        proveedores.add("Cell perfecto");
        proveedores.add("Babidi");
        proveedores.add("Yardrat");
        proveedores.add("Rey Vegeta");
        proveedores.add("Principe Vegeta");
        proveedores.add("Paragus");
        proveedores.add("Turles");
        proveedores.add("Cooler");
        System.out.println(colorCeleste+proveedores);

        ArrayList<Integer> costosServiciosPublicos=new ArrayList<>();
        costosServiciosPublicos.add(1800000);
        costosServiciosPublicos.add(1350000);
        costosServiciosPublicos.add(2000000);
        costosServiciosPublicos.add(1950000);
        costosServiciosPublicos.add(2236001);
        System.out.println(colorBlanco+costosServiciosPublicos);




    }
}