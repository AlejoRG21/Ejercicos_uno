public class Main3 {public static void main(String[] args) {
    System.out.println("Texto invertido: " + invertirCadena("Hola Mundo"));
}

    public static String invertirCadena(String texto) {
        char[] caracteres = texto.toCharArray();
        String resultado = "";
        for (int i = caracteres.length - 1; i >= 0; i--) {
            resultado += caracteres[i];
        }
        return resultado;
    }
}
