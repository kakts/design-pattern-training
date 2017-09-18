package ChainOfResponsibility;

public class NoSupport extends Support {
	public NoSupport(String name) {
		super(name);
	}
	
	protected boolean resolve(Trouble trouble) {
		// 常にfalseを返す この暮らすのインスタンスでは解決させない
		return false;
	}
}
