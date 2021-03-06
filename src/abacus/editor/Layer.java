package abacus.editor;

public class Layer {

    private Tile[] tiles;
    private int width, height;
    
    public Layer(int w, int h) {
        width = w;
        height = h;
        tiles = new Tile[width * height];
        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = new Tile();
        }
    }
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public boolean inBounds(int x, int y) {
        return x >= 0 && x < width && y >= 0 && y < height;
    }
    
    public Tile getTile(int x, int y) {
        if (inBounds(x, y)) {
            return tiles[x + y * width];
        }
        
        return null;
    }
    
//    public void setTile(int x, int y, EditorTile tile) {
//        if (inBounds(x, y)) {
//            tiles[x + y * width] = tile;
//        }
//    }
    
}
