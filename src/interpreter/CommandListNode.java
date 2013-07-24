package interpreter;

import java.util.Iterator;
import java.util.Vector;

//<command list> ::= <command>* END 
public class CommandListNode implements INode {

	private Vector list = new Vector();

	public void parse(Context context) {
		while (true) {
			if (context.currentToken() == null) {
				System.err.println("Missing 'END'");
				break;
			} else if (context.currentToken().equals("END")) {
				context.skipToken("END");
				break;
			} else {
				INode commandNode = new CommandNode();
				commandNode.parse(context);
				list.add(commandNode);
			}
		}
	}

    public void execute() {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((CommandNode)it.next()).execute();
        }
    }
    
	public String toString() {
		return "" + list;
	}
}
