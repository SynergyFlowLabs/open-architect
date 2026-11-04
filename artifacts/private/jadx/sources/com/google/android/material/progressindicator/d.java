package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.t0;
import androidx.annotation.x;
import androidx.collection.b3;
import com.google.android.material.color.u;

/* JADX INFO: loaded from: classes4.dex */
final class d extends i<f> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f113191g = 0.01f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f113192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f113193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f113194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f113195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @x(from = 0.0d, to = 1.0d)
    private float f113196f;

    d(@NonNull f fVar) {
        super(fVar);
    }

    private void h(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, @androidx.annotation.l int i10, @t0 int i11, @t0 int i12) {
        float f12 = f11 >= f10 ? f11 - f10 : (f11 + 1.0f) - f10;
        float f13 = f10 % 1.0f;
        if (this.f113196f < 1.0f) {
            float f14 = f13 + f12;
            if (f14 > 1.0f) {
                h(canvas, paint, f13, 1.0f, i10, i11, 0);
                h(canvas, paint, 1.0f, f14, i10, 0, i12);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f113193c / this.f113194d);
        if (f13 == 0.0f && f12 >= 0.99f) {
            f12 += ((f12 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float f15 = y6.a.f(1.0f - this.f113196f, 1.0f, f13);
        float f16 = y6.a.f(0.0f, this.f113196f, f12);
        float degrees2 = (float) Math.toDegrees(i11 / this.f113194d);
        float degrees3 = ((f16 * 360.0f) - degrees2) - ((float) Math.toDegrees(i12 / this.f113194d));
        float f17 = (f15 * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i10);
        paint.setStrokeWidth(this.f113192b);
        float f18 = degrees * 2.0f;
        if (degrees3 < f18) {
            float f19 = degrees3 / f18;
            paint.setStyle(Paint.Style.FILL);
            j(canvas, paint, f17 + (degrees * f19), this.f113193c * 2.0f, this.f113192b, f19);
            return;
        }
        float f20 = this.f113194d;
        RectF rectF = new RectF(-f20, -f20, f20, f20);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f113195e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f21 = f17 + degrees;
        canvas.drawArc(rectF, f21, degrees3 - f18, false, paint);
        if (this.f113195e || this.f113193c <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        i(canvas, paint, f21, this.f113193c * 2.0f, this.f113192b);
        i(canvas, paint, (f17 + degrees3) - degrees, this.f113193c * 2.0f, this.f113192b);
    }

    private void i(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, float f12) {
        j(canvas, paint, f10, f11, f12, 1.0f);
    }

    private void j(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, float f12, float f13) {
        float fMin = (int) Math.min(f12, this.f113192b);
        float f14 = f11 / 2.0f;
        float fMin2 = Math.min(f14, (this.f113193c * fMin) / this.f113192b);
        RectF rectF = new RectF((-fMin) / 2.0f, (-f11) / 2.0f, fMin / 2.0f, f14);
        canvas.save();
        double d10 = f10;
        canvas.translate((float) (((double) this.f113194d) * Math.cos(Math.toRadians(d10))), (float) (((double) this.f113194d) * Math.sin(Math.toRadians(d10))));
        canvas.rotate(f10);
        canvas.scale(f13, f13);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    private int k() {
        S s10 = this.f113248a;
        return ((f) s10).f113221h + (((f) s10).f113222i * 2);
    }

    @Override // com.google.android.material.progressindicator.i
    void a(@NonNull Canvas canvas, @NonNull Rect rect, @x(from = 0.0d, to = 1.0d) float f10, boolean z10, boolean z11) {
        float fWidth = rect.width() / f();
        float fHeight = rect.height() / e();
        S s10 = this.f113248a;
        float f11 = (((f) s10).f113221h / 2.0f) + ((f) s10).f113222i;
        canvas.translate((f11 * fWidth) + rect.left, (f11 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (((f) this.f113248a).f113223j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f12 = -f11;
        canvas.clipRect(f12, f12, f11, f11);
        S s11 = this.f113248a;
        this.f113195e = ((f) s11).f113184a / 2 <= ((f) s11).f113185b;
        this.f113192b = ((f) s11).f113184a * f10;
        this.f113193c = Math.min(((f) s11).f113184a / 2, ((f) s11).f113185b) * f10;
        S s12 = this.f113248a;
        float f13 = (((f) s12).f113221h - ((f) s12).f113184a) / 2.0f;
        this.f113194d = f13;
        if (z10 || z11) {
            if ((z10 && ((f) s12).f113188e == 2) || (z11 && ((f) s12).f113189f == 1)) {
                this.f113194d = f13 + (((1.0f - f10) * ((f) s12).f113184a) / 2.0f);
            } else if ((z10 && ((f) s12).f113188e == 1) || (z11 && ((f) s12).f113189f == 2)) {
                this.f113194d = f13 - (((1.0f - f10) * ((f) s12).f113184a) / 2.0f);
            }
        }
        if (z11 && ((f) s12).f113189f == 3) {
            this.f113196f = f10;
        } else {
            this.f113196f = 1.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.i
    void b(@NonNull Canvas canvas, @NonNull Paint paint, @androidx.annotation.l int i10, @g0(from = 0, to = b3.f12144d) int i11) {
    }

    @Override // com.google.android.material.progressindicator.i
    void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull i.a aVar, @g0(from = 0, to = b3.f12144d) int i10) {
        int iA = u.a(aVar.f113251c, i10);
        float f10 = aVar.f113249a;
        float f11 = aVar.f113250b;
        int i11 = aVar.f113252d;
        h(canvas, paint, f10, f11, iA, i11, i11);
    }

    @Override // com.google.android.material.progressindicator.i
    void d(@NonNull Canvas canvas, @NonNull Paint paint, float f10, float f11, @androidx.annotation.l int i10, @g0(from = 0, to = b3.f12144d) int i11, int i12) {
        h(canvas, paint, f10, f11, u.a(i10, i11), i12, i12);
    }

    @Override // com.google.android.material.progressindicator.i
    int e() {
        return k();
    }

    @Override // com.google.android.material.progressindicator.i
    int f() {
        return k();
    }
}
