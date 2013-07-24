package interpreter;

//<program> ::= PROGRAM <command list> 
public class ProgramNode implements INode {

    private INode commandListNode; 
    public void parse(Context context) { 
        context.skipToken("PROGRAM"); 
        commandListNode = new CommandListNode(); 
        commandListNode.parse(context); 
    } 

    public void execute() {
        commandListNode.execute();
    }
    
    public String toString() { 
        return "[PROGRAM " + commandListNode + "]"; 
    } 
}
