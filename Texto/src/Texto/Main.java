package Texto;

public class Main {
    /** EXECUTION OF TEXT TESTS EXAMPLE**/

    public static void main(String[] args) {
        Texto exemplo;
        exemplo = new Texto("Texto escrito numa mao num teste muito pequeno");
        exemplo.imprime();
        System.out.printf("tamanho do texto: %d\n", exemplo.getPalavras().length());
        System.out.printf("numero de palavras: %d\n", exemplo.numeroPalavras());
        System.out.printf("palavra \"teste\" na posicao: %d\n", exemplo.posicaoPalavra("teste")); //if do not find = -1
        exemplo.trocaPalavra("num", "para");
        System.out.println("primeira troca:");
        exemplo.imprime();
        exemplo.trocaPalavra("mao", "dedos");
        System.out.printf("trocando \"mao\" por \"dedos\": %s\n", exemplo.getPalavras());

    }

}
