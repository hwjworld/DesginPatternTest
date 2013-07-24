package proxy.staticproxy;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloProxy implements IHello {

    private Logger logger = 
              Logger.getLogger(this.getClass().getName()); 
    private IHello helloObject; 

    public HelloProxy(IHello helloObject) { 
        this.helloObject = helloObject; 
    } 

    public void hello(String name) { 
        logger.log(Level.INFO, "hello method starts...."); 

        helloObject.hello(name); 

        logger.log(Level.INFO, "hello method ends...."); 
    } 
}
