package Hoteleria;

public class Reserva {
    private Habitacion habitacion;
    private String cliente;
    private String inicio;
    private String fin;

    // Constructor
    public Reserva(Habitacion habitacion, String cliente, String inicio, String fin) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.inicio = inicio;
        this.fin = fin;
        this.habitacion.ocupado();
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public String getCliente() {
        return cliente;
    }

    public String getInicio() {
        return inicio;
    }

    public String getFin() {
        return fin;
    }


    @Override
    public String toString() {
        return "Reserva{" +
                "habitacion=" + habitacion +
                ", cliente='" + cliente + '\'' +
                ", inicio='" + inicio + '\'' +
                ", fin='" + fin + '\'' +
                '}';
    }



}