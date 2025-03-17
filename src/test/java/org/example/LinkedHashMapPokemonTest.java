package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedHashMapPokemonTest {
    private LinkedHashMapPokemon LinkedHashMapPokemon;
    @BeforeEach
    void setUp() {
        LinkedHashMapPokemon = new LinkedHashMapPokemon();
    }

    @Test
    void testGuardarPokemon_NuevoPokemon() {
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Eléctrico", "", "Ratón", 0.4f, 6.0f, "Electricidad Estática", 1, false);
        String resultado = LinkedHashMapPokemon.GuardarPokemon(pikachu);
        assertEquals("El Pokemon ya se encuentra registrado", resultado);
    }

    @Test
    void testGuardarPokemon_PokemonDuplicado() {
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Eléctrico", "", "Ratón", 0.4f, 6.0f, "Electricidad Estática", 1, false);
        LinkedHashMapPokemon.GuardarPokemon(pikachu);
        String resultado = LinkedHashMapPokemon.GuardarPokemon(pikachu);
        assertEquals("El Pokemon ya existe en la colección", resultado);
    }

    @Test
    void testBuscarPokemon_Existe() {
        Pokemon pikachu = new Pokemon("Pikachu", 25, "Eléctrico", "", "Ratón", 0.4f, 6.0f, "Electricidad Estática", 1, false);
        LinkedHashMapPokemon.GuardarPokemon(pikachu);
        String resultado = LinkedHashMapPokemon.BuscarPokemon("Pikachu");
        assertEquals(pikachu.getInformation(), resultado);
    }

    @Test
    void testBuscarPokemon_NoExiste() {
        String resultado = LinkedHashMapPokemon.BuscarPokemon("Charmander");
        assertEquals("El pokemon no está en la colección", resultado);
    }
}