import java.util.Scanner;

class LivroDeNotas {

  Scanner scanner = new Scanner(System.in);
  private int numeroAlunos;

  public int getNumAlunos() {
    return numeroAlunos;
  }

  public void setNumAlunos(int numeroAlunos) {
    this.numeroAlunos = numeroAlunos;
  }

  public void calcularMediaDeCadaAluno() {
    while (true) {
      System.out.println("\nDigite a quantidade de alunos: ");
      numeroAlunos = scanner.nextInt();

      if (numeroAlunos <= 0) {
        System.out.println("Numero invalido!");
        continue; // Volta para o início do loop se o número for negativo ou zero
      } else {
        break; // Sai do loop se o número for válido
      }
    }

    double somaMedias = 0;

    for (int i = 1; i < numeroAlunos; i++) {
      System.out.println("Nota da A1 para o aluno " + i + ": ");
      double a1 = scanner.nextDouble();
      System.out.println("Nota da A2 para o aluno " + i + ": ");
      double a2 = scanner.nextDouble();
      System.out.println("Nota da A3 para o aluno " + i + ": ");
      double a3 = scanner.nextDouble();

      double media = (a1 + a2 + a3) / 3;

      somaMedias += media;

      System.out.println("Media do aluno " + i + " foi: " + media);
    }

    double mediaGeral = somaMedias / numeroAlunos;
    System.out.println("Media geral: " + mediaGeral);

    scanner.close();
  }

  public static void main(String[] args) {
    LivroDeNotas livro = new LivroDeNotas();
    livro.calcularMediaDeCadaAluno();
  }
}
