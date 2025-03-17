package org.example;

public class Pokemon {
    private String nombre;
    private int pokedexnum;
    private String tipo1;
    private String tipo2;
    private String clasificacion;
    private float altura;
    private float peso;
    private String habilidad;
    private int gen;
    private boolean legendario;

    Pokemon(String nombre, int pokedexnum, String tipo1, String tipo2, String clasificacion, float altura, float peso, String habilidad, int gen, boolean legendario) {
        this.nombre = nombre;
        this.pokedexnum = pokedexnum;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.clasificacion = clasificacion;
        this.altura = altura;
        this.peso = peso;
        this.habilidad = habilidad;
        this.legendario = legendario;
        this.gen = gen;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public int getPokedexnum() {return pokedexnum;}
    public void setPokedexnum(int pokedexnum) {this.pokedexnum = pokedexnum;}

    public String getTipo1() {return tipo1;}
    public void setTipo1(String tipo1) {this.tipo1 = tipo1;}

    public String getTipo2() {return tipo2;}
    public void setTipo2(String tipo2) {this.tipo2 = tipo2;}

    public String getClasificacion() {return clasificacion;}
    public void setClasificacion(String clasificacion) {this.clasificacion = clasificacion;}

    public float getAltura() {return altura;}
    public void setAltura(float altura) {this.altura = altura;}

    public float getPeso() {return peso;}
    public void setPeso(float peso) {this.peso = peso;}

    public String getHabilidad() {return habilidad;}
    public void setHabilidad(String habilidad) {this.habilidad = habilidad;}

    public int getGen() {return gen;}
    public void setGen(int gen) {this.gen = gen;}

    public boolean isLegendario() {return legendario;}
    public void setLegendario(boolean legendario) {this.legendario = legendario;}

    public String getInformation(){
        return "Nombre: " + nombre + "\n" + "Tipo1: " + tipo1 + "\n" + "Tipo2: " + tipo2 + "\n" +"Clasificación: " + clasificacion + "\n" + "Altura: " + altura + "\n" + "Peso: " + peso + "\n" + "Habilidad: " + habilidad + "\n" + "Generación: " + gen + "\n" + "Legendario: " + legendario;
    }
}
