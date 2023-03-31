public class Questao3 {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double Valortotal = sp + rj + mg + es + outros;

        int valor1 = (int) ((sp*100) / Valortotal);
        System.out.println("São Paulo teve participação de: "+valor1+"%");
        int valor2 = (int) ((rj*100) / Valortotal);
        System.out.println("Rio de Janeiro teve participação de: "+valor2+"%");
        int valor3 = (int) ((mg*100) / Valortotal);
        System.out.println("Minas Gerais teve participação de: "+valor3+"%");
        int valor4 = (int) ((es*100) / Valortotal);
        System.out.println("Espirito Santo teve participação de: "+valor4+"%");
        int valor5 = (int) ((outros*100) / Valortotal);
        System.out.println("Outros teve participação de: "+valor5+"%");
    }
}
