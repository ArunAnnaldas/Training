
public class Aggregation {

	public static void main(String[] args) {
		
		Student[] sobj = new Student[10];
		Address add;
		for(int i =0 ; i<10; i++) {
			add = new Address("parel", "addline2" +i, "400013"+i, "Mumbai", "Maharashtra");
			sobj[i] = new Student("arun" + i, add);
		}
		
		for(int j=0; sobj.length>j; j++) {
		}
		
		//enhanced for loop
		for(Student st : sobj) {
			System.out.println(st);
		}
	}
}

class Student {
	String name;
	Address address;// Adderess is a class

	Student() {
	}

	Student(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return this.name + "_" + this.address.toString();
	}
}
