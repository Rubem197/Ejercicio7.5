package principal;

public class Main {

    public static void main(String[] args) {
        Frecuencia f1=new Frecuencia();
        Frecuencia f2=new Frecuencia();
        f1.subirfrecuencia(12348);
        System.out.println(f1.getSintonizador());
        f2.bajarFrecuencia(25);
        System.out.println(f2.getSintonizador());
    }
}
