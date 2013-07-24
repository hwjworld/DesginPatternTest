package interpreter;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("e:/pr.txt"));
			String text;
			while ((text = reader.readLine()) != null) {
//				System.out.println("text = \"" + text + "\"");
				INode node = new ProgramNode();
				node.parse(new Context(text));
//				System.out.println("node = " + node);
				node.execute();
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Usage: java Main yourprogram.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
