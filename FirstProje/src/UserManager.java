
public class UserManager {
	
	public void signUp(User user) {
		
		System.out.println(user.getFirstName() + " �simli kullan�c� ba�ar�l� bir �ekilde olu�turuldu.");
	}

	public void signIn(User user) {
		
		System.out.println(user.getFirstName() + " �simli kullan�c� ba�ar�l� bir �ekilde giri� yapt�.");
	}
	
	public void signUpdate(User user) {
		
		System.out.println(user.getFirstName() + " �simli kullan�c� bilgileri ba�ar�l� bir �ekilde g�ncellendi.");
	}
}
