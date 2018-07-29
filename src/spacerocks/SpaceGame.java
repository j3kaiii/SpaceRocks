package spacerocks;

/**
 *
 * @author j3kaiii
 */
public class SpaceGame extends BaseGame{

    @Override
    public void create() {
        super.create();
        setActiveScreen(new LevelScreen());
    }

}
