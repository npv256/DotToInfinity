package BLL;

import android.content.Context;
import android.graphics.Point;
import android.util.Size;
import android.view.Display;
import android.view.WindowManager;

import java.lang.reflect.Array;

import Entity.DotEntity;
import Entity.TextureEntity;

/**
 * Created by Wayha on 07.11.2017.
 */

public class BLL
{
    public BLL(Display display)
    {
        DotEntity DotObj = new DotEntity();
        DotObj.SetDotObj(display);
        TextureEntity TextureObj = new TextureEntity();
        TextureObj.SetTextureObj(display);

        while(1!=2)
        {

        }
    }





}
