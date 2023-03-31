//Informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

import java.util.Scanner;
import java.util.ArrayList;

public class Questao1{
    public static boolean fibo(int valorDesejado){
        int vAtu = 1;
        int vAnt = 0;
        int aux;
        ArrayList<Integer> Fibo = new ArrayList<Integer>();
        for(int i = 0; i < 30; i++){
            Fibo.add(vAnt);
            aux = vAtu;
            vAtu = vAtu + vAnt;
            vAnt = aux;
        }
        boolean result = Fibo.contains(valorDesejado);
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valorInformado;
        System.out.println("Informe o valor que procura na sequência de Fibonacci");
        valorInformado = scanner.nextInt();
        boolean check = fibo(valorInformado);

        if(check == true){
            System.out.println("Esse número pertence a sequência de Fibonacci");
        }else{
            System.out.println("Esse número não pertence a sequência de Fibonnaci");
        }
    }
}