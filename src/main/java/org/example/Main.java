package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //entradas
        Scanner LeerDato = new Scanner(System.in);
        String nombreCliente;
        String paisCliente;
        int anoNacimientoCliente;
        int mesNacimientoCliente;
        int diaNacimientoCliente;

        //pedimos los datos al usuario

        System.out.printf("Ingrese su nombre ");
        nombreCliente=LeerDato.nextLine();

        System.out.printf("Pais de origen");
        paisCliente=LeerDato.nextLine();

        System.out.println("Año de nacimiento");
        anoNacimientoCliente=LeerDato.nextInt();

        System.out.println("Ingrese mes de nacimiento");
        mesNacimientoCliente=LeerDato.nextInt();

        System.out.println("Digita dia de nacimiento");
        diaNacimientoCliente=LeerDato.nextInt();

        //PROCESANDO LAS ENTRADAS

        // 1. como calcular la edad del cliente?
        //restar el año actuacl menos el año de nacimeiento

        int edadDelCliente=2024-anoNacimientoCliente;

        System.out.println("su edad es:"+edadDelCliente);

        //2 decidir con base en la edad si el cliente es mayor de edad
        if (edadDelCliente>=18){
            System.out.println("Usted es mayor de edad");
            // menu de licores
            // botella de guaro
            // botella de don julio
            //botella blue label
            //botella de jagger

            System.out.println("MENU LICORES");
            System.out.println("Botella de guaro $150");
            System.out.println("botella de don julio $600");
            System.out.println("botella de blue label $1500");
            System.out.println("botella de jagger $200");
        }else {
            System.out.println("Usted es un niño vayase a mimir");
        }





    }

}





