import java.util.Scanner;

public class HavaHesaplama {
    public static void main(String[] args) {
        int heat;

        Scanner scan = new Scanner(System.in);
        heat = scan.nextInt();

        if(heat<5){
            System.out.println("KAYAK YAPABİLİRSİN.");
        } else if (heat>5 && heat<15) {
            System.out.println("SİNEMAYA GİDEBİLİRSİN.");
        } else if (heat>10 && heat<25) {
            System.out.println("PİKNİĞE GİDEBİLİRSİN.");
        }
        else{
            System.out.println("YÜZMEYE GİDEBİLİRSİN.");
        }
    }
}
