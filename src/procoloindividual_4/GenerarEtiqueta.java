/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procoloindividual_4;

/**
 *
 * @author Sebastian
 */
public class GenerarEtiqueta {
    public void GenerarEtiqueta(Producto producto) {
        System.out.println("Etiqueta: " + producto.getNombre() + " - $" + producto.getPrecio());
    }

    
}
