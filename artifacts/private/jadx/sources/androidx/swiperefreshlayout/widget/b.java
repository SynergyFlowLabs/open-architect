package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.core.util.t;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class b extends Drawable implements Animatable {
    private static final float H1 = 0.01f;
    private static final float X = 0.75f;
    private static final float Y = 0.5f;
    private static final int Z = 1332;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f75431i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f75432j = 11.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f75433k = 3.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f75434l = 12;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f75435m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f75436n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final float f75437o = 7.5f;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final float f75438p0 = 216.0f;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final float f75439p1 = 0.8f;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final float f75440p2 = 0.20999998f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f75441s = 2.5f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f75442t = 10;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f75443v = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f75445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f75446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Resources f75447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Animator f75448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f75449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f75450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Interpolator f75429g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Interpolator f75430h = new androidx.interpolator.view.animation.b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int[] f75444w = {-16777216};

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f75451a;

        a(d dVar) {
            this.f75451a = dVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.G(fFloatValue, this.f75451a);
            b.this.d(fFloatValue, this.f75451a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.swiperefreshlayout.widget.b$b, reason: collision with other inner class name */
    class C0760b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f75453a;

        C0760b(d dVar) {
            this.f75453a = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.d(1.0f, this.f75453a, true);
            this.f75453a.M();
            this.f75453a.v();
            b bVar = b.this;
            if (!bVar.f75450f) {
                bVar.f75449e += 1.0f;
                return;
            }
            bVar.f75450f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f75453a.I(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f75449e = 0.0f;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final RectF f75455a = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Paint f75456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Paint f75457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Paint f75458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f75459e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f75460f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f75461g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        float f75462h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int[] f75463i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f75464j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f75465k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f75466l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f75467m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f75468n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Path f75469o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f75470p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        float f75471q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f75472r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f75473s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f75474t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f75475u;

        d() {
            Paint paint = new Paint();
            this.f75456b = paint;
            Paint paint2 = new Paint();
            this.f75457c = paint2;
            Paint paint3 = new Paint();
            this.f75458d = paint3;
            this.f75459e = 0.0f;
            this.f75460f = 0.0f;
            this.f75461g = 0.0f;
            this.f75462h = 5.0f;
            this.f75470p = 1.0f;
            this.f75474t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        void A(int i10) {
            this.f75458d.setColor(i10);
        }

        void B(float f10) {
            this.f75471q = f10;
        }

        void C(int i10) {
            this.f75475u = i10;
        }

        void D(ColorFilter colorFilter) {
            this.f75456b.setColorFilter(colorFilter);
        }

        void E(int i10) {
            this.f75464j = i10;
            this.f75475u = this.f75463i[i10];
        }

        void F(@NonNull int[] iArr) {
            this.f75463i = iArr;
            E(0);
        }

        void G(float f10) {
            this.f75460f = f10;
        }

        void H(float f10) {
            this.f75461g = f10;
        }

        void I(boolean z10) {
            if (this.f75468n != z10) {
                this.f75468n = z10;
            }
        }

        void J(float f10) {
            this.f75459e = f10;
        }

        void K(Paint.Cap cap) {
            this.f75456b.setStrokeCap(cap);
        }

        void L(float f10) {
            this.f75462h = f10;
            this.f75456b.setStrokeWidth(f10);
        }

        void M() {
            this.f75465k = this.f75459e;
            this.f75466l = this.f75460f;
            this.f75467m = this.f75461g;
        }

        void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f75455a;
            float f10 = this.f75471q;
            float fMin = (this.f75462h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f75472r * this.f75470p) / 2.0f, this.f75462h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f75459e;
            float f12 = this.f75461g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f75460f + f12) * 360.0f) - f13;
            this.f75456b.setColor(this.f75475u);
            this.f75456b.setAlpha(this.f75474t);
            float f15 = this.f75462h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f75458d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f75456b);
            b(canvas, f13, f14, rectF);
        }

        void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f75468n) {
                Path path = this.f75469o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f75469o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f75472r * this.f75470p) / 2.0f;
                this.f75469o.moveTo(0.0f, 0.0f);
                this.f75469o.lineTo(this.f75472r * this.f75470p, 0.0f);
                Path path3 = this.f75469o;
                float f13 = this.f75472r;
                float f14 = this.f75470p;
                path3.lineTo((f13 * f14) / 2.0f, this.f75473s * f14);
                this.f75469o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f75462h / 2.0f));
                this.f75469o.close();
                this.f75457c.setColor(this.f75475u);
                this.f75457c.setAlpha(this.f75474t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f75469o, this.f75457c);
                canvas.restore();
            }
        }

        int c() {
            return this.f75474t;
        }

        float d() {
            return this.f75473s;
        }

        float e() {
            return this.f75470p;
        }

        float f() {
            return this.f75472r;
        }

        int g() {
            return this.f75458d.getColor();
        }

        float h() {
            return this.f75471q;
        }

        int[] i() {
            return this.f75463i;
        }

        float j() {
            return this.f75460f;
        }

        int k() {
            return this.f75463i[l()];
        }

        int l() {
            return (this.f75464j + 1) % this.f75463i.length;
        }

        float m() {
            return this.f75461g;
        }

        boolean n() {
            return this.f75468n;
        }

        float o() {
            return this.f75459e;
        }

        int p() {
            return this.f75463i[this.f75464j];
        }

        float q() {
            return this.f75466l;
        }

        float r() {
            return this.f75467m;
        }

        float s() {
            return this.f75465k;
        }

        Paint.Cap t() {
            return this.f75456b.getStrokeCap();
        }

        float u() {
            return this.f75462h;
        }

        void v() {
            E(l());
        }

        void w() {
            this.f75465k = 0.0f;
            this.f75466l = 0.0f;
            this.f75467m = 0.0f;
            J(0.0f);
            G(0.0f);
            H(0.0f);
        }

        void x(int i10) {
            this.f75474t = i10;
        }

        void y(float f10, float f11) {
            this.f75472r = (int) f10;
            this.f75473s = (int) f11;
        }

        void z(float f10) {
            if (f10 != this.f75470p) {
                this.f75470p = f10;
            }
        }
    }

    public b(@NonNull Context context) {
        this.f75447c = ((Context) t.l(context)).getResources();
        d dVar = new d();
        this.f75445a = dVar;
        dVar.F(f75444w);
        D(2.5f);
        F();
    }

    private void A(float f10, float f11, float f12, float f13) {
        d dVar = this.f75445a;
        float f14 = this.f75447c.getDisplayMetrics().density;
        dVar.L(f11 * f14);
        dVar.B(f10 * f14);
        dVar.E(0);
        dVar.y(f12 * f14, f13 * f14);
    }

    private void F() {
        d dVar = this.f75445a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f75429g);
        valueAnimatorOfFloat.addListener(new C0760b(dVar));
        this.f75448d = valueAnimatorOfFloat;
    }

    private void a(float f10, d dVar) {
        G(f10, dVar);
        float fFloor = (float) (Math.floor(dVar.r() / 0.8f) + 1.0d);
        dVar.J(dVar.s() + (((dVar.q() - 0.01f) - dVar.s()) * f10));
        dVar.G(dVar.q());
        dVar.H(dVar.r() + ((fFloor - dVar.r()) * f10));
    }

    private int e(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    private float o() {
        return this.f75446b;
    }

    private void z(float f10) {
        this.f75446b = f10;
    }

    public void B(float f10, float f11) {
        this.f75445a.J(f10);
        this.f75445a.G(f11);
        invalidateSelf();
    }

    public void C(@NonNull Paint.Cap cap) {
        this.f75445a.K(cap);
        invalidateSelf();
    }

    public void D(float f10) {
        this.f75445a.L(f10);
        invalidateSelf();
    }

    public void E(int i10) {
        if (i10 == 0) {
            A(f75432j, f75433k, 12.0f, 6.0f);
        } else {
            A(f75437o, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    void G(float f10, d dVar) {
        if (f10 > 0.75f) {
            dVar.C(e((f10 - 0.75f) / 0.25f, dVar.p(), dVar.k()));
        } else {
            dVar.C(dVar.p());
        }
    }

    void d(float f10, d dVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f75450f) {
            a(f10, dVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fR = dVar.r();
            if (f10 < 0.5f) {
                interpolation = dVar.s();
                interpolation2 = (f75430h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fS = dVar.s() + 0.79f;
                interpolation = fS - (((1.0f - f75430h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fS;
            }
            float f11 = fR + (f75440p2 * f10);
            float f12 = (f10 + this.f75449e) * f75438p0;
            dVar.J(interpolation);
            dVar.G(interpolation2);
            dVar.H(f11);
            z(f12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f75446b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f75445a.a(canvas, bounds);
        canvas.restore();
    }

    public boolean f() {
        return this.f75445a.n();
    }

    public float g() {
        return this.f75445a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f75445a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        return this.f75445a.e();
    }

    public float i() {
        return this.f75445a.f();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f75448d.isRunning();
    }

    public int j() {
        return this.f75445a.g();
    }

    public float k() {
        return this.f75445a.h();
    }

    @NonNull
    public int[] l() {
        return this.f75445a.i();
    }

    public float m() {
        return this.f75445a.j();
    }

    public float n() {
        return this.f75445a.m();
    }

    public float p() {
        return this.f75445a.o();
    }

    @NonNull
    public Paint.Cap q() {
        return this.f75445a.t();
    }

    public float r() {
        return this.f75445a.u();
    }

    public void s(float f10, float f11) {
        this.f75445a.y(f10, f11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f75445a.x(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f75445a.D(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f75448d.cancel();
        this.f75445a.M();
        if (this.f75445a.j() != this.f75445a.o()) {
            this.f75450f = true;
            this.f75448d.setDuration(666L);
            this.f75448d.start();
        } else {
            this.f75445a.E(0);
            this.f75445a.w();
            this.f75448d.setDuration(1332L);
            this.f75448d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f75448d.cancel();
        z(0.0f);
        this.f75445a.I(false);
        this.f75445a.E(0);
        this.f75445a.w();
        invalidateSelf();
    }

    public void t(boolean z10) {
        this.f75445a.I(z10);
        invalidateSelf();
    }

    public void u(float f10) {
        this.f75445a.z(f10);
        invalidateSelf();
    }

    public void v(int i10) {
        this.f75445a.A(i10);
        invalidateSelf();
    }

    public void w(float f10) {
        this.f75445a.B(f10);
        invalidateSelf();
    }

    public void x(@NonNull int... iArr) {
        this.f75445a.F(iArr);
        this.f75445a.E(0);
        invalidateSelf();
    }

    public void y(float f10) {
        this.f75445a.H(f10);
        invalidateSelf();
    }
}
