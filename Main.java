import java.util.Scanner;
class Main {
 
  public static void main(String[] args) {
  System.out.println("-----------------------------------------------\n\nKALKULATOR SZACOWANEGO CZASU TRZEZWIENIA\n\n-----------------------------------------------");
  System.out.println("Podaj swoją wagę w kg: ");
  Scanner a = new Scanner (System.in);
  double waga = a.nextDouble();
  System.out.println("\nWybierz rodzaj spożytego alkoholu:\n1. Wódka/Whisky/Gin/Tequila (40% zawartosci alk.)\n2. Piwo (5% zawartosci alk.)\n3. Wino (12% zawartosci alk.)");
  Scanner to = new Scanner (System.in);
  int program = to.nextInt();

  switch(program)
    {
      case 1:
        System.out.println ("-----------------------------------------------\nWybrales alkohol mocny (40%)");
        System.out.println ("Podaj ilosc wypitego alkoholu (w ml): ");
        Scanner b = new Scanner (System.in);
        double iloscb = b.nextDouble();
        double mgb = iloscb*40/100;
        System.out.println ("\nPodales " + iloscb + " ml mocnego alkoholu. Jest to " + mgb + " mg czystego alkoholu we krwi.\n");
        double promileb = mgb / (0.7*waga);
        System.out.println ("Masz " + promileb + " ‰ we krwi.");
        double czasb = promileb / 0.15;
        System.out.println ("Czas, po ktorym osiagniesz pelna trzezwosc to: " + czasb + " h");
        break;
    
      case 2:
       System.out.println ("-----------------------------------------------\nWybrales piwo (5%)");
        System.out.println ("Podaj ilosc wypitego piwa (w ml): ");
        Scanner c = new Scanner (System.in);
        double iloscc = c.nextDouble();
        double mgc = iloscc*5/100;
        System.out.println ("\nPodales " + iloscc + " ml wypitego piwa. Jest to " + mgc + " mg czystego alkoholu we krwi.\n");
        double promilec = mgc / (0.7*waga);
        System.out.println ("Masz " + promilec + " ‰ we krwi.");
        double czasc = promilec / 0.15;
        System.out.println ("Czas, po ktorym osiagniesz pelna trzezwosc to: " + czasc + " h");
        break;
        
      case 3:
       System.out.println ("-----------------------------------------------\nWybrales wino (12%)");
        System.out.println ("Podaj ilosc wypitego wina (w ml): ");
        Scanner d = new Scanner (System.in);
        double iloscd = d.nextDouble();
        double mgd = iloscd*12/100;
        System.out.println ("\nPodales " + iloscd + " ml wina. Jest to " + mgd + " mg czystego alkoholu we krwi.\n");
        double promiled = mgd / (0.7*waga);
        System.out.println ("Masz " + promiled + " ‰ we krwi.");
        double czasd = promiled / 0.15;
        System.out.println ("Czas, po ktorym osiagniesz pelna trzezwosc to: " + czasd + " h\n");
        break;
    } 
    System.out.println("-----------------------------------------------\nKONIEC DZIALANIA PROGRAMU\n-----------------------------------------------");
  }
}