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
    if (direction.equals(Direction.NORTH)){
        this.direction = Direction.EAST;
    }else if(direction.equals(Direction.EAST)){
        this.direction = Direction.SOUTH;
    }else if(direction.equals(Direction.SOUTH)){
        this.direction = Direction.WEST;
    }else if(direction.equals(Direction.WEST)){
        this.direction = Direction.NORTH;
    }else{
        System.out.println("ARAH  SALAH");
    }
}
public void turnLeft(){
    if (direction.equals(Direction.NORTH)){
        this.direction = Direction.WEST;
    }else if(direction.equals(Direction.WEST)){
        this.direction = Direction.SOUTH;
    }else if(direction.equals(Direction.SOUTH)){
        this.direction = Direction.EAST;
    }else if(direction.equals(Direction.EAST)){
        this.direction = Direction.NORTH;
    }else{
        System.out.println("ARAH YANG ANDA MASUKAN SALAH!");
    }
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
        System.out.println("ARAH YANG ANDA MASUKAN SALAH!");
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
        System.out.println("ARAH YANG ANDA MASUKAN SALAH!");
    }
}
    public void move(String movement,Direction direction) {
        switch(movement) {
            case RIGHT :
               turnRight();
                break;
            case LEFT :
               turnLeft();
                break;
            case FORWARD :
            forward();
                break;
            case BACK :
               backward();
            default :
                System.out.println("Invalid move");
        }


    }

    public void run(){

        for (int i = 0; i < this.commands.length; i++) {
            move(String.valueOf(this.commands[i]),this.direction);
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