
public class Main {

	public static void main(String[] args) {
		Person male = new Person();
		male.setName("João");
		male.setAge(12);
		Person female = new Person();
		female.setName("Maria");
		female.setAge(23);
		System.out.println("Male name: " + male.getName() + " idade: " + male.getAge());
		System.out.println("Female name: " + female.getName() + " idade: " + female.getAge());
	}

}
