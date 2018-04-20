package com.capgemini;

// class variables

public class Player {
    private int playerID;
    private int playerDistrictNo;
    private String gender;
    private int playerAlive;

// constructors for the variables.

    public Player(int playerAlive) {
        this.playerAlive = playerAlive;
    }

    public Player(int playerID, int playerDistrictNo, String gender) {
        this.playerID = playerID;
        this.playerDistrictNo = playerDistrictNo;
        this.gender = gender;

        playerAlive = Math.min(playerAlive + 1, 24);
        System.out.println(playerAlive);
    }

// below are setters and getters for objects within the class.

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
