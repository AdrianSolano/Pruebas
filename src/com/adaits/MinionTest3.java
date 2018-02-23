package com.adaits;
import org.junit.jupiter.api.*;

public class MinionTest3 {

    Jefe chief;
    static Minion[] minions;

    @BeforeAll
    static void crearMinions() {
        minions = new Minion[10];
        minions[0] = new Minion(true, 0);
        minions[1] = new Minion(false, 1);
        minions[2] = new Minion(true, 2);
        minions[3] = new Minion(false, 10);
        minions[4] = new Minion(true, 1);
        minions[5] = new Minion(false, 5);
        minions[6] = new Minion(true, 2);
        minions[7] = new Minion(false, 2);


    }
    @Test
    void minionsCorrectos(){

    }
    @Test
    void minionsIncorrectos(){

    }
}
