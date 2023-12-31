package com.codecool.board;

import com.codecool.ship.Ship;
import com.codecool.square.Square;
import com.codecool.square.SquareStatus;

import java.util.List;

public class Board {

    private int size = 10;
    public Square[][] ocean;


    public Board() {
        ocean = new Square[size][size];
        initializeOcean();
    }

    public boolean isPlacementOk(Coordinates coordinates) {
        return (ocean[coordinates.getX()][coordinates.getY()].getSquareStatus().equals(SquareStatus.EMPTY));
    }

    public Square[][] getSquares() {
        return this.ocean;
    }

    private void initializeOcean() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                Coordinates coordinates = new Coordinates(row, col);
                ocean[row][col] = new Square(SquareStatus.EMPTY, coordinates);
            }
        }
    }

    public Square[][] getOcean() {
        return ocean;
    }

    public Square getSquareByCoordinates(Coordinates coordinates) {
        return this.ocean[coordinates.getX()][coordinates.getY()];
    }
}
