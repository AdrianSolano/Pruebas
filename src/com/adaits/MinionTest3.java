package com.adaits;
import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MinionTest3 {

    Jefe chief;
    static Minion[] minions;

    @BeforeAll
    static void crearMinions() {
        minions = new Minion[10];
        minions[0] = new Minion(true, 0);
        minions[1] = new Minion(false, 1);
        minions[2] = new Minion(true, 2);
        minions[3] = new Minion(false, 0);
        minions[4] = new Minion(true, 1);
        minions[5] = new Minion(false, 2);
        minions[6] = new Minion(true, 2);
        minions[7] = new Minion(false, -1);


    }
    @Test
    void probarFuncion(){
        ArrayList<Minion> minion = new ArrayList<>();
        Minion n1 = new Minion(false,2);
        minion.add(n1);
        Jefe j = new Jefe("Pepe",n1);
        j.ojosGafas();
        ArrayList<Minion> minionsPrueba= new ArrayList<>();
        for (int i = 0; i<minion.size();i++)
            minion.indexOf(i);
        for (int i = 0; i<minionsPrueba.size();i++)
            minionsPrueba.indexOf(i);
        assertEquals(minion,minionsPrueba);
        //IMPLEMENTAR TODAS LA FUNCIONES Y ALMENOS DOS PRUEBAS

    }
    @Test
    void minionsCorrectos(){

    }
    @Test
    void minionsIncorrectos(){

    }
}
