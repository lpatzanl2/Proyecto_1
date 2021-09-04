package Proyecto1;


/**
 * @author Estuado López
 * Clase padre que heredara otras
 */
public class Vehiculos {

    public int tamarray;
    private int tamanio, posicionActual;
    private Proyecto1.Auto arregloVehiculo[];



    public Vehiculos(){}

    /**
     * Metrodo unicamente utilizado para saber si recibimos el dato
     */
    public void tamanio (){
        System.out.println("El tamaño del ARRAY sera de " + tamarray + " posiciones");
    }

    /**
     * parametro para llamarlo en otro lado e ingresar el dato a esta variable
     * @param s
     */
    public void setTamarray(int s){

        tamarray=s;
    }

    /**
     * Parametro get
     * @return
     */
    public int getTamarray(){

        return tamarray;
    }

    /**
     * Validamos el tamaño del array
     * @param tamMandado
     */
    public Vehiculos(int tamMandado) {
        tamanio = tamMandado;
        arregloVehiculo = new Proyecto1.Auto[tamanio];
        posicionActual = 0;
    }

    /**
     * Parametro para ingresar el carro y validamos si hay espacios aun
     * @param tamMandado
     * @return
     */
    public boolean ingresarVehiculo(Proyecto1.Auto tamMandado) { //Metodo para ingresar el vehiculo

        if (posicionActual < tamanio) { // Si la posicion del arreglo es menor al tamaño nos dejara ingresar
            arregloVehiculo[posicionActual++] = tamMandado; //el vehiculo, sino, no.
            return true;
        }
        return false;
    }

    /**
     * Mostramos los datos del array
     * @return
     */
    public String mostrarVector() {//Mostraremos los datos del valor
        String auxiliar = "";
        for (int h = 0; h < posicionActual; h++) {
            auxiliar += arregloVehiculo[h].toString();
            System.out.println(arregloVehiculo[h] + "\n******************\n");
        }
        return auxiliar;
    }
}
