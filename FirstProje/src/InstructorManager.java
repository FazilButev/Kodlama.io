
public class InstructorManager {

	public void courseAdd(User user) {
		
		System.out.println(user.getFirstName() + " isimli eðitmen tarafýndan kurs ekleme iþlemi baþarýlý bir þekilde gerçekleþtirildi.");
		
		
	}
	public void courseDelete(User user) {
		
		System.out.println(user.getFirstName() + " isimli eðitmen tarafýndan kurs silme iþlemi baþarýlý bir þekilde gerçekleþtirildi.");
	}
	public void courseUpdate(User user) {
	
		System.out.println(user.getFirstName() + " isimli eðitmen tarafýndan kurs güncelleme iþlemi baþarýlý bir þekilde gerçekleþtirildi.");
}
}
