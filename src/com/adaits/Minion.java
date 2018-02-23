package com.adaits;

import java.util.ArrayList;

public class Minion {

    private String nombre;
    private int crimenes;
    private String gafas;
    private int ojos=2;
    private ArrayList habilidades = new ArrayList(10);
    private String jefe;


    //Crear propiedad para gestionar palabra favorita//
    //Crear propiedad para los numeros de ojos""
    //Crear propiedad de si lleva gafas o no///
    //Crear propiedad de habilidades//Array
    //Crear Clase com.adaits.Jefe y asociarla a un minion, tener en cuenta que un jefe puede tener varios minions
    //Pero los minions solo obedecen a un jefe

    public Minion(String nombre, int crimenes) {
        this.nombre = nombre;
        this.crimenes = crimenes;
    }
    public Minion(){

    }

    @Override
    public String toString() {
        return "Minion{" +
                "nombre='" + nombre + '\'' +
                ", crimenes=" + crimenes +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esUnVillano(){
        boolean esMayor = false;

        if(this.crimenes >= 18){
            esMayor = true;
        }

        return esMayor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Minion minion = (Minion) o;

        if (crimenes != minion.crimenes) return false;
        return nombre != null ? nombre.equals(minion.nombre) : minion.nombre == null;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + crimenes;
        return result;
    }
    //Crear una funcion que obtengan todos los minions con mas de un ojo y sin gafas

    //Crear una función que obtenga todos los minions con más de una habilidad


    //Crear una función que obtenga un minion con la misma palabra favorita que tu

    //Crear una función que te devuelva el primer minion que se unio a un jefe

}
