package org.example;

public class Factory {
    public Factory() {}

    public MapPokemon createMapPokemon(int cond) {
        MapPokemon TipoMap = null;
        switch (cond) {
            case 1:
                TipoMap = new HashMapPokemon();
                break;
            case 2:
                TipoMap = new TreeMapPokemon();
                break;
            case 3:
                TipoMap = new LinkedHashMapPokemon();
                break;
        }

        return TipoMap;
    }
}
