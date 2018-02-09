
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author euced
 */
public class Principal2 {

    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String respuesta;
        int res = 1;
        String dentCaso;
        int dentCas;
        String noID, correo, usuario, password, nombre, ciudad, telefono;
        String lengProg, universidad, idioma, hobbies, nombreMarca, modeloCamara, redSocial, estadoInsc;
        char genero;
        double dinero;
        int edad;

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
                        switch (dentCas) {
                            case 1:
                                System.out.println("Ingrese Numero Identidad");
                                noID = sc.nextLine();
                                System.out.println("Ingrese Correo Electrónico");
                                correo = sc.nextLine();
                                System.out.println("Ingrese Nombre");
                                usuario = sc.nextLine();
                                System.out.println("Ingrese Contraseña");
                                password = sc.nextLine();
                                lista.add(new Administrador(noID, correo, usuario, password));
                                break;
                            case 2:
                                System.out.println("Tipo de FreeLance \n 1. Desarrollador Web \n 2. Fotografo \n 3. Diseñador Gráfico \n 4. Medios Audiovisuales \n 5. Marketing \n 6. Contador");
                                dentCas = sc.nextInt();
                                switch (dentCas) {
                                    case 1:
                                        System.out.println("Ingrese Numero Identidad");
                                        noID = sc.nextLine();
                                        System.out.println("Ingrese Correo Electrónico");
                                        correo = sc.nextLine();
                                        System.out.println("Ingrese Nombre");
                                        usuario = sc.nextLine();
                                        System.out.println("Ingrese Contraseña");
                                        password = sc.nextLine();
                                        System.out.println("Ingrese Genero (M/F)");
                                        genero = sc.nextLine().charAt(0);
                                        System.out.println("Ingrese edad");
                                        edad = sc.nextInt();
                                        System.out.println("Ingrese dinero");
                                        dinero = sc.nextDouble();
                                        System.out.println("Ingrese ciudad");
                                        ciudad = sc.nextLine();
                                        System.out.println("Ingrese telefono");
                                        telefono = sc.nextLine();
                                        System.out.println("Ingrese lenguaje Programacion");
                                        lengProg = sc.nextLine();
                                        System.out.println("Ingrese Universidad");
                                        universidad = sc.nextLine();
                                        System.out.println("Ingrese idioma");
                                        idioma = sc.nextLine();
                                        lista.add(new DesarrolloWeb(lengProg, universidad, idioma, usuario, password, edad, genero, dinero, ciudad, telefono, noID, correo));

                                        break;
                                    case 2:
                                        System.out.println("Ingrese Numero Identidad");
                                        noID = sc.nextLine();
                                        System.out.println("Ingrese Correo Electrónico");
                                        correo = sc.nextLine();
                                        System.out.println("Ingrese Nombre");
                                        usuario = sc.nextLine();
                                        System.out.println("Ingrese Contraseña");
                                        password = sc.nextLine();
                                        System.out.println("Ingrese Genero (M/F)");
                                        genero = sc.nextLine().charAt(0);
                                        System.out.println("Ingrese edad");
                                        edad = sc.nextInt();
                                        System.out.println("Ingrese dinero");
                                        dinero = sc.nextDouble();
                                        System.out.println("Ingrese ciudad");
                                        ciudad = sc.nextLine();
                                        System.out.println("Ingrese telefono");
                                        telefono = sc.nextLine();
                                        System.out.println("Ingrese Universidad");
                                        universidad = sc.nextLine();
                                        System.out.println("Ingrese hobbies");
                                        hobbies = sc.nextLine();
                                        lista.add(new DiseñadorGrafico(universidad, hobbies, usuario, password, edad, genero, dinero, ciudad, telefono, noID, correo));
                                        break;
                                    case 3:
                                        System.out.println("Ingrese Numero Identidad");
                                        noID = sc.nextLine();
                                        System.out.println("Ingrese Correo Electrónico");
                                        correo = sc.nextLine();
                                        System.out.println("Ingrese Nombre");
                                        usuario = sc.nextLine();
                                        System.out.println("Ingrese Contraseña");
                                        password = sc.nextLine();
                                        System.out.println("Ingrese Genero (M/F)");
                                        genero = sc.nextLine().charAt(0);
                                        System.out.println("Ingrese edad");
                                        edad = sc.nextInt();
                                        System.out.println("Ingrese dinero");
                                        dinero = sc.nextDouble();
                                        System.out.println("Ingrese ciudad");
                                        ciudad = sc.nextLine();
                                        System.out.println("Ingrese telefono");
                                        telefono = sc.nextLine();
                                        System.out.println("Ingrese nombre de la marca");
                                        nombreMarca = sc.nextLine();
                                        System.out.println("Ingrese el modelo de la camara");
                                        modeloCamara = sc.nextLine();
                                        lista.add(new Fotografo(nombreMarca, modeloCamara, usuario, password, edad, genero, dinero, ciudad, telefono, noID, correo));
                                        break;
                                    case 4:
                                        System.out.println("Ingrese Numero Identidad");
                                        noID = sc.nextLine();
                                        System.out.println("Ingrese Correo Electrónico");
                                        correo = sc.nextLine();
                                        System.out.println("Ingrese Nombre");
                                        usuario = sc.nextLine();
                                        System.out.println("Ingrese Contraseña");
                                        password = sc.nextLine();
                                        System.out.println("Ingrese Genero (M/F)");
                                        genero = sc.nextLine().charAt(0);
                                        System.out.println("Ingrese edad");
                                        edad = sc.nextInt();
                                        System.out.println("Ingrese dinero");
                                        dinero = sc.nextDouble();
                                        System.out.println("Ingrese ciudad");
                                        ciudad = sc.nextLine();
                                        System.out.println("Ingrese telefono");
                                        telefono = sc.nextLine();
                                        System.out.println("Ingrese nombre de la marca");
                                        nombreMarca = sc.nextLine();
                                        System.out.println("Ingrese el modelo de la camara");
                                        modeloCamara = sc.nextLine();
                                        lista.add(new MediosAudioVisuales(nombreMarca, modeloCamara, usuario, password, edad, genero, dinero, ciudad, telefono, noID, correo));
                                        break;
                                    case 5:

                                        break;
                                }
                                break;
                        }

