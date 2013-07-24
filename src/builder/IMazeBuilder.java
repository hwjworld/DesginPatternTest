package builder;

public interface IMazeBuilder {

    public void createRoadBlock();
    public void createWallBlock();
    public void createTreasureBlock();
    public void nextRow();
}
