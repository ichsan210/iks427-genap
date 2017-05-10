import java.util.Scanner;
public class absen {
    public static void main(String[] args) {
        String user, password;
	String[] users = new String[6];
	String[] passwords = new String[6];
	
	users[0] = "ichsan";
	users[1] = "gabriel";
	users[2] = "rilo";
	passwords[0] = "ichsan";
	passwords[1] = "gabriel";
	passwords[2] = "rilo";
	
       
        Scanner akun = new Scanner(System. in );
       
        System.out.println("masukkan Username: ");
        user = akun.nextLine();
        System.out.println("masukkan Password: ");
        password = akun.nextLine();
					
        if (users[0].equals(user) && passwords[0].equals(password)) 
	{
            System.out.println("Login Sukses");
	}
	else if (users[1].equals(user) && passwords[1].equals(password)) 
	{
            System.out.println("Login Sukses");
	}
	else if (users[2].equals(user) && passwords[2].equals(password)) 
	{
            System.out.println("Login Sukses");
	}
	else 
	{
            System.out.println("Login Gagal");
        }
					
				
    }
}

//ichsan
//dony
//anri
//gabriel
//fajar
//rilo
