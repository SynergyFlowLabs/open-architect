package com.planner5d.library.model.item;

import androidx.annotation.NonNull;
import com.planner5d.library.engine.util.math.h;
import com.planner5d.library.math.m;
import com.planner5d.library.model.item.model2d.Model2D;
import com.planner5d.library.widget.editor.editor2d.drawable.j;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class ItemWindow extends ItemNs {
    public static final boolean ENABLE_DEPTH_FOR_WINDOWS = false;
    private final Set<String> intersectedWalls;
    private h polygon;

    public ItemWindow(String str, String str2, @NonNull Model2D model2D) {
        super(str, str2, model2D);
        this.polygon = null;
        this.intersectedWalls = new HashSet();
    }

    private h createPolygon() {
        if (this.polygon == null) {
            h hVar = new h();
            this.polygon = hVar;
            hVar.u(createPolygonVertexes(getSize(new m())));
        }
        ItemLayout layout = getLayout(new ItemLayout());
        this.polygon.t(layout.getScaleX(), layout.getScaleY());
        this.polygon.s(layout.getRotationY() + 90.0f);
        this.polygon.r(layout.getPositionX(), layout.getPositionY());
        return this.polygon;
    }

    @Override // com.planner5d.library.model.item.ItemNs
    protected j createDrawableModel(Model2D model2D, ItemMaterial[] itemMaterialArr) {
        return new j(model2D, itemMaterialArr, true);
    }

    protected float[] createPolygonVertexes(m mVar) {
        float f10 = mVar.f180482a / 2.0f;
        float f11 = mVar.f180483b / 2.0f;
        float f12 = -f10;
        float f13 = -f11;
        int i10 = 0 | 2;
        return new float[]{f12, f13, f12, f11, f10, f11, f10, f13};
    }

    public float getHeight3DModel() {
        return getSize(new m()).f180484c;
    }

    public Set<String> getIntersectedWalls() {
        return this.intersectedWalls;
    }

    public h getPolygon(h hVar) {
        createPolygon();
        hVar.u(this.polygon.k());
        hVar.t(this.polygon.h(), this.polygon.i());
        hVar.s(this.polygon.g());
        hVar.r(this.polygon.l(), this.polygon.m());
        return hVar;
    }

    @Override // com.planner5d.library.model.item.Item
    protected void onLayoutChanged(ItemLayout itemLayout) {
        super.onLayoutChanged(itemLayout);
        this.intersectedWalls.clear();
        createPolygon();
    }

    public void updateIntersections(String str) {
        this.intersectedWalls.add(str);
    }

    public ItemWindow(ItemWindow itemWindow, ProviderUid providerUid) {
        super(itemWindow, providerUid);
        this.polygon = null;
        this.intersectedWalls = new HashSet();
    }
}
