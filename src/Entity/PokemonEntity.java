/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/*import javax.swing.JPanel;*/
/**
 *
 * @author marti
 */
public class PokemonEntity implements Comparable<PokemonEntity> {

    private int fila;
    private int columna;
    private String nombre;
    private int comba_power;
    private String tipo;

    public PokemonEntity() {
    }

    public PokemonEntity(int fila, int columna, String nombre, int comba_power, String tipo) {

        this.fila = fila;
        this.columna = columna;
        this.nombre = nombre;
        this.comba_power = comba_power;
        this.tipo = tipo;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getComba_power() {
        return comba_power;
    }

    public void setComba_power(int comba_power) {
        this.comba_power = comba_power;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return " Nombre= " + nombre + " \n Fila= " + fila + "\n Columna= " + columna + " \n Kombat_power= " + comba_power + "\n  Tipo= " + tipo;
    }

    @Override
    public int compareTo(PokemonEntity o) {
        if (o.getComba_power() > this.getComba_power()) {
            return 1;
        } else if (o.getComba_power() == this.getComba_power()) {
            return 0;
        } else {
            return -1;
        }
    }

}
