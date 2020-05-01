package client.listener;
import lib.event.GameEvent;
import lib.event.JoinEvent;

public interface JoinEventListener extends GameEventListener<JoinEvent>{

    default boolean isApplicable(Class<? extends GameEvent> eventClass){
        return JoinEvent.class.equals(eventClass);
    }

}
