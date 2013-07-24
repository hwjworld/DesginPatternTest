package strategy;

public class Main {

	public static void main(String[] args) {
		String linuxText = "This is a test text!!@n Oh! Line Return!!@n";
		String windowsText = "This is a test text!!@r@n Oh! Line Return@r@n";

		// load file, suppose it's Linux's text file
		// take the WindowsStrategy
		// I want to change it to Windows' text file
		TextCharChange.replace(new WindowsStrategy(linuxText));

		// such-and-such operation.....
		System.out.println();

		// load file, suppose it's Windows' text file
		// take the LinuxStrategy
		// I want to change it to Linux's text file
		TextCharChange.replace(new LinuxStrategy(windowsText));
	}
}
