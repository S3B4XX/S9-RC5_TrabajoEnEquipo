package Hoteleria;

public class Habitacion {
    private int numeroHabitacion;
    private boolean disponible;
    private String tipo;
    private int capacidad;

    public Habitacion(int numeroHabitacion, boolean disponible, String tipo, int capacidad) {
        this.numeroHabitacion = numeroHabitacion;
        this.disponible = true;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public boolean isDisponible() {
        return disponible;
    }


    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void ocupado(){
        this.disponible = false;
    }

    public void libre(){
        this.disponible = true;
    }

    //En necesario el metodo toString???

    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", disponible=" + disponible +
                ", tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}