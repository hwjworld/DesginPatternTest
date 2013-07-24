package builder;

/**
 * 简单来说，建筑者模式适用的场合，在于使得您可以依赖抽象的建筑蓝图，而实际建造时可以使用不同的实例，这是其之所以命为Builder的原因。
 * 
 * 您想要建立一个迷宫产生程式，迷宫使用二维阵列来定义，0表示道路，1表示墙，2表示宝物，根据所定义的二维迷宫阵列，您想要程式自动产生各种不同材质的迷宫，
 * 例如砖墙迷宫，钻石迷宫等等。
 * 
 * 您可以在程式中定义两个角色，一个是指导迷宫建立的Director角色，一个是按照指导者指示建立迷宫的Builder角色，
 * Director根据定义的迷宫阵列来指导Builder，只要更换Builder，就可以完成不同材质的迷宫。
 * 
 * @author Administrator
 * 
 */
public class Main {
	public static void main(String[] args) {
		int[][] maze = { { 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 0, 2, 1 },
				{ 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 2, 1, 0, 1, 1 },
				{ 1, 1, 0, 1, 0, 1, 1 }, { 1, 0, 0, 2, 0, 0, 1 },
				{ 1, 1, 1, 1, 1, 1, 1 } };

		MazeDirector mazeDirector = new MazeDirector();
		mazeDirector.setMaze(maze);

		System.out.println("Build SolidMaze....");
		mazeDirector.setMazeBuilder(new SoliderMazeBuilder());
		mazeDirector.buildMaze();

		System.out.println("Build DiamondMaze....");

		mazeDirector.setMazeBuilder(new DiamondMazeBuilder());
		mazeDirector.buildMaze();
	}

}
