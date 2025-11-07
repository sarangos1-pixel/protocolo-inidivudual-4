/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procoloindividual_4;

/**
 *
 * @author Sebastian
 */
public class GenerarReporte {
    public void GenerarReporte(Libro libro){
        System.out.println("****Reporte del libro***" ); 
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autir: " + libro.getAutor());
    }
    
}
