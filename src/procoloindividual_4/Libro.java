/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procoloindividual_4;

/**
 *
 * @author Sebastian
 */
public class Libro {
    private String Titulo;
    private String Autor;
    
    
    public Libro (String Titulo, String Autor){
    this.Titulo = Titulo;
    this.Autor = Autor;
    
    }
    
    public String getTitulo(){ 
        return Titulo; 
    }
    public String getAutor(){ 
        return Autor; 
    }

}
