package Proyecto1;

/**
 * @author Estuado López
 * Calse que contendra los datos del Vehiculo.
 *
 */
public class Auto extends Proyecto1.Vehiculos {
    public String placa;

    /**
     * Parametro que recibe el valor de placa del main
     * @param placa
     */
    public Auto(String placa) {
        this.placa = placa;
    }

    /**
     * Metodo que suma la cantidad de espacios recibidos en la main para determinar el tamaño del arreglo
     * @param cant1
     * @param cant2
     * @param cant3
     * @return
     */
    public int toot (int cant1, int cant2, int cant3){
        int tottal = cant1 + cant2 + cant3;
        return tottal;
    }

    /**
     * get de la instancion
     * @return
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Set te placa
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Metodo para mandar el tamaño del array a la super clase
     * @param tOOTA
     */
    public void Sabervalordeinstanciacion1 (int tOOTA){
        setTamarray(tOOTA);
    }

    /**
     * metrodo para leer los valores de la placa
     * @return
     */
    public String toString(){ return "\n*****************\nplaca " + placa ;}

    public Auto(){
        super();
    }


}