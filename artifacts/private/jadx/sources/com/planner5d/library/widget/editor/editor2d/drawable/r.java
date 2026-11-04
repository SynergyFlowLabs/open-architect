package com.planner5d.library.widget.editor.editor2d.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.p0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemEditableWall;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.walls.WallsInfoWall;

/* JADX INFO: loaded from: classes12.dex */
public class r implements c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f255079w = 20;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Matrix f255080n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected WallsInfoWall f255081o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Paint f255082p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Path f255083q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.planner5d.library.engine.util.math.h[] f255084r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final RectF f255085s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Integer f255086t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Integer f255087u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Integer f255088v;

    public r(r rVar) {
        this(rVar.f255081o);
        this.f255080n.set(rVar.f255080n);
    }

    private com.planner5d.library.engine.util.math.h h(com.planner5d.library.math.c cVar, com.planner5d.library.math.k kVar) {
        com.planner5d.library.math.k kVarR = kVar.V(cVar.b()).O(1).R(20.0f);
        return new com.planner5d.library.engine.util.math.h(new float[]{cVar.e().f180480a - kVarR.f180480a, cVar.e().f180481b - kVarR.f180481b, cVar.e().f180480a + kVarR.f180480a, cVar.e().f180481b + kVarR.f180481b, cVar.c().f180480a + kVarR.f180480a, cVar.c().f180481b + kVarR.f180481b, cVar.c().f180480a - kVarR.f180480a, cVar.c().f180481b - kVarR.f180481b});
    }

    private int j(boolean z10, boolean z11, boolean z12) {
        Integer num;
        if (z12 && (num = this.f255088v) != null) {
            return num.intValue();
        }
        Integer num2 = this.f255086t;
        return num2 == null ? k(z10, z11) : num2.intValue();
    }

    private com.planner5d.library.engine.util.math.h[] l() {
        WallsInfoWall wallsInfoWall;
        com.planner5d.library.engine.util.math.h[] hVarArr = this.f255084r;
        if (hVarArr != null || (wallsInfoWall = this.f255081o) == null) {
            return hVarArr;
        }
        com.planner5d.library.math.k kVar = new com.planner5d.library.math.k();
        com.planner5d.library.engine.util.math.h[] hVarArr2 = {h(wallsInfoWall.getTop(), kVar), h(wallsInfoWall.getBottom(), kVar)};
        this.f255084r = hVarArr2;
        return hVarArr2;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void b(d dVar, boolean z10, @p0 Item item) {
        WallsInfoWall wallsInfoWall = this.f255081o;
        if (wallsInfoWall != null) {
            if ((!wallsInfoWall.getWall().isHidden() || z10) && !this.f255081o.getWall().isZero()) {
                Canvas canvas = dVar.f254891a;
                canvas.save();
                synchronized (this.f255080n) {
                    try {
                        canvas.concat(this.f255080n);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                i(canvas, this.f255081o.getWall().isHidden(), z10, dVar.f254893c, dVar.a());
                canvas.restore();
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void c(ItemLayout itemLayout) {
        com.planner5d.library.math.k kVar = new com.planner5d.library.math.k();
        synchronized (this.f255080n) {
            try {
                this.f255080n.setTranslate(itemLayout.getPosition(kVar).f180480a, kVar.f180481b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public RectF d(RectF rectF) {
        if (this.f255081o == null) {
            return rectF;
        }
        rectF.set(this.f255085s);
        synchronized (this.f255080n) {
            try {
                this.f255080n.mapRect(rectF);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rectF;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public boolean e(PointF pointF) {
        synchronized (this.f255080n) {
            try {
                if (this.f255081o != null && x.i(this, pointF, 20.0f)) {
                    synchronized (this.f255083q) {
                        if (x.a(this.f255083q, this.f255080n, pointF)) {
                            return true;
                        }
                        com.planner5d.library.engine.util.math.h[] hVarArrL = l();
                        if (hVarArrL != null) {
                            for (com.planner5d.library.engine.util.math.h hVar : hVarArrL) {
                                if (x.f(hVar, this.f255080n, pointF)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public int g() {
        return -6;
    }

    protected void i(Canvas canvas, boolean z10, boolean z11, com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar, Typeface typeface) {
        this.f255082p.setColor(j(z10, z11, bVar.f258082m));
        this.f255082p.setStyle(Paint.Style.FILL);
        synchronized (this.f255083q) {
            try {
                canvas.drawPath(this.f255083q, this.f255082p);
                Integer num = this.f255087u;
                if (num != null) {
                    this.f255082p.setColor(num.intValue());
                }
                if (Color.alpha(this.f255082p.getColor()) >= 255) {
                    this.f255082p.setStyle(Paint.Style.STROKE);
                    canvas.drawPath(this.f255083q, this.f255082p);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected int k(boolean z10, boolean z11) {
        return z11 ? 857516907 : 861890933;
    }

    public void m(@p0 WallsInfoWall wallsInfoWall) {
        this.f255081o = wallsInfoWall;
        boolean z10 = wallsInfoWall != null;
        if (z10 && (wallsInfoWall.getWall() instanceof ItemEditableWall)) {
            ItemEditableWall itemEditableWall = (ItemEditableWall) wallsInfoWall.getWall();
            if (itemEditableWall.getWallColor() != -1) {
                this.f255088v = Integer.valueOf(itemEditableWall.getWallColor());
            }
        }
        synchronized (this.f255083q) {
            try {
                this.f255083q.reset();
                if (z10) {
                    this.f255083q.moveTo(wallsInfoWall.getBottom().e().f180480a, wallsInfoWall.getBottom().e().f180481b);
                    for (int i10 = 0; i10 < wallsInfoWall.getStart().length; i10++) {
                        this.f255083q.lineTo(wallsInfoWall.getStart()[i10].c().f180480a, wallsInfoWall.getStart()[i10].c().f180481b);
                    }
                    for (int length = wallsInfoWall.getEnd().length - 1; length >= 0; length--) {
                        this.f255083q.lineTo(wallsInfoWall.getEnd()[length].c().f180480a, wallsInfoWall.getEnd()[length].c().f180481b);
                    }
                    this.f255083q.lineTo(wallsInfoWall.getBottom().c().f180480a, wallsInfoWall.getBottom().c().f180481b);
                    this.f255083q.close();
                    this.f255083q.computeBounds(this.f255085s, false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f255084r = null;
    }

    public r(WallsInfoWall wallsInfoWall) {
        this.f255080n = new Matrix();
        this.f255081o = null;
        int i10 = 7 ^ 1;
        Paint paint = new Paint(1);
        this.f255082p = paint;
        this.f255083q = new Path();
        this.f255084r = null;
        this.f255085s = new RectF();
        this.f255086t = null;
        this.f255087u = null;
        this.f255088v = null;
        m(wallsInfoWall);
        paint.setStrokeWidth(0.0f);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }
}
