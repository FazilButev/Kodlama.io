
public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"Faz�l","B�tev","12345","Yap� Kredi","ANKARA");
		User user3 = new User(3,"Ferit","�ahiner","1234567890","Akbank","ANKARA");
		Student user2 = new Student();
		user2.setId(2);
		user2.setFirstName("An�l");
		user2.setLastName("Nalbantoglu");
		user2.setMyCourses("C#","Java","Phyton");
		user2.setStudentProfile("��renci Profili");
		
		System.out.println("Kullan�c� id : " + user.getId());
		System.out.println("Kullan�c� ad� : " + user.getFirstName());
		System.out.println("Kullan�c� soyad� : " + user.getLastName());
		System.out.println("Kullan�c� �ifresi : " + user.getPassword());
		System.out.println("Kullan�c� kart bilgisi : " + user.getCardInformation());
		System.out.println("Kullan�c� adresi : " + user.getAddress());
		
		System.out.println("---------------------------------------------------------");
		
		UserManager user1 = new UserManager();
		user1.signIn(user);
		user1.signUp(user);
		user1.signUpdate(user);
		
		System.out.println("---------------------------------------------------------");
		
		StudentManager studentManager = new StudentManager();
		studentManager.courseRegister(user2);
		
		System.out.println("---------------------------------------------------------");
		
		InstructorManager instructorManager  = new InstructorManager();
		instructorManager.courseAdd(user3);
		instructorManager.courseDelete(user3);
		instructorManager.courseUpdate(user3);
		
		
		
		
	}

}
