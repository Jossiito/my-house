/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square campoverde;
    private Person persona1;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();
        
        campoverde = new Square();
        campoverde.changeColor("green");
        campoverde.moveVertical(140);
        campoverde.moveHorizontal(-400);
        campoverde.changeSize(5000);
        campoverde.makeVisible();
        
        sun = new Circle();
        sun.changeColor("yellow");
        sun.changeSize(80);
        sun.moveHorizontal(100);
        sun.moveVertical(80);
        sun.makeVisible();
        sun.slowMoveVertical(-140);
             
    }
    /**
     * El sol bajar? imitando un atardecer
     */
    public void atardecer()
    {
        sun.slowMoveVertical(320);
        
        persona1 = new Person();
        persona1.moveHorizontal(-250);
        persona1.moveVertical(50);
        persona1.makeVisible();
        persona1.slowMoveHorizontal(175);
    }
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
