/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasolar;

/**
 *
 * @author fernandafajardo
 */
public class PlanetaRocoso extends CuerpoCeleste implements Planeta {

    public PlanetaRocoso(String nombre, double tamano, double distanciaSol, int numeroLunas) {
        super(nombre, tamano, distanciaSol, numeroLunas);
    }
    
    @Override
    public double calcularAnio(){
        return Math.sqrt(Math.pow(distanciaSol, 3)); //Ley de Kepler
    } 
    
}

