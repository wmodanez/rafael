import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Lista lista1 = new Lista();

        int opcao;
        int informacao;
        Celula x;
        String menu;

        do {
            menu = "===============\n";
            menu += "\tMENU:\n";
            menu += "1 - Inserir.\n";
            menu += "2 - Remover.\n";
            menu += "3 - Listar.\n";
            menu += "4 - Consultar.\n";
            menu += "5 - Sair\n";
            menu += "===============\n";

            System.out.println(menu);
            System.out.println("Informe uma opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe um valor a ser inserido: ");
                    informacao = teclado.nextInt();
                    x = new Celula(informacao);
                    lista1.inserir(x);
                    System.out.println("\n\nPronto!\n\n");
                    break;
                case 2:
                    System.out.println("Informe o valor a ser removido: ");
                    informacao = teclado.nextInt();
                    x = lista1.remover(informacao);

                    if (x != null) {
                        System.out.println("\n\nPronto!\n\n");
                    } else {
                        System.out.println("\n\nNão existe " + informacao + " na lista!\n\n");
                    }
                    break;
            }
        } while (opcao != 5);
    }
}