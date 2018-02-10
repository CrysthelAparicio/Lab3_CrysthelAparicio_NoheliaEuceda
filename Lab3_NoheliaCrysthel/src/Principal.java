
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
public class Principal {

    public static void main(String[] args) {
        ArrayList<Object> lista = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String respuesta;
        int res;
        String dentCaso;
        int dentCas;
        String noID, correo, usuario, password, nombre, ciudad, telefono;
        String pais, pagweb, municipio, mision, vision, depto, lengProg, universidad, idioma, hobbies, nombreMarca, modeloCamara, redSocial, estadoInsc, descripcion;
        char genero;
        double dinero;
        int edad;
        boolean EstadoInscripcion;

        String opcion;
        int opt;

        System.out.println("Menú");
        System.out.println("1. Registrar Administrador");
        System.out.println("2. LogIn Empresas");
        opcion = sc.nextLine();
        while (!opcion.equals("3")){
            if (verificaNum(opcion)) {
                opt = Integer.parseInt(opcion);
                switch (opt) {
                    case 1:
                        System.out.println("Agregar: \n 1. Administrador \n2. Freelance \n Empresa");
                        dentCas = sc.nextInt();
                        switch (dentCas) {
                            case 1:
                                System.out.println("Ingrese Numero Identidad");
                                noID = sc.next();
                                System.out.println("Ingrese Correo Electrónico");
                                correo = sc.next();
                                System.out.println("Ingrese Nombre");
                                usuario = sc.next();
                                System.out.println("Ingrese Contraseña");
                                password = sc.next();
                                lista.add(new Administrador(noID, correo, usuario, password));
                                break;
                            case 2:
                                System.out.println("Tipo de FreeLance \n 1. Desarrollador Web \n 2. Fotografo \n 3. Diseñador Gráfico \n 4. Medios Audiovisuales \n 5. Marketing \n 6. Contador");
                                dentCas = sc.nextInt();
                                switch (dentCas) {
                                    case 1:
                                        System.out.println("Ingrese Numero Identidad");
                                        noID = sc.next();
                                        System.out.println("Ingrese Correo Electrónico");
                                        correo = sc.next();
                                        System.out.println("Ingrese Nombre");
                                        usuario = sc.next();
                                        System.out.println("Ingrese Contraseña");
                                        password = sc.next();
                                        System.out.println("Ingrese Genero (M/F)");
                                        genero = sc.next().charAt(0);
                                        System.out.println("Ingrese edad");
                                        edad = sc.nextInt();
                                        System.out.println("Ingrese dinero");
                                        dinero = sc.nextDouble();
                                        System.out.println("Ingrese ciudad");
                                        ciudad = sc.next();
                                        System.out.println("Ingrese telefono");
                                        telefono = sc.next();
                                        System.out.println("Ingrese lenguaje Programacion");
                                        lengProg = sc.next();
                                        System.out.println("Ingrese Universidad");
                                        universidad = sc.next();
                                        System.out.println("Ingrese idioma");
                                        idioma = sc.next();
                                        lista.add(new DesarrolloWeb(lengProg, universidad, idioma, usuario, password, edad, genero, dinero, ciudad, telefono, noID, correo));

                                        break;
                                    case 2:
                                        System.out.println("Ingrese Numero Identidad");
                                        noID = sc.next();
                                        System.out.println("Ingrese Correo Electrónico");
                                        correo = sc.next();
                                        System.out.println("Ingrese Nombre");
                                        usuario = sc.next();
                                        System.out.println("Ingrese Contraseña");
                                        password = sc.next();
                                        System.out.println("Ingrese Genero (M/F)");
                                        genero = sc.next().charAt(0);
                                        System.out.println("Ingrese edad");
                                        edad = sc.nextInt();
                                        System.out.println("Ingrese dinero");
                                        dinero = sc.nextDouble();
                                        System.out.println("Ingrese ciudad");
                                        ciudad = sc.next();
                                        System.out.println("Ingrese telefono");
                                        telefono = sc.next();
                                        System.out.println("Ingrese Universidad");
                                        universidad = sc.next();
                                        System.out.println("Ingrese hobbies");
                                        hobbies = sc.next();
                                        lista.add(new DiseñadorGrafico(universidad, hobbies, usuario, password, edad, genero, dinero, ciudad, telefono, noID, correo));
                                        break;
                                    case 3:
                                        System.out.println("Ingrese Numero Identidad");
                                        noID = sc.next();
                                        System.out.println("Ingrese Correo Electrónico");
                                        correo = sc.next();
                                        System.out.println("Ingrese Nombre");
                                        usuario = sc.next();
                                        System.out.println("Ingrese Contraseña");
                                        password = sc.next();
                                        System.out.println("Ingrese Genero (M/F)");
                                        genero = sc.next().charAt(0);
                                        System.out.println("Ingrese edad");
                                        edad = sc.nextInt();
                                        System.out.println("Ingrese dinero");
                                        dinero = sc.nextDouble();
                                        System.out.println("Ingrese ciudad");
                                        ciudad = sc.next();
                                        System.out.println("Ingrese telefono");
                                        telefono = sc.next();
                                        System.out.println("Ingrese nombre de la marca");
                                        nombreMarca = sc.next();
                                        System.out.println("Ingrese el modelo de la camara");
                                        modeloCamara = sc.next();
                                        lista.add(new Fotografo(nombreMarca, modeloCamara, usuario, password, edad, genero, dinero, ciudad, telefono, noID, correo));
                                        break;
                                    case 4:
                                        System.out.println("Ingrese Numero Identidad");
                                        noID = sc.next();
                                        System.out.println("Ingrese Correo Electrónico");
                                        correo = sc.next();
                                        System.out.println("Ingrese Nombre");
                                        usuario = sc.next();
                                        System.out.println("Ingrese Contraseña");
                                        password = sc.next();
                                        System.out.println("Ingrese Genero (M/F)");
                                        genero = sc.next().charAt(0);
                                        System.out.println("Ingrese edad");
                                        edad = sc.nextInt();
                                        System.out.println("Ingrese dinero");
                                        dinero = sc.nextDouble();
                                        System.out.println("Ingrese ciudad");
                                        ciudad = sc.next();
                                        System.out.println("Ingrese telefono");
                                        telefono = sc.next();
                                        System.out.println("Ingrese nombre de la marca");
                                        nombreMarca = sc.next();
                                        System.out.println("Ingrese el modelo de la camara");
                                        modeloCamara = sc.next();
                                        lista.add(new MediosAudioVisuales(nombreMarca, modeloCamara, usuario, password, edad, genero, dinero, ciudad, telefono, noID, correo));
                                        break;
                                    case 5:
                                        System.out.println("Ingrese Numero Identidad");
                                        noID = sc.next();
                                        System.out.println("Ingrese Correo Electrónico");
                                        correo = sc.next();
                                        System.out.println("Ingrese Nombre");
                                        usuario = sc.next();
                                        System.out.println("Ingrese Contraseña");
                                        password = sc.next();
                                        System.out.println("Ingrese Genero (M/F)");
                                        genero = sc.next().charAt(0);
                                        System.out.println("Ingrese edad");
                                        edad = sc.nextInt();
                                        System.out.println("Ingrese dinero");
                                        dinero = sc.nextDouble();
                                        System.out.println("Ingrese ciudad");
                                        ciudad = sc.next();
                                        System.out.println("Ingrese telefono");
                                        telefono = sc.next();
                                        System.out.println("Ingrese la red social mas usada");
                                        redSocial = sc.next();
                                        lista.add(new Marketing(redSocial, usuario, password, edad, genero, dinero, ciudad, telefono, noID, correo));
                                        break;
                                    case 6:
                                        System.out.println("Ingrese Numero Identidad");
                                        noID = sc.next();
                                        System.out.println("Ingrese Correo Electrónico");
                                        correo = sc.next();
                                        System.out.println("Ingrese Nombre");
                                        usuario = sc.next();
                                        System.out.println("Ingrese Contraseña");
                                        password = sc.next();
                                        System.out.println("Ingrese Genero (M/F)");
                                        genero = sc.next().charAt(0);
                                        System.out.println("Ingrese edad");
                                        edad = sc.nextInt();
                                        System.out.println("Ingrese dinero");
                                        dinero = sc.nextDouble();
                                        System.out.println("Ingrese ciudad");
                                        ciudad = sc.next();
                                        System.out.println("Ingrese telefono");
                                        telefono = sc.next();
                                        System.out.println("Ingrese Universidad");
                                        universidad = sc.next();
                                        System.out.println("Estado de la Inscripcion");
                                        EstadoInscripcion = sc.nextBoolean();
                                        System.out.println("Ingrese hobbies");
                                        hobbies = sc.next();
                                        lista.add(new Contador(universidad, EstadoInscripcion, hobbies, usuario, password, edad, genero, dinero, ciudad, telefono, noID, correo));
                                }
                                break;
                        }

                        break;
                    case 3:
                        System.out.println("Tipo de Empresa \n 1. Nacional \n 2. Extranjera \n");
                        dentCas = sc.nextInt();
                        switch (dentCas) {
                            case 1:
                                System.out.println("Ingrese Nombre");
                                usuario = sc.next();
                                System.out.println("Ingrese telefono");
                                telefono = sc.next();
                                System.out.println("Ingrese Correo Electronico");
                                correo = sc.next();
                                System.out.println("Ingrese Contraseña");
                                password = sc.next();
                                System.out.println("Ingrese Descripcion");
                                descripcion = sc.next();
                                System.out.println("Ingrese departamento");
                                depto = sc.next();
                                System.out.println("Ingrese Municipio");
                                municipio = sc.next();
                                System.out.println("Ingrese Ciudad");
                                ciudad = sc.next();
                                System.out.println("Ingrese Mision");
                                mision = sc.next();
                                System.out.println("Ingrese Vision");
                                vision = sc.next();
                                lista.add(new Nacional(depto, municipio, ciudad, mision, vision, usuario, telefono, correo, password, descripcion));
                                break;
                            case 2:
                                System.out.println("Ingrese Nombre");
                                usuario = sc.next();
                                System.out.println("Ingrese telefono");
                                telefono = sc.next();
                                System.out.println("Ingrese Correo Electronico");
                                correo = sc.next();
                                System.out.println("Ingrese Contraseña");
                                password = sc.next();
                                System.out.println("Ingrese Descripcion");
                                descripcion = sc.next();
                                System.out.println("Ingrese Pais");
                                pais = sc.next();
                                System.out.println("Ingrese Ciudad");
                                ciudad = sc.next();
                                System.out.println("Ingrese Pagina web (URL)");
                                pagweb = sc.next();
                                System.out.println("Ingrese Mision");
                                mision = sc.next();
                                System.out.println("Ingrese Vision");
                                vision = sc.next();
                                lista.add(new Extranjera(pais, ciudad, pagweb, usuario, telefono, correo, password, descripcion));
                                break;
                            case 4:

                                break;
                            default:
                                System.out.println("Opcion Invalida");
                        }
                    case 2:
                        System.out.println("Ingrese correo");
                        correo = sc.next();
                        System.out.println("Ingrese contraseña");
                        password = sc.next();
                        int flag = 1;

                        for (Object user : lista) {
                            if (((Persona) user).getCorreo().equals(correo) || ((Empresa) user).getCorreo().equals(correo)) {
                                if (((Freelance) user).getContraseña().equals(password) || ((Administrador) user).getContraseña().equals(password) || ((Empresa) user).getContraseña().equals(password)) {
                                    if (user instanceof Administrador) {

                                        System.out.println("Menu Administrador \n 1. Ver Ingresos \n 2. Modificar datos \n 3. Eliminar Administrador \n 4. Cerrar Sesion");
                                        dentCas = sc.nextInt();
                                        while (flag == 1) {
                                            switch (dentCas) {
                                                case 1:
                                                    //System.out.println(ConnectiveLine.getProyectospubli().);
                                                    break;

                                                case 2:
                                                    System.out.println("Ingrese Numero Identidad");
                                                    noID = sc.next();
                                                    ((Administrador) user).setId(noID);
                                                    System.out.println("Ingrese Correo Electrónico");
                                                    correo = sc.next();
                                                    ((Administrador) user).setCorreo(correo);
                                                    System.out.println("Ingrese Nombre");
                                                    usuario = sc.next();
                                                    ((Administrador) user).setUsuario(usuario);
                                                    System.out.println("Ingrese Contraseña");
                                                    password = sc.next();
                                                    ((Administrador) user).setContraseña(password);
                                                    break;
                                                case 3:
                                                    System.out.println("Ingrese correo");
                                                    correo = sc.next();
                                                    System.out.println("Ingrese contraseña");
                                                    password = sc.next();
                                                    if (correo.equals(((Administrador) user).getCorreo()) && password.equals(((Administrador) user).getContraseña())) {
                                                        lista.remove(user);
                                                        flag = 2;
                                                    }
                                                    break;
                                                case 4:
                                                    flag = 2;
                                                    break;

                                            }
                                        }

                                    } else if (user instanceof Freelance) {
                                        System.out.println("Menu Freelance \n 1. Modificar datos \n 2. Eliminar Freelance \n 3. Visualizar Proyecto \n 4. Cerrar Sesion");
                                        dentCas = sc.nextInt();
                                        if (user instanceof DesarrolloWeb) {
                                            while (flag == 1) {
                                                switch (dentCas) {
                                                    case 1:
                                                        System.out.println("Ingrese Numero Identidad");
                                                        noID = sc.next();
                                                        ((DesarrolloWeb) user).setId(noID);

                                                        System.out.println("Ingrese Correo Electrónico");
                                                        correo = sc.next();
                                                        ((DesarrolloWeb) user).setCorreo(correo);

                                                        System.out.println("Ingrese Nombre");
                                                        usuario = sc.next();
                                                        ((DesarrolloWeb) user).setNombre(usuario);

                                                        System.out.println("Ingrese Contraseña");
                                                        password = sc.next();
                                                        ((DesarrolloWeb) user).setContraseña(password);

                                                        System.out.println("Ingrese Genero (M/F)");
                                                        genero = sc.next().charAt(0);
                                                        ((DesarrolloWeb) user).setGenero(genero);

                                                        System.out.println("Ingrese edad");
                                                        edad = sc.nextInt();
                                                        ((DesarrolloWeb) user).setEdad(edad);

                                                        System.out.println("Ingrese dinero");
                                                        dinero = sc.nextDouble();
                                                        ((DesarrolloWeb) user).setDinero(dinero);

                                                        System.out.println("Ingrese ciudad");
                                                        ciudad = sc.next();
                                                        ((DesarrolloWeb) user).setCiudad(ciudad);

                                                        System.out.println("Ingrese telefono");
                                                        telefono = sc.next();
                                                        ((DesarrolloWeb) user).setTelefono(telefono);

                                                        System.out.println("Ingrese lenguaje Programacion");
                                                        lengProg = sc.next();
                                                        ((DesarrolloWeb) user).setLenguajeProgra(lengProg);

                                                        System.out.println("Ingrese Universidad");
                                                        universidad = sc.next();
                                                        ((DesarrolloWeb) user).setUniversidad(universidad);

                                                        System.out.println("Ingrese idioma");
                                                        idioma = sc.next();
                                                        ((DesarrolloWeb) user).setIdioma(idioma);
                                                        break;
                                                }
                                            }
                                        } else if (user instanceof DiseñadorGrafico) {
                                            System.out.println("Ingrese Numero Identidad");
                                            noID = sc.next();
                                            ((DiseñadorGrafico) user).setId(noID);

                                            System.out.println("Ingrese Correo Electrónico");
                                            correo = sc.next();
                                            ((DiseñadorGrafico) user).setCorreo(correo);

                                            System.out.println("Ingrese Nombre");
                                            usuario = sc.next();
                                            ((DiseñadorGrafico) user).setNombre(usuario);

                                            System.out.println("Ingrese Contraseña");
                                            password = sc.next();
                                            ((DiseñadorGrafico) user).setContraseña(password);

                                            System.out.println("Ingrese Genero (M/F)");
                                            genero = sc.next().charAt(0);
                                            ((DiseñadorGrafico) user).setGenero(genero);

                                            System.out.println("Ingrese edad");
                                            edad = sc.nextInt();
                                            ((DiseñadorGrafico) user).setEdad(edad);

                                            System.out.println("Ingrese dinero");
                                            dinero = sc.nextDouble();
                                            ((DiseñadorGrafico) user).setDinero(dinero);

                                            System.out.println("Ingrese ciudad");
                                            ciudad = sc.next();
                                            ((DiseñadorGrafico) user).setCiudad(ciudad);

                                            System.out.println("Ingrese telefono");
                                            telefono = sc.next();
                                            ((DiseñadorGrafico) user).setTelefono(telefono);

                                            System.out.println("Ingrese Universidad");
                                            universidad = sc.next();
                                            ((DiseñadorGrafico) user).setUniversidad(universidad);

                                            System.out.println("Ingrese hobbies");
                                            hobbies = sc.next();
                                            ((DiseñadorGrafico) user).setHobbies(hobbies);

                                        } else if (user instanceof Fotografo) {
                                            System.out.println("Ingrese Numero Identidad");
                                            noID = sc.next();
                                            ((Fotografo) user).setId(noID);

                                            System.out.println("Ingrese Correo Electrónico");
                                            correo = sc.next();
                                            ((Fotografo) user).setCorreo(correo);

                                            System.out.println("Ingrese Nombre");
                                            usuario = sc.next();
                                            ((Fotografo) user).setNombre(usuario);

                                            System.out.println("Ingrese Contraseña");
                                            password = sc.next();
                                            ((Fotografo) user).setContraseña(password);

                                            System.out.println("Ingrese Genero (M/F)");
                                            genero = sc.next().charAt(0);
                                            ((Fotografo) user).setGenero(genero);

                                            System.out.println("Ingrese edad");
                                            edad = sc.nextInt();
                                            ((Fotografo) user).setEdad(edad);

                                            System.out.println("Ingrese dinero");
                                            dinero = sc.nextDouble();
                                            ((Fotografo) user).setDinero(dinero);

                                            System.out.println("Ingrese ciudad");
                                            ciudad = sc.next();
                                            ((Fotografo) user).setCiudad(ciudad);

                                            System.out.println("Ingrese telefono");
                                            telefono = sc.next();
                                            ((Fotografo) user).setTelefono(telefono);

                                            System.out.println("Ingrese nombre de la marca");
                                            nombreMarca = sc.next();
                                            ((Fotografo) user).setNombreMarca(nombreMarca);

                                            System.out.println("Ingrese el modelo de la camara");
                                            modeloCamara = sc.next();
                                            ((Fotografo) user).setModeloCamara(modeloCamara);

                                        } else if (user instanceof MediosAudioVisuales) {
                                            System.out.println("Ingrese Numero Identidad");
                                            noID = sc.next();
                                            ((MediosAudioVisuales) user).setId(noID);

                                            System.out.println("Ingrese Correo Electrónico");
                                            correo = sc.next();
                                            ((MediosAudioVisuales) user).setCorreo(correo);

                                            System.out.println("Ingrese Nombre");
                                            usuario = sc.next();
                                            ((MediosAudioVisuales) user).setNombre(usuario);

                                            System.out.println("Ingrese Contraseña");
                                            password = sc.next();
                                            ((MediosAudioVisuales) user).setContraseña(password);

                                            System.out.println("Ingrese Genero (M/F)");
                                            genero = sc.next().charAt(0);
                                            ((MediosAudioVisuales) user).setGenero(genero);

                                            System.out.println("Ingrese edad");
                                            edad = sc.nextInt();
                                            ((MediosAudioVisuales) user).setEdad(edad);

                                            System.out.println("Ingrese dinero");
                                            dinero = sc.nextDouble();
                                            ((MediosAudioVisuales) user).setDinero(dinero);

                                            System.out.println("Ingrese ciudad");
                                            ciudad = sc.next();
                                            ((MediosAudioVisuales) user).setCiudad(ciudad);

                                            System.out.println("Ingrese telefono");
                                            telefono = sc.next();
                                            ((MediosAudioVisuales) user).setTelefono(telefono);

                                            System.out.println("Ingrese nombre de la marca");
                                            nombreMarca = sc.next();
                                            ((MediosAudioVisuales) user).setNombreMarca(nombreMarca);

                                            System.out.println("Ingrese el modelo de la camara");
                                            modeloCamara = sc.next();
                                            ((MediosAudioVisuales) user).setModeloCamara(modeloCamara);

                                        } else if (user instanceof Contador) {
                                            System.out.println("Ingrese Numero Identidad");
                                            noID = sc.next();
                                            ((Contador) user).setId(noID);

                                            System.out.println("Ingrese Correo Electrónico");
                                            correo = sc.next();
                                            ((Contador) user).setCorreo(correo);

                                            System.out.println("Ingrese Nombre");
                                            usuario = sc.next();
                                            ((Contador) user).setNombre(usuario);

                                            System.out.println("Ingrese Contraseña");
                                            password = sc.next();
                                            ((Contador) user).setContraseña(password);

                                            System.out.println("Ingrese Genero (M/F)");
                                            genero = sc.next().charAt(0);
                                            ((Contador) user).setGenero(genero);

                                            System.out.println("Ingrese edad");
                                            edad = sc.nextInt();
                                            ((Contador) user).setEdad(edad);

                                            System.out.println("Ingrese dinero");
                                            dinero = sc.nextDouble();
                                            ((Contador) user).setDinero(dinero);

                                            System.out.println("Ingrese ciudad");
                                            ciudad = sc.next();
                                            ((Contador) user).setCiudad(ciudad);

                                            System.out.println("Ingrese telefono");
                                            telefono = sc.next();
                                            ((Contador) user).setTelefono(telefono);

                                            System.out.println("Ingrese Universidad");
                                            universidad = sc.next();
                                            ((Contador) user).setUniversidad(universidad);

                                            System.out.println("Estado de la Inscripcion");
                                            EstadoInscripcion = sc.nextBoolean();
                                            ((Contador) user).setEstadoInscripcion(EstadoInscripcion);

                                            System.out.println("Ingrese hobbies");
                                            hobbies = sc.next();
                                            ((Contador) user).setHobbies(hobbies);

                                        } else if (user instanceof Marketing) {
                                            System.out.println("Ingrese Numero Identidad");
                                            noID = sc.next();
                                            ((Marketing) user).setId(noID);

                                            System.out.println("Ingrese Correo Electrónico");
                                            correo = sc.next();
                                            ((Marketing) user).setCorreo(correo);

                                            System.out.println("Ingrese Nombre");
                                            usuario = sc.next();
                                            ((Marketing) user).setNombre(usuario);

                                            System.out.println("Ingrese Contraseña");
                                            password = sc.next();
                                            ((Marketing) user).setContraseña(password);

                                            System.out.println("Ingrese Genero (M/F)");
                                            genero = sc.next().charAt(0);
                                            ((Marketing) user).setGenero(genero);

                                            System.out.println("Ingrese edad");
                                            edad = sc.nextInt();
                                            ((Marketing) user).setEdad(edad);

                                            System.out.println("Ingrese dinero");
                                            dinero = sc.nextDouble();
                                            ((Marketing) user).setGenero(genero);

                                            System.out.println("Ingrese ciudad");
                                            ciudad = sc.next();
                                            ((Marketing) user).setCiudad(ciudad);

                                            System.out.println("Ingrese telefono");
                                            telefono = sc.next();
                                            ((Marketing) user).setTelefono(telefono);

                                            System.out.println("Ingrese la red social mas usada");
                                            redSocial = sc.next();
                                            ((Marketing) user).setRedSocial(redSocial);

                                        }
                                    } else if (user instanceof Empresa) {
                                        System.out.println("Menu Freelance \n 1. Modificar datos \n 2. Eliminar Freelance \n 3. Modifica/Eliminar/Crear Proyecto \n 4. Cerrar Sesion");
                                        dentCas = sc.nextInt();
                                        if (user instanceof Nacional) {
                                            while (flag == 1) {
                                                switch (dentCas) {
                                                    case 1:
                                                        System.out.println("Ingrese Nombre");
                                                        usuario = sc.next();
                                                        ((Nacional) ((Empresa) user)).setNombre(usuario);
                                                        System.out.println("Ingrese telefono");
                                                        telefono = sc.next();
                                                        ((Nacional) ((Empresa) user)).setTelefono(telefono);
                                                        System.out.println("Ingrese Correo Electronico");
                                                        correo = sc.next();
                                                        ((Nacional) ((Empresa) user)).setCorreo(correo);
                                                        System.out.println("Ingrese Contraseña");
                                                        password = sc.next();
                                                        ((Nacional) ((Empresa) user)).setContraseña(password);
                                                        System.out.println("Ingrese Descripcion");
                                                        descripcion = sc.next();
                                                        ((Nacional) ((Empresa) user)).setDescripcion(descripcion);
                                                        System.out.println("Ingrese departamento");
                                                        depto = sc.next();
                                                        ((Nacional) ((Empresa) user)).setDepto(depto);
                                                        System.out.println("Ingrese Municipio");
                                                        municipio = sc.next();
                                                        ((Nacional) ((Empresa) user)).setMunicipio(municipio);
                                                        System.out.println("Ingrese Ciudad");
                                                        ciudad = sc.next();
                                                        ((Nacional) ((Empresa) user)).setCiudad(ciudad);
                                                        System.out.println("Ingrese Mision");
                                                        mision = sc.next();
                                                        ((Nacional) ((Empresa) user)).setMision(mision);
                                                        System.out.println("Ingrese Vision");
                                                        vision = sc.next();
                                                        ((Nacional) ((Empresa) user)).setVision(vision);
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese correo");
                                                        correo = sc.next();
                                                        System.out.println("Ingrese contraseña");
                                                        password = sc.next();
                                                        if (correo.equals(((Nacional) ((Empresa) user)).getCorreo()) && password.equals(((Nacional) ((Empresa) user)).getContraseña())) {
                                                            lista.remove(user);
                                                            flag = 2;
                                                        }
                                                        break;
                                                    case 3:
                                                        //
                                                        break;
                                                    case 4:
                                                        flag = 2;
                                                        break;

                                                }

                                            }
                                        } else if (user instanceof Extranjera) {
                                            while (flag == 1) {
                                                switch (dentCas) {
                                                    case 1:
                                                        System.out.println("Ingrese Nombre");
                                                        usuario = sc.next();
                                                        ((Extranjera) ((Empresa) user)).setNombre(usuario);
                                                        System.out.println("Ingrese telefono");
                                                        telefono = sc.next();
                                                        ((Extranjera) ((Empresa) user)).setTelefono(telefono);
                                                        System.out.println("Ingrese Correo Electronico");
                                                        correo = sc.next();
                                                        ((Extranjera) ((Empresa) user)).setCorreo(correo);
                                                        System.out.println("Ingrese Contraseña");
                                                        password = sc.next();
                                                        ((Extranjera) ((Empresa) user)).setContraseña(password);
                                                        System.out.println("Ingrese Descripcion");
                                                        descripcion = sc.next();
                                                        ((Extranjera) ((Empresa) user)).setDescripcion(descripcion);
                                                        System.out.println("Ingrese Pais");
                                                        pais = sc.next();
                                                        ((Extranjera) ((Empresa) user)).setPais(pais);
                                                        System.out.println("Ingrese ciudad");
                                                        ciudad = sc.next();
                                                        ((Extranjera) ((Empresa) user)).setCiudad(ciudad);
                                                        System.out.println("Ingrese pagina web");
                                                        pagweb = sc.next();
                                                        ((Extranjera) ((Empresa) user)).setPagweb(pagweb);
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese correo");
                                                        correo = sc.next();
                                                        System.out.println("Ingrese contraseña");
                                                        password = sc.next();
                                                        if (correo.equals(((Extranjera) ((Empresa) user)).getCorreo()) && password.equals(((Extranjera) ((Empresa) user)).getContraseña())) {
                                                            lista.remove(user);
                                                            flag = 2;
                                                        }
                                                        break;
                                                    case 3:
                                                        //
                                                        break;
                                                    case 4:
                                                        flag = 2;
                                                        break;

                                                }

                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                }

                System.out.println("Desea Regresar al menu? (1 si/ 2 no)");
                respuesta = sc.next();
                if (verificaNum(respuesta)) {
                    res = Integer.parseInt(respuesta);
                }
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
            return true;
        } else {
            return false;
        }
    }
}
