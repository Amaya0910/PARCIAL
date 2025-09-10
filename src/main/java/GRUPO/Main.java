package GRUPO;

import GRUPO.LOGICA.Administrador;
import GRUPO.LOGICA.Estudiante;
import GRUPO.LOGICA.Usuario;

import java.nio.channels.ScatteringByteChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    static ArrayList<Administrador> administradores = new ArrayList<Administrador>();

    public static void main(String[] args) {
        int N=0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. REGISTRAR USUARIO" +
                    "\n2. VER ESTUDIANTES" +
                    "\n3. SALIR");

            N = sc.nextInt();

            switch (N) {
                case 1: registrarUsuario();
                    break;
                case 2: verEstudiantes();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("ERROR INVALID OPTION");

            }
        }while(N !=3);
    }


    public static void registrarUsuario() {
        int N=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("DESEA INGRESAR ESTUDIANTE O ADMINISTRADOR? \n (1 - ESTUDIANTE) \n (2 - ADMINISTRADOR)");
            N = sc.nextInt();
            switch (N) {
                case 1: registrarEstudiante();
                    break;
                case 2: registrarAdministrador();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("ERROR INVALID OPTION");
        }
    }while(N !=3);
}

public static void registrarEstudiante() {
        Scanner sc = new Scanner(System.in);
        Estudiante e = new Estudiante();
        System.out.println("INGRESE NOMBRE: ");
        e.setNombre(sc.next());
        System.out.println("INGRESE CEDULA: ");
        e.setCedula(sc.next());
        System.out.println("INGRESE CONTRASEÑA: ");
        e.setContraseña(sc.next());
        System.out.println("INGRESE EMAIL: ");
        e.setEmail(sc.next());
        System.out.println("INGRESE CURSO: ");
        e.setCurso(sc.next());
        System.out.println("INGRESE FECHA: ");
        String fechaIngreso = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        estudiantes.add(e);
}

public static void registrarAdministrador() {
        Scanner sc = new Scanner(System.in);
        Estudiante e = new Estudiante();
        System.out.println("INGRESE NOMBRE: ");
        e.setNombre(sc.next());
        System.out.println("INGRESE CEDULA: ");
        e.setCedula(sc.next());
        System.out.println("INGRESE CONTRASEÑA: ");
        e.setContraseña(sc.next());
        System.out.println("INGRESE EMAIL: ");
        e.setEmail(sc.next());

}

    public static void verEstudiantes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE SU CEDULA: ");
        String ced = sc.nextLine();
        Administrador adminEncontrado = new Administrador();
        adminEncontrado = null;
        for(Administrador A: administradores){
            if(ced.equals(A.getCedula())){
                adminEncontrado = A;
            }
        }
        if(adminEncontrado == null){
            System.out.println("EL ADMINISTRADOR NO EXISTE.");
        }else{
            System.out.println("NOMBRE\t- CEDULA\t - EMAIL\t - CURSO\t - FECHA INGRESO\n");
            for(Estudiante A: estudiantes){
                A.verEstudiante();
            }
        }



    }

}

