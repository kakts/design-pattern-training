package Factory;

public abstract class Factory {
	public static Factory getFactory(String classname) {
		Factory factory = null;
		try {
			// 指定したクラス名のクラスをforNameで動的に読み込む。
			// newInsctanceメソッドでインスタンスを作成
			factory = (Factory)Class.forName(classname).newInstance();
		} catch (ClassNotFoundException e) {
			System.err.println("クラス" + classname + " が見つかりません");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return factory;
	}
	
	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);
}
