import java.util.Scanner;
public class att3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número;");
        double num1 = sc.nextDouble();
        System.out.println("Escolha a operador (+,-,*,/):");
        char operador = sc.next().charAt(0);
        System.out.println("Digite o segundo número");
        double num2 = sc.nextDouble();
        double resultado;
        switch (operador) {
            case '+':
            resultado = num1 + num2;
            System.out.println("Resultado:" + resultado);
            break;

            case '-':
                resultado = num1 - num2;
             System.out.println("Resultado:" + resultado);
             break;
             case '/':
                if (num2 != 0) {
                resultado = num1 / num2;
              System.out.println("Resultado:" + resultado);
                } else {
                    System.out.println("Não pode ser dividido por zero. ");
                }
              break;
              case '*':
                resultado = num1 * num2;
                 System.out.println("Resultado:" + resultado);
                
                 break;
                
                
                
        
            default:
                System.out.println("Operador ivalido.");

                
        }
        
        sc.close();
        
    }
}

    
    
        


