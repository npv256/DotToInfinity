package Entity;

import android.graphics.Point;
import android.view.Display;

import java.util.Random;

/**
 * Created by Wayha on 09.11.2017.
 */

public class TextureEntity {
    private int x;// координата X
    private int y;// координата Y
    private int sizeX;
    private int sizeY;
    private int id=1;

    public TextureEntity()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }

    private Point getSize (Display display)
    {
        Point size = new Point();
        display.getSize(size);
        return size;
    }


    public void SetTextureObj(Display display)
    {
        int proportion = 20;
        Point size = getSize(display);
        this.setSizeX(size.x/proportion);
        this. setSizeY(size.y/proportion);
        Random random = new Random();
        this. setX(size.x);
        this.setY(random.nextInt(size.y-this.getSizeY()));
    }

    public void moveTextureObj()
    {
        int step = 5;
        this.setX(this.getX()+step);
    }
}
