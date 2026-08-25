package model;

public class Arma {
    private String nombre;
    private int puntosDanio;

    public Arma() {
    }

    public Arma(String nombre, int puntosDanio) {
        this.nombre = nombre;
        this.puntosDanio = puntosDanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosDanio() {
        return puntosDanio;
    }

    public void setPuntosDanio(int puntosDanio) {
        this.puntosDanio = puntosDanio;
    }

    @Override
    public String toString() {
        return "~~~~ Arma ~~~~" +
                "\nnombre: " + nombre +
                "\npuntosDanio: " + puntosDanio +
                "\nes Letal?: " + esLetal();
    }
    public boolean esLetal(){
        boolean respuesta = false;
        if (this.puntosDanio > 50){
            respuesta = true;
        }
        return respuesta;
    }
}
