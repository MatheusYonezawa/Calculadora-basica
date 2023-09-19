import java.util.Scanner;


public class MinhaClasse {
    

    public static void main (String[] args){

        Scanner ler = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int soma = 0;
        int sub = 0;
        float div = 0;
        int mult = 0;

        int escolha = 0;

        System.out.println("Escolha uma operação (escolha o número da operação), \n (1)Soma \n (2)Subtração \n (3)divisão \n (4)MultiplicaÇão");
            escolha = ler.nextInt();
        

        if (escolha == 1) {
           
            System.out.println("Digite o primeiro número");
                n1 = ler.nextInt();
            System.out.println("Digite o segundo número");
                n2 = ler.nextInt();
            soma = n1+n2;
            System.out.print("A soma dos números é: " + soma);

       }else if (escolha == 2){

             System.out.println("Digite o primeiro número");
                n1 = ler.nextInt();
            System.out.println("Digite o segundo número");
                n2 = ler.nextInt();
            sub = n1-n2;
            System.out.println("A subtraÇão dos números é: " + sub);

       }else if (escolha == 3){

             System.out.println("Digite o primeiro número");
                n1 = ler.nextInt();
            System.out.println("Digite o segundo número");
                n2 = ler.nextInt();
            div = n1/n2;
            System.out.println("A divisão dos números é: " + div);
            

       }else if (escolha == 4){

             System.out.println("Digite o primeiro número");
                n1 = ler.nextInt();
            System.out.println("Digite o segundo número");
                n2 = ler.nextInt();
            mult = n1*n2;
            System.out.println("A multiplicaÇão dos números é:" + mult);

       }else {
            
            System.out.println("Escolha invalida");

       }


    }

}
