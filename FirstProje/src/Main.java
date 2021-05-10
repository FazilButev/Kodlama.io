
public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"Fazýl","Bütev","12345","Yapý Kredi","ANKARA");
		User user3 = new User(3,"Ferit","Þahiner","1234567890","Akbank","ANKARA");
		Student user2 = new Student();
		user2.setId(2);
		user2.setFirstName("Anýl");
		user2.setLastName("Nalbantoglu");
		user2.setMyCourses("C#","Java","Phyton");
		user2.setStudentProfile("Öðrenci Profili");
		
		System.out.println("Kullanýcý id : " + user.getId());
		System.out.println("Kullanýcý adý : " + user.getFirstName());
		System.out.println("Kullanýcý soyadý : " + user.getLastName());
		System.out.println("Kullanýcý þifresi : " + user.getPassword());
		System.out.println("Kullanýcý kart bilgisi : " + user.getCardInformation());
		System.out.println("Kullanýcý adresi : " + user.getAddress());
		
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
