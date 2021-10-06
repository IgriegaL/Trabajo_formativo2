/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajoformativo_2;

import java.util.ArrayList;
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
        List<String> InstaLista = new ArrayList<>();
        List<String> EstadoLista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int op1 = sc.nextInt();
        while (op1 != 4){     
            
            if (op1 == 1) {
            System.out.println("Escriba la Historia que subirá:");
            String historia1 = sc.nextLine();            
            InstaLista.add(historia1);
            } 
            else if  (op1 == 2) {
            System.out.println("Escriba la Estado que subirá:");
            String Estado1 = sc.nextLine();            
            EstadoLista.add(Estado1);
            }
            else if  (op1== 3){
                System.out.println("Historias SubidaS:");
            }  
        }

}
    
    
    
}
