/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_noheliacrysthel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author COPECO -13
 */
public class Lab3_NoheliaCrysthel {

    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String respuesta  ;
        int res=1;
        String dentCaso;
        int dentCas;
        String noID, correo, usuario, password;

        String opcion;
        int opt;
        while (res == 1) {
            System.out.println("Menú");
            System.out.println("1. Registrar Administrador");
            System.out.println("2. LogIn Empresas");
            opcion = sc.nextLine();
            if (verificaNum(opcion)) {
                opt = Integer.parseInt(opcion);
                switch (opt) {
                    case 1:
                        System.out.println("Agregar: \n 1. Administrador \n2. Freelance \n Empresa");
                        dentCas = sc.nextInt();
                        switch(dentCas){
                            case 1:
                                System.out.println("Ingrese Numero Identidad");
                                noID = sc.nextLine();
                                System.out.println("Ingrese Correo Electrónico");
                                correo = sc.nextLine();
                                System.out.println("Ingrese Nombre");
                                usuario= sc.nextLine();
                                System.out.println("Ingrese Contraseña");
                                password = sc.nextLine();
                                lista.add(new Administrador(noID, correo, usuario, password));
                                break;
                        }
                        
                        
                        
                        break;
                    case 2:

                        break;
                    case 3:

                    break;
                default:
                    System.out.println("Opcion Invalida");
                }
            }
            
            System.out.println("Desea Regresar al menu? (1 si/ 2 no)");
            respuesta = sc.nextLine();
            if (verificaNum(respuesta)) {
                res = Integer.parseInt(respuesta);
            }
        }

    }
    public static boolean verificaNum(String str) {
        int cont = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                cont++;
            }
        }
        if (cont == str.length()) {
            return false;
        } else {
            return true;
        }
    }

}
