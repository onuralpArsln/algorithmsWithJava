// dosya adı ile aynı isimli bir public class

public class example1 {
	public static void main(String[] args) {
		System.out.println("Bu class example1");

	}
}

// bir adet public class olacağı için bu class public değil
class example1sideclass {
	public static void main(String[] args) {
		// main metodun her zaman void olacak çünkü main bitince program biter
		// program bittikten sonra bir return olmaz
		// class public olmasa da bu sınıf public çünkü dışarıdan çağrılabilir
		System.out.println("bu side class");
		example1extra example = new example1extra();
		String name = example.name();
		System.out.println(name);

	}
}

class example1extra {

	public void salut() {
		System.out.println("selam");
	}

	public String name() {
		return "mahmude";
	}
}
