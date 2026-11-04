package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l;
import androidx.annotation.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class d extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f10483m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f10484n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f10485o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f10486p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f10487q = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Paint f10488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f10489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f10490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f10491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f10492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f10493f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Path f10494g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f10495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f10497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f10498k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f10499l;

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    public d(Context context) {
        Paint paint = new Paint();
        this.f10488a = paint;
        this.f10494g = new Path();
        this.f10496i = false;
        this.f10499l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, i.a.m.C3, i.a.b.f285964o1, i.a.l.f286444v1);
        p(typedArrayObtainStyledAttributes.getColor(i.a.m.G3, 0));
        o(typedArrayObtainStyledAttributes.getDimension(i.a.m.K3, 0.0f));
        s(typedArrayObtainStyledAttributes.getBoolean(i.a.m.J3, true));
        r(Math.round(typedArrayObtainStyledAttributes.getDimension(i.a.m.I3, 0.0f)));
        this.f10495h = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.a.m.H3, 0);
        this.f10490c = Math.round(typedArrayObtainStyledAttributes.getDimension(i.a.m.F3, 0.0f));
        this.f10489b = Math.round(typedArrayObtainStyledAttributes.getDimension(i.a.m.D3, 0.0f));
        this.f10491d = typedArrayObtainStyledAttributes.getDimension(i.a.m.E3, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static float k(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    public float a() {
        return this.f10489b;
    }

    public float b() {
        return this.f10491d;
    }

    public float c() {
        return this.f10490c;
    }

    public float d() {
        return this.f10488a.getStrokeWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int i10 = this.f10499l;
        boolean z10 = false;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? androidx.core.graphics.drawable.c.f(this) == 0 : androidx.core.graphics.drawable.c.f(this) == 1))) {
            z10 = true;
        }
        float f10 = this.f10489b;
        float fK = k(this.f10490c, (float) Math.sqrt(f10 * f10 * 2.0f), this.f10497j);
        float fK2 = k(this.f10490c, this.f10491d, this.f10497j);
        float fRound = Math.round(k(0.0f, this.f10498k, this.f10497j));
        float fK3 = k(0.0f, f10487q, this.f10497j);
        float fK4 = k(z10 ? 0.0f : -180.0f, z10 ? 180.0f : 0.0f, this.f10497j);
        double d10 = fK;
        double d11 = fK3;
        boolean z11 = z10;
        float fRound2 = Math.round(Math.cos(d11) * d10);
        float fRound3 = Math.round(d10 * Math.sin(d11));
        this.f10494g.rewind();
        float fK5 = k(this.f10492e + this.f10488a.getStrokeWidth(), -this.f10498k, this.f10497j);
        float f11 = (-fK2) / 2.0f;
        this.f10494g.moveTo(f11 + fRound, 0.0f);
        this.f10494g.rLineTo(fK2 - (fRound * 2.0f), 0.0f);
        this.f10494g.moveTo(f11, fK5);
        this.f10494g.rLineTo(fRound2, fRound3);
        this.f10494g.moveTo(f11, -fK5);
        this.f10494g.rLineTo(fRound2, -fRound3);
        this.f10494g.close();
        canvas.save();
        float strokeWidth = this.f10488a.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        float f12 = this.f10492e;
        canvas.translate(bounds.centerX(), ((((int) (fHeight - (f12 * 2.0f))) / 4) * 2) + (strokeWidth * 1.5f) + f12);
        if (this.f10493f) {
            canvas.rotate(fK4 * (this.f10496i ^ z11 ? -1 : 1));
        } else if (z11) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f10494g, this.f10488a);
        canvas.restore();
    }

    @l
    public int e() {
        return this.f10488a.getColor();
    }

    public int f() {
        return this.f10499l;
    }

    public float g() {
        return this.f10492e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f10495h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f10495h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final Paint h() {
        return this.f10488a;
    }

    @x(from = 0.0d, to = 1.0d)
    public float i() {
        return this.f10497j;
    }

    public boolean j() {
        return this.f10493f;
    }

    public void l(float f10) {
        if (this.f10489b != f10) {
            this.f10489b = f10;
            invalidateSelf();
        }
    }

    public void m(float f10) {
        if (this.f10491d != f10) {
            this.f10491d = f10;
            invalidateSelf();
        }
    }

    public void n(float f10) {
        if (this.f10490c != f10) {
            this.f10490c = f10;
            invalidateSelf();
        }
    }

    public void o(float f10) {
        if (this.f10488a.getStrokeWidth() != f10) {
            this.f10488a.setStrokeWidth(f10);
            this.f10498k = (float) (((double) (f10 / 2.0f)) * Math.cos(f10487q));
            invalidateSelf();
        }
    }

    public void p(@l int i10) {
        if (i10 != this.f10488a.getColor()) {
            this.f10488a.setColor(i10);
            invalidateSelf();
        }
    }

    public void q(int i10) {
        if (i10 != this.f10499l) {
            this.f10499l = i10;
            invalidateSelf();
        }
    }

    public void r(float f10) {
        if (f10 != this.f10492e) {
            this.f10492e = f10;
            invalidateSelf();
        }
    }

    public void s(boolean z10) {
        if (this.f10493f != z10) {
            this.f10493f = z10;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (i10 != this.f10488a.getAlpha()) {
            this.f10488a.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f10488a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(@x(from = 0.0d, to = 1.0d) float f10) {
        if (this.f10497j != f10) {
            this.f10497j = f10;
            invalidateSelf();
        }
    }

    public void t(boolean z10) {
        if (this.f10496i != z10) {
            this.f10496i = z10;
            invalidateSelf();
        }
    }
}
