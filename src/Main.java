import java.util.Scanner;
// premetto che qui ho dovuto cercare come creare un input dell'utente in quanto sulle lezioni non le ho trovate.
// per questo usando la funzione scanner
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci un numero da 1 a 10: ");
            int numero = userInput.nextInt();

            String nomeNumero;
            switch (numero) {
                case 1:
                    nomeNumero = "uno";
                    break;
                case 2:
                    nomeNumero = "due";
                    break;
                case 3:
                    nomeNumero = "tre";
                    break;
                case 4:
                    nomeNumero = "quattro";
                    break;
                case 5:
                    nomeNumero = "cinque";
                    break;
                case 6:
                    nomeNumero = "sei";
                    break;
                case 7:
                    nomeNumero = "sette";
                    break;
                case 8:
                    nomeNumero = "otto";
                    break;
                case 9:
                    nomeNumero = "nove";
                    break;
                case 10:
                    nomeNumero = "dieci";
                    break;
                default:
                    System.out.println("Non posso dirti il nome poichè fuori dai parametri");
                    continue;
            }

            System.out.println(numero + " --> " + nomeNumero);
        }
    }
}
