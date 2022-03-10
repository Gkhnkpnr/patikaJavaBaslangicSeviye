package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Kombinasyon formulunde gereken degiskenleri tanimladim.C(n,r) = n! / (r! * (n-r)!)
        int n,r,f = 0,combination,facN=1,facR=1,facF=1;

        //Kullanicidan deger alabilmek icin Scanner sinifini dahil ettim.
        Scanner input = new Scanner(System.in);

        //Kullanicidan degerleri aldim.
        System.out.print("Lutfen n degerini giriniz: ");
        n=input.nextInt();
        System.out.print("Lutfen r degerini giriniz: ");
        r=input.nextInt();

        
        if (n-r >0){
            //n degerinin faktoriyelini hesapladim
            for (int i =1; i<=n; i++){
                facN = facN*i;
            }

            //r degerinin faktoriyelini hesapladim
            for (int i=1;i<=r;i++){
                facR=facR*i;
            }

            f =n-r;
            //n-r degerinin faktoriyelini hesapladim
            for (int i=1; i<=f;i++){
                facF= facF*i;
            }
        }else{
            //girilen degerlerden n in r den buyuk olmasi gerekiyor.
            System.out.println("n deferinin r degerinden buyuk olmasi gerekmektedir.");
        }

        //Kombinasyon formulunde degerleri yerine koyduktan sonra ekrana yazdirdim.
        combination = facN / (facR * facF);
        System.out.println("C(n,r) = "+ combination);


    }
}
