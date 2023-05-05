import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float altura;
        System.out.printf("Informe sua altura: ");
        altura = ler.nextFloat();
        System.out.println("Seu peso ideal é " + ((altura*72.7)-58) + "kg");
    }
}
