public class Main{
    public static void main(String[] args) {
        System.out.println("Área del cuadrado: " + calcularArea("cuadrado", 3, 0));
        System.out.println("Área del triángulo: " + calcularArea("triangulo", 4, 4));
        System.out.println("Área del rectángulo: " + calcularArea("rectangulo", 2, 2));
    }

    public static int calcularArea(String tipo, int medida1, int medida2) {
        if (tipo.equalsIgnoreCase("cuadrado")) {
            return medida1 * medida1;
        } else if (tipo.equalsIgnoreCase("triangulo")) {
            return (medida1 * medida2) / 2;
        } else if (tipo.equalsIgnoreCase("rectangulo")) {
            return medida1 * medida2;
        } else {
            System.out.println("Figura no reconocida");
            return -1;
        }
    }
}
