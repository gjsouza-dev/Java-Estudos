/*Dado um determinado salário,
se o salário for maior que 4500,
imprima 30% do valor. Senão,
imprima 15% do valor.*/

public class CalculadoraCondition {
    public static void main(String[] args) {
        float salario = 4700.50F;
        if(salario > 4500) {
            System.out.println(salario * 0.30);
        } else {
            System.out.println(salario * 0.15);
        }
    }
}
