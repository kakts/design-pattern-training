package Builder;

public class Director {
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("朝から昼にかけて");
		builder.makeItems(new String[] {
			"Good morning",
			"Hello"
		});
		builder.makeString("夜に");
		builder.makeItems(new String[] {
			"こんばんは",
			"おやすみ",
			"さようなら"
		});
		builder.close();
	}
}
