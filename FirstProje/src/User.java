
public class User {
	
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String cardInformation;
	private String Address;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String password, String cardInformation, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.cardInformation = cardInformation;
		this.Address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCardInformation() {
		return cardInformation;
	}


	public void setCardInformation(String cardInformation) {
		this.cardInformation = cardInformation;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}
}
