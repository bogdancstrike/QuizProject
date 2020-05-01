package client.listener;

import lib.event.GameEvent;

public interface GameEventListener<EV extends GameEvent> {
    boolean isApplicable(Class<? extends GameEvent> event);

    void accept(EV event);
}
