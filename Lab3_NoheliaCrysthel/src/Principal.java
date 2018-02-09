
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
        int res = 1;
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
                                        System.out.println("Ingrese la red social mas usada");
                                        redSocial = sc.nextLine();
                                        lista.add(new Marketing(redSocial, usuario, password, edad, genero, dinero, ciudad, telefono, noID, correo));
                                        break;
                                    case 6:
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
                                        System.out.println("Estado de la Inscripcion");
                                        EstadoInscripcion = sc.nextBoolean();
                                        System.out.println("Ingrese hobbies");
                                        hobbies = sc.nextLine();
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
                                usuario = sc.nextLine();
                                System.out.println("Ingrese telefono");
                                telefono = sc.nextLine();
                                System.out.println("Ingrese Correo Electronico");
                                correo = sc.nextLine();
                                System.out.println("Ingrese Contraseña");
                                password = sc.nextLine();
                                System.out.println("Ingrese Descripcion");
                                descripcion = sc.nextLine();
                                System.out.println("Ingrese departamento");
                                depto = sc.nextLine();
                                System.out.println("Ingrese Municipio");
                                municipio = sc.nextLine();
                                System.out.println("Ingrese Ciudad");
                                ciudad = sc.nextLine();
                                System.out.println("Ingrese Mision");
                                mision = sc.nextLine();
                                System.out.println("Ingrese Vision");
                                vision = sc.nextLine();
                                lista.add(new Nacional(depto, municipio, ciudad, mision, vision, usuario, telefono, correo, password, descripcion));
                                break;
                            case 2:
                                System.out.println("Ingrese Nombre");
                                usuario = sc.nextLine();
                                System.out.println("Ingrese telefono");
                                telefono = sc.nextLine();
                                System.out.println("Ingrese Correo Electronico");
                                correo = sc.nextLine();
                                System.out.println("Ingrese Contraseña");
                                password = sc.nextLine();
                                System.out.println("Ingrese Descripcion");
                                descripcion = sc.nextLine();
                                System.out.println("Ingrese Pais");
                                pais = sc.nextLine();
                                System.out.println("Ingrese Ciudad");
                                ciudad = sc.nextLine();
                                System.out.println("Ingrese Pagina web (URL)");
                                pagweb = sc.nextLine();
                                System.out.println("Ingrese Mision");
                                mision = sc.nextLine();
                                System.out.println("Ingrese Vision");
                                vision = sc.nextLine();
                                lista.add(new Extranjera(pais, ciudad, pagweb, usuario, telefono, correo, password, descripcion));
                                break;
                            case 4:

                                break;
                            default:
                                System.out.println("Opcion Invalida");
                        }
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

                                        System.out.println("Menu Administrador \n 1. Ver Ingresos \n 2. Modificar datos \n 3. Eliminar Administrador \n 4. Cerrar Sesion");
                                        dentCas = sc.nextInt();
                                        while (flag == 1) {
                                            switch (dentCas) {
                                                case 1:
                                                    //System.out.println(ConnectiveLine.getProyectospubli().);
                                                    break;

                                                case 2:
                                                    System.out.println("Ingrese Numero Identidad");
                                                    noID = sc.nextLine();
                                                    ((Administrador) user).setId(noID);
                                                    System.out.println("Ingrese Correo Electrónico");
                                                    correo = sc.nextLine();
                                                    ((Administrador) user).setCorreo(correo);
                                                    System.out.println("Ingrese Nombre");
                                                    usuario = sc.nextLine();
                                                    ((Administrador) user).setUsuario(usuario);
                                                    System.out.println("Ingrese Contraseña");
                                                    password = sc.nextLine();
                                                    ((Administrador) user).setContraseña(password);
                                                    break;
                                                case 3:
                                                    System.out.println("Ingrese correo");
                                                    correo = sc.nextLine();
                                                    System.out.println("Ingrese contraseña");
                                                    password = sc.nextLine();
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
                                                        noID = sc.nextLine();
                                                        ((DesarrolloWeb) user).setId(noID);

                                                        System.out.println("Ingrese Correo Electrónico");
                                                        correo = sc.nextLine();
                                                        ((DesarrolloWeb) user).setCorreo(correo);

                                                        System.out.println("Ingrese Nombre");
                                                        usuario = sc.nextLine();
                                                        ((DesarrolloWeb) user).setNombre(usuario);

                                                        System.out.println("Ingrese Contraseña");
                                                        password = sc.nextLine();
                                                        ((DesarrolloWeb) user).setContraseña(password);

                                                        System.out.println("Ingrese Genero (M/F)");
                                                        genero = sc.nextLine().charAt(0);
                                                        ((DesarrolloWeb) user).setGenero(genero);

                                                        System.out.println("Ingrese edad");
                                                        edad = sc.nextInt();
                                                        ((DesarrolloWeb) user).setEdad(edad);

                                                        System.out.println("Ingrese dinero");
                                                        dinero = sc.nextDouble();
                                                        ((DesarrolloWeb) user).setDinero(dinero);

                                                        System.out.println("Ingrese ciudad");
                                                        ciudad = sc.nextLine();
                                                        ((DesarrolloWeb) user).setCiudad(ciudad);

                                                        System.out.println("Ingrese telefono");
                                                        telefono = sc.nextLine();
                                                        ((DesarrolloWeb) user).setTelefono(telefono);

                                                        System.out.println("Ingrese lenguaje Programacion");
                                                        lengProg = sc.nextLine();
                                                        ((DesarrolloWeb) user).setLenguajeProgra(lengProg);

                                                        System.out.println("Ingrese Universidad");
                                                        universidad = sc.nextLine();
                                                        ((DesarrolloWeb) user).setUniversidad(universidad);

                                                        System.out.println("Ingrese idioma");
                                                        idioma = sc.nextLine();
                                                        ((DesarrolloWeb) user).setIdioma(idioma);
                                                        break;
                                                }
                                            }
                                        } else if (user instanceof DiseñadorGrafico) {
                                            System.out.println("Ingrese Numero Identidad");
                                            noID = sc.nextLine();
                                            ((DiseñadorGrafico) user).setId(noID);

                                            System.out.println("Ingrese Correo Electrónico");
                                            correo = sc.nextLine();
                                            ((DiseñadorGrafico) user).setCorreo(correo);

                                            System.out.println("Ingrese Nombre");
                                            usuario = sc.nextLine();
                                            ((DiseñadorGrafico) user).setNombre(usuario);

                                            System.out.println("Ingrese Contraseña");
                                            password = sc.nextLine();
                                            ((DiseñadorGrafico) user).setContraseña(password);

                                            System.out.println("Ingrese Genero (M/F)");
                                            genero = sc.nextLine().charAt(0);
                                            ((DiseñadorGrafico) user).setGenero(genero);

                                            System.out.println("Ingrese edad");
                                            edad = sc.nextInt();
                                            ((DiseñadorGrafico) user).setEdad(edad);

                                            System.out.println("Ingrese dinero");
                                            dinero = sc.nextDouble();
                                            ((DiseñadorGrafico) user).setDinero(dinero);

                                            System.out.println("Ingrese ciudad");
                                            ciudad = sc.nextLine();
                                            ((DiseñadorGrafico) user).setCiudad(ciudad);

                                            System.out.println("Ingrese telefono");
                                            telefono = sc.nextLine();
                                            ((DiseñadorGrafico) user).setTelefono(telefono);

                                            System.out.println("Ingrese Universidad");
                                            universidad = sc.nextLine();
                                            ((DiseñadorGrafico) user).setUniversidad(universidad);

                                            System.out.println("Ingrese hobbies");
                                            hobbies = sc.nextLine();
                                            ((DiseñadorGrafico) user).setHobbies(hobbies);

                                        } else if (user instanceof Fotografo) {
                                            System.out.println("Ingrese Numero Identidad");
                                            noID = sc.nextLine();
                                            ((Fotografo) user).setId(noID);

                                            System.out.println("Ingrese Correo Electrónico");
                                            correo = sc.nextLine();
                                            ((Fotografo) user).setCorreo(correo);

                                            System.out.println("Ingrese Nombre");
                                            usuario = sc.nextLine();
                                            ((Fotografo) user).setNombre(usuario);

                                            System.out.println("Ingrese Contraseña");
                                            password = sc.nextLine();
                                            ((Fotografo) user).setContraseña(password);

                                            System.out.println("Ingrese Genero (M/F)");
                                            genero = sc.nextLine().charAt(0);
                                            ((Fotografo) user).setGenero(genero);

                                            System.out.println("Ingrese edad");
                                            edad = sc.nextInt();
                                            ((Fotografo) user).setEdad(edad);

                                            System.out.println("Ingrese dinero");
                                            dinero = sc.nextDouble();
                                            ((Fotografo) user).setDinero(dinero);

                                            System.out.println("Ingrese ciudad");
                                            ciudad = sc.nextLine();
                                            ((Fotografo) user).setCiudad(ciudad);

                                            System.out.println("Ingrese telefono");
                                            telefono = sc.nextLine();
                                            ((Fotografo) user).setTelefono(telefono);

                                            System.out.println("Ingrese nombre de la marca");
                                            nombreMarca = sc.nextLine();
                                            ((Fotografo) user).setNombreMarca(nombreMarca);

                                            System.out.println("Ingrese el modelo de la camara");
                                            modeloCamara = sc.nextLine();
                                            ((Fotografo) user).setModeloCamara(modeloCamara);

                                        } else if (user instanceof MediosAudioVisuales) {
                                            System.out.println("Ingrese Numero Identidad");
                                            noID = sc.nextLine();
                                            ((MediosAudioVisuales) user).setId(noID);

                                            System.out.println("Ingrese Correo Electrónico");
                                            correo = sc.nextLine();
                                            ((MediosAudioVisuales) user).setCorreo(correo);

                                            System.out.println("Ingrese Nombre");
                                            usuario = sc.nextLine();
                                            ((MediosAudioVisuales) user).setNombre(usuario);

                                            System.out.println("Ingrese Contraseña");
                                            password = sc.nextLine();
                                            ((MediosAudioVisuales) user).setContraseña(password);

                                            System.out.println("Ingrese Genero (M/F)");
                                            genero = sc.nextLine().charAt(0);
                                            ((MediosAudioVisuales) user).setGenero(genero);

                                            System.out.println("Ingrese edad");
                                            edad = sc.nextInt();
                                            ((MediosAudioVisuales) user).setEdad(edad);

                                            System.out.println("Ingrese dinero");
                                            dinero = sc.nextDouble();
                                            ((MediosAudioVisuales) user).setDinero(dinero);

                                            System.out.println("Ingrese ciudad");
                                            ciudad = sc.nextLine();
                                            ((MediosAudioVisuales) user).setCiudad(ciudad);

                                            System.out.println("Ingrese telefono");
                                            telefono = sc.nextLine();
                                            ((MediosAudioVisuales) user).setTelefono(telefono);

                                            System.out.println("Ingrese nombre de la marca");
                                            nombreMarca = sc.nextLine();
                                            ((MediosAudioVisuales) user).setNombreMarca(nombreMarca);

                                            System.out.println("Ingrese el modelo de la camara");
                                            modeloCamara = sc.nextLine();
                                            ((MediosAudioVisuales) user).setModeloCamara(modeloCamara);

                                        } else if (user instanceof Contador) {

                                        } else if (user instanceof Marketing) {
                                            System.out.println("Ingrese Numero Identidad");
                                            noID = sc.nextLine();
                                            ((Marketing) user).setId(noID);

                                            System.out.println("Ingrese Correo Electrónico");
                                            correo = sc.nextLine();
                                            ((Marketing) user).setCorreo(correo);

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
                                            System.out.println("Ingrese la red social mas usada");
                                            redSocial = sc.nextLine();

                                        }
                                    } else if (user instanceof Empresa) {
                                        System.out.println("Menu Freelance \n 1. Modificar datos \n 2. Eliminar Freelance \n 3. Modifica/Eliminar/Crear Proyecto \n 4. Cerrar Sesion");
                                        dentCas = sc.nextInt();
                                        if (user instanceof Nacional) {
                                            while (flag == 1) {
                                                switch (dentCas) {
                                                    case 1:
                                                        System.out.println("Ingrese Nombre");
                                                        usuario = sc.nextLine();
                                                        ((Nacional) ((Empresa) user)).setNombre(usuario);
                                                        System.out.println("Ingrese telefono");
                                                        telefono = sc.nextLine();
                                                        ((Nacional) ((Empresa) user)).setTelefono(telefono);
                                                        System.out.println("Ingrese Correo Electronico");
                                                        correo = sc.nextLine();
                                                        ((Nacional) ((Empresa) user)).setCorreo(correo);
                                                        System.out.println("Ingrese Contraseña");
                                                        password = sc.nextLine();
                                                        ((Nacional) ((Empresa) user)).setContraseña(password);
                                                        System.out.println("Ingrese Descripcion");
                                                        descripcion = sc.nextLine();
                                                        ((Nacional) ((Empresa) user)).setDescripcion(descripcion);
                                                        System.out.println("Ingrese departamento");
                                                        depto = sc.nextLine();
                                                        ((Nacional) ((Empresa) user)).setDepto(depto);
                                                        System.out.println("Ingrese Municipio");
                                                        municipio = sc.nextLine();
                                                        ((Nacional) ((Empresa) user)).setMunicipio(municipio);
                                                        System.out.println("Ingrese Ciudad");
                                                        ciudad = sc.nextLine();
                                                        ((Nacional) ((Empresa) user)).setCiudad(ciudad);
                                                        System.out.println("Ingrese Mision");
                                                        mision = sc.nextLine();
                                                        ((Nacional) ((Empresa) user)).setMision(mision);
                                                        System.out.println("Ingrese Vision");
                                                        vision = sc.nextLine();
                                                        ((Nacional) ((Empresa) user)).setVision(vision);
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese correo");
                                                        correo = sc.nextLine();
                                                        System.out.println("Ingrese contraseña");
                                                        password = sc.nextLine();
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
                                                        usuario = sc.nextLine();
                                                        ((Extranjera) ((Empresa) user)).setNombre(usuario);
                                                        System.out.println("Ingrese telefono");
                                                        telefono = sc.nextLine();
                                                        ((Extranjera) ((Empresa) user)).setTelefono(telefono);
                                                        System.out.println("Ingrese Correo Electronico");
                                                        correo = sc.nextLine();
                                                        ((Extranjera) ((Empresa) user)).setCorreo(correo);
                                                        System.out.println("Ingrese Contraseña");
                                                        password = sc.nextLine();
                                                        ((Extranjera) ((Empresa) user)).setContraseña(password);
                                                        System.out.println("Ingrese Descripcion");
                                                        descripcion = sc.nextLine();
                                                        ((Extranjera) ((Empresa) user)).setDescripcion(descripcion);
                                                        System.out.println("Ingrese Pais");
                                                        pais = sc.nextLine();
                                                        ((Extranjera) ((Empresa) user)).setPais(pais);
                                                        System.out.println("Ingrese ciudad");
                                                        ciudad = sc.nextLine();
                                                        ((Extranjera) ((Empresa) user)).setCiudad(ciudad);
                                                        System.out.println("Ingrese pagina web");
                                                        pagweb = sc.nextLine();
                                                        ((Extranjera) ((Empresa) user)).setPagweb(pagweb);
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese correo");
                                                        correo = sc.nextLine();
                                                        System.out.println("Ingrese contraseña");
                                                        password = sc.nextLine();
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
                respuesta = sc.nextLine();
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
            return false;
        } else {
            return true;
        }
    }
}
