package com.adaits;
import org.junit.jupiter.api.*;

import javax.swing.text.html.HTMLDocument;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class MinionTest3 {


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
        assertSame(minion,minionsPrueba);

    }
    @Test
    void pruebaMinions(){
        ArrayList<Minion> minion= new ArrayList<>();
        Minion n1 = new Minion(false,2);
        Minion n2 = new Minion(false,2);
        Minion n3 = new Minion(false,2);
        Minion n4 = new Minion(true,3);
        Minion n5 = new Minion(true,3);
        Jefe j1 = new Jefe("Juan",n1);
        minion.add(n1);
        minion.add(n2);
        minion.add(n3);
        minion.add(n4);
        minion.add(n5);
        ArrayList <Minion> resultadoEsperado = new ArrayList<Minion>();
        resultadoEsperado.add(n1);
        resultadoEsperado.add(n2);
        resultadoEsperado.add(n3);
        ArrayList <Minion> resultadoFuncion = j1.ojosGafas();
        assertEquals(minion,resultadoEsperado);
        for (int i=0;i<resultadoEsperado.size();i++){
           assertTrue(resultadoFuncion.contains(n1));
        }
        Iterator<Minion> it = resultadoEsperado.iterator() ;
        while (it.hasNext()){
            Object minion1 = it.hasNext();
            assertTrue(resultadoEsperado.contains(minion1));
        }
    }
    @Test
    void pruebaMinionsMal(){
        ArrayList<Minion> minion= new ArrayList<>();
        Minion n1 = new Minion(true,1);
        Minion n2 = new Minion(true,1);
        Jefe j1 = new Jefe("Paco",n1);
        minion.add(n1);
        minion.add(n2);
        ArrayList <Minion> resultadoEsperado = new ArrayList<Minion>();
        resultadoEsperado.add(n1);
        resultadoEsperado.add(n2);
        ArrayList <Minion> resultadoFuncion = j1.ojosGafas();
        assertNotEquals(resultadoFuncion,resultadoEsperado);
    }
    @Test
    void pruebaMinionsAlgo(){
        ArrayList<Minion> minio = new ArrayList<>();
        Minion m1= new Minion(false,1);
        Minion m2= new Minion(true,5);
        Minion m3= new Minion(false,2);
        Minion m4= new Minion(false,3);
        Minion m5= new Minion(false,5);
        Jefe j1 = new Jefe("Ember",m1);
        minio.add(m1);
        minio.add(m2);
        minio.add(m3);
        ArrayList <Minion> resultadoEsperado = new ArrayList<Minion>();
        resultadoEsperado.add(m1);
        resultadoEsperado.add(m2);
        resultadoEsperado.add(m3);
        ArrayList <Minion> resultadoFuncion = j1.ojosGafas();
        Iterator<Minion> it = resultadoEsperado.iterator() ;
        while (it.hasNext()){
            Object minion1 = it.hasNext();
            assertFalse(resultadoEsperado.contains(minion1));
        }
    }
    @Test
    void pruebaMinionsArrayL(){
        ArrayList<Minion> minion = new ArrayList<>();
        Minion m1= new Minion(true,1);
        Minion m2= new Minion(true,5);
        Jefe j1 = new Jefe("Ember",m1);
        ArrayList <Minion> resultadoEsperado = new ArrayList<Minion>();
        resultadoEsperado.add(m1);
        resultadoEsperado.add(m2);
        ArrayList <Minion> resultadoFuncion = j1.ojosGafas();
        assertNotNull(resultadoFuncion);
    }
    @Test
    void pruebaMinionCorecto(){
        ArrayList<Minion> minio = new ArrayList<>();
        Minion m1= new Minion(false,2);
        Minion m2= new Minion(false,2);
        Minion m3= new Minion(false,2);
        Minion m4= new Minion(false,2);
        Minion m5= new Minion(false,2);
        Jefe j1 = new Jefe("Ember",m1);
        minio.add(m1);
        minio.add(m2);
        minio.add(m3);
        ArrayList <Minion> resultadoEsperado = new ArrayList<Minion>();
        resultadoEsperado.add(m1);
        resultadoEsperado.add(m2);
        resultadoEsperado.add(m3);
        ArrayList <Minion> resultadoFuncion = j1.ojosGafas();
        //ArrayVacio
    }
}
