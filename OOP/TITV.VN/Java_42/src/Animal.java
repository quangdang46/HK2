
public class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//
	public void eat() {
		System.out.println("MAM MAM");
	}
	//
	public void makeSound() {
		System.out.println("AM THANH");
	}
	//
	public void sleep() {
		System.out.println("ZZZZZZZZZZZ");
	}
}
