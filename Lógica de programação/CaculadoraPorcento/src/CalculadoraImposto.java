public class CalculadoraImposto {
    public static void main(String[] args) {
        double salario = 2500.00F;
        float porcentagem =  30L;
        double porcentagemDoSalario = salario * (porcentagem / 100);
        System.out.println(porcentagemDoSalario);

    }
}
