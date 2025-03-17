package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Factory factory = new Factory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de estructura:");
        System.out.println("1. HashMap\n2. TreeMap\n3. LinkedHashMap");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        MapPokemon mapPokemon = factory.createMapPokemon(opcion);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar Pokémon\n2. Buscar Pokémon\n3. Mostrar Pokémon por tipo\n4. Mostrar Pokémon por habilidad\n5. Mostrar toda la colección\n6. Salir");
            int opcionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcionMenu) {
                case 1:
                    System.out.println("Ingrese nombre, número, tipo1, tipo2, clasificación, altura, peso, habilidad, generación, legendario (true/false):");
                    String nombre = scanner.nextLine();
                    int pokedexnum = scanner.nextInt();
                    scanner.nextLine();
                    String tipo1 = scanner.nextLine();
                    String tipo2 = scanner.nextLine();
                    String clasificacion = scanner.nextLine();
                    float altura = scanner.nextFloat();
                    float peso = scanner.nextFloat();
                    scanner.nextLine();
                    String habilidad = scanner.nextLine();
                    int gen = scanner.nextInt();
                    boolean legendario = scanner.nextBoolean();
                    scanner.nextLine();

                    Pokemon nuevoPokemon = new Pokemon(nombre, pokedexnum, tipo1, tipo2, clasificacion, altura, peso, habilidad, gen, legendario);
                    System.out.println(mapPokemon.GuardarPokemon(nuevoPokemon));
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del Pokémon:");
                    String nombreBuscar = scanner.nextLine();
                    System.out.println(mapPokemon.BuscarPokemon(nombreBuscar));
                    break;

                case 3:
                    System.out.println("Ingrese el tipo de Pokémon:");
                    String tipoBuscar = scanner.nextLine();
                    System.out.println(mapPokemon.MostrarPokemonTipo(tipoBuscar));
                    break;

                case 4:
                    System.out.println("Ingrese la habilidad:");
                    String habilidadBuscar = scanner.nextLine();
                    System.out.println(mapPokemon.MostrarPokemonHabilidad(habilidadBuscar));
                    break;

                case 5:
                    System.out.println(mapPokemon.MostrarColeccion());
                    break;

                case 6:
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}