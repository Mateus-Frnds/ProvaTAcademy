package UltimosCaracteres;

public class UltimosCaracteres {

    public static boolean UltimoCaractere(String palavra1, String palavra2) {
        if (palavra1.length() < 2 || palavra2.length() < 2) {
            return false;
        }

        String fimPalavra = palavra1.substring(palavra1.length() - 2);

        return palavra2.equals(fimPalavra);

    }
}