package singletonInteraction;

class Runner {
	public static void main(String[] args) {
		System.out.println(Singleton.name);

		// To access the static nested class's static field
		System.out.println(Singleton.Values.lastName);
	}
}
