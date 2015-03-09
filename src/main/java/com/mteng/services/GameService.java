package com.mteng.services;

import com.mteng.combatants.*;

/**
 * Created by mingogo on 3/6/15.
 */
public class GameService {

    public static void main(String argv[]) {
        GameService gs = new GameService();
        gs.game();
    }

    Civilian c1 = new CivilianImpl();
    Civilian c2 = new CivilianImpl();
    Civilian c3 = new CivilianImpl();
    Cupid cupid = new Cupid();
    God god = new God();
    Guard guard = new Guard();
    Werewolf wf1 = new Werewolf();
    Werewolf wf2 = new Werewolf();
    Werewolf wf3 = new Werewolf();
    Witch wt1 = new Witch();
    Hunter hunter = new Hunter();

    public void game() {
        god.setCombatantCount(11);
        god.setWerewolfCount(3);
        /**
         * The game will be terminated if either of the following is true:
         * 1. All werewolf are dead. (Werewolf won.)
         * 2. combatantsCount() = werewolfCount. (Werewolf lost.)
         */
        cupid.shoot();
        Integer count = god.getWerewolfCount();

        while (!god.getCombatantCount().equals(god.getWerewolfCount()) && !god.getWerewolfCount().equals(0)) {
            c1.vote();
            wf1.kill();
            wf2.kill();
            wf3.kill();
            wt1.useMedicine();
            guard.protect();
            System.out.println("In the game");
            god.setWerewolfCount(count--);
        }
    }
}
