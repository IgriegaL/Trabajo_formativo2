/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoformativo_2;

/**
 *
 * @author pc
 */
public class Red_Social {
    private String usuario;
    private int Password;

    public Red_Social(String usuario, int Password) {
        this.usuario = usuario;
        this.Password = Password;
    }

    public Red_Social() {
    }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getPassword() {
        return Password;
    }

    public void setPassword(int Password) {
        this.Password = Password;
    }
    
    
    
}
