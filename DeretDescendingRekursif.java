import java.util.Scanner;

public class DeretDescendingRekursif {

    static void deretRekursif(int n){
        if (n >= 0){
            System.out.println(n);
            deretRekursif(n - 1);
        }
    } 
    static void deretIteratif(int n){
        for (int i = n; i >= 0; i--){
            System.out.println(i);
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan Angka : ");
        n = sc.nextInt();
        System.out.println("Hasil dari fungsi rekursif : ");
        deretRekursif(n);
        System.out.println("Hasil dari fungsi iteratif : ");
        deretIteratif(n);
    }
    
}