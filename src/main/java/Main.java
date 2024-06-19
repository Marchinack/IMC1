import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Seu primeiro nome:");
    String nome = sc.next();
    System.out.println("Seu segundo nome:");
    String sobrenome = sc.next();
    System.out.println("Sua idade:");
    int idade = sc.nextInt();
    System.out.println("Sua altura:");
    double altura = sc.nextDouble();
    System.out.println("Sua massa [peso] em kg:");
    double massa = sc.nextDouble();
    double imc = massa / (altura * altura);
    System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
    System.out.println("Sua idade é: " + idade + " anos");
    System.out.println("Sua altura é: " + altura + " metros");
    System.out.println("Sua massa é: " + massa + " kg");
    System.out.println("Seu IMC é: " + imc);
    sc.close();
  }
}