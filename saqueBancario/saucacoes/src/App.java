import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //entrada das variaveis
        Scanner sc = new Scanner(System.in);
        double saldo = 50.00;
        int menuOpcao = 0;

        do {
            System.out.println("1) Consultar Saldo: ");
            System.out.println("2) Realizar depósito: ");
            System.out.println("3) Realizar Saque:   ");
            System.out.println("0) Sair ");
            System.out.println("Qual opção escolhida? ");
            menuOpcao = sc.nextInt();
           
            switch (menuOpcao) {
                case 1:
                    System.out.println("seu saldo é: " + saldo + ". ");
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = sc.nextDouble();
                    saldo += valorDeposito;
                    System.out.println(" Valor depositado com sucesso: R$" + valorDeposito + "Seu novo saldo é: R$" + saldo + ". ");
                    break;
                case 3:
                    System.out.println("Digite o valor a ser sacado: ");
                    double valorSaque = sc.nextDouble();
                    if (valorSaque > saldo){
                        System.out.println(" Saldo insuficiente ");
                    }else{
                        saldo -= valorSaque;
                        System.out.println(" Saque realizado com sucesso no valor de: R$ " + valorSaque + "Seu novo saldo é: R$" + saldo + ". ");
                    }
                    break;
                case 0:
                    System.out.println(" Sair ");
                    break;             
                }
        }while (menuOpcao != 0);
                
        sc.close();
    }
}
