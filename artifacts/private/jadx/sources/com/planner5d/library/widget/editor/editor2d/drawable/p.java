package com.planner5d.library.widget.editor.editor2d.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemWall;
import com.planner5d.library.model.item.ItemWalls;

/* JADX INFO: loaded from: classes12.dex */
public class p implements f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f255033n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Paint f255034o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final PointF f255035p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.planner5d.library.math.k f255036q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ItemLayout f255037r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f255038s;

    public p() {
        Paint paint = new Paint(1);
        this.f255033n = paint;
        this.f255035p = new PointF();
        this.f255036q = new com.planner5d.library.math.k();
        this.f255037r = new ItemLayout();
        this.f255038s = false;
        paint.setStrokeWidth(3.0f);
        Paint paint2 = new Paint(paint);
        this.f255034o = paint2;
        paint.setColor(2013200384);
        paint2.setColor(1996488959);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.f
    public void a(com.planner5d.library.widget.editor.editor2d.painter.d dVar, com.planner5d.library.widget.editor.editor2d.o oVar, @p0 Item item, boolean z10) {
        this.f255038s = z10;
        if (z10) {
            RectF rectFC = oVar.c();
            this.f255035p.set(rectFC.width(), rectFC.height());
            if (item instanceof ItemPoint) {
                ((ItemPoint) item).getPoint(this.f255036q, true);
                return;
            }
            if (item instanceof ItemWall) {
                ((ItemWall) item).getPoint(this.f255036q, true, true);
                return;
            }
            if (!(item instanceof ItemWalls)) {
                if (item != null) {
                    item.getLayout(this.f255037r).getPosition(this.f255036q);
                }
            } else {
                ItemWall[] children = ((ItemWalls) item).getChildren();
                if (children != null) {
                    children[0].getPoint(this.f255036q, true, true);
                }
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void b(d dVar, boolean z10, Item item) {
        if (this.f255038s && dVar.f254893c.f258072c) {
            Canvas canvas = dVar.f254891a;
            float f10 = this.f255036q.f180481b;
            canvas.drawLine(0.0f, f10, this.f255035p.x, f10, this.f255033n);
            Canvas canvas2 = dVar.f254891a;
            float f11 = this.f255036q.f180480a;
            canvas2.drawLine(f11, 0.0f, f11, this.f255035p.y, this.f255034o);
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void c(ItemLayout itemLayout) {
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public RectF d(RectF rectF) {
        return null;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public boolean e(PointF pointF) {
        return false;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public int g() {
        return c.f254878a;
    }
}
