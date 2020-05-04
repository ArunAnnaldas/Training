package p1;

import java.io.IOException;

public class Exceptions {

	public static void main(String[] args) {

		try {
			m1();
		} catch (Exception e) {
			System.out.println("Inside main catch block");
			e.printStackTrace();
		}

	}

	public static void m1() throws Exception {

		int x = 0;
		int y = 1;

		try {
			System.out.println(y / x);
		} catch (Exception e) {
			System.out.println("Inside m1 catch block");
			throw new Exception("division is performed incorrectly");
		}
	}
}

class TestExceptionPropagation2 {
	void m() throws IOException {
		throw new java.io.IOException("device error");// checked exception
	}

	void n() throws IOException {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		TestExceptionPropagation2 obj = new TestExceptionPropagation2();
		obj.p();
		System.out.println("normal flow");
	}
}
