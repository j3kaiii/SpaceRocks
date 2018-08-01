package spacerocks;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
/**
 *
 * @author j3kaiii
 */
public class Laser extends BaseActor{

    public Laser(float x, float y, Stage s) {
        super(x, y, s);
        
        loadTextire("laser_1.png");
        
        addAction(Actions.delay(1));
        addAction(Actions.after(Actions.fadeOut(0.5f)));
        addAction(Actions.after(Actions.removeActor()));
        
        setSpeed(800);
        setMaxSpeed(800);
        setDeceleration(0);
    }
    
    public void act(float dt) {
        super.act(dt);
        applyPhysics(dt);
        //wrapAroundWorld();
    }

}
