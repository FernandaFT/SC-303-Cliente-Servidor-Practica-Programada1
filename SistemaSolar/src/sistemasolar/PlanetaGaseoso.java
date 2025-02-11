/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasolar;

/**
 *
 * @author fernandafajardo
 */
public class PlanetaGaseoso extends CuerpoCeleste implements Planeta  {
    
    private boolean anillos;

    public PlanetaGaseoso(String nombre, double tamano, double distanciaSol, int numeroLunas, boolean anillos) {
        super(nombre, tamano, distanciaSol, numeroLunas);
        this.anillos = anillos;
    }
    
    @Override
    public double calcularAnio(){
        return Math.sqrt(Math.pow(distanciaSol, 3)); //Ley de Kepler
    } 
    
    
    public boolean anillos() {
        return anillos;
    }
}
