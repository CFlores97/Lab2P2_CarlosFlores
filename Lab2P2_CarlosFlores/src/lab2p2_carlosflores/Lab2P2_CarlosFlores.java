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

                                    if (turno.equalsIgnoreCase("matutino") && contMatChef != 7) {
                                        contMatChef++;

                                    } else if (turno.equalsIgnoreCase("matutino") && contMatChef == 7) {
                                        System.out.println("No puedes agregar mas matutinos!");
                                        continue;
                                    }

                                    if (turno.equalsIgnoreCase("vespertino") && contVesChef != 7) {
                                        contVesChef++;

                                    } else if (turno.equalsIgnoreCase("vespertino") && contVesChef == 7) {
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

                                    if (currentTurn.equals("matutino") && turno.equals("matutino")) {
                                        contMatChef--;
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
                                        contMatChef++;
                                    }
                                    if (currentTurn.equals("vespertino") && turno.equals("vespertino")) {
                                        contVesChef--;
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
                                        contVesChef++;
                                    }
                                    if (currentTurn.equals("matutino") && turno.equals("vespertino")) {
                                        contMatChef--;
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
                                        contVesChef++;
                                    }
                                    if (currentTurn.equals("vespertino") && turno.equals("matutino")) {
                                        contVesChef--;
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
                                        contMatChef++;
                                    }

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
                                
                                String currentTurn = bartenders.get(opMod).getTurno();

                                if (currentTurn.equals("matutino")) {
                                    contMatChef--;
                                } else if (currentTurn.equals("vespertino")) {
                                    contVesChef--;
                                }

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

                                    if (turno.equalsIgnoreCase("matutino") && contMatMes != 4) {
                                        contMatMes++;

                                    } else if (turno.equalsIgnoreCase("matutino") && contMatMes == 4) {
                                        System.out.println("No puedes agregar mas matutinos!");
                                        continue;
                                    }

                                    if (turno.equalsIgnoreCase("vespertino") && contVesMes != 4) {
                                        contVesMes++;

                                    } else if (turno.equalsIgnoreCase("vespertino") && contVesMes == 4) {
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

                                String currentTurn = bartenders.get(opMod).getTurno();

                                if (opMod >= 0 && opMod < meseros.size()) {
                                    System.out.println("Ingrese nombre: ");
                                    String name = sc.next();

                                    System.out.println("Ingrese turno: ");
                                    String turno = sc.next();

                                    if (currentTurn.equals("matutino") && turno.equals("matutino")) {
                                        contMatMes--;

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

                                        contMatMes++;
                                    }

                                    if (currentTurn.equals("vespertino") && turno.equals("vespertino")) {
                                        contVesMes--;
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

                                        contVesMes++;
                                    }

                                    if (currentTurn.equals("vespertino") && turno.equals("matutino")) {
                                        contVesMes--;
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

                                        contMatMes++;
                                    }
                                    if (currentTurn.equals("matutino") && turno.equals("vespertino")) {
                                        contMatMes--;
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

                                        contVesMes++;
                                    }

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
                                
                                String currentTurn = bartenders.get(opMod).getTurno();

                                if (currentTurn.equals("matutino")) {
                                    contMatMes--;
                                } else if (currentTurn.equals("vespertino")) {
                                    contVesMes--;
                                }
                                

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

                                    } else if (turno.equalsIgnoreCase("matutino") && contMatBar == 2) {
                                        System.out.println("No puedes agregar mas matutinos!");
                                        continue;
                                    }

                                    if (turno.equalsIgnoreCase("vespertino") && contVesBar != 2) {
                                        contVesBar++;

                                    } else if (turno.equalsIgnoreCase("vespertino") && contVesBar == 2) {
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

                                opMod--;

                                String currentTurn = bartenders.get(opMod).getTurno();

                                if (opMod >= 0 && opMod < bartenders.size()) {
                                    System.out.println("Ingrese nombre: ");
                                    String name = sc.next();

                                    System.out.println("Ingrese turno: ");
                                    String turno = sc.next();

                                    if (currentTurn.equals("matutino") && turno.equals("matutino")) {
                                        contMatBar--;

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
                                    }
                                    if (currentTurn.equals("vespertino") && turno.equals("vespertino")) {
                                        contVesBar--;
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
                                        contVesBar++;
                                    }
                                    if (currentTurn.equals("vespertino") && turno.equals("matutino") && contMatBar != 2) {
                                        contVesBar--;
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
                                    }
                                    if (currentTurn.equals("matutino") && turno.equals("vespertino") && contVesBar != 2) {
                                        contVesBar++;
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
                                        contMatBar--;
                                    }

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

                                String currentTurn = bartenders.get(opMod).getTurno();

                                if (currentTurn.equals("matutino")) {
                                    contMatBar--;
                                } else if (currentTurn.equals("vespertino")) {
                                    contVesBar--;
                                }

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

}
