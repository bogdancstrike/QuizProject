package lib.event;

import lib.model.Player;

public class JoinEvent implements GameEvent {
    private final String gameId;
    private final Player player; //player-ul care a intrat in joc

    public JoinEvent(String gameId, Player player) {
        this.gameId = gameId;
        this.player = player;
    }

    public String getGameId() {
        return gameId;
    }

    public Player getPlayer() {
        return player;
    }

}
