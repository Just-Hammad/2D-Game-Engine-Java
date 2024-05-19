
public class BasicSolidTile extends BasicTile {

    public BasicSolidTile(int id, int x, int y, long tileColour, int levelColour) {
        super(id, x, y, tileColour, levelColour);
        this.solid = true;
    }

    public void render(Screen screen, Level level, int x, int y) {
        screen.render(x, y, tileId, tileColour, 0x00, 1);
    }
}
