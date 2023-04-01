/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

/**
 *
 * @author Edilson Da Sara
 */
import java.util.Scanner;
public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TODO: Conhecer e importara aclasse scanner;
        //Exibir mensagens para usuarios;
        //Obter pela classe scanner os valores digitados no terminal
        //Exibir a mensagem conta criada
        
        Scanner leitura= new Scanner (System.in);
        System.out.println("Digite o seu nome:");
        String nomeCliente=leitura.nextLine();
        
        System.out.println("Digite o seu nome Agencia:");
        String agencia=leitura.nextLine();
        
        System.out.println("Por favor, digite o numero da Agencia:");
          int numero=leitura.nextInt();
          
          System.out.println("Digite o seu saldo:");
            double saldo=leitura.nextDouble();
          
          System.out.println("Ola "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agencia e' "+agencia+" conta "+numero+" e seu saldo "+saldo+" ja esta disponivel para saque.");
    }
    
}
