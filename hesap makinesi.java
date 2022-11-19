
import java.util.Scanner;


public class pratik6 {
 public static void main(String[] args) {
    int n1 , n2 , select;

    Scanner input = new Scanner(System.in);
    System.out.print("ilk sayini giriniz:");
    n1 = input.nextInt();
    System.out.print("ikinci sayini giriniz:");
    n2 = input.nextInt();

    System.out.println("1-toplama\n2-çikartma\n3-çarpma\n4-bolme");
    System.out.print("seçiniz:");
    select = input.nextInt();

    switch(select){
        case 1:
        System.out.println("toplam:" + (n1+n2));
        break;
        case 2:
        System.out.println("cikarma:" +(n1-n2));
        break;
        case 3:
        System.out.println("carpma:" + (n1*n2));
        break;
        case 4:
        if(n2 != 0){
            System.out.println("bolme:" + (n1/n2));
        }else{
            System.out.println("bir san 0'a bolunemez");
        }
        break;
        default:
        System.out.println("yanlis sectiniz. tekrar deneyin");
    }
 }
}
