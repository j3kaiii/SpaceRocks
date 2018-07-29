package spacerocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Game;
/**
 *
 * @author j3kaiii
 */
public abstract class BaseGame extends Game{

    private static BaseGame game;
    
    public void create() {
        InputMultiplexer im = new InputMultiplexer();
        Gdx.input.setInputProcessor(im);
    }
    
    public BaseGame() {
        game = this;
    }
    
    public static void setActiveScreen(BaseScreen s) {
        game.setScreen(s);
    }

}
