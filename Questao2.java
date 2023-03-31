import java.util.ArrayList;

public class Questao2 {
    public static double CalculoMaior(double vetor[]){
        double maior = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > maior){
                maior = vetor[i];
            }
        }
        return maior;
    }
    public static double CalculoMenor(double vetor[]){
        double menor = 999999999;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < menor){
                if(vetor[i] == 0){
                    continue;
                }else{
                    menor = vetor[i];
                }
            }
        }
        return menor;
    }
    public static double CalculoMedia(double vetor[]){
        double media = 0;
        double soma = 0;
        ArrayList<Double> mediaArray = new ArrayList<Double>();
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == 0){
                continue;
            }else{
                mediaArray.add(vetor[i]);
            }
        }
        int n = mediaArray.size();
        for(int j = 0; j < n; j++){
            soma = soma + mediaArray.get(j);
        }
        media = soma / n;
        return media;
    }
    public static void main(String[] args) {
        double vetor[] = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 
            26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722, 0.0, 0.0, 
            3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 
            35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 
            25681.8318, 1718.1221, 13220.495, 8414.61};
        
        double maior = CalculoMaior(vetor);
        double menor = CalculoMenor(vetor);
        double media = CalculoMedia(vetor);

        System.out.println("Maior valor de faturamento do mês: "+maior);
        System.out.println("Menor valor de faturamento do mês: "+menor);
        System.out.println("Media de faturamento do mês: "+media);
    }
}