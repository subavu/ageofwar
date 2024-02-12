package com.ageofwar.ageofwar.service;

import com.ageofwar.ageofwar.common.BattleResult;
import org.springframework.stereotype.Service;

@Service
public class BattleService {

    /*
     * Implementation of the Battle result calculation logic
     */
    public BattleResult determineBattleResult(int yourSoldiers, int opponentSoldiers) {
        if (yourSoldiers > opponentSoldiers) {
            return BattleResult.YOU_WIN;
        } else if (yourSoldiers == opponentSoldiers) {
            return BattleResult.DRAW;
        } else {
            return BattleResult.YOU_LOSE;
        }
    }
}
