package com.planner5d.library.widget.editor.editor2d.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.services.c0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class m implements c {
    private final Path A;
    private final com.planner5d.library.widget.editor.editor2d.drawable.pr.g B;
    private com.planner5d.library.widget.editor.editor2d.drawable.pr.g.a C;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f255012n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Paint f255013o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Matrix f255014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Matrix f255015q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final RectF f255016r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c0 f255017s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final com.planner5d.library.math.k f255018t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final c0 f255019u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final com.planner5d.library.math.k f255020v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final com.planner5d.library.math.k f255021w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final com.planner5d.library.math.m f255022x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f255023y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List<com.planner5d.library.math.k> f255024z;

    public m(ItemMaterial itemMaterial) {
        Paint paint = new Paint();
        this.f255012n = paint;
        Paint paint2 = new Paint();
        this.f255013o = paint2;
        this.f255014p = new Matrix();
        this.f255015q = new Matrix();
        this.f255016r = new RectF(-50.0f, -50.0f, 50.0f, 50.0f);
        this.f255017s = null;
        this.f255018t = new com.planner5d.library.math.k();
        this.f255019u = new c0();
        this.f255020v = new com.planner5d.library.math.k();
        this.f255021w = new com.planner5d.library.math.k();
        this.f255022x = new com.planner5d.library.math.m();
        this.f255023y = 0.0f;
        this.f255024z = new ArrayList();
        this.A = new Path();
        this.B = new com.planner5d.library.widget.editor.editor2d.drawable.pr.g();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-16777216);
        h(itemMaterial);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void b(d dVar, boolean z10, @p0 Item item) {
        if (dVar.f254893c.f258070a) {
            Canvas canvas = dVar.f254891a;
            if (z10) {
                com.planner5d.library.widget.editor.editor2d.drawable.pr.g.a aVar = this.C;
                if (aVar != null) {
                    this.f255017s = com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c.p(this.f255019u, dVar.f254894d, this.f255020v, aVar.a());
                } else {
                    this.f255017s = com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c.o(this.f255019u, dVar.f254894d, this.f255020v, this.f255021w, this.f255023y);
                }
            } else {
                this.f255017s = null;
            }
            canvas.save();
            synchronized (this.f255014p) {
                canvas.concat(this.f255014p);
            }
            if (this.C != null) {
                canvas.drawPath(this.A, this.f255012n);
                canvas.drawPath(this.A, this.f255013o);
            } else {
                canvas.drawRect(this.f255016r, this.f255012n);
                canvas.drawRect(this.f255016r, this.f255013o);
            }
            canvas.restore();
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void c(ItemLayout itemLayout) {
        com.planner5d.library.widget.editor.editor2d.drawable.pr.g.a aVarV;
        itemLayout.getRotation(this.f255022x);
        itemLayout.getScale(this.f255018t);
        this.f255021w.U(this.f255016r.width(), this.f255016r.height()).T(this.f255018t);
        com.planner5d.library.math.m mVar = this.f255022x;
        if (mVar.f180482a == 0.0f && mVar.f180484c == 0.0f) {
            synchronized (this.f255014p) {
                try {
                    Matrix matrix = this.f255014p;
                    com.planner5d.library.math.k kVar = this.f255018t;
                    matrix.setScale(kVar.f180480a, kVar.f180481b);
                    Matrix matrix2 = this.f255014p;
                    float rotationY = itemLayout.getRotationY();
                    this.f255023y = rotationY;
                    matrix2.postRotate(rotationY);
                    this.f255014p.postTranslate(itemLayout.getPosition(this.f255020v).f180480a, this.f255020v.f180481b);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        synchronized (this.f255014p) {
            try {
                this.f255014p.setTranslate(itemLayout.getPosition(this.f255020v).f180480a, this.f255020v.f180481b);
                this.f255015q.setTranslate(itemLayout.getPosition(this.f255020v).f180480a, this.f255020v.f180481b);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f255024z.clear();
        synchronized (this.B) {
            try {
                aVarV = this.B.v(itemLayout);
                this.C = aVarV;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        c0 c0VarA = aVarV.a();
        this.f255017s = c0VarA;
        this.f255016r.set((-c0VarA.k()) / 2.0f, (-this.f255017s.e()) / 2.0f, this.f255017s.k() / 2.0f, this.f255017s.e() / 2.0f);
        this.f255024z.addAll(this.C.b());
        synchronized (this.A) {
            try {
                this.A.reset();
                for (int i10 = 0; i10 < this.f255024z.size(); i10++) {
                    com.planner5d.library.math.k kVar2 = this.f255024z.get(i10);
                    if (i10 == 0) {
                        this.A.moveTo(kVar2.f180480a, kVar2.f180481b);
                    } else {
                        this.A.lineTo(kVar2.f180480a, kVar2.f180481b);
                    }
                }
                this.A.close();
                if (this.C.c() != null) {
                    Path path = new Path();
                    com.planner5d.library.widget.editor.editor2d.drawable.pr.g.c cVarC = this.C.c();
                    for (com.planner5d.library.widget.editor.editor2d.drawable.pr.g.c cVar : cVarC.b()) {
                        path.moveTo(cVarC.c().f180482a, cVarC.c().f180484c);
                        path.lineTo(cVar.c().f180482a, cVar.c().f180484c);
                    }
                    this.A.addPath(path);
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public RectF d(RectF rectF) {
        rectF.set(this.f255016r);
        if (this.C != null) {
            synchronized (this.f255015q) {
                this.f255015q.mapRect(rectF);
            }
            return rectF;
        }
        synchronized (this.f255014p) {
            try {
                this.f255014p.mapRect(rectF);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return rectF;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public boolean e(PointF pointF) {
        boolean z10;
        synchronized (this.f255014p) {
            try {
                z10 = x.g(this.f255017s, pointF) || x.d(this.f255016r, this.f255014p, pointF);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public int g() {
        return 0;
    }

    public void h(ItemMaterial itemMaterial) {
        Integer num;
        if (itemMaterial == null || (num = itemMaterial.colorDraw) == null) {
            return;
        }
        this.f255012n.setColor(num.intValue());
    }
}
