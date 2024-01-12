package introducaoAAlgoritmos;

public class BuscaBinaria {

    public static void main(String[] args) {
        int[] minhaLista = {3, 5, 6, 7, 8, 19, 40, 42};

        BuscaBinaria bb = new BuscaBinaria();

        System.out.println(bb.buscaBunaria(minhaLista, 42));
        System.out.println(bb.buscaBunaria(minhaLista, 19));
        System.out.println(bb.buscaBunaria(minhaLista, 40));

    }

    public Integer buscaBunaria(int[] lista, int item) {
        int indiceBaixo = 0;
        int indiceAlto = lista.length;
        int etapa = 0;

        while (indiceBaixo <= indiceAlto) {
            int indiceMeio = (indiceBaixo + indiceAlto) / 2;
            int chute = lista[indiceMeio];
            if (chute == item) {
                return indiceMeio;
            }
            if (chute > item) {
                indiceAlto = indiceMeio - 1;
            } else indiceBaixo = indiceMeio + 1;
        }
        return null;
    }
}
