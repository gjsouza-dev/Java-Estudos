/*Dado um determinado salário,
se o salário for maior que 4500,
imprima 30% do valor. Senão,
imprima 15% do valor.*/

public class CalculadoraCondition {
    public static void main(String[] args) {
        float salario = 4800.50F;
        float resultado = 0F;
        String porcentagem = "";
        if(salario > 4500) {
            resultado = salario * 0.30F;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.15F;
            porcentagem = "15%";
        }
        System.out.println("O valor em porcentagem de "+porcentagem+" é " +  resultado);
    }
}
