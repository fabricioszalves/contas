import java.util.Random;
public class contas {
    public  static void main(String[] args){
        System.out.println("************************************************************");
        operacoesMais();
        operacoesMenos();
        operacoesVezes();
        operacoesDividir();
        operacaoBoolean();
    }
    private static void operacoesMais(){
        Random gerador = new Random();
        System.out.println("Continha de mais");
        System.out.println(" ");
        int n1 = gerador.nextInt(1000), m1;
        int n2 = gerador.nextInt(1000), m2;
        int n3 = gerador.nextInt(1000), m3;

        m1 = n1 + n2;
        m2 = n1 + n3;
        m3 = n3 + n2;
        System.out.println(n1+" mais "+n2+" é igual a = "+m1);
        System.out.println(n1+" mais "+n3+" é igual a = "+m2);
        System.out.println(n3+" mais "+n2+" é igual a = "+m3);
        System.out.println("************************************************************");
    }
    private static void operacoesMenos(){
        Random gerador = new Random();
        System.out.println("Continha de menos");
        System.out.println(" ");
        int n1 = gerador.nextInt(1000), m1;
        int n2 = gerador.nextInt(1000), m2;
        int n3 = gerador.nextInt(1000), m3;

        m1 = n1 - n2;
        m2 = n1 - n3;
        m3 = n3 - n2;
        System.out.println(n1+" menos "+n2+" é igual a = "+m1);
        System.out.println(n1+" menos "+n3+" é igual a = "+m2);
        System.out.println(n3+" menos "+n2+" é igual a = "+m3);
        System.out.println("************************************************************");
    }
    private static void operacoesVezes(){
        Random gerador = new Random();
        System.out.println("Continha de vezes");
        System.out.println(" ");
        int n1 = gerador.nextInt(100), m1;
        int n2 = gerador.nextInt(100), m2;
        int n3 = gerador.nextInt(100), m3;

        m1 = n1 * n2;
        m2 = n1 * n3;
        m3 = n3 * n2;
        System.out.println(n1+" vezes "+n2+" é igual a = "+m1 );
        System.out.println(n1+" vezes "+n3+" é igual a = "+m2 );
        System.out.println(n3+" vezes "+n2+" é igual a = "+m3 );
        System.out.println("************************************************************");
    }
    private static void operacoesDividir(){
        System.out.println("Continhas de dividir");
        System.out.println(" ");
        Random gerador = new Random();
        int n1 = gerador.nextInt(100), m1;
        int n2 = gerador.nextInt(100), m2;
        int n3 = gerador.nextInt(100), m3;

        m1 = n1 / n2;
        m2 = n1 / n3;
        m3 = n3 / n2;

        System.out.println(n1+" dividido por "+n2+" é igual a = "+m1);
        System.out.println(n1+" dividido por "+n3+" é igual a = "+m2);
        System.out.println(n3+" dividido por "+n2+" é igual a = "+m3);
        System.out.println("************************************************************");

    }
    private static void operacaoBoolean(){
        Random gerador = new Random();
        System.out.println("Fake or Nery");
        System.out.println(" ");
        int n1 = gerador.nextInt(10);
        int n2 = gerador.nextInt(10);
        int n3 = gerador.nextInt(10);

        boolean m1 = n1 > n2;
        boolean m2 = n1 < n3;
        boolean m3 = n1 >= n2;
        boolean m4 = n1 <= n3;
        boolean m5 = n1 == n3;
        boolean m6 = n1 != n3;

        System.out.println("se "+n1+" for maior que "+n2+" é true se não é false = "+m1);
        System.out.println("se "+n1+" for menor que "+n3+" é true se não é false = "+m2);
        System.out.println("se "+n1+" for maior ou igual "+n2+" é true se não é false = "+m3);
        System.out.println("se "+n1+" for menor ou igual "+n3+" é true se não é false = "+m4);
        System.out.println("se "+n1+" for igual a "+n3+" é true se não é false = "+m5);
        System.out.println("se "+n1+" for diferente de "+n3+" é true se não é false = "+m6);
        System.out.println("************************************************************");





    }

}
