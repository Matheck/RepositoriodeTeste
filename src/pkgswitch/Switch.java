package pkgswitch;
public class Switch {
public static void main(String[] args) {
      java.util.Scanner scan = new java.util.Scanner(System.in);
      int n;
      System.out.println("Dia da semana");
      n = scan.nextInt();
      switch (n) {
          case 0: System.out.println("Domingo");
          break;
          case 1: System.out.println("Segunda");
          break;
          case 2: System.out.println("Terça");
          break;
          case 3: System.out.println("Quarta");
          break;
          case 4: System.out.println("Quinta");
          break;
          case 5: System.out.println("Sexta");
          break;
          case 6: System.out.println("Sabado");
          break;
          default : System.out.println("Invalido");
      }
    }
    
}
