package com.planner5d.library.widget.editor.editor2d.painter;

import android.graphics.PointF;
import com.canhub.cropper.core.CropImageOptions;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemRoom;
import com.planner5d.library.widget.editor.facade.i0;

/* JADX INFO: loaded from: classes12.dex */
class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i0 f255294d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f255291a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Item f255292b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ItemLayout f255293c = new ItemLayout();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.math.k f255295e = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.planner5d.library.math.k f255296f = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.planner5d.library.math.m f255297g = new com.planner5d.library.math.m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.planner5d.library.math.k f255298h = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f255299i = 0.0f;

    public r(i0 i0Var) {
        this.f255294d = i0Var;
    }

    public void a(PointF pointF) {
        this.f255293c.getPosition(this.f255296f).b0(pointF.x, pointF.y).R(-1.0f);
        float fA = this.f255294d.a(this.f255299i + this.f255295e.d(this.f255296f)) % CropImageOptions.S3;
        Item item = this.f255292b;
        if (item instanceof ItemRoom) {
            ((ItemRoom) item).rotate(this.f255297g.y0(0.0f, fA, 0.0f), this.f255293c.getPosition(this.f255298h));
        } else {
            item.setLayout(this.f255293c.setRotationY(fA));
        }
    }

    public boolean b() {
        return this.f255291a;
    }

    public Item[] c(@fj.h Item item, PointF pointF) {
        if (item == null) {
            return null;
        }
        this.f255291a = true;
        boolean z10 = item instanceof ItemRoom;
        if (z10) {
            ((ItemRoom) item).getLayoutForRotation(this.f255293c);
        } else {
            item.getLayout(this.f255293c);
        }
        this.f255293c.getPosition(this.f255295e).b0(pointF.x, pointF.y).R(-1.0f);
        this.f255299i = this.f255293c.getRotationY();
        this.f255292b = item;
        if (!z10) {
            return new Item[]{item};
        }
        ItemRoom itemRoom = (ItemRoom) item;
        return (Item[]) com.planner5d.library.services.utility.e.a(itemRoom.getItemsMovedTogether(), itemRoom, Item[].class);
    }

    public void d() {
        this.f255292b = null;
        this.f255291a = false;
    }
}
