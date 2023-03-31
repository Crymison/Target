import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a palavra a ser invertida: ");
        String palavra = scanner.nextLine();
        String palavraInvertida = "";
        int tamanho = palavra.length();
        for(int i = tamanho - 1;i >= 0; i--){
            palavraInvertida += palavra.charAt(i);
        }
        System.out.println(palavraInvertida);
    }
}
