package chap15.lecture.textbook.s150401;

public class Student {
	public int sna;
	public String name;

	public Student(int sna, String name) {
		this.sna = sna;
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return (sna == student.sna) && (name.contentEquals(student.name));
		} else {
			return false;
		}
	}

	public int hashCode() {
		return sna + name.hashCode();
	}
}
