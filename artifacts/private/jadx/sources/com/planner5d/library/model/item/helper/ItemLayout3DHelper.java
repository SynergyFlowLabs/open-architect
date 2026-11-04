package com.planner5d.library.model.item.helper;

import com.planner5d.library.engine.util.math.Matrix4;
import com.planner5d.library.engine.util.math.b;
import com.planner5d.library.math.m;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemDoor;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemNs;
import com.planner5d.library.model.item.ItemPr;
import com.planner5d.library.model.item.ItemWindow;
import gc.d;

/* JADX INFO: loaded from: classes7.dex */
public class ItemLayout3DHelper {
    private static final m vector = new m();
    private static final m temp0 = new m();
    private static final m temp1 = new m();
    private static final m temp2 = new m();
    private static final m temp3 = new m();
    private static final b bounds = new b();
    private static final Matrix4 matrix = new Matrix4();
    private static final Matrix4 matrixTemp = new Matrix4();
    private static final ItemLayout layoutTemp = new ItemLayout();
    private static final Object lock = new Object();

    private static b boundingBox(ItemNs itemNs, b bVar) {
        return d.a(itemNs.getBounds(itemNs.getClosed()), bVar);
    }

    public static ItemLayout item(Item item, ItemLayout itemLayout) {
        item.getLayout(itemLayout);
        if (item instanceof ItemPr) {
            synchronized (lock) {
                try {
                    m mVar = vector;
                    itemLayout.setPosition(itemLayout.getPosition(mVar).f180482a, mVar.f180483b, mVar.f180484c + (itemLayout.getScaleZ() * 50.0f));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return itemLayout;
        }
        if ((item instanceof ItemNs) && (item instanceof ItemWindow)) {
            itemLayout.setRotation(0.0f, itemLayout.getRotationY() + 90.0f, 0.0f);
            if (itemLayout.isFlippedVertically() != itemLayout.isFlippedHorizontally()) {
                itemLayout.setRotationY(itemLayout.getRotationY() - 180.0f);
            }
            if (item instanceof ItemDoor) {
                float rotationY = itemLayout.getRotationY();
                ((ItemDoor) item).getLayoutWithOffset(item.getLayout(itemLayout), true);
                itemLayout.setRotation(0.0f, rotationY, 0.0f);
            }
            itemLayout.setScale(itemLayout.getScaleX(), 1.0f, itemLayout.getScaleZ());
        }
        return itemLayout;
    }

    public static b placeholderBounds(Item item, b bVar, b bVar2) {
        b bVarF;
        synchronized (lock) {
            ItemLayout itemLayout = layoutTemp;
            item.getLayout(itemLayout);
            float scaleZ = itemLayout.getScaleZ();
            b bVar3 = bounds;
            boundingBox((ItemNs) item, bVar3);
            bVarF = bVar2.G(bVar).F(matrix.i0(bVar3.z(), bVar3.w(), bVar3.u()).w(matrixTemp.k0(bVar3.j(), (bVar3.w() / 2.0f) * scaleZ, bVar3.l())));
        }
        return bVarF;
    }

    public static void transformPlaceholder(Item item, Matrix4 matrix4, Matrix4 matrix5) {
        synchronized (lock) {
            try {
                b bVar = bounds;
                boundingBox((ItemNs) item, bVar);
                m mVar = vector;
                mVar.y0(bVar.z(), bVar.w(), bVar.u());
                matrix4.i0(mVar.f180482a, mVar.f180483b, mVar.f180484c);
                mVar.y0(bVar.j(), bVar.k(), bVar.l());
                matrix4.w(matrix5.k0(mVar.f180482a, mVar.f180483b, mVar.f180484c));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
