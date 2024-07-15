
public class test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.makesound();
		dog.sleep();
		System.out.println("------------------");
		Cat c = new Cat();
		c.eat();
		c.makesound();
		c.sleep();
		System.out.println("------------------");
		Bird b = new Bird();
		b.eat();
		b.makesound();
		b.sleep();
	}
}
