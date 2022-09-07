import java.util.Scanner;

public class Login {
    private String username;
    private String password;
    private int hak = 3;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHak() {
        return hak;
    }

    public void setHak(int hak) {
        this.hak = hak;
    }

    public void Login(){
        Scanner scan = new Scanner(System.in);
        for(int i = 1; i <= 3; i++){
            System.out.print("Kullanıcı adınızı giriniz :");
            username = scan.nextLine();
            System.out.print("Parolanızı giriniz :");
            password = scan.nextLine();
            if(username.equals("patika") && password.equals("123")){
                System.out.print("Başarılı bir şekilde giriş yaptınız :");
            }else {
                System.out.println("Kullanıcı adı veya şifre hatalı tekrar deneyiniz !");
            }
            hak--;
            System.out.println("Kalan hak :" + hak);
        }
    }
}
