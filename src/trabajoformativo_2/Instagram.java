/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoformativo_2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Instagram extends Red_Social{
    private int id;
    private String historia;
    private String estado;

    public Instagram(int id, String historia, String estado, String usuario, int Password) {
        super(usuario, Password);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

    public Instagram() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public void instagramUso() {
        System.out.println("Bienvenido a Instagram " + this.getUsuario());
        System.out.println("Qué Acción quieres hacer? \n 1.- Subir una historia \n 2.- Subir un estado");
    }
}
