package ru.pelmegov.tilebasedgame.states;

import ru.pelmegov.tilebasedgame.Game;
import ru.pelmegov.tilebasedgame.entities.creatures.Player;
import ru.pelmegov.tilebasedgame.gfx.Assets;
import ru.pelmegov.tilebasedgame.worlds.World;

import java.awt.*;

/**
 * @author modkomi
 * @since 09.06.16
 */
public class GameState extends State {

    private Player player;
    private World world;

    public GameState(Game game) {
        super(game);
        player = new Player(game, 100, 100);
        world = new World("resources/worlds/world1.txt");
    }

    @Override
    public void tick() {
        world.tick();
        player.tick();
    }

    @Override
    public void render(Graphics g) {
        world.render(g);
        player.render(g);
    }
}
