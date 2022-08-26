import java.util.Scanner;

public class ciftsayiBulma {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        k = input.nextInt();

        // Döngü sonunu bildiğimiz için for kullandık.
        for (int i = 1;  i <= k; i++)    {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
