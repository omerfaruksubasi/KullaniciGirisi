import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String password,control;
        Scanner input = new Scanner(System.in);
        System.out.print("omer bey sifrenizi giriniz: ");
        password = input.nextLine();
        if(password.equals("subasi")){
            System.out.println("giris basarili");
            System.out.println("HOSGELDINIZ");
        }
        else{
            System.out.println("sifre hatali");
            System.out.println("sifrenizi degistirmek istiyorsaniz evet istemiyorsanız hayir yaziniz: ");
            control = input.nextLine();
            if(control.equals("evet")){
                System.out.print("yeni sifrenizi giriniz: ");
                while(true){
                    password = input.nextLine();
                    if(!password.equals("subasi")){
                        System.out.println("sifreniz degismistir");
                        break;
                    }
                    else{
                        System.out.print("sifreniz eskisiyle ayni olmamalidir. Lütfen yeni sifre giriniz: ");
                    }
                }

            }

        }
    }
}
