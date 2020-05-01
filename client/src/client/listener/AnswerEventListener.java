package client.listener;

import lib.event.AnswerEvent;
import lib.event.GameEvent;

public interface AnswerEventListener extends GameEventListener<AnswerEvent> {

    default boolean isApplicable(Class<? extends GameEvent> eventClass){
        return AnswerEvent.class.equals(eventClass);
    }
}
