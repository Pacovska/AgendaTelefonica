package engtelecom.poo;

import java.util.Scanner;

public class Principal {
    public int menu(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("==============================");
        System.out.println("1 - Listar contatos           ");
        System.out.println("2 - Adicionar Contato         ");
        System.out.println("3 - Adicionar Telefone        ");
        System.out.println("4 - Adicionar E-mail          ");
        System.out.println("5 - Alterar Telefone          ");
        System.out.println("6 - Alterar E-mail            ");
        System.out.println("7 - Remover Telefone          ");
        System.out.println("8 - Remocer E-mail            ");
        System.out.println("9 - Remover Contato           ");
        System.out.println("0 - Sair                      ");
        System.out.println("==============================");

        return teclado.nextInt();
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        Agenda agenda = new Agenda();
        while (true){
            Scanner teclado = new Scanner(System.in);
            var opcao = principal.menu();
            switch (opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    if (!agenda.isEmpty()){
                        System.out.println(agenda.toString());

                        System.out.print("Informe o número referênte ao contato que deseja remover: ");
                        int i = teclado.nextInt();

                        if(agenda.removePessoa(i - 1)){
                            System.out.println("Pessoa removida com sucesso!");
                        }else {
                            System.out.println("Valor informado, não se encontra na lista");
                        }
                    } else {
                        System.out.println("Sua lista de contatos está vazia!");
                    }
                    break;
                case 0:
                    System.out.println("Finalizando sistema...");
                    System.exit(0);
                default:
                    System.err.println("Informe um valor valido");
            }
        }

    }
}
