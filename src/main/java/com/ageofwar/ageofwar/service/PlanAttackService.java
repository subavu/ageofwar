package com.ageofwar.ageofwar.service;

import com.ageofwar.ageofwar.common.BattleResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlanAttackService {

    @Autowired
    private BattleService battleService;

    /*
     * Method for implementing the plan attack functionality of AgeOfWar
     */
    public Map<String, BattleResult> planAttack(List<Integer> yourPlatoons, List<Integer> opponentPlatoons) {
        Map<String, BattleResult> results = new HashMap<>();

        for (int i = 0; i < yourPlatoons.size(); i++) {
            int yourPlatoon = yourPlatoons.get(i);
            int opponentPlatoon = opponentPlatoons.get(i);
            BattleResult result = battleService.determineBattleResult(yourPlatoon, opponentPlatoon);
            results.put("YourPlatoon" + (i + 1) + " vs OpponentPlatoon" + (i + 1), result);
        }

        return results;
    }
}
