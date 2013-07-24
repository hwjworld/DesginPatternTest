package defaultAdapter;

import java.awt.event.WindowEvent;
import java.util.EventListener;

public interface WindowListener extends EventListener{
    public void windowOpened(WindowEvent e);
    public void windowClosing(WindowEvent e);
    public void windowClosed(WindowEvent e);
    public void windowIconified(WindowEvent e);
    public void windowDeiconified(WindowEvent e);
    public void windowActivated(WindowEvent e);
    public void windowDecativated(WindowEvent e);
}
