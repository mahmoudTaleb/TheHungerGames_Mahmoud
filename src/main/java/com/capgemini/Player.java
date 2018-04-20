package com.capgemini;

public class Player {
    private int playerID;
    private int playerDistrictNo;

    public Player(int playerID, int playerDistrictNo) {
        this.playerID = playerID;
        this.playerDistrictNo = playerDistrictNo;
    }



    public Player() {
    }

    public void attack(boolean) {

    }

    public void fight(boolean) {

    }

    public void isAlive(boolean) {

    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getPlayerDistrictNo() {
        return playerDistrictNo;
    }

    public void setPlayerDistrictNo(int playerDistrictNo) {
        this.playerDistrictNo = playerDistrictNo;
    }
}
