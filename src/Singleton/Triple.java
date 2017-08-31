package Singleton;

public class Triple {
	private static Triple[] singletons = new Triple[] {
			new Triple(0),
			new Triple(1),
			new Triple(2)
	};
	private int id;
	private Triple(int id) {
		this.id = id;
		System.out.println("instance create");
	}
	
	public static Triple getInstance(int id) {
		return singletons[id];
	}
	
	public String toString() {
		return "[Triple id=" + id + "]";
	}
}
