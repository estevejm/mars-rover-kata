package com.dodevjutsu.kata.marsrover;

public class Direction {

    private final String representation;

    protected Direction(String representation) {
        this.representation = representation;
    }

    public Direction rotateLeft() {
        if (representation.equals("N")) {
            throw new RuntimeException();
        } else if (representation.equals("W")) {
            throw new RuntimeException();
        } else if (representation.equals("S")) {
            throw new RuntimeException();
        } else  {
            return Direction.facing("N");
        }
    }

    public Direction rotateRight() {
        if (representation.equals("N")) {
            throw new RuntimeException();
        } else if (representation.equals("W")) {
            throw new RuntimeException();
        } else if (representation.equals("S")) {
            throw new RuntimeException();
        } else {
            return Direction.facing("S");
        }
    }

    public static Direction facing(String representation) {
        if (representation.equals("N")) {
            return new North();
        } else if (representation.equals("W")) {
            return new West();
        } else if (representation.equals("S")) {
            return new South();
        }

        return new Direction(representation);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Direction direction = (Direction) o;

        return representation != null ? representation.equals(direction.representation) : direction.representation == null;

    }

    @Override
    public int hashCode() {
        return representation != null ? representation.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Direction{" +
                "representation=" + representation +
                '}';
    }
}
