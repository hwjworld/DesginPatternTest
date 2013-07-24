package factoryMethod;

public class RTFDocument implements IDocument {

	public RTFDocument() {
		System.out.println("建立RTF文件");
	}

	public void open() {
		System.out.println("开启文件");
	}

	public void save() {
		System.out.println("储存文件");
	}

	public void close() {
		System.out.println("关闭文件");
	}

}
