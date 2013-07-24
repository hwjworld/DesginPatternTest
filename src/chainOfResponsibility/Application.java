package chainOfResponsibility;

import java.io.IOException;

/**
 * 类似if,,,else if,,,else
 * 类似try..catch(e1)..catch(e2)..
 * 总是有人处理，处理不了就扔给后面
 * @author Administrator
 *
 */
public class Application {

	public static void main(String[] args) throws IOException {
		Handler numberHandler = new NumberHandler();
		Handler characterHandler = new CharacterHandler();
		Handler symbolHandler = new SymbolHandler();

		numberHandler.setSuccessor(characterHandler);
		characterHandler.setSuccessor(symbolHandler);

		System.out.print("Press any key then return: ");
		char c = (char) System.in.read();
		numberHandler.handleRequest(c);
	}
}
