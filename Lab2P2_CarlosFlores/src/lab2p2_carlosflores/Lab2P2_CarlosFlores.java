package lab2p2_carlosflores;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_CarlosFlores {

    static Scanner sc = new Scanner(System.in);
    static int contMatChef = 0;
    static int contVesChef = 0;
    static int contMatMes = 0;
    static int contVesMes = 0;
    static int contMatBar = 0;
    static int contVesBar = 0;

    public static void main(String[] args) {
        ArrayList<Chefs> chefs = new ArrayList<>();
        ArrayList<Meseros> meseros = new ArrayList<>();
        ArrayList<Bartenders> bartenders = new ArrayList<>();
        ArrayList<Mesas> mesas = new ArrayList<>();

        boolean running = false;
        boolean validUser = true;

        while (validUser) {
            //inicio de sesion 

            System.out.println("Ingrese el usuario: ");
            String user = sc.next();
            System.out.println("Ingrese la contraseña: ");
            String password = sc.next();

            if (user.equals("gerente") && password.equals("g3r$nt0")) {
                running = true;
                validUser = false;
            } else {
                System.out.println("El usuario o la contraseña no es correcta!\n");

            }

        }

        while (running) {
            // g3r$nt0
            System.out.println("Bienvenido!\n\n1. Chefs\n2. Meseros\n3. Bartenders\n4. Mesas\n5. Salir");
            int op = sc.nextInt();

            switch (op) {
                case 1 -> {

                    boolean newRunning = true;
                    while (newRunning) {
                        System.out.println("Que operacion desea realizar?\n\n1. Crear\n2. Modifcar\n3. Eliminar\n4. Listar\n5. Regresar");
                        int newOp = sc.nextInt();

                        switch (newOp) {
                            case 1 -> {

                                if (chefs.size() < 14) {
                                    System.out.println("Ingrese nombre: ");
                                    String name = sc.next();

                                    System.out.println("Ingrese turno: ");
                                    String turno = sc.next();

                                    if (turno.equalsIgnoreCase("matutino") && checkMatutinoChef(chefs) == 7) {
                                        System.out.println("No puedes agregar mas matutinos!");

                                        continue;
                                    }
                                    if (turno.equalsIgnoreCase("vespertino") && checkVespertinoChef(chefs) == 7) {
                                        System.out.println("No puedes agregar mas vespertinos!");

                                        continue;
                                    }

                                    System.out.println("Ingrese edad: ");
                                    int edad = sc.nextInt();

                                    System.out.println("Ingrese numero de estrellas: ");
                                    int numEstrellas = sc.nextInt();

                                    System.out.println("Ingrese sueldo: ");
                                    int sueldo = sc.nextInt();

                                    chefs.add(new Chefs(name, turno, edad, numEstrellas, sueldo));
                                } else {
                                    System.out.println("Se ha alcanzado la maxima capacidad de chefs!");
                                }

                            }
                            case 2 -> {
                                System.out.println("-Chefs-");
                                for (Chefs chef : chefs) {
                                    System.out.println(chef);
                                }

                                System.out.println("Que posicion de chef desea modificar?");
                                int opMod = sc.nextInt();

                                opMod--;

                                String currentTurn = chefs.get(opMod).getTurno();

                                if (opMod >= 0 && opMod < chefs.size()) {
                                    System.out.println("Ingrese nombre: ");
                                    String name = sc.next();

                                    System.out.println("Ingrese turno: ");
                                    String turno = sc.next();

                                    System.out.println("Ingrese edad: ");
                                    int edad = sc.nextInt();

                                    while (edad < 1) {
                                        System.out.println("Numero invalido!");

                                        System.out.println("Ingrese edad: ");
                                        edad = sc.nextInt();
                                    }

                                    System.out.println("Ingrese numero de estrellas: ");
                                    int numEstrellas = sc.nextInt();
                                    while (numEstrellas < 0) {
                                        System.out.println("Numero invalido!");

                                        System.out.println("Ingrese numero de estrellas: ");
                                        numEstrellas = sc.nextInt();
                                    }

                                    System.out.println("Ingrese sueldo: ");
                                    int sueldo = sc.nextInt();

                                    while (sueldo < 0) {
                                        System.out.println("Numero invalido!");

                                        System.out.println("Ingrese sueldo: ");
                                        sueldo = sc.nextInt();
                                    }

                                    chefs.set(opMod, new Chefs(name, turno, edad, numEstrellas, sueldo));
                                } else {
                                    System.out.println("Esa opcion no existe!");
                                    continue;
                                }

                            }
                            case 3 -> {
                                System.out.println("-Chefs-");
                                for (Chefs chef : chefs) {
                                    System.out.println(chef);
                                }

                                System.out.println("Que posicion de chef desea eliminar?");
                                int opMod = sc.nextInt();

                                opMod--;

                                if (opMod >= 0 && opMod < chefs.size()) {
                                    chefs.remove(opMod);
                                    System.out.println("Eliminado exitosamente!");
                                } else {
                                    System.out.println("Esa opcion no existe!");
                                    continue;
                                }

                            }
                            case 4 -> {
                                System.out.println("-Chefs-");
                                for (Chefs chef : chefs) {
                                    System.out.println(chef);
                                }
                            }
                            case 5 -> {
                                newRunning = false;
                            }
                            default ->
                                System.out.println("aaaaaaaaaaa");
                        }
                    }

                }
                case 2 -> {
                    boolean newRunning = true;
                    while (newRunning) {
                        System.out.println("Que operacion desea realizar?\n\n1. Crear\n2. Modifcar\n3. Eliminar\n4. Listar\n5. Regresar");
                        int newOp = sc.nextInt();

                        switch (newOp) {
                            case 1 -> {
                                if (meseros.size() < 8) {
                                    System.out.println("Ingrese nombre: ");
                                    String name = sc.next();

                                    System.out.println("Ingrese turno: ");
                                    String turno = sc.next();

                                    if (turno.equalsIgnoreCase("matutino") && checkMatutinoMes(meseros) == 4) {
                                        System.out.println("No puedes agregar mas matutinos!");

                                        continue;
                                    }
                                    if (turno.equalsIgnoreCase("vespertino") && checkVespertinoMes(meseros) == 4) {
                                        System.out.println("No puedes agregar mas vespertinos!");

                                        continue;
                                    }

                                    System.out.println("Ingrese edad: ");
                                    int edad = sc.nextInt();

                                    System.out.println("Ingrese sueldo: ");
                                    int sueldo = sc.nextInt();

                                    System.out.println("Ingrese propina: ");
                                    int propina = sc.nextInt();

                                    meseros.add(new Meseros(name, turno, edad, sueldo, propina));
                                } else {
                                    System.out.println("Se ha alcanzado la maxima capacidad de meseros!");
                                }

                            }
                            case 2 -> {

                                System.out.println("-Meseros-");
                                for (Meseros mesero : meseros) {
                                    System.out.println(mesero);
                                }

                                System.out.println("Que posicion de mesero desea modificar?");
                                int opMod = sc.nextInt();

                                opMod--;

                                if (opMod >= 0 && opMod < meseros.size()) {
                                    System.out.println("Ingrese nombre: ");
                                    String name = sc.next();

                                    System.out.println("Ingrese turno: ");
                                    String turno = sc.next();

                                    System.out.println("Ingrese edad: ");
                                    int edad = sc.nextInt();

                                    while (edad < 1) {
                                        System.out.println("Numero invalido!");

                                        System.out.println("Ingrese edad: ");
                                        edad = sc.nextInt();
                                    }

                                    System.out.println("Ingrese sueldo: ");
                                    int sueldo = sc.nextInt();

                                    while (sueldo < 0) {
                                        System.out.println("Numero invalido!");

                                        System.out.println("Ingrese sueldo: ");
                                        sueldo = sc.nextInt();
                                    }
                                    System.out.println("Ingrese propina: ");
                                    int propina = sc.nextInt();

                                    while (propina < 0) {
                                        System.out.println("Numero invalido!");

                                        System.out.println("Ingrese propina: ");
                                        propina = sc.nextInt();
                                    }

                                    meseros.set(opMod, new Meseros(name, turno, edad, sueldo, propina));
                                } else {
                                    System.out.println("Esa opcion no existe!");
                                    continue;
                                }

                            }
                            case 3 -> {
                                System.out.println("-Meseros-");
                                for (Chefs chef : chefs) {
                                    System.out.println(chef);
                                }

                                System.out.println("Que posicion de mesero desea eliminar?");
                                int opMod = sc.nextInt();

                                opMod--;

                                if (opMod >= 0 && opMod < meseros.size()) {
                                    meseros.remove(opMod);
                                    System.out.println("Eliminado exitosamente!");
                                } else {
                                    System.out.println("Esa opcion no existe!");
                                    continue;
                                }

                            }
                            case 4 -> {
                                System.out.println("-Meseros-");
                                for (Meseros mesero : meseros) {
                                    System.out.println(mesero);
                                }

                            }
                            case 5 -> {
                                newRunning = false;
                            }
                            default ->
                                System.out.println("aaaaaaaaaaa");
                        }
                    }
                }
                case 3 -> {
                    boolean newRunning = true;
                    while (newRunning) {
                        System.out.println("Que operacion desea realizar?\n\n1. Crear\n2. Modifcar\n3. Eliminar\n4. Listar\n5. Regresar");
                        int newOp = sc.nextInt();

                        switch (newOp) {
                            case 1 -> {
                                if (bartenders.size() < 4) {
                                    System.out.println("Ingrese nombre: ");
                                    String name = sc.next();

                                    System.out.println("Ingrese turno: ");
                                    String turno = sc.next();

                                    if (turno.equalsIgnoreCase("matutino") && contMatBar != 2) {
                                        contMatBar++;
                                        System.out.println(contMatBar);

                                    } else {
                                        System.out.println("No puedes agregar mas matutinos!");
                                        continue;
                                    }
                                    
                                    
                                    if (turno.equalsIgnoreCase("vespertino") && contVesBar == 2) {
                                        contVesBar++;

                                    } else {
                                        System.out.println("No puedes agregar mas vespertinos!");
                                        continue;
                                    }

                                    System.out.println("Ingrese edad: ");
                                    int edad = sc.nextInt();

                                    System.out.println("Ingrese sueldo: ");
                                    int sueldo = sc.nextInt();

                                    System.out.println("Ingrese numero de licores: ");
                                    int numLicores = sc.nextInt();

                                    bartenders.add(new Bartenders(name, turno, edad, sueldo, numLicores));
                                } else {
                                    System.out.println("Se ha alcanzado la maxima capacidad de bartenders!");
                                }
                            }
                            case 2 -> {

                                System.out.println("-Bartenders-");
                                for (Bartenders bartender : bartenders) {
                                    System.out.println(bartender);
                                }

                                System.out.println("Que posicion de bartender desea modificar?");
                                int opMod = sc.nextInt();

                                String currentTurn = bartenders.get(opMod).getTurno();

                                opMod--;

                                if (opMod >= 0 && opMod < bartenders.size()) {
                                    System.out.println("Ingrese nombre: ");
                                    String name = sc.next();

                                    System.out.println("Ingrese turno: ");
                                    String turno = sc.next();

                                    if (currentTurn.equals("matutino") && turno.equals("matutino")) {
                                        contMatBar--;
                                    }
                                    if (currentTurn.equals("vespertino") && turno.equals("vespertino")) {
                                        contVesBar--;
                                    }
                                    if (currentTurn.equals("vespertino") && turno.equals("matutino") && contMatBar != 2) {
                                        contVesBar--;
                                        contMatBar++;
                                    }
                                    if (currentTurn.equals("matutino") && turno.equals("vespertino") && contVesBar != 2) {
                                        contVesBar++;
                                        contMatBar--;
                                    }

                                    System.out.println("Ingrese edad: ");
                                    int edad = sc.nextInt();

                                    while (edad < 1) {
                                        System.out.println("Numero invalido!");

                                        System.out.println("Ingrese edad: ");
                                        edad = sc.nextInt();
                                    }

                                    System.out.println("Ingrese sueldo: ");
                                    int sueldo = sc.nextInt();

                                    while (sueldo < 0) {
                                        System.out.println("Numero invalido!");

                                        System.out.println("Ingrese sueldo: ");
                                        sueldo = sc.nextInt();
                                    }
                                    System.out.println("Ingrese numero de licores: ");
                                    int numLicores = sc.nextInt();

                                    while (numLicores < 0) {
                                        System.out.println("Numero invalido!");

                                        System.out.println("Ingrese numero de licores: ");
                                        numLicores = sc.nextInt();
                                    }

                                    bartenders.set(opMod, new Bartenders(name, turno, edad, sueldo, numLicores));
                                    contMatBar++;
                                } else {
                                    System.out.println("Esa opcion no existe!");
                                    continue;
                                }

                            }
                            case 3 -> {

                                System.out.println("-Bartenders-");
                                for (Bartenders bartender : bartenders) {
                                    System.out.println(bartender);
                                }

                                System.out.println("Que posicion de bartender desea eliminar?");
                                int opMod = sc.nextInt();

                                opMod--;

                                if (opMod >= 0 && opMod < bartenders.size()) {
                                    bartenders.remove(opMod);
                                    System.out.println("Eliminado exitosamente!");
                                } else {
                                    System.out.println("Esa opcion no existe!");
                                    continue;
                                }

                            }
                            case 4 -> {
                                System.out.println("-Bartenders-");
                                for (Bartenders bartender : bartenders) {
                                    System.out.println(bartender);
                                }

                            }
                            case 5 -> {
                                newRunning = false;
                            }
                            default ->
                                System.out.println("aaaaaaaaaaa");
                        }
                    }
                }
                case 4 -> {
                    boolean newRunning = true;
                    while (newRunning) {
                        System.out.println("Que operacion desea realizar?\n\n1. Crear\n2. Modifcar\n3. Eliminar\n4. Listar\n5. Regresar");
                        int newOp = sc.nextInt();

                        switch (newOp) {
                            case 1 -> {
                                if (mesas.size() < 10) {

                                    System.out.println("Ingrese numero de platos: ");
                                    int numPlatos = sc.nextInt();

                                    System.out.println("Ingrese numero de utensilios: ");
                                    int numUtensilios = sc.nextInt();

                                    System.out.println("Ingrese el precio total: ");
                                    int precioTotal = sc.nextInt();

                                    mesas.add(new Mesas(numPlatos, numUtensilios, precioTotal));
                                } else {
                                    System.out.println("Se ha alcanzado la maxima capacidad de mesas!");
                                }

                            }
                            case 2 -> {
                                System.out.println("-Mesas-");
                                for (Mesas mesa : mesas) {
                                    System.out.println(mesa);
                                }

                                System.out.println("Que posicion de mesa desea modificar?");
                                int opMod = sc.nextInt();

                                opMod--;

                                if (opMod >= 0 && opMod < mesas.size()) {

                                    System.out.println("Ingrese numero de platos: ");
                                    int numPlatos = sc.nextInt();

                                    while (numPlatos < 1) {
                                        System.out.println("Numero invalido!");

                                        System.out.println("Ingrese numero de platos: ");
                                        numPlatos = sc.nextInt();
                                    }

                                    System.out.println("Ingrese numero de utensilios: ");
                                    int numUtensilios = sc.nextInt();

                                    while (numUtensilios < 0) {
                                        System.out.println("Numero invalido!");

                                        System.out.println("Ingrese numero de utensilios: ");
                                        numUtensilios = sc.nextInt();
                                    }
                                    System.out.println("Ingrese precio total: ");
                                    int precioTotal = sc.nextInt();

                                    while (precioTotal < 0) {
                                        System.out.println("Numero invalido!");

                                        System.out.println("Ingrese precio total: ");
                                        precioTotal = sc.nextInt();
                                    }

                                    mesas.set(opMod, new Mesas(numPlatos, numUtensilios, precioTotal));
                                } else {
                                    System.out.println("Esa opcion no existe!");
                                    continue;
                                }

                            }
                            case 3 -> {

                                System.out.println("-Mesas-");
                                for (Mesas mesa : mesas) {
                                    System.out.println(mesa);
                                }

                                System.out.println("Que posicion de mesa desea modificar?");
                                int opMod = sc.nextInt();

                                opMod--;

                                if (opMod >= 0 && opMod < mesas.size()) {
                                    mesas.remove(opMod);
                                    System.out.println("Eliminado exitosamente!");
                                } else {
                                    System.out.println("Esa opcion no existe!");
                                    continue;
                                }

                            }
                            case 4 -> {
                                System.out.println("-Mesas-");
                                for (Mesas mesa : mesas) {
                                    System.out.println(mesa);
                                }

                                System.out.println("El precio total de todas las mesas existentes es: " + sumaPrecioTotal(mesas));

                            }
                            case 5 -> {
                                newRunning = false;
                            }
                            default ->
                                System.out.println("aaaaaaaaaaa");
                        }
                    }
                }

                case 5 ->
                    running = false;

                default -> {
                }
            }

        }
    }

    static int sumaPrecioTotal(ArrayList<Mesas> m) {
        int totalPrice = 0;
        for (Mesas mesa : m) {
            totalPrice += mesa.getPrecioTotal();
        }

        return totalPrice;
    }

    static int checkMatutinoChef(ArrayList<Chefs> c) {
        int cant = 0;
        for (Chefs chef : c) {
            if (chef.getTurno().equalsIgnoreCase("matutino")) {
                cant++;
            }
        }
        return cant;
    }

    static int checkVespertinoChef(ArrayList<Chefs> c) {
        int cant = 0;
        for (Chefs chef : c) {
            if (chef.getTurno().equalsIgnoreCase("vespertino")) {
                cant++;
            }
        }
        return cant;
    }

    static int checkMatutinoMes(ArrayList<Meseros> m) {
        int cant = 0;
        for (Meseros mesero : m) {
            if (mesero.getTurno().equalsIgnoreCase("matutino")) {
                cant++;
            }
        }
        return cant;
    }

    static int checkVespertinoMes(ArrayList<Meseros> m) {
        int cant = 0;
        for (Meseros mesero : m) {
            if (mesero.getTurno().equalsIgnoreCase("vespertino")) {
                cant++;
            }
        }
        return cant;
    }

    static void checkMatutinoBar(ArrayList<Bartenders> b) {
        for (Bartenders bartender : b) {
            if (bartender.getTurno().equalsIgnoreCase("matutino")) {
                contMatBar++;
            }
        }

    }

    static int checkVespertinoBar(ArrayList<Bartenders> b) {
        int cant = 0;
        for (Bartenders bartender : b) {
            if (bartender.getTurno().equalsIgnoreCase("vespertino")) {
                cant++;
            }
        }
        return cant;
    }

}
