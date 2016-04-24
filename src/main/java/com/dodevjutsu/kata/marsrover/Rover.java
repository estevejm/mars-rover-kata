package com.dodevjutsu.kata.marsrover;

public class Rover {
    private Vector vector;
    private Direction direction;
    private Point point;

    public Rover(int x, int y, String direction) {
        this.point = new Point(x, y);
        this.direction = Direction.facing(direction);
        this.vector = new Vector(this.point, this.direction);
    }

    public void receive(String sequence) {
        for (int i = 0; i < sequence.length(); i++) {
            String command = parseCommand(sequence, i);
            execute(command);
        }
    }

    private String parseCommand(String sequence, int i) {
        return sequence.substring(i, i + 1);
    }

    private void execute(String command) {
        if (command.equals("l")) {
            this.vector = vector.rotateLeft();
            this.direction = direction.rotateLeft();
        } else if (command.equals("r")) {
            this.vector = vector.rotateRight();
            this.direction = direction.rotateRight();
        } else if (command.equals("f")) {
            this.vector = vector.moveForward();
            this.point = this.direction.moveForward(this.point);
        } else if (command.equals("b")) {
            this.vector = vector.moveBackwards();
            this.point = this.direction.moveBackwards(this.point);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        return vector != null ? vector.equals(rover.vector) : rover.vector == null;

    }

    @Override
    public int hashCode() {
        return vector != null ? vector.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Rover{" +
                "vector=" + vector +
                '}';
    }
}
