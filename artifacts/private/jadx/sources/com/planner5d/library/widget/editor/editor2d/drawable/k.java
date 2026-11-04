package com.planner5d.library.widget.editor.editor2d.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemPoint;
import com.planner5d.library.model.item.ItemWall;

/* JADX INFO: loaded from: classes12.dex */
public class k implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f255003s = 10;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f255004t = 20;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f255005u = 15431922;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f255006v = 1754350;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Matrix f255007n = new Matrix();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Paint f255008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Paint f255009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ItemPoint f255010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Integer f255011r;

    public k(ItemPoint itemPoint) {
        Paint paint = new Paint(1);
        this.f255008o = paint;
        Paint paint2 = new Paint(1);
        this.f255009p = paint2;
        this.f255011r = null;
        this.f255010q = itemPoint;
        paint.setStyle(Paint.Style.FILL);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-16777216);
        paint2.setStrokeWidth(0.0f);
    }

    private int i(boolean z10) {
        return z10 ? 855638016 : 570425344;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void b(d dVar, boolean z10, @p0 Item item) {
        Item parentItem = this.f255010q.getParentItem();
        if ((parentItem instanceof ItemWall) && !((ItemWall) parentItem).isZero()) {
            Canvas canvas = dVar.f254891a;
            canvas.save();
            synchronized (this.f255007n) {
                try {
                    canvas.concat(this.f255007n);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Paint paint = this.f255008o;
            Integer num = this.f255011r;
            paint.setColor(num == null ? h(z10, item) | i(z10) : num.intValue());
            com.planner5d.library.math.k point = this.f255010q.getPoint();
            canvas.drawCircle(point.f180480a, point.f180481b, 10.0f, this.f255008o);
            if (z10) {
                float f10 = point.f180480a;
                float f11 = point.f180481b;
                canvas.drawLine(f10 - 20.0f, f11, f10 + 20.0f, f11, this.f255009p);
                float f12 = point.f180480a;
                float f13 = point.f180481b;
                canvas.drawLine(f12, f13 - 20.0f, f12, f13 + 20.0f, this.f255009p);
            }
            canvas.restore();
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void c(ItemLayout itemLayout) {
        com.planner5d.library.math.k kVar = new com.planner5d.library.math.k();
        itemLayout.getPosition(kVar);
        synchronized (this.f255007n) {
            try {
                this.f255007n.setTranslate(kVar.f180480a, kVar.f180481b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public RectF d(RectF rectF) {
        com.planner5d.library.math.k point = this.f255010q.getPoint();
        float f10 = point.f180480a;
        float f11 = point.f180481b;
        rectF.set(f10 - 20.0f, f11 - 20.0f, f10 + 20.0f, f11 + 20.0f);
        this.f255007n.mapRect(rectF);
        return rectF;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public boolean e(PointF pointF) {
        return x.h(this, pointF);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public int g() {
        return -5;
    }

    protected int h(boolean z10, Item item) {
        if (z10 && (item instanceof ItemWall) && item == this.f255010q.getParentItem()) {
            return ((ItemWall) this.f255010q.getParentItem()).getPoints()[0] == this.f255010q ? f255005u : f255006v;
        }
        return 1878891;
    }

    public void j(@androidx.annotation.l Integer num) {
        this.f255011r = num;
    }
}
