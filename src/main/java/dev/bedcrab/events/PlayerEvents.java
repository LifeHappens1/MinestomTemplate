package dev.bedcrab.events;

import dev.bedcrab.server.MinestomServer;
import net.minestom.server.coordinate.Pos;
import net.minestom.server.entity.Player;
import net.minestom.server.event.player.PlayerLoginEvent;

public class PlayerEvents {
    /**
     * Called when a player joins
     */
    public static void onJoin(PlayerLoginEvent event) {
        final Player player = event.getPlayer();
        event.setSpawningInstance(MinestomServer.instanceContainer);

        player.setRespawnPoint(new Pos(7.5, 69, 8.5));
    }
}