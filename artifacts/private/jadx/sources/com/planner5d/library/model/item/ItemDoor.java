package com.planner5d.library.model.item;

import androidx.annotation.NonNull;
import com.planner5d.library.math.k;
import com.planner5d.library.math.m;
import com.planner5d.library.model.item.model2d.Model2D;
import com.planner5d.library.widget.editor.editor2d.drawable.c;
import com.planner5d.library.widget.editor.editor2d.drawable.w;

/* JADX INFO: loaded from: classes7.dex */
public class ItemDoor extends ItemWindow {
    private boolean initialized;

    public ItemDoor(String str, String str2, @NonNull Model2D model2D) {
        super(str, str2, model2D);
        this.initialized = false;
    }

    private k getLayoutOffset(ItemLayout itemLayout, k kVar, boolean z10) {
        if (this.model == null) {
            return kVar.a0();
        }
        kVar.U(getLayout(itemLayout).isFlippedHorizontally() ? 1.0f : -1.0f, 0.0f).N(itemLayout.getRotationY());
        return z10 ? kVar.R(getWallThicknessHalf1() * 0.0f) : kVar.R((this.model.size2DHalf[0] * 1.0f) - getWallThicknessHalf1());
    }

    private static float getWallThicknessHalf1() {
        return 6.0f;
    }

    private w resetDrawableLayout(w wVar) {
        if (wVar != null) {
            ItemLayout itemLayout = new ItemLayout();
            for (c cVar : wVar.f255098a) {
                cVar.c(getLayoutWithOffset(itemLayout, false));
            }
        }
        return wVar;
    }

    @Override // com.planner5d.library.model.item.ItemNs, com.planner5d.library.model.item.Item
    protected w createDrawables() {
        return resetDrawableLayout(super.createDrawables());
    }

    @Override // com.planner5d.library.model.item.ItemWindow
    protected float[] createPolygonVertexes(m mVar) {
        float f10 = mVar.f180482a / 2.0f;
        float f11 = mVar.f180483b / 2.0f;
        float wallThicknessHalf1 = (getWallThicknessHalf1() * 1.0f) - f11;
        float f12 = -f10;
        float f13 = wallThicknessHalf1 - f11;
        float f14 = wallThicknessHalf1 + f11;
        return new float[]{f12, f13, f12, f14, f10, f14, f10, f13};
    }

    public ItemLayout getLayoutWithOffset(ItemLayout itemLayout, boolean z10) {
        getLayout(itemLayout).setPosition(itemLayout.getPosition(new k()).c0(getLayoutOffset(itemLayout, new k(), z10)));
        return itemLayout;
    }

    @Override // com.planner5d.library.model.item.Item
    protected void initializeDrawable(w wVar) {
        super.initializeDrawable(wVar);
        resetDrawableLayout(wVar);
        this.initialized = true;
    }

    @Override // com.planner5d.library.model.item.ItemWindow, com.planner5d.library.model.item.Item
    protected void onLayoutChanged(ItemLayout itemLayout) {
        super.onLayoutChanged(itemLayout);
        if (this.initialized) {
            resetDrawableLayout(getDrawables());
        }
    }

    public ItemDoor(ItemDoor itemDoor, ProviderUid providerUid) {
        super(itemDoor, providerUid);
        boolean z10 = false & false;
        this.initialized = false;
    }
}
