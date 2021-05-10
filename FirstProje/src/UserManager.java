
public class UserManager {
	
	public void signUp(User user) {
		
		System.out.println(user.getFirstName() + " Ýsimli kullanýcý baþarýlý bir þekilde oluþturuldu.");
	}

	public void signIn(User user) {
		
		System.out.println(user.getFirstName() + " Ýsimli kullanýcý baþarýlý bir þekilde giriþ yaptý.");
	}
	
	public void signUpdate(User user) {
		
		System.out.println(user.getFirstName() + " Ýsimli kullanýcý bilgileri baþarýlý bir þekilde güncellendi.");
	}
}
