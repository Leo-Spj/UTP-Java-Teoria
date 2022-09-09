package Semana4;

import java.util.Scanner;

public class sesion_DO_While_Switch_if_substring{

    public static void main(String[] args) {

        String nombre, apellido, contra, contraC = null, Usu, UsuC = null, cadena, No, Ap;
        int Dni, i = 0, a = 0, D, opcion, ale = 0;

        Scanner zam = new Scanner(System.in);

        do {
            System.out.println("1)Ingresar al sistema\n2)Registrar nuevo usuario\n3)Salir");
            opcion = zam.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese usuario");
                    Usu = zam.next();

                    System.out.println("Ingrese su contraseña");
                    contra = zam.next();

                    if (contra.equals(contraC) && Usu.equals(UsuC)) {
                        System.out.println("Bienvenido " + UsuC);
                        opcion = 3;
                        break;
                    } else {
                        do {
                            System.out.println("Datos Incorrectos");
                            System.out.println("Ingrese usuario");
                            Usu = zam.next();
                            System.out.println("Ingrese su contraseña");
                            contra = zam.next();
                            a = a + 1;
                            if (a == 2) {
                                System.out.println("Exceso de intentos fallidos");
                                System.out.println("SISTEMA BLOQUEADO");
                                opcion = 3;
                                break;
                            }
                        }while (!contra.equals(contraC) || !Usu.equals(UsuC));
                    }
                    break;
                case 2:
                    System.out.println("Nombre:");
                    nombre = zam.next();

                    System.out.println("Apellido:");
                    apellido = zam.next();

                    System.out.println("DNI:");
                    Dni = zam.nextInt();

                    System.out.println("Ingresar usuario nuevo:");
                    UsuC = zam.next();

                    No = nombre.substring(0, 2);
                    Ap = apellido.substring(0, 2);
                    ale = (int) (Math.random() * 876543);
                    D = Dni - ale;
                    contraC = D + Ap + No;

                    System.out.println("Su nueva contraseña es: " + contraC);
                    System.out.println("Usuario nuevo registrado");
                    break;
                case 3:
                    System.out.println("Hasta otra oportunidad");
                    break;
                default:
                    i = i + 1;
                    System.out.println("Opción Inválida");
                    if (i == 3) {
                        opcion = 3;
                        System.out.println("Exceso de intentos fallidos");
                        System.out.println("SISTEMA BLOQUEADO");
                    }
                    break;
            }
        } while (opcion != 3);
    }
}
