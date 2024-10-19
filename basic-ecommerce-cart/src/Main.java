/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */

import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        int islem;
        int sayi1,sayi2;
        Scanner  scanner = new Scanner(System.in);
         System.out.println("Birinci sayıyı giriniz: ");
         sayi1 = scanner.nextInt();
         
            System.out.println("İkinci sayıyı giriniz: ");
         sayi2 = scanner.nextInt();
         
         
        System.out.println("İşlem seçiniz: ");
        System.out.println("Toplama için -->1,Çıkartma için -->2,Çarpma için --> 3,Bolme için -->4  seçiniz: ");
        islem = scanner.nextInt();
        
        switch(islem){
            case 1:
                System.out.println("Sayıların toplamı :" + (sayi1+sayi2));
                break;
                
            case 2 :
                System.out.println("Sayıların farkı :  "+ Math.abs(sayi1 -  sayi2));
                break;
            case 3:
                System.out.println("Sayıların çarpımı :  " + (sayi1*sayi2));
                break;
                
            case 4:
                if(sayi2 ==0){
                    System.out.println("Bölmede 0 a bölünme tanımsızdır!!");
                }
                else{
                     System.out.println("Sayilarin bölümü : " + (double)sayi1/sayi2);
                }
                break;
            default:
                   System.out.println("Geçersiz işlem girdiniz !!");

                
                
                
        }
    }
    
}

