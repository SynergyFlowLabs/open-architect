package com.planner5d.library.widget.editor.editor2d.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.p0;
import com.planner5d.library.model.item.Item;
import com.planner5d.library.model.item.ItemLayout;

/* JADX INFO: loaded from: classes12.dex */
public class g implements c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Paint f254897n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Paint f254898o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f254899p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f254900q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float[] f254901r;

    public g() {
        Paint paint = new Paint(1);
        this.f254897n = paint;
        this.f254899p = new Rect();
        this.f254900q = new Rect();
        this.f254901r = new float[9];
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(1711276032);
        paint.setStrokeWidth(0.0f);
        Paint paint2 = new Paint(paint);
        this.f254898o = paint2;
        paint2.setStrokeWidth(2.0f);
        paint2.setColor(-1442840576);
    }

    @Override // com.planner5d.library.widget.editor.editor2d.drawable.c
    public void b(d dVar, boolean z10, @p0 Item item) {
        Rect rect;
        com.planner5d.library.widget.editor.projectresources.viewoptions.b bVar = dVar.f254893c;
        if (bVar.f258078i) {
            float f10 = bVar.f258080k;
            int i10 = (int) (f10 * 100.0f);
            Canvas canvas = dVar.f254891a;
            this.f254900q.set(canvas.getClipBounds());
            dVar.f254892b.getValues(this.f254901r);
            boolean z11 = false;
            if (this.f254901r[0] < 0.8d && f10 <= 20.0f) {
                z11 = true;
            }
            boolean z12 = z11;
            Rect rect2 = this.f254900q;
            rect2.left = (int) (rect2.left - f10);
            rect2.top = (int) (rect2.top - f10);
            rect2.right = (int) (rect2.right + f10);
            rect2.bottom = (int) (rect2.bottom + f10);
            this.f254899p.set(rect2);
            Rect rect3 = this.f254899p;
            rect3.left *= 100;
            int i11 = rect3.top * 100;
            rect3.top = i11;
            rect3.right *= 100;
            rect3.bottom *= 100;
            int i12 = (i11 / i10) * i10;
            while (true) {
                rect = this.f254899p;
                if (i12 > rect.bottom) {
                    break;
                }
                int i13 = i12 / i10;
                if (!z12 || i13 % 5 == 0) {
                    Rect rect4 = this.f254900q;
                    float f11 = i12 / 100.0f;
                    canvas.drawLine(rect4.left, f11, rect4.right, f11, i13 % 10 == 0 ? this.f254898o : this.f254897n);
                }
                i12 += i10;
            }
            for (int i14 = (rect.left / i10) * i10; i14 <= this.f254899p.right; i14 += i10) {
                int i15 = i14 / i10;
                if (!z12 || i15 % 5 == 0) {
                    float f12 = i14 / 100.0f;
                    Rect rect5 = this.f254900q;
                    canvas.drawLine(f12, rect5.top, f12, rect5.bottom, i15 % 10 == 0 ? this.f254898o : this.f254897n);
                }
            }
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
        return -8;
    }
}
