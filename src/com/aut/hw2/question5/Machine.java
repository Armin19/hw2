package com.aut.hw2.question5;


public class Machine {
    private static int presentSpeed;
    private int presentDirection;
    private String ownerMachine;
    private String machineNumber;
    private static int presentSpeed2;
    private static int maxSpeed = Math.max(presentSpeed,presentSpeed2);
    public Machine machine1(){
        this.presentSpeed = presentSpeed;
        this.ownerMachine = ownerMachine;
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Machine machine2(String ownerMachine1){
        this.ownerMachine = ownerMachine1;
        return null;
    }
    private void turn1(int degree){

    }
    private void turn2{

    }
    public static void main(String[] args) {

    }
}
