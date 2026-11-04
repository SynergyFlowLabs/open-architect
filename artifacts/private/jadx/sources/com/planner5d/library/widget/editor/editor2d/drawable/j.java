package com.planner5d.library.widget.editor.editor2d.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;
import com.planner5d.library.model.item.ItemMaterial;
import com.planner5d.library.model.item.model2d.Model2D;
import com.planner5d.library.model.item.model2d.Model2DPart;
import com.planner5d.library.services.c0;

/* JADX INFO: loaded from: classes12.dex */
public class j implements c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Paint f254991y = h();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Model2D f254992n;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f254999u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ItemMaterial[] f255002x;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final Matrix f254993o = new Matrix();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final RectF f254994p = new RectF();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.planner5d.library.math.k f254995q = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final com.planner5d.library.math.k f254996r = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final com.planner5d.library.math.k f254997s = new com.planner5d.library.math.k();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f254998t = 0.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final c0 f255000v = new c0();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private c0 f255001w = null;

    public j(@NonNull Model2D model2D, ItemMaterial[] itemMaterialArr, boolean z10) {
        this.f254992n = model2D;
        this.f255002x = itemMaterialArr;
        this.f254999u = z10;
    }

    private static Paint h() {
        Paint paint = new Paint(1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        return paint;
    }

    private RectF j(RectF rectF, boolean z10) {
        int[] iArr = this.f254992n.size2DHalf;
        int i10 = 7 << 0;
        int i11 = iArr[0];
        int i12 = iArr[1];
        rectF.set(-i11, -i12, i11, i12);
        if (!z10) {
            return rectF;
        }
        synchronized (this.f254993o) {
            this.f254993o.mapRect(rectF);
        }
        return rectF;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void b(d dVar, boolean z10, @p0 Item item) {
        if (dVar.f254893c.f258070a) {
            Canvas canvas = dVar.f254891a;
            if (z10) {
                this.f255001w = com.planner5d.library.widget.editor.editor2d.drawable.gizmo.c.o(this.f255000v, dVar.f254894d, this.f254997s, this.f254996r, this.f254998t);
            } else {
                this.f255001w = null;
            }
            canvas.save();
            synchronized (this.f254993o) {
                canvas.concat(this.f254993o);
            }
            i(canvas, this.f254992n);
            canvas.restore();
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void c(@NonNull ItemLayout itemLayout) {
        if (this.f254999u) {
            itemLayout = new ItemLayout().set(itemLayout).setScale(1.0f, itemLayout.getScaleX(), 1.0f);
        }
        synchronized (this.f254993o) {
            try {
                this.f254993o.setScale(itemLayout.getScale(this.f254995q).f180480a, this.f254995q.f180481b);
                this.f254993o.preScale(itemLayout.isFlippedHorizontally() ? -1.0f : 1.0f, itemLayout.isFlippedVertically() ? -1.0f : 1.0f);
                j(this.f254994p, false);
                this.f254996r.U(this.f254994p.width(), this.f254994p.height()).T(this.f254995q);
                Matrix matrix = this.f254993o;
                float rotationY = itemLayout.getRotationY();
                this.f254998t = rotationY;
                matrix.postRotate(rotationY);
                this.f254993o.postTranslate(itemLayout.getPosition(this.f254997s).f180480a, this.f254997s.f180481b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public RectF d(RectF rectF) {
        return j(rectF, true);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public boolean e(PointF pointF) {
        boolean z10;
        synchronized (this.f254993o) {
            try {
                if (!x.g(this.f255001w, pointF)) {
                    z10 = x.d(j(this.f254994p, false), this.f254993o, pointF);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public int g() {
        return this.f254992n.level;
    }

    protected void i(Canvas canvas, Model2D model2D) {
        int i10 = 0;
        while (true) {
            Model2DPart[] model2DPartArr = model2D.parts;
            if (i10 >= model2DPartArr.length) {
                return;
            }
            Model2DPart model2DPart = model2DPartArr[i10];
            int fill = model2DPart.getFill(this.f255002x);
            if (fill != 0) {
                Paint paint = f254991y;
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(fill);
                canvas.drawPath(model2DPart.path, paint);
            }
            if (model2DPart.stroke != 0) {
                Paint paint2 = f254991y;
                paint2.setStyle(Paint.Style.STROKE);
                paint2.setColor(model2DPart.stroke);
                paint2.setStrokeWidth(model2DPart.strokeWidth);
                canvas.drawPath(model2DPart.path, paint2);
            }
            i10++;
        }
    }
}
