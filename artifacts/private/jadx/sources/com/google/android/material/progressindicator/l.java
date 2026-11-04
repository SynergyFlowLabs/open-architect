package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.x;
import androidx.collection.b3;
import com.google.android.material.color.u;

/* JADX INFO: loaded from: classes4.dex */
final class l extends i<o> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f113257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f113258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f113259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f113260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @x(from = 0.0d, to = 1.0d)
    private float f113261f;

    l(@NonNull o oVar) {
        super(oVar);
        this.f113257b = 300.0f;
    }

    private void h(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, @androidx.annotation.l int i10, @t0 int i11, @t0 int i12) {
        float f12;
        float fD = n1.a.d(f10, 0.0f, 1.0f);
        float fD2 = n1.a.d(f11, 0.0f, 1.0f);
        float f13 = y6.a.f(1.0f - this.f113261f, 1.0f, fD);
        float f14 = y6.a.f(1.0f - this.f113261f, 1.0f, fD2);
        int iD = (int) ((i11 * n1.a.d(f13, 0.0f, 0.01f)) / 0.01f);
        int iD2 = (int) ((i12 * (1.0f - n1.a.d(f14, 0.99f, 1.0f))) / 0.01f);
        float f15 = this.f113257b;
        int i13 = (int) ((f13 * f15) + iD);
        int i14 = (int) ((f14 * f15) - iD2);
        float f16 = (-f15) / 2.0f;
        if (i13 <= i14) {
            float f17 = this.f113259d;
            float f18 = i13 + f17;
            float f19 = i14 - f17;
            float f20 = f17 * 2.0f;
            paint.setColor(i10);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f113258c);
            if (f18 >= f19) {
                j(canvas, paint, new PointF(f18 + f16, 0.0f), new PointF(f19 + f16, 0.0f), f20, this.f113258c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.f113260e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f21 = f18 + f16;
            float f22 = f19 + f16;
            canvas.drawLine(f21, 0.0f, f22, 0.0f, paint);
            if (this.f113260e || this.f113259d <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f18 > 0.0f) {
                f12 = f20;
                i(canvas, paint, new PointF(f21, 0.0f), f12, this.f113258c);
            } else {
                f12 = f20;
            }
            if (f19 < this.f113257b) {
                i(canvas, paint, new PointF(f22, 0.0f), f12, this.f113258c);
            }
        }
    }

    private void i(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, float f10, float f11) {
        j(canvas, paint, pointF, null, f10, f11);
    }

    private void j(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, @p0 PointF pointF2, float f10, float f11) {
        float fMin = Math.min(f11, this.f113258c);
        float f12 = f10 / 2.0f;
        float fMin2 = Math.min(f12, (this.f113259d * fMin) / this.f113258c);
        RectF rectF = new RectF((-f10) / 2.0f, (-fMin) / 2.0f, f12, fMin / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, fMin2, fMin2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    @Override // com.google.android.material.progressindicator.i
    void a(@NonNull Canvas canvas, @NonNull Rect rect, @x(from = 0.0d, to = 1.0d) float f10, boolean z10, boolean z11) {
        this.f113257b = rect.width();
        float f11 = ((o) this.f113248a).f113184a;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - f11) / 2.0f));
        if (((o) this.f113248a).f113288j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f12 = this.f113257b / 2.0f;
        float f13 = f11 / 2.0f;
        canvas.clipRect(-f12, -f13, f12, f13);
        S s10 = this.f113248a;
        this.f113260e = ((o) s10).f113184a / 2 == ((o) s10).f113185b;
        this.f113258c = ((o) s10).f113184a * f10;
        this.f113259d = Math.min(((o) s10).f113184a / 2, ((o) s10).f113185b) * f10;
        if (z10 || z11) {
            if ((z10 && ((o) this.f113248a).f113188e == 2) || (z11 && ((o) this.f113248a).f113189f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z10 || (z11 && ((o) this.f113248a).f113189f != 3)) {
                canvas.translate(0.0f, (((o) this.f113248a).f113184a * (1.0f - f10)) / 2.0f);
            }
        }
        if (z11 && ((o) this.f113248a).f113189f == 3) {
            this.f113261f = f10;
        } else {
            this.f113261f = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.i
    void b(@NonNull Canvas canvas, @NonNull Paint paint, @androidx.annotation.l int i10, @g0(from = 0, to = b3.f12144d) int i11) {
        int iA = u.a(i10, i11);
        if (((o) this.f113248a).f113289k <= 0 || iA == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iA);
        PointF pointF = new PointF((this.f113257b / 2.0f) - (this.f113258c / 2.0f), 0.0f);
        S s10 = this.f113248a;
        i(canvas, paint, pointF, ((o) s10).f113289k, ((o) s10).f113289k);
    }

    @Override // com.google.android.material.progressindicator.i
    void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull i.a aVar, int i10) {
        int iA = u.a(aVar.f113251c, i10);
        float f10 = aVar.f113249a;
        float f11 = aVar.f113250b;
        int i11 = aVar.f113252d;
        h(canvas, paint, f10, f11, iA, i11, i11);
    }

    @Override // com.google.android.material.progressindicator.i
    void d(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, int i10, int i11, @t0 int i12) {
        h(canvas, paint, f10, f11, u.a(i10, i11), i12, i12);
    }

    @Override // com.google.android.material.progressindicator.i
    int e() {
        return ((o) this.f113248a).f113184a;
    }

    @Override // com.google.android.material.progressindicator.i
    int f() {
        return -1;
    }
}
