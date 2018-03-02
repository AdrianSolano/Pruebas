package com.adaits;

public class Jefe {
    String nombre;
    Minion minionsJefe;
    public Jefe(String nombre, Minion minionsJefe) {
        this.nombre = nombre;
        this.minionsJefe = minionsJefe;
    }

    public Minion ojosGafas(){
        Minion o = new Minion(true,2);
        if (o.getOjos()<2)
            System.out.println("Mas de un ojo");
        if (o.isGafas()==false)
            System.out.println("Sin gafas");
        return o;
    }

    public Minion habilidades(Minion o){
        o.getHabilidades().add("Fuerza");
        o.getHabilidades().add("Resistencia");
        return o;
    }

}
