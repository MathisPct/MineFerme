package org.polytech.model.legume.type;

import org.polytech.model.legume.LegumeModel;
import org.polytech.model.legume.state.type.State;
import org.polytech.model.legume.state.StateMachine;
import org.polytech.model.legume.state.StateType;
import org.polytech.model.legume.state.type.StateGraine;

import java.util.Map;

public class FleurJaune extends LegumeModel {
    public FleurJaune() {
        super();
        State initialState = new StateGraine(Map.of(StateType.GRAINE, 120L, StateType.BOURGON, 130L, StateType.FLEURIE, 120L, StateType.MATURE, 130L));
        this.stateMachine = new StateMachine(initialState);
    }

    @Override
    public TypeLegume getType() {
        return TypeLegume.FLEUR_JAUNE;
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
