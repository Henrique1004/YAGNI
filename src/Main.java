import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GastoBD gastoBD = new GastoBD();
        char x = 'a';

        while(x == 'a') {
            int id;
            String descricao;
            String fpgto;
            float valor;
            char op;

            System.out.println("Cadastrar/remover gasto -B / Vizualizar gasto específico -V / Visualizar valor total gasto -T / Sair -S");
            op = scanner.next().charAt(0);

            if(op == 's'){
                x = 's';
            }

            else if(op == 'b') {
                System.out.println("C - Cadastrar gasto / E - Excluir gasto");
                op = scanner.next().charAt(0);

                if(op == 'c'){
                    System.out.println("Insira o id do seu gasto: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insira a descrição do seu gasto: ");
                    descricao = scanner.nextLine();
                    System.out.println("Insira a forma de pagamento: ");
                    fpgto = scanner.nextLine();
                    System.out.println("Insira o valor gasto: ");
                    valor = scanner.nextFloat();
                    System.out.println("Confirma? S/N");
                    op = scanner.next().charAt(0);

                    if(op == 's'){
                        Gasto gasto = new Gasto(id, descricao, fpgto, valor);
                        gastoBD.adicionarGasto(gasto);
                    }
                    else if(op == 'n'){
                        System.out.println("Registro cancelado");
                    }
                }

                else if(op == 'e'){
                    System.out.println("Digite o ID do seu gasto: ");
                    id = scanner.nextInt();
                    Gasto gasto = gastoBD.getGasto(id);
                    gastoBD.removerGasto(gasto);
                }
            }

            else if(op == 'v'){
                System.out.println("Digite o ID do seu gasto: ");
                id = scanner.nextInt();
                Gasto gasto = gastoBD.getGasto(id);
                System.out.println("id: " + id);
                System.out.println("Descrição: " + gasto.getDescricao());
                System.out.println("Forma de pagamento: " + gasto.getFpgto());
                String gvalor = String.format("%.2f", gasto.getValor());
                System.out.println("Valor: " + gvalor);
            }

            else if(op == 't') {
                String total = String.format("%.2f", gastoBD.getTotal());
                System.out.println("Total de gastos: " + total);
            }
        }
    }
}
