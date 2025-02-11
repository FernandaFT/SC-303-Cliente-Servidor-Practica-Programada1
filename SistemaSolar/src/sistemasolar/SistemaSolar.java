/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemasolar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernandafajardo
 */
public class SistemaSolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Planeta> planetas = new ArrayList<>();
        planetas.add(new PlanetaRocoso("Tierra", 12742, 149.6, 1));
        planetas.add(new PlanetaRocoso("Mercurio", 4879, 57.9, 0));
        planetas.add(new PlanetaRocoso("Venus", 12104, 108.2, 0));
        planetas.add(new PlanetaRocoso("Marte", 6779, 227.9, 2));
        planetas.add(new PlanetaGaseoso("Júpiter", 139820, 778.3, 79,true));
        planetas.add(new PlanetaGaseoso("Saturno", 116460, 1427, 83,true));
        planetas.add(new PlanetaGaseoso("Urano", 50724, 2871, 27,true));
        planetas.add(new PlanetaGaseoso("Neptuno", 49244, 4495, 14,true));

        // Imprimir los años de órbita de cada planeta
        for (Planeta planeta : planetas) {
            System.out.println("=======================================");
            System.out.println("🌍 Planeta: " + planeta.getNombre());
            System.out.println("🔵 Tamaño: " + planeta.getTamano());
            System.out.println("🌞 Distancia al Sol: " + planeta.getDistanciaSol() + " millones de km");
            System.out.println("🌙 Número de lunas: " + planeta.getNumeroLunas() + (planeta.getNumeroLunas() == 1 ? " luna" : " lunas"));
            System.out.println("🌀 Tiempo de órbita: " + planeta.calcularAnio() + " años");

            if (planeta instanceof PlanetaGaseoso) {
                PlanetaGaseoso gaseoso = (PlanetaGaseoso) planeta;
                System.out.println("💍 Tiene anillos: " + (gaseoso.anillos() ? "Sí" : "No"));
            }

            System.out.println("=======================================\n");
        }
    }
    
}
