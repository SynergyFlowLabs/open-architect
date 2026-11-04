package com.planner5d.library.uploadplan.view.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.github.danielnilsson9.colorpickerview.view.d;
import kotlin.enums.c;
import kotlin.internal.n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f231200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f231201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f231202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f231203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final Bitmap f231204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f231205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f231206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f231207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final float f231208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final float f231209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float f231210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final Paint f231211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Paint f231212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final Paint f231213n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final Paint f231214o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final Paint f231215p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f231216q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f231217r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f231218s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f231219t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private EnumC1712a f231220u;

    /* JADX INFO: renamed from: com.planner5d.library.uploadplan.view.widget.a$a, reason: collision with other inner class name */
    public enum EnumC1712a {
        None,
        Start,
        End;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f231225e = c.c(k());

        @NotNull
        public static kotlin.enums.a<EnumC1712a> l() {
            return f231225e;
        }
    }

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f231200a = d.a(context, 10.0f);
        this.f231201b = d.a(context, 20.0f);
        float fA = d.a(context, 1.0f);
        this.f231202c = fA;
        this.f231203d = d.a(context, 16.0f);
        Drawable drawableB = j.a.b(context, he.b.h.f282540ki);
        this.f231204e = drawableB != null ? androidx.core.graphics.drawable.d.b(drawableB, 0, 0, null, 7, null) : null;
        float fA2 = d.a(context, 8.0f);
        this.f231205f = fA2;
        float fA3 = d.a(context, 1.0f);
        this.f231206g = fA3;
        this.f231207h = d.a(context, 10.0f);
        this.f231208i = d.a(context, 4.0f);
        this.f231209j = d.a(context, 0.75f);
        this.f231210k = d.a(context, 1.0f);
        Paint paint = new Paint(1);
        this.f231211l = paint;
        Paint paint2 = new Paint(1);
        this.f231212m = paint2;
        Paint paint3 = new Paint(1);
        this.f231213n = paint3;
        Paint paint4 = new Paint(1);
        this.f231214o = paint4;
        Paint paint5 = new Paint(1);
        this.f231215p = paint5;
        this.f231220u = EnumC1712a.None;
        paint.setColor(context.getColor(he.b.f.f281580t4));
        paint.setAlpha(128);
        paint2.setColor(context.getColor(he.b.f.f281580t4));
        paint2.setAlpha(90);
        paint3.setColor(context.getColor(he.b.f.f281334io));
        paint3.setStrokeWidth(fA2);
        paint4.setColor(context.getColor(he.b.f.bo));
        paint4.setStrokeWidth(fA);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        paint5.setColor(context.getColor(he.b.f.jo));
        paint5.setStrokeWidth(fA3);
        paint5.setStrokeCap(Paint.Cap.BUTT);
    }

    private final void a(float f10, float f11, float f12, Canvas canvas, Paint paint) {
        float f13 = this.f231203d / 2;
        double d10 = f12;
        float fCos = ((float) Math.cos(Math.toRadians(d10))) * f13;
        float fSin = ((float) Math.sin(Math.toRadians(d10))) * f13;
        double d11 = f12 + 90;
        float fCos2 = ((float) Math.cos(Math.toRadians(d11))) * f13;
        float fSin2 = f13 * ((float) Math.sin(Math.toRadians(d11)));
        canvas.drawLine(f10 - fCos, f11 - fSin, f10 + fCos, f11 + fSin, paint);
        canvas.drawLine(f10 - fCos2, f11 - fSin2, f10 + fCos2, f11 + fSin2, paint);
    }

    private final void b(float f10, float f11, float f12, Canvas canvas) {
        Bitmap bitmap = this.f231204e;
        if (bitmap != null) {
            Matrix matrix = new Matrix();
            matrix.postTranslate((this.f231201b + this.f231200a) / 2.0f, (-bitmap.getHeight()) / 2.0f);
            matrix.postRotate(f12);
            matrix.postTranslate(f10, f11);
            canvas.drawBitmap(bitmap, matrix, null);
        }
    }

    private final void c(Canvas canvas, float f10, float f11) {
        canvas.drawCircle(f10, f11, this.f231200a, this.f231211l);
        float degrees = (float) Math.toDegrees(Math.atan2(this.f231219t - this.f231217r, this.f231218s - this.f231216q));
        a(f10, f11, degrees, canvas, this.f231214o);
        b(f10, f11, degrees - 90, canvas);
    }

    private final void d(Canvas canvas) {
        e(canvas);
        f(canvas);
        c(canvas, this.f231216q, this.f231217r);
        c(canvas, this.f231218s, this.f231219t);
    }

    private final void e(Canvas canvas) {
        Canvas canvas2;
        String str;
        float f10;
        float f11;
        int i10;
        canvas.drawLine(this.f231216q, this.f231217r, this.f231218s, this.f231219t, this.f231213n);
        float f12 = this.f231218s;
        float f13 = this.f231216q;
        float f14 = (f12 - f13) * (f12 - f13);
        float f15 = this.f231219t;
        float f16 = this.f231217r;
        float fSqrt = (float) Math.sqrt(f14 + ((f15 - f16) * (f15 - f16)));
        float degrees = (float) Math.toDegrees(Math.atan2(this.f231219t - this.f231217r, this.f231218s - this.f231216q));
        float f17 = this.f231208i;
        float f18 = f17 + this.f231209j;
        float f19 = f17 - this.f231210k;
        double d10 = degrees;
        float fCos = (float) Math.cos(Math.toRadians(d10));
        float fSin = (float) Math.sin(Math.toRadians(d10));
        double d11 = 90 + degrees;
        float fCos2 = (float) Math.cos(Math.toRadians(d11));
        float fSin2 = (float) Math.sin(Math.toRadians(d11));
        float f20 = this.f231207h;
        int i11 = (int) (((double) f20) * 1.5d);
        int i12 = (int) fSqrt;
        int i13 = i12 - ((int) f20);
        int i14 = (int) f20;
        String str2 = "Step must be positive, was: ";
        if (i14 <= 0) {
            throw new IllegalArgumentException("Step must be positive, was: " + i14 + ".");
        }
        int iC = n.c(i11, i13, i14);
        if (i11 <= iC) {
            while (true) {
                float f21 = i11;
                float f22 = this.f231216q + (f21 * fCos);
                float f23 = this.f231209j;
                float f24 = f22 - (f23 * fCos2);
                int i15 = iC;
                float f25 = (this.f231217r + (f21 * fSin)) - (f23 * fSin2);
                float f26 = f18;
                f10 = f19;
                str = str2;
                int i16 = i11;
                f11 = fCos;
                i10 = 2;
                canvas2 = canvas;
                canvas2.drawLine(f24, f25, (f18 * fCos2) + f24, (f18 * fSin2) + f25, this.f231215p);
                canvas2.drawCircle(f24, f25, this.f231206g / 2, this.f231215p);
                if (i16 == i15) {
                    break;
                }
                i11 = i16 + i14;
                iC = i15;
                f19 = f10;
                fCos = f11;
                f18 = f26;
                str2 = str;
            }
        } else {
            canvas2 = canvas;
            str = "Step must be positive, was: ";
            f10 = f19;
            f11 = fCos;
            i10 = 2;
        }
        float f27 = this.f231207h;
        int i17 = (int) f27;
        int i18 = i12 - ((int) f27);
        int i19 = (int) f27;
        if (i19 <= 0) {
            throw new IllegalArgumentException(str + i19 + ".");
        }
        int iC2 = n.c(i17, i18, i19);
        if (i17 > iC2) {
            return;
        }
        int i20 = i17;
        while (true) {
            float f28 = i20;
            float f29 = this.f231216q + (f28 * f11);
            float f30 = this.f231210k;
            float f31 = f29 + (f30 * fCos2);
            float f32 = this.f231217r + (f28 * fSin) + (f30 * fSin2);
            canvas2.drawLine(f31, f32, (f10 * fCos2) + f31, (f10 * fSin2) + f32, this.f231215p);
            canvas2.drawCircle(f31, f32, this.f231206g / i10, this.f231215p);
            if (i20 == iC2) {
                return;
            } else {
                i20 += i19;
            }
        }
    }

    private final void f(Canvas canvas) {
        if (this.f231220u == EnumC1712a.Start) {
            g(canvas, this.f231216q, this.f231217r);
        }
        if (this.f231220u == EnumC1712a.End) {
            g(canvas, this.f231218s, this.f231219t);
        }
    }

    private final void g(Canvas canvas, float f10, float f11) {
        canvas.drawCircle(f10, f11, this.f231201b, this.f231212m);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        d(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    public final void h(float f10, float f11, float f12, float f13, @NotNull EnumC1712a dragPoint) {
        Intrinsics.checkNotNullParameter(dragPoint, "dragPoint");
        this.f231216q = f10;
        this.f231217r = f11;
        this.f231218s = f12;
        this.f231219t = f13;
        this.f231220u = dragPoint;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }
}
