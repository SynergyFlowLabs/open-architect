package com.planner5d.library.model.item.helper;

import android.graphics.PointF;
import android.graphics.RectF;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemFloor;
import com.planner5d.library.model.item.ItemProject;
import com.planner5d.library.model.item.ItemWalls;
import com.planner5d.library.widget.editor.editor2d.drawable.w;

/* JADX INFO: loaded from: classes7.dex */
public class ItemProjectPosition {
    public static PointF getCenter(Item[] itemArr, Boolean bool, RectF rectF) {
        w drawableInstances;
        RectF rectF2 = new RectF();
        RectF rectF3 = null;
        for (Item item : itemArr) {
            if ((bool == null || ((bool.booleanValue() || !(item instanceof ItemWalls)) && (!bool.booleanValue() || (item instanceof ItemWalls)))) && (drawableInstances = item.getDrawableInstances()) != null) {
                drawableInstances.f255098a[0].d(rectF2);
                if (rectF3 == null) {
                    rectF3 = new RectF(rectF2);
                } else {
                    rectF3.union(rectF2);
                }
            }
        }
        if (rectF3 == null) {
            return null;
        }
        PointF pointF = new PointF(rectF3.centerX(), rectF3.centerY());
        if (rectF == null || rectF.contains(pointF.x, pointF.y)) {
            return pointF;
        }
        return null;
    }

    public static PointF getDefault(ItemProject itemProject) {
        ItemFloor activeFloor = itemProject == null ? null : itemProject.getActiveFloor();
        if (activeFloor == null) {
            return new PointF(4000.0f, 4000.0f);
        }
        PointF size = itemProject.getEarth().getSize();
        RectF rectF = new RectF(0.0f, 0.0f, size.x, size.y);
        Item[] children = activeFloor.getChildren();
        PointF center = getCenter(children, Boolean.TRUE, rectF);
        if (center != null) {
            return center;
        }
        PointF center2 = getCenter(children, Boolean.FALSE, rectF);
        if (center2 == null) {
            center2 = new PointF(rectF.centerX(), rectF.centerY());
        }
        return center2;
    }
}
