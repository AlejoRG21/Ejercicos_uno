public class Main2{
    public static void main(String[] args) {
        System.out.println("Tiempo en milisegundos: " + calcularMilisegundos(1, 1, 1, 1));
    }

    public static long calcularMilisegundos(int dias, int horas, int minutos, int segundos) {
        long totalMilisegundos = 0;
        totalMilisegundos += dias * 86_400_000L;
        totalMilisegundos += horas * 3_600_000L;
        totalMilisegundos += minutos * 60_000L;
        totalMilisegundos += segundos * 1_000L;
        return totalMilisegundos;
    }
}
