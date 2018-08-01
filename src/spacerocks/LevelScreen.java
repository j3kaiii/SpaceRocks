package spacerocks;

import com.badlogic.gdx.Input.Keys;

/**
 *
 * @author j3kaiii
 */
public class LevelScreen extends BaseScreen{
    private Spaceship spaceship;

    @Override
    public void initialize() {
        BaseActor space = new BaseActor(0, 0, mainStage);
        space.loadTextire("space.png");
        space.setSize(800, 600);
        BaseActor.setWorldBounds(space);
        
        spaceship = new Spaceship(0, 0, mainStage);
    }

    @Override
    public void update(float dt) {
    }
    
    public boolean keyDown(int keycode) {
        if (keycode == Keys.X)
            spaceship.warp();
        
        if (keycode == Keys.SPACE)
            spaceship.shoot();
        
        return false;
    }

}
