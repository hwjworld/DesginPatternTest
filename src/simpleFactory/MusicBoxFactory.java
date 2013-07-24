package simpleFactory;

public class MusicBoxFactory {
	public static IMusicBox createMusicBox(String name)
			throws InstantiationException, IllegalAccessException,
			ClassNotFoundException {
		// 这边使用的是Java的Reflection机制来产生实例
		// 不过客户端不用管啦
		// 以后就算改变了这边的程式，客户端程式是不用更改的
		return (IMusicBox) Class.forName(name).newInstance();
	}

}
