/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procoloindividual_4;

/**
 *
 * @author Sebastian
 */
public class Validacion {
    public boolean esValido(Usuario usuario) {
       
        boolean nombreValido = usuario.getNombre() != null && !usuario.getNombre().isEmpty();

        
        boolean contrasenaValida = usuario.getContrasena() != null && usuario.getContrasena().isEmpty();

       
        return nombreValido && contrasenaValida;
    }
}


