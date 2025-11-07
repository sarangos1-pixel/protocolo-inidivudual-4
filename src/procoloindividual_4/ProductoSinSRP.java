/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procoloindividual_4;

/**
 *
 * @author Sebastian
 */
public class ProductoSinSRP {
    private String nombre;
    private double precio;

    public ProductoSinSRP(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

  
    public String getNombre() { 
        return nombre; }
    public double getPrecio() { 
        return precio; }

    
    public void generarEtiqueta() {
        System.out.println("Etiqueta: " + nombre + " | $" + precio);
    }

   
    public double calcularPrecioConImpuesto() {
        return precio * 1.19;
    }
}

