package Entity;

import android.graphics.Point;
import android.util.Size;
import android.view.Display;

/**
 * Created by Wayha on 07.11.2017.
 */

public class DotEntity {
    private int x;// координата X
    private int y;// координата Y
    private int sizeX;
    private int sizeY;
    private String stateMove; // Last moving state up or down
    private String stateLife ; // Live or dead

    public  DotEntity()
    {
        this.stateLife="Live";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX ;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY ;
    }


    public String getStateMove() {
        return this.stateMove;
    }

    public void setStateMove(String state) {
        this.stateMove = state;
    }

    public String getStateLife() {
        return this.stateLife;
    }

    public void setStateLife(String state) {
        this.stateLife = state;
    }

    private Point getSize (Display display)
    {
        Point size = new Point();
        display.getSize(size);
        return size;
    }


    public void SetDotObj(Display display)
    {
        int proportion = 10;
        Point size = getSize(display);
        this. setSizeX(size.x/proportion);
        this. setSizeY(size.y/proportion);
        this. setX(size.x/10);
        this.setY(size.y/2-this.getSizeY()/2); // Center in screen
    }

    private void moveDotObjUp()
    {
        int step = 5;
        this.setX(this.getX()+step);
        this.setY(this.getY()+step);
        this.setStateMove("up");
    }

    private void moveDotObjDown()
    {
        int step = 5;
        this.setX(this.getX()+step);
        this.setY(this.getY()-step);
        this.setStateMove("down");
    }

    public void moveDotObj()
    {
        if((this.getStateMove()=="down") || (this.getStateMove()!=null))
            moveDotObjDown();
        else
            moveDotObjUp();
    }

}
