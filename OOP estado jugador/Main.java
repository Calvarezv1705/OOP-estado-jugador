public class Main {
    public static void main(String[] args) {

        Jugador jg1 = new Jugador(01, "camilo", "alvarez", 10, 22, "delantero");
        Jugador jg2 = new Jugador(02, "felipe", "restrepo", 9, 20, "medio centro");
        Jugador jg3 = new Jugador(03, "carlos", "estrada", 11, 30, "central");
        jg1.imprimir();
        System.out.println("------------------------------------");
        jg2.imprimir();
        System.out.println("------------------------------------");
        jg3.imprimir();
        System.out.println("------------------------------------");

        jg1.entrenar();
        jg2.viajar();
        jg3.concentrado();

        jg1.imprimirEstado();
        System.out.println("------------------------------------");
        jg2.imprimirEstado();
        System.out.println("------------------------------------");
        jg3.imprimirEstado();
        System.out.println("------------------------------------");
    }
}