import static java.lang.Math.*;

public class StaticImportTest {

	public static void main(String[] args) {
		System.out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0));
		System.out.printf("sqrt(900.0) = %.1f%n", Math.sqrt(900.0));
		System.out.printf("E = %f%n", E);
	}

}
