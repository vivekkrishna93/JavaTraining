package Thread_sync;

public class detail {
	 int id;
	 String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "detail [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
}
