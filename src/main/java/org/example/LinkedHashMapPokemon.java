package org.example;
import java.util.*;

public class LinkedHashMapPokemon extends  MapPokemon {
    LinkedHashMap<String, Pokemon> colection = new LinkedHashMap<>();

    @Override
    public String GuardarPokemon(Pokemon pokemon){
        String mensaje;
        if (colection.containsKey(pokemon.getNombre())) {
            mensaje = "El Pokemon ya existe en la colección";
        } else {
            colection.put(pokemon.getNombre(), pokemon);
            mensaje = "El Pokemon ya se encuentra registrado";
        }

        return mensaje;
    }

    @Override
    public String BuscarPokemon(String llave){
        String mensaje;
        if(colection.containsKey(llave)) {
            mensaje = colection.get(llave).getInformation();
        }else{
            mensaje = "El pokemon no está en la coleccion";
        }
        return mensaje;
    }

    @Override
    public String MostrarPokemonTipo(String tipo) {
        String mensaje = "";
        for(String llave: colection.keySet()) {
            if(colection.get(llave).getTipo1().equals(tipo)) {
                mensaje += colection.get(llave).getNombre() + " - " + colection.get(llave).getTipo1() + "\n";
            }
        }
        return mensaje;
    }


    @Override
    public String MostrarPokemonHabilidad(String habilidad) {
        String mensaje = "";
        for(String llave: colection.keySet()) {
            if(colection.get(llave).getHabilidad().equals(habilidad)) {
                mensaje += colection.get(llave).getNombre() + " - " + colection.get(llave).getHabilidad() + "\n";
            }
        }
        return mensaje;
    }

    @Override
    public String MostrarColeccion() {
        List<Pokemon> listaOrdenada = new ArrayList<>(colection.values());
        listaOrdenada.sort(Comparator.comparing(Pokemon::getTipo1));

        String mensaje = "";
        for (Pokemon pokemon : listaOrdenada) {
            mensaje += pokemon.getNombre() + " - " + pokemon.getTipo1() + "\n";
        }
        return mensaje;
    }
}
