package Ejercicio2;

public class Pez implements Nadador, Respirador {

    @Override
    public void nadar() {
        System.out.println("El pez está nadando.");
    }

    @Override
    public void respirar() {
        System.out.println("El pez está respirando por las branquias.");
    }
}
