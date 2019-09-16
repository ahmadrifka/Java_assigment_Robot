package com.enigma.model;

import java.util.Arrays;

public class Robot {
    private Integer postX;
    private Integer postY;
    private final String RIGHT = "R";
    private final String LEFT = "L";
    private final String FORWARD = "F";
    private final String BACK = "B";
    private  char [] commands ;
    Direction direction;

    public Robot(Integer x, Integer y, Direction direction) {
        this.postX = x;
        this.postY = y;
        this.direction = direction;
    }
  public void comand(String commands){
      for (int i = 0; i < commands.length(); i++) {
          this.commands = commands.toUpperCase().toCharArray();

      }
  }
public void turnRight(){
    this.direction = this.direction.turnRight();
}
public void turnLeft(){
    this.direction = this.direction.turnLeft();
}
public void forward(){
    if (direction.equals(Direction.NORTH)){
        this.postY++;
        this.direction = Direction.NORTH;
    }else if(direction.equals(Direction.WEST)){
        this.postX--;
        this.direction = Direction.WEST;
    }else if(direction.equals(Direction.SOUTH)) {
        this.postY--;
        this.direction = Direction.SOUTH;
    }else if(direction.equals(Direction.EAST)){
        this.postX++;
        this.direction = Direction.EAST;
    }else{
        System.out.println("ARAH  SALAH");
    }
}
public void backward(){
    if (direction.equals( Direction.NORTH)){
        this.postY--;
        this.direction = Direction.NORTH;
    }else if(direction.equals(Direction.WEST)){
        this.postX++;
        this.direction = Direction.WEST;
    }else if(direction.equals(Direction.SOUTH)){
        this.postY++;
        this.direction = Direction.SOUTH;
    }else if(direction.equals(Direction.EAST)){
        this.postX--;
        this.direction = Direction.EAST;
    }else{
        System.out.println("ARAH  SALAH");

    }
}
    public void move(String movement) {
        if (movement.equals(RIGHT)) {
           turnRight();
        } else if (movement.equals(LEFT)) {
          turnLeft();
        } else if (movement.equals(FORWARD)) {
            forward();
        } else if (movement.equals(BACK)) {
            backward();
        }else {
            System.out.println("Invalid Move "+ movement +"");
            System.exit(0);
        }

    }

    public void run(){

        for (int i = 0; i < this.commands.length; i++) {
            move(String.valueOf(this.commands[i]));
            System.out.println(this.commands[i] + getPotition()+this.direction);

        }
    }
    public String getPotition(){
        return  "(" + this.postX + "," + this.postY+ ")";
    }

    public String print() {
        return "Car{" +
                "postX=" + postX +
                ", postY=" + postY +

                ", commands=" + Arrays.toString(commands) +
                ", direction=" + direction +
                '}';
    }
}