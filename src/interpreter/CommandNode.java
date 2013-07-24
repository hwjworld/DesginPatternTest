package interpreter;

//<command> ::= <repeat command> | <primitive command> 
public class CommandNode implements INode {

	private INode node;

	public void parse(Context context) {
		if (context.currentToken().equals("REPEAT")) {
			node = new RepeatCommandNode();
			node.parse(context);
		} else {
			node = new PrimitiveCommandNode();
			node.parse(context);
		}
	}

    public void execute() {
        node.execute();
    }

	public String toString() {
		return node.toString();
	}
}
