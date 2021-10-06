/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public class TrabajoFormativo_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Red_Social rs1 = new Red_Social();
            Instagram insta1 = new Instagram();
            
            List<String> InstaLista = new ArrayList<>();
            List<String> EstadoLista = new ArrayList<>();
            System.out.println("Bienvenido a la Red Social");
            
            Scanner sn = new Scanner(System.in);
            boolean salir = false;
            boolean salir2 = false;
            int opcion;
            
            while(!salir){
            System.out.println("Elija la red social a la que deseas entrar: \n 1.instagram \n 2.Twitter \n 5. Salir");
            opcion = sn.nextInt();
                if (opcion == 1) {
                    System.out.println("Has seleccionado la opcion 1");
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Escriba su nuevo usuario");
                    String usuario = sc.nextLine();
                    insta1.setUsuario(usuario);
                    System.out.println("Bienvenido " + insta1.getUsuario());
                        while(!salir2){
                            System.out.println("1.Subir una historia 2.Subir un estado 3.volver al home");
                        opcion = sn.nextInt();
                            if (opcion == 1) {
                            System.out.println("Escriba historia a subir");
                            String story = sn.next();
                            InstaLista.add(story);
                            System.out.println("Usted ha subido la siguiente historia con exito:" + InstaLista);
                            }
                            if (opcion == 2) {
                                System.out.println("Escriba el estado a subir");
                                String story = sn.next();
                                EstadoLista.add(story);
                                System.out.println("Usted ha subido el siguiente estado con exito:" + EstadoLista);
                            }
                            if (opcion == 3) {
                                salir2=true;
                            }
                        }
                    }//final-if-1
                if (opcion == 5) {
                    salir=true;
                }

            }

            
            System.out.println("Muchas gracias por preferir Red Social");


    }
    
}
