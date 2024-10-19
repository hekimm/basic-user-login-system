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
        Scanner scanner = new Scanner(System.in);

        String sys_username = "hekimm";
        String sys_password ="gs1905M99";
        String username_input,password_input;
        String yeniParola;
        
        System.out.println("Kullanıcı adınızı giriniz: ");
    username_input = scanner.nextLine();
    boolean parolaSifirlanacakMi =false;
            System.out.println("Parolanızı  giriniz: ");
    password_input = scanner.nextLine();
    
    if(username_input.equals(sys_username) &&  password_input.equals(sys_password)){
        System.out.println("Sisteme başarıyla giriş yapıldı");
    }
    else if(username_input.equals(sys_username) && !password_input.equals(sys_password) ){
        System.out.println("Parolanız hatalı !!");
        System.out.println("Şifrenizi sıfırlamak istiyor musunuz : Evet ise true, hayır ise false yazınız" );
        parolaSifirlanacakMi =  scanner.nextBoolean();
        scanner.nextLine();  // Boş satırı okumak için

        if(parolaSifirlanacakMi){
            System.out.println("Yeni parolanızı giriniz:");
              yeniParola = scanner.nextLine();
            while (yeniParola.equals(sys_password) ){
                System.out.println("Yeni parolanız eskisi ile aynı olamaz");
                   yeniParola = scanner.nextLine();
                   if(!yeniParola.equals(sys_password)){
                       System.out.println("Şifre oluşturuldu");
                       sys_password = yeniParola;
                       System.out.println("Yeni parolanız : " +  sys_password );
                       break;
                       
                   }

            }
                
            
            
        }
        
    }
    
     else if(!username_input.equals(sys_username) && password_input.equals(sys_password) ){
        System.out.println("Kullanıcı adınız hatalı !!");
    }
    
     else{
         System.out.println("Hem kullanıcı adınız hem de parolanız hatalı");
     }
    }
}
