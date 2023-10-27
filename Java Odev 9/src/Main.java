import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, registerPassword="java123",password, select, oldPassword;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici Adiniz : ");
        userName = inp.nextLine();
        System.out.print("Sifreniz :");
        password = inp.nextLine();

        if (userName.equals("patika") ) {
            if(password.equals(registerPassword)){
                System.out.println("Giris Yaptiniz !");
            }
            else{
                System.out.println("Sifrenizi Sifirlamak Ister Misiniz? E/H");
                System.out.print("Seciniz: ");
                select=inp.nextLine();

                if(select.equals("E")){
                    oldPassword=password;
                    System.out.print("Yeni Sifrenizi Giriniz :");
                    password = inp.nextLine();
                    if(!password.equals(registerPassword) && !password.equals(oldPassword)){
                        System.out.print("Sifre Olusturuldu!");
                    }
                    else{
                        System.out.print("Sifre Olusturulamadi, lutfen baska sifre giriniz.");
                    }
                }
                else{
                    System.out.println("Sifreniz Degistirilmedi");
                }
            }

        } else {
            System.out.println("Kullanici Adinizi Yanlis Girdiniz!");
        }
    }
}