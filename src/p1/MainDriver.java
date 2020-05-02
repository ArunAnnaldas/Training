package p1;

public class MainDriver {

	public static void main(String[] args) {

		Sample s = new A();
		s.m2();

		Sample2 s2 = new A();
		s2.m2();

		s = new B();
		s.m2();

	}
}

// Can we create instance of interface?
// Can we declare abstract method as static?
// Can we declare abstract method as final?
// Can abstract class have constructor in java?

abstract class D {
	D() {

	}
}

class E extends D {
	E() {
		super();
	}
}

//****************************************************************************

interface Sample {
	static void m1() {
		System.out.println("Inside interface");
	}

	void m2() throws ArithmeticException; // declaration
}

interface Sample2 {
	static void m1() {
		System.out.println("Inside interface");
	}

	void m2(); // declaration
}

class A implements Sample, Sample2 {
	static void m1() {
		System.out.println("Inside A");
	}

	@Override
	public void m2() {
		System.out.println(1 / 0);

	}
}

class B implements Sample {
	static void m1() {
		System.out.println("Inside B");
	}

	@Override
	public void m2() {
		System.out.println("Inside B m2");

	}
}

//****************************************************************************

interface Animal {
	void eat();

	default void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class DefaultMethod implements Animal {
	public void eat() {
		System.out.println("Animal is eating");
	}

	public static void main(String args[]) {
		DefaultMethod dm = new DefaultMethod();
		dm.eat();
		dm.sleep();
	}
}

// ******************************MEMBER INNER CLASS***************************

class MemberOuter {
	private int salary = 4000;// private data member of outer class
	
	private int m1() {
		return 1;
	}

	class MemberInner {
		void get() {
			System.out.println("salary is " + salary);// access in inner class
			m1();
		}
	}

	public static void main(String args[]) {
		MemberOuter mo = new MemberOuter();
		MemberOuter.MemberInner mi = mo.new MemberInner();
		mi.get();
	}
}

// *****************Java Anonymous Inner Class Example Using abstract Class*************

abstract class AIExample {
	abstract void show();
}

class Test {
	public static void main(String args[]) {
		AIExample a = new AIExample() {
			void show() {
				System.out.println("Method of anonymous class");
			}
		};
		a.show();
	}
}

// *****************Java Anonymous Inner Class Example - Using Interface**********

interface AnonymousExmple {

	void show();
}

class Test2 {
	public static void main(String args[]) {
		AnonymousExmple ae = new AnonymousExmple() {
			public void show() {
				System.out.println("hello java ");
			}
		};
		ae.show();
	}
}

// **************************Java Local Inner Class Example************************

class LICExample {
	private int a = 40;

	void show() {
		class LICExample1 {
			void get() {
				System.out.println("value is " + a);
			}
		}
		LICExample1 l = new LICExample1();
		l.get();
	}

	public static void main(String args[]) {
		LICExample ll = new LICExample();
		ll.show();
	}
}

// ******************************STATIC NESTED CLASS**************************

class Simple {
	static int a = 700;

	static class SimpleInner {
		void show() {
			System.out.println("value is" + a);
		}
	}

	public static void main(String args[]) {
		Simple.SimpleInner s = new Simple.SimpleInner();
		s.show();
	}
}
