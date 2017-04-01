import java.util.Scanner;
public class absen {
    public static void main(String[] args) {
        String user, password;
	String[] users;
	String[] passwords;
	int i = 0;
	
	users = new String[3];
	passwords = new String[3];

        
        users[0] = "syaifudin";
	passwords[0] = "syaifudin";
	users[1] = "anung";
	passwords [1] = "anung";
       
        Scanner akun = new Scanner(System. in );
	Scanner akun1 = new Scanner(System. in );


       
        System.out.println("masukkan Username: ");
        user = akun.nextLine();
        System.out.println("masukkan Password: ");
        password = akun.nextLine();

	System.out.println("masukkan Username: ");
        user = akun1.nextLine();
        System.out.println("masukkan Password: ");
        password = akun1.nextLine();

				
		if (i=0; i<=3; i++)
					{
        if (users[i].equals(user) && passwords[i].equals(password)) {
            System.out.println("Login Sukses");
        } else {
            System.out.println("Login Gagal");
        }
					}
				
    }
}