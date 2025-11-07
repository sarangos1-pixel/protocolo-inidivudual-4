/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procoloindividual_4;

/**
 *
 * @author Sebastian
 */
public class LibrosSinSRP {
    private String titulo;
    private String autor;

    public LibrosSinSRP(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

  
    public String getTitulo() { 
        return titulo; }
    public String getAutor() { 
        return autor; }
    

  
    public void generarReporte() {
        System.out.println("Reporte del libro: " + titulo + " | " + autor);
    }

    
    public void GuardarEnBaseDeDatos() {
        System.out.println("Guardando libro en la base de datos...");
    }
} 

