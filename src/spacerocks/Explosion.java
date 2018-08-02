package spacerocks;

import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 *
 * @author j3kaiii
 */
public class Explosion extends BaseActor{

    public Explosion(float x, float y, Stage s) {
        super(x, y, s);
        
        loadAnimationFromSheet("explosion.png", 6, 6, 0.03f, true);
    }
    
    public void act(float dt) {
        super.act(dt);
        
        if (isAnimationFinished())
            remove();
    }

}
