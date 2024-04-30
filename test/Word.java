package test;

import java.util.Arrays;
import java.util.Objects;

public class Word {
    private final Tile[] tiles;
    private final int col;
    private final int row;
    private final boolean vertical;

    public Word(Tile[] tiles, int row, int col, boolean vertical) {
        this.tiles = tiles;
        this.col = col;
        this.row = row;
        this.vertical = vertical;
    }

    public Tile[] getTiles() {
        return tiles;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public boolean isVertical() {
        return vertical;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Word check = (Word) obj;
        return Arrays.equals(check.tiles, tiles) && row == check.row && col == check.col && vertical == check.vertical;
    }
    // public boolean equals(Object o) {
    // if (this == o)
    // return true;
    // if (o == null || getClass() != o.getClass())
    // return false;
    // Word word = (Word) o;
    // return col == word.col && row == word.row && vertical == word.vertical &&
    // Arrays.equals(tiles, word.tiles);
    // }

    // public int hashCode() {
    // int result = Objects.hash(col, row, vertical);
    // result = 31 * result + Arrays.hashCode(tiles);
    // return result;
    // }
}
