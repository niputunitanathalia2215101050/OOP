package id.ac.undiksha.ais.people;

public class Human {
	private String name;
	private String birthDate;
	private boolean gender; // 0 for female and 1 for male
	private String address;
	
	
	public Human() {
		this.name = "Plase insert name";
		this.birthDate = "Plase insert birth date";
		this.address = "Plase insert address";
	}
	
	public Human(String name, String birthDate, boolean gender, String address) {
		super();
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void printAll() {
		System.out.println(this.name);
		System.out.println(this.birthDate);
		if (isGender()) {
			System.out.println("Male");
		}
		else {
			System.out.println("Female");
		}
		System.out.println(this.address);
	}

	
}
