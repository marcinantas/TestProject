public class IntegerTest {
	private void print(int i) {
		System.out.println("int: " + i);
	}

	private void print(Object o) {
		System.out.println("Object: " + o);
	}

	private void print(String s) {
		System.out.println("String: " + s);
	}

	public static void main(String[] args) {
		IntegerTest in = new IntegerTest();
		Integer i = new Integer(0);
		in.print(i);
	}
}