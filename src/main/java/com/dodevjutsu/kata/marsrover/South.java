package com.dodevjutsu.kata.marsrover;

public class South extends Direction {
    protected South() {
        super("S");
    }

    @Override
    public Direction rotateRight() {
        return Direction.facing("W");
    }

    @Override
    public Direction rotateLeft() {
        return Direction.facing("E");
    }
}
