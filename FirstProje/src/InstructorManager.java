
public class InstructorManager {

	public void courseAdd(User user) {
		
		System.out.println(user.getFirstName() + " isimli e�itmen taraf�ndan kurs ekleme i�lemi ba�ar�l� bir �ekilde ger�ekle�tirildi.");
		
		
	}
	public void courseDelete(User user) {
		
		System.out.println(user.getFirstName() + " isimli e�itmen taraf�ndan kurs silme i�lemi ba�ar�l� bir �ekilde ger�ekle�tirildi.");
	}
	public void courseUpdate(User user) {
	
		System.out.println(user.getFirstName() + " isimli e�itmen taraf�ndan kurs g�ncelleme i�lemi ba�ar�l� bir �ekilde ger�ekle�tirildi.");
}
}
