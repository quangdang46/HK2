
public class main {
	public static void main(String[] args) {
		Dog dg=new Dog();
		Cat ct=new Cat();
		Bird br=new Bird();
		dg.eat();
		dg.sleep();
		dg.makeSound();
		System.out.println("________");
		ct.eat();
		ct.sleep();
		ct.makeSound();
		System.out.println("________");
		br.eat();
		br.sleep();
		br.makeSound();
	}
}
