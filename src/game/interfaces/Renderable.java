package game.interfaces;

import javafx.scene.canvas.GraphicsContext;

/**
 * Interface for all objects that can be rendered in a game.
 */
public interface Renderable {

    /**
     * Renders object to given context.
     * @param gc {@link GraphicsContext} object.
     */
    void render(GraphicsContext gc);

}
