package com.ageofwar.ageofwar.controller;

import com.ageofwar.ageofwar.common.AttackRequest;
import com.ageofwar.ageofwar.common.BattleResult;
import com.ageofwar.ageofwar.service.PlanAttackService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@Api(tags = "Battle")
public class BattleController {

    @Autowired
    private PlanAttackService planAttackService;

    /*
     * POST request controller for plan-attack API endpoint
     *
     */

    @PostMapping("/plan-attack")
    public Map<String, BattleResult> planAttack(@RequestBody AttackRequest request) {
        List<Integer> yourPlatoons = request.getYourPlatoons();
        List<Integer> opponentPlatoons = request.getOpponentPlatoons();
        return planAttackService.planAttack(yourPlatoons, opponentPlatoons);
    }
}