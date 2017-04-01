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
       
        Scanner akun = new Scanner(System. in );
       
        System.out.println("masukkan Username: ");
        user = akun.nextLine();
        System.out.println("masukkan Password: ");
        password = akun.nextLine();

					
        if (users[i].equals(user) && passwords[i].equals(password)) {
            System.out.println("Login Sukses");
        } else {
            System.out.println("Login Gagal");
        }
					
				
    }
}

//ichsan
//dony
//anri
//gabriel
//fajar
