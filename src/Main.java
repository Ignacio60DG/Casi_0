import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("¿Quires saber si tú numero es casi 0?, escribbelo aquí y verás si le das al intro ;)");

        Scanner sc = new Scanner(System.in);

        float numero = sc.nextFloat();

        sc.close();

        if(numero >= 1){
            System.out.println("No es un numero casi 0");
        }else if(numero <= -1){
            System.out.println("No es un numero casi 0");
        }else if(numero == 0){
            System.out.println("Es 0");
        }else{
            System.out.println("Es un numero casi 0");
        }
    }
}
//Más eficiente :D | rapido :D
/*
  if (numero >= 1 || numero <= -1 || numero == 0){
        System.out.println("No es un numero casi 0")
  }else{
        System.out.println("Es casi 0")
  }
 */