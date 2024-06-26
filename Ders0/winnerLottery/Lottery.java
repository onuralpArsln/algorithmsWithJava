class Lottery {

	public static void main(String[] args) {
		// define an array
		int[] numbers = { 123, 123, 123, 345, 423, 234 };
		String[] names = { "jhon", "doe", "mark", "marcus", "jane" };

		// for each döngüsü olarak bilinen bu döngü liste içinde her elemanı
		for (String element : names) {
			System.out.println(element);
		}
		// standart bir for yapısı ve array içi elemanlara ulaşma
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// basit bir if else yapısı
		if (args.length > 0) {
			System.out.println("Args sayisi " + args.length);
		} else {
			System.out.println("Hadi Arg vererek terminalden cagir");
		}

	}

}
