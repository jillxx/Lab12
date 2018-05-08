package PersonClasses;

public class Person {
	private String name;
	private String Address;

	
	
	
	public Person(String name, String address) {
		
	}








	public String getAddress() {
		return Address;
	}




	public void setAddress(String address) {
		Address = address;
	}




	public String getName() {
		return name;
	}




	@Override
	public String toString() {
		return "Person [name=" + name + ", Address=" + Address + "]";
	}
	
	
	
	
}


