package factoryMethod;

public abstract class AbstractEditor {
	private IDocument document;

	public abstract IDocument createDocument();

	public void newDocument() {
		document = createDocument();
		document.open();
	}

	public void saveDocument() {
		if (document != null)
			document.save();
	}

	public void closeDocument() {
		if (document != null)
			document.close();
	}
}
