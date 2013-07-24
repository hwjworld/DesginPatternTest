package defaultAdapter;

import java.awt.event.WindowEvent;

/**
 * 
 * 借助adapter,我的类只需要实现我想要的方法，而不用浪费代码实现其它接口
 * @author Administrator
 *
 */
public class WindowEventHandler extends WindowAdapter {
    public void windowClosed(WindowEvent e) {
        System.exit(0);
    }

}
