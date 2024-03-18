package gaspardev.controller;

import gaspardev.model.Grid;
import gaspardev.model.Tile;

import java.io.File;

public class WaveFuntionColapse {

    private Grid grid;
    File tilesDir = new File("src/main/resources/Tiles");
    File[] tilesFiles = tilesDir.listFiles();
    private Tile[] tiles;
    private short[] conexcions[];

    public WaveFuntionColapse() {
        grid = new Grid();
        loadManualTiles();
    }

    public WaveFuntionColapse(Grid grid) {
        this.grid = grid;
        loadTiles();
    }

    public int getNumberOfTiles() {
        return this.tilesFiles.length;
    }

    public void setNewPath(String path) {
        this.tilesDir = new File(path);
    }

    public Tile getTile(int index) {
        return this.tiles[index];
    }

    private void loadTiles() {

        loadTilesRotations(this.conexcions);

        this.tiles = new Tile[tilesFiles.length * 4 - 3];
        // Obligatoriamente debe haber un tile Blank.png
        for (int i = 0; i < tilesFiles.length; i++) {
            if (tilesFiles[i].getName().equals("BLANK.png")) {
                this.tiles[i] = new Tile(0, this.tilesDir + "/" + "BLANK.png", new short[] { 0, 0, 0, 0 },
                        (short) 0);
            } else {
                for (int j = 0; j < 4; j++) {
                    this.tiles[i] = new Tile(j, this.tilesDir + "/" + tilesFiles[i].getName(), this.conexcions[i],
                            (short) 0);
                }
            }
        }

    }

    public void loadManualTiles(Tile[] dataTiles) {
        this.tiles = dataTiles;
    }

    private void loadManualTiles() {
        this.tiles = new Tile[6];
        this.tiles[0] = new Tile(0, "src/main/resources/Tiles/BLANK.png", new short[] { 0, 0, 0, 0 }, (short) 0);
        this.tiles[1] = new Tile(0, "src/main/resources/Tiles/Tiles[0].png", new short[] { 1, 1, 1, 1 }, (short) 0);
        this.tiles[2] = new Tile(0, "src/main/resources/Tiles/Tiles[1].png", (short) 0);
        this.tiles[3] = new Tile(1, "src/main/resources/Tiles/Tiles[1].png", (short) 0);
        this.tiles[4] = new Tile(2, "src/main/resources/Tiles/Tiles[1].png", (short) 0);
        this.tiles[5] = new Tile(3, "src/main/resources/Tiles/Tiles[1].png", (short) 0);
    }

    public void loadTilesRotations(short[] data[]) {
        this.conexcions = data;
    }

    public void showTiles() {
        for (int i = 0; i < tiles.length; i++) {
            System.out.println(tiles[i].getImg() + " " + tiles[i].getRotation());
        }
    }

    public void showTilesFiles() {
        for (File f : this.tilesFiles) {
            System.out.println(f.getName());
        }
    }

    public Grid getGrid() {
        return grid;
    }

}