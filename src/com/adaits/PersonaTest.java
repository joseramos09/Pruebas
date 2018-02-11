package com.adaits;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonaTest {

    static Persona[] personas;
    static int posPersonaActual = 0;
    private Persona personaProbar = null;

    @BeforeAll
    static void crearPersonas(){
        personas = new Persona[10];
        personas[0] = new Persona("Jorge",30);
        personas[1] = new Persona("Maria",15);
        personas[2] = new Persona("Lolita",Integer.MAX_VALUE);
        personas[3] = new Persona("Juanito",Integer.MIN_VALUE);
        personas[4] = new Persona("Jaimito",17);
        personas[5] = new Persona("Pepe",18);
        personas[6] = new Persona("Jaimito",19);
        personas[7] = new Persona("Pepe",Integer.MIN_VALUE -1);
        personas[8] = new Persona("Pepe",Integer.MAX_VALUE+1);
    }

    @BeforeEach
    void prepararPersonaProbar(){
        personaProbar = personas[posPersonaActual];
        System.out.println(personaProbar);
    }

    @AfterEach
    void aumentarPosicion(){
        posPersonaActual +=1;
        System.out.println("POSICION ACTUAL: "+posPersonaActual);
    }

    @AfterAll
    static void terminar(){
        System.out.println("TODAS LAS PRUEBAS HAN TERMINADO");
    }



    @Test
    void probarEsMayorEdad(){
        assertTrue(personaProbar.esMayorEdad());
    }

    @Test
    void probarEsMayorEdad2(){
        assertFalse(personaProbar.esMayorEdad());
    }

    @Test
    void probarEsMayorEdad3(){
        assertTrue(personaProbar.esMayorEdad());
    }

    @Test
    void probarEsMayorEdad4(){
        assertFalse(personaProbar.esMayorEdad());
    }

    @Test
    void probarEsMayorEdad5(){
        assertFalse(personaProbar.esMayorEdad());
    }
    @Test
    void probarEsMayorEdad6(){
        assertTrue(personaProbar.esMayorEdad());
    }
    @Test
    void probarEsMayorEdad7(){
        assertTrue(personaProbar.esMayorEdad());
    }
    @Test
    void probarEsMayorEdad8(){
        assertFalse(personaProbar.esMayorEdad());
    }
    @Test
    void probarEsMayorEdad9(){
        assertTrue(personaProbar.esMayorEdad());
    }








}