/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajoformativo_2;

import java.util.InputMismatchException;
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
//            Red_Social rs1 = new Red_Social();
//            Instagram insta1 = new Instagram();
//            //Instagram insta1 = new Instagram();
//            System.out.println("Bienvenido a la Red Social");
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Escriba su nuevo usuario");
//            String usuario = sc.nextLine();
//            insta1.setUsuario(usuario);
//            System.out.println("Bienvenido " + insta1.getUsuario());
//            System.out.println("Elija la red social a la que deseas entrar: \n 1.instagram \n 2.Twitter");
//            int Opc = sc.nextInt();
//
//            while (Opc != 3) {
//                if (Opc == 1) {
//                    System.out.println("Eligio Instagram");
//                    insta1.instagramUso();
//                    return;
//                    
//                }
//                if (Opc == 2) {
//                    System.out.println("Eligio Twitter");
//                    
//                }
//            }
//            System.out.println("Muchas gracias por preferir Red Social");

Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
    
}