                        break;
                    case 2:
                        System.out.println("Ingrese correo");
                        correo = sc.nextLine();
                        System.out.println("Ingrese contraseña");
                        password = sc.nextLine();
                        int flag = 1;

                        for (Object user : lista) {
                            if (((Persona) user).getCorreo().equals(correo) || ((Empresa) user).getCorreo().equals(correo)) {
                                if (((Freelance) user).getContraseña().equals(password) || ((Administrador) user).getContraseña().equals(password) || ((Empresa) user).getContraseña().equals(password)) {
                                    if (user instanceof Administrador) {
                                        
                                        System.out.println("Menu Administrador \n 1. Ver Ingresos \n 2. Modificar datos \n 3. Cerrar Sesion");
                                        dentCas = sc.nextInt();
                                        while (flag == 1) {
                                            switch (dentCas) {
                                                case 1:
                                                    break;

                                                case 2:
                                                    System.out.println("Ingrese Numero Identidad");
                                                    noID = sc.nextLine();
                                                    ((Administrador)user).setId(noID);
                                                    System.out.println("Ingrese Correo Electrónico");
                                                    correo = sc.nextLine();
                                                    ((Administrador)user).setCorreo(correo);
                                                    System.out.println("Ingrese Nombre");
                                                    usuario = sc.nextLine();
                                                    ((Administrador)user).setUsuario(usuario);
                                                    System.out.println("Ingrese Contraseña");
                                                    password = sc.nextLine();
                                                    ((Administrador)user).setContraseña(password);
                                                    break;
                                            }
                                        }

                                    }
                                }
                            }
                        }
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
