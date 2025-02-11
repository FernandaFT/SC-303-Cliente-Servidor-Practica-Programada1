/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemasolar;

/**
 *
 * @author fernandafajardo
 */
public interface Planeta {
    String getNombre();
    double getTamano();
    double getDistanciaSol();
    int getNumeroLunas();
    double calcularAnio();
}
