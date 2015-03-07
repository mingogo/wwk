package com.mteng.services;

import com.mteng.combatants.*;

/**
 * Created by mingogo on 3/6/15.
 */
public class GameService {

    Civilian c1 = new Civilian();
    Civilian c2 = new Civilian();
    Civilian c3 = new Civilian();
    Cupid cupid = new Cupid();
    God god = new God();
    Guard guard = new Guard();
    Werewolf wf1 = new Werewolf();
    Werewolf wf2 = new Werewolf();
    Werewolf wf3 = new Werewolf();
    Witch wt1 = new Witch();
    Hunter hunter = new Hunter();

    public void game(){
        /**
         * The game will be terminated if either of the following is true:
         * 1. All werewolf are dead. (Werewolf won.)
         * 2. combatantsCount() = werewolfCount. (Werewolf lost.)
         */
        cupid.shoot();
        while(!god.werewolfCount().equals(god.combatantCount()) && !god.werewolfCount().equals(0)){
            wf1.kill();
            wf2.kill();
            wf3.kill();
            wt1.useMedicine();
            guard.protect();
        }
    }


}
