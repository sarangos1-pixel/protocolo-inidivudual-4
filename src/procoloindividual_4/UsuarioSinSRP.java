/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procoloindividual_4;

/**
 *
 * @author Sebastian
 */
public class UsuarioSinSRP {
    private String nombre;
    private String contrasena;
    
    public UsuarioSinSRP (String nombre, String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    
    public String getNombre(){
    return nombre;
    }
    public String getContrasena(){
    return contrasena;
    }

public boolean Autenticar(String IngresoContrasena, String IngresoUsuario){
return this.Autenticar(IngresoContrasena, IngresoUsuario);
}

public boolean esValido() {
        return nombre != null && !nombre.isEmpty();
    }
    
}
