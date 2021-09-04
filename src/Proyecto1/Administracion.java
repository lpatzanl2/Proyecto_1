package Proyecto1;
import java.util.*;

/**
 * @author Estuado López
 * Clase Principal
 */

public class Administracion {
    public static void main(String[] args) {
        Scanner pudin = new Scanner(System.in);
        int ciclo = 0, opc, opc1, ciclarraytam=0, ciclo3 = 0;
        int totalespacios = 0, espaciom=0, espacioa=0, espacioc = 0, opcTamArr;
        int tarMs, tarAs, tarCs, tOOTA=15;
        double pricem, pricea, pricec;




        while (ciclo==0){
            Proyecto1.Vehiculos mandamoselTamAlVec = new Proyecto1.Vehiculos(tOOTA);
            System.out.println("\n\n\n**********************\nParqueo Mariano Galvez\n**********************\n");
            System.out.println("1) Administracion\n2)Ingresar Vehiculo\n3)Egresar Vehiculo\n4)Mostrar parqueo\n5)Salir\n\nIngrese Opcion: ");
            opc = pudin.nextInt();

            switch (opc){
                //***************************************************************************************
                case 1: //Case 1 modulo 1
                    while (ciclo3 == 0) {
                        System.out.println("1)Definir Espacios Habilitados\n2)Definir Precio De Estacionamiento\n3)Regresar ");
                        opc1 = pudin.nextInt();
                        switch (opc1) {
                            case 1: //case 1 "a"
                                while (ciclarraytam == 0) {
                                    System.out.println("1)Automoviles\n2)Motos\n3)Camiones\n4)Regresar");
                                    opcTamArr = pudin.nextInt();
                                    switch (opcTamArr) {
                                        case 1:
                                            System.out.println("Ingrese la cantidad de espacios para automoviles: ");
                                            espacioa = pudin.nextInt();
                                            break;
                                        case 2:
                                            System.out.println("Ingrese la cantidad de espacios para motos: ");
                                            espaciom = pudin.nextInt();

                                            break;
                                        case 3:
                                            System.out.println("Ingrese la cantidad de espacios para camiones: ");
                                            espacioc = pudin.nextInt();
                                            Proyecto1.Auto r1 = new Proyecto1.Auto();
                                            tOOTA = r1.toot(espacioa,espaciom,espacioc); //Mandamos los valores

                                            break;
                                        case 4:
                                            System.out.println("\n\nEl dia de hoy contaremos con " + (espacioc+espacioa+espaciom) + " espacios!!");
                                            ciclarraytam = 1;
                                            pudin.nextLine();
                                        break;
                                    }
                                }
                            break; //End case 1 "a"
                            case 2: //modulo 1 - b
                                System.out.println("\n\n****** DEFINIR TARIFA ******");
                                System.out.print("\nA U T O: Cantidad de segundos: "); tarAs = pudin.nextInt();
                                System.out.print("\nA U T O: Ingrese el precio Q: "); pricea = pudin.nextDouble();
                                System.out.print("\nM O T O: Cantidad de segundos: "); tarAs = pudin.nextInt();
                                System.out.print("\nM O T O: Ingrese el precio Q: "); pricea = pudin.nextDouble();
                                System.out.print("\nC A M I O N: Cantidad de segundos: "); tarCs = pudin.nextInt();
                                System.out.print("\nC A M I O N: Ingrese el precio Q: "); pricec = pudin.nextDouble();
                                System.out.println("\n\n\n");
                                ciclo3 = 1;
                            break; // en case 2 - modulo 1 - b
                            case 3:
                                ciclo3 = 1; //Salimos al menu principal
                            break;
                        }
                    } //End ciclo while modulo 1
                break;
                //***************************************************************************************
                case 2: //Case 2 - modulo 2
                    IngresoAuto(mandamoselTamAlVec);
                break;
                case 3:

                break;
                case 4:
                    mostrarVECTOR(mandamoselTamAlVec);


                    break;
                case 5:
                    ciclo = 1;
                    System.out.println("Gracias por usar nuestro servicio ¡VUELVA PRONTO!");
                break;
            }
        }


    }

    /**
     * Parametro para leer placa que mandaremos a instanceado a la clase Auto
     * @param auxi
     */
    public static void IngresoAuto (Proyecto1.Vehiculos auxi){
        Scanner pudin = new Scanner(System.in);                 //valores al metodo que tenemos en la clase
        String placa;
        System.out.println("Ingrese la placa del automovil: ");
        placa = pudin.nextLine();
        auxi.ingresarVehiculo(new Proyecto1.Auto(placa));
    }

    /**
     * Parametro para leer los datos del vector
     * @param objTaller
     */
    public static void mostrarVECTOR (Proyecto1.Vehiculos objTaller){ //Metodo para imprimir

        objTaller.mostrarVector(); //Mandamos a llamar el metodo que imprime nuestro vector en la calse Taller

    }
}



