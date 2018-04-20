package com.capgemini;

import java.util.List;

public class Player {
    private int playerID;
    private int playerDistrictNo;
    private String gender;

    public Player(int playerID, int playerDistrictNo, String gender) {
        this.playerID = playerID;
        this.playerDistrictNo = playerDistrictNo;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
