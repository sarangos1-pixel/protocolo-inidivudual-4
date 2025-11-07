/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procoloindividual_4;

/**
 *
 * @author Sebastian
 */
public class Autenticacion {
    public boolean autenticar(Usuario usuario, String ContrasenaIngresada) {
        return usuario.getContrasena().equals(ContrasenaIngresada);
    }
}
