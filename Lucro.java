import java.util.Scanner;

public class Lucro {

  private int numeroClientes;

  public Lucro(int numeroClientes) {
    this.numeroClientes = numeroClientes;
  }

  public void calcularMediaGastoPorCliente() {
    Scanner scanner = new Scanner(System.in);

    double totalGastosClientes = 0.0;

    for (int i = 0; i < numeroClientes; i++) {
      System.out.println("Digite o número de bebidas que o cliente " + (i + 1) + " comprou: ");
      int numBebidas = scanner.nextInt();

      System.out.println("Digite o preço da bebida: ");
      double precoBebida = scanner.nextDouble();

      System.out.println("Digite o número de comidas que o cliente " + (i + 1) + " comprou: ");
      int numComidas = scanner.nextInt();

      System.out.println("Digite o preço da comida: ");
      double precoComida = scanner.nextDouble();

      double gastoCliente = (numBebidas * precoBebida) + (numComidas * precoComida);
      totalGastosClientes += gastoCliente;

      double mediaCliente = gastoCliente / 2;
      System.out.println("A média de gastos do cliente " + (i + 1) + " é: " + mediaCliente);
    }

    scanner.close();
  }

  public void calcularMediaGeral() {
    Scanner scanner = new Scanner(System.in);

    double totalGastos = 0.0;

    for (int i = 0; i < numeroClientes; i++) {
      System.out.print("Quanto que o cliente " + (i + 1) + " gastou em comidas: ");
      double comidas = scanner.nextDouble();

      System.out.print("Quanto que o cliente " + (i + 1) + " gastou em bebidas: ");
      double bebidas = scanner.nextDouble();

      totalGastos += comidas + bebidas;
    }

    double mediaGeral =
        totalGastos
            / (numeroClientes * 2); // Dividindo por 2 para considerar o gasto médio de cada cliente

    System.out.println("A média Geral é: " + mediaGeral);

    scanner.close();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o numero de clientes: ");
    int numeroClientes = scanner.nextInt();

    Lucro lucro = new Lucro(numeroClientes);

    System.out.println("Digite 1 para escolher a média gasta por cliente e 2 para a média geral:");
    int escolha = scanner.nextInt();

    switch (escolha) {
      case 1:
        lucro.calcularMediaGastoPorCliente();
        break;
      case 2:
        lucro.calcularMediaGeral();
        break;
      default:
        System.out.println("Escolha inválida!");
    }

    scanner.close();
  }
}
