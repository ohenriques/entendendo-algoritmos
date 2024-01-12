package introducaoAAlgoritmos;

public class BuscaBinaria {

    public static void main(String[] args) {
        int[] minhaLista = { 3, 5, 6, 7, 8, 19, 40 };

        BuscaBinaria pb = new BuscaBinaria();

        pb.pesquisaBinari(minhaLista, 3);
    }

    public void pesquisaBinari(int[] minhaLista, int item) {
        int baixo = 0;
        int alto = minhaLista.length;
    }
}
