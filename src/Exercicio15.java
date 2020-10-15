package src;

import java.util.Scanner;

class Main 
{
  public static void main(String[] args) 
  {
    int pessoas = 0, p = 120;
    double lucro = 0.0, dinheiro = 5.00, acmL = 0.0, valorI = 0.0;

    Scanner scan = new Scanner(System.in);
    
    System.out.println("\nInforme o adicional de pessoas: ");
    pessoas = scan.nextInt();

    System.out.println("\nTabela de lucro");
    System.out.println("-----------------------");

    scan.close();

    for(dinheiro = 5; dinheiro >= 1; dinheiro = dinheiro - 0.5)
    {
      
      lucro = (dinheiro * p) - 200;

      System.out.println("Lucro R$" + dinheiro + " - " + "R$" + lucro);
      
      p += pessoas;

      if(lucro > acmL)
      {
        acmL = lucro;
        valorI = dinheiro;
      }
    }
    System.out.println("-----------------------");
    System.out.println("\nValor que gera maior lucro: " + "R$" + valorI);
    
  }
}
