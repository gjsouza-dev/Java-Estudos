public class TesteDeCondicao {
    public static void main(String[] args){
        int temperatura = 49;
        if(temperatura < 15) {
            System.out.println("está frio");
        } else if (temperatura >= 15 && temperatura <= 20) {
            System.out.println("clima agradável");
        } else {
            System.out.println("está quente");
        }
    }
}
