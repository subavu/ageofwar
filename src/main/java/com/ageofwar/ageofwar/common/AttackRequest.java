package com.ageofwar.ageofwar.common;

import java.util.List;

public class AttackRequest {
    private List<Integer> yourPlatoons;
    private List<Integer> opponentPlatoons;

    public List<Integer> getYourPlatoons() {
        return yourPlatoons;
    }

    public void setYourPlatoons(List<Integer> yourPlatoons) {
        this.yourPlatoons = yourPlatoons;
    }

    public List<Integer> getOpponentPlatoons() {
        return opponentPlatoons;
    }

    public void setOpponentPlatoons(List<Integer> opponentPlatoons) {
        this.opponentPlatoons = opponentPlatoons;
    }
}