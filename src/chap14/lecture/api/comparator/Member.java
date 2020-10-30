package chap14.lecture.api.comparator;

public class Member {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

	public Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
