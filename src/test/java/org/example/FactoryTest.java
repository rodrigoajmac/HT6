package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    void testCreateMapPokemon_HashMap() {
        Factory factory = new Factory();
        MapPokemon result = factory.createMapPokemon(1);
        assertTrue(result instanceof HashMapPokemon, "Debe devolver una instancia de HashMapPokemon");
    }

    @Test
    void testCreateMapPokemon_TreeMap() {
        Factory factory = new Factory();
        MapPokemon result = factory.createMapPokemon(2);
        assertTrue(result instanceof TreeMapPokemon, "Debe devolver una instancia de TreeMapPokemon");
    }

    @Test
    void testCreateMapPokemon_LinkedHashMap() {
        Factory factory = new Factory();
        MapPokemon result = factory.createMapPokemon(3);
        assertTrue(result instanceof LinkedHashMapPokemon, "Debe devolver una instancia de LinkedHashMapPokemon");
    }

    @Test
    void testCreateMapPokemon_Default() {
        Factory factory = new Factory();
        MapPokemon result = factory.createMapPokemon(99);
        assertNull(result, "Debe devolver null para valores fuera del rango");
    }

}