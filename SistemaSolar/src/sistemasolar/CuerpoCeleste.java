/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasolar;

/**
 *
 * @author fernandafajardo
 */
abstract class CuerpoCeleste {
    protected String nombre;
    protected double tamano;
    protected double distanciaSol;
    protected int numeroLunas;

    public CuerpoCeleste(String nombre, double tamano, double distanciaSol, int numeroLunas) {
        
        if(tamano <= 0 || distanciaSol <= 0 ){
            throw new IllegalArgumentException("Los valores deben ser positivos");
        }
        
        this.nombre = nombre;
        this.tamano = tamano;
        this.distanciaSol = distanciaSol;
        this.numeroLunas = numeroLunas;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTamano() {
        return tamano;
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public int getNumeroLunas() {
        return numeroLunas;
    }

}
