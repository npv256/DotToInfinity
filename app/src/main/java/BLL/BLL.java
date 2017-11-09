package BLL;

import android.content.Context;
import android.graphics.Point;
import android.util.Size;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import Entity.DotEntity;
import Entity.TextureEntity;

public class BLL
{
    private DotEntity DotObj = new DotEntity();
    private ArrayList<TextureEntity> ArrTextureObjs = new ArrayList<TextureEntity>();
//    private TextureEntity TextureObj = new TextureEntity();
    private Display display;
    public BLL(Display display)
    {
          this.display=display;
          DotObj.SetDotObj(display);
//        TextureObj.SetTextureObj(display);
    }

    public void startGame()
    {
        int id=0;
        while (this.DotObj.getStateLife()=="Live")
        {
             if(ArrTextureObjs.isEmpty())
             {
                 id++;
                 TextureEntity TextureObj = new TextureEntity(id);
                 TextureObj.SetTextureObj(display);
                 ArrTextureObjs.add(TextureObj);
             }

            for (TextureEntity obj: ArrTextureObjs)
            {

             if(obj.getX()<=0)
             {
                 id++;
                 TextureEntity TextureObj = new TextureEntity(id);
                 TextureObj.SetTextureObj(display);
                 ArrTextureObjs.add(TextureObj);
                 ArrTextureObjs.remove(obj);
             }

             if(ArrTextureObjs.get(ArrTextureObjs.size()).getX()<ArrTextureObjs.get(ArrTextureObjs.size()).getSizeX()/2) // I know what is very bad...
             {
                 id++;
                 TextureEntity TextureObj = new TextureEntity(id);
                 TextureObj.SetTextureObj(display);
                 ArrTextureObjs.add(TextureObj);
             }
             obj.moveTextureObj();
            }

        }

        if(this.DotObj.getStateLife()=="Dead")
        {

        }
    }





}
