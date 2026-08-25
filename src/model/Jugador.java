package model;

public class Jugador {
    private  String alias;
    private int puntosVida;
    private Arma armaEquipada;

    public Jugador() {
    }

    public Jugador(String alias, int puntosVida, Arma armaEquipada) {
        this.alias = alias;
        this.puntosVida = puntosVida;
        this.armaEquipada = armaEquipada;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public Arma getArmaEquipada() {
        return armaEquipada;
    }

    public void setArmaEquipada(Arma armaEquipada) {
        this.armaEquipada = armaEquipada;
    }

    @Override
    public String toString() {
        return "~~~~ Jugador ~~~~" +
                "\nalias: " + alias +
                "\npuntosVida: " + puntosVida +
                "\nestá vivo?: " + estaVivo() +
                "\n" + armaEquipada;
    }

    public boolean estaVivo(){
        return this.puntosVida > 0;
    }
}
