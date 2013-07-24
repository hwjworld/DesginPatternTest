package command;

import java.util.HashMap;
import java.util.Map;

public class Invoker {

    private Map commands;
    
    public Invoker() {
        commands = new HashMap();
    }
    
    public void addCommand(String commName,
                           ICommand command) {
        commands.put(commName, command);
    }
    
    public void request(String commName) {
        ICommand command = (ICommand) commands.get(commName);
        command.execute();
    }
}
