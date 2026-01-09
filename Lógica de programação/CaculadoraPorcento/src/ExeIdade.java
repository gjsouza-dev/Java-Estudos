/*
Receba uma idade como entrada
Se a idade for maior que 18 imprima "adulto"
senão imprima " não é adulto"
*/
public class ExeIdade {
    public static void main(String[] args){
        int age = 90;
        if(age < 0){
            System.out.println("Idade inválida");
        } else if (age >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
