package gaspardev.model;

public class Cell {

    private boolean isColapsed = false;
    private Tile colapsedTile;
    private Cell[] neighbors = new Cell[4];
    private Tile[] entropy;

    public Cell() {

    }

    public Cell(Tile[] entropy) {
        this.entropy = entropy;
    }

    public boolean isColapsed() {
        return this.isColapsed;
    }

    public void setColapsed(boolean isColapsed) {
        this.isColapsed = isColapsed;
    }

    public void colapseTile(Tile colapsTile) {
        this.colapsedTile = colapsTile;
        this.isColapsed = true;
    }

    public Tile getColapsedTile() {
        return this.colapsedTile;
    }

    public Cell[] getNeighbors() {
        return this.neighbors;
    }

    public void setNeighbors(Cell[] neighbors) {
        try {
            if (neighbors.length == 4) {
                this.neighbors = neighbors;
            } else {
                throw new Exception("La lista de vecinos debe ser de 4 elementos");
            }
        } catch (Exception e) {
            System.out.println("Error al cargar los vecinos: " + e.getMessage());
        }
    }

    public Tile[] getEntropy() {
        return this.entropy;
    }

    public void setEntropy(Tile[] entropy) {
        this.entropy = entropy;
    }

    @Override
    public String toString() {
        return "{" +
                " isColapsed='" + isColapsed() + "'" +
                ", colapsedTile='" + getColapsedTile() != null ? getColapsedTile().getImg()
                        : "null" + "'" +
                                ", neighbors='" + getNeighbors() + "'" +
                                ", entropy='" + getEntropy() + "'" +
                                "}";
    }

}
