
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
	
	public void eat() {
		System.out.println("Toi dang an");
	}
	
	public void makesound() {
		System.out.println("......................");
	}
	public void sleep() {
		System.out.println("zzzzzz");
	}
}
