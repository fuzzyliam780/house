
/**
 * Write a description of class myPicutre here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class myPicutre
{
    private Square wall;
    private Square wall2;
    private Square door;
    private Square door2;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle knob;
    private boolean drawn;

    /**
     * Constructor for objects of class myPicutre
     */
    public myPicutre()
    {
        wall = new Square();
        wall2 = new Square();
        door = new Square();
        door2 = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        knob = new Circle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.changeColor("red");
            wall.makeVisible();
            
            wall2.moveHorizontal(-20);
            wall2.moveVertical(20);
            wall2.changeSize(120);
            wall2.changeColor("red");
            wall2.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
            
            door.changeColor("black");
            door.moveHorizontal(-80);
            door.moveVertical(40);
            door.changeSize(40);
            door.makeVisible();
            
            door2.changeColor("black");
            door2.moveHorizontal(-80);
            door2.moveVertical(80);
            door2.changeSize(40);
            door2.makeVisible();
    
            roof.changeSize(60, 260);
            roof.moveHorizontal(80);
            roof.moveVertical(-60);
            roof.makeVisible();
            roof.changeColor("blue");
    
            sun.changeColor("yellow");
            sun.moveHorizontal(-100);
            sun.moveVertical(-60);
            sun.changeSize(40);
            sun.makeVisible();
    
            knob.changeColor("yellow");
            knob.moveHorizontal(-80);
            knob.moveVertical(-60);
            knob.changeSize(2);
            knob.makeVisible();
            drawn = true;
        }
    }
}
