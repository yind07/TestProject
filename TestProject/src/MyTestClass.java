
public class MyTestClass {

	public static void main(String[] args) {
		// can use command line to test
		System.out.println("The number of arguments: " + args.length);
		for (String s : args) {
			System.out.println(s);
		}
	}

}
