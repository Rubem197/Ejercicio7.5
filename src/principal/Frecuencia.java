package principal;

public class Frecuencia {
    private final double FRECUENCIAMINIMA=80;
    private final double FRECUENCIAMAXIMA=108;
    private double sintonizador;
    private final double SALTO=0.5;

    public Frecuencia(){
        sintonizador=FRECUENCIAMINIMA;
    }

    public double getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(double sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void subirfrecuencia(int numeroSaltos){
        double multi=numeroSaltos*SALTO;
        if (sintonizador+multi<FRECUENCIAMAXIMA){
            sintonizador+=multi;
        }else{
            sintonizador+=multi;

        while (sintonizador>FRECUENCIAMAXIMA){
            sintonizador=sintonizador-FRECUENCIAMAXIMA;
            sintonizador=sintonizador+FRECUENCIAMINIMA;

        }
        }

    }
    public void bajarFrecuencia(int numeroSaltos) {
        double multi = -numeroSaltos * SALTO;
        if (sintonizador + multi > FRECUENCIAMINIMA) {
            sintonizador += multi;
        } else {
            sintonizador += multi;

        while(sintonizador<FRECUENCIAMINIMA){
            sintonizador=FRECUENCIAMINIMA-sintonizador;
            sintonizador=FRECUENCIAMAXIMA-sintonizador;

        }
        }
    }
}
