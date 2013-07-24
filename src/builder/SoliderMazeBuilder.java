package builder;

public class SoliderMazeBuilder implements IMazeBuilder {
	public void createWallBlock() {
		System.out.print("█");
	}

	public void createRoadBlock() {
		System.out.print("　");
	}

	public void createTreasureBlock() {
		System.out.print("$ ");
	}

	public void nextRow() {
		System.out.println();
	}
}
