package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.annotation.x;
import androidx.core.view.u1;
import com.google.android.material.internal.p0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class ClockHandView extends View {
    private static final int H1 = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f114296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeInterpolator f114297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ValueAnimator f114298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f114299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f114300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f114301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f114302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f114303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f114304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<c> f114305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f114306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final float f114307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Paint f114308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final RectF f114309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @t0
    private final int f114310o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f114311p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f114312p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f114313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f114314t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private b f114315v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private double f114316w;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void c(@x(from = 0.0d, to = 360.0d) float f10, boolean z10);
    }

    public interface c {
        void g(@x(from = 0.0d, to = 360.0d) float f10, boolean z10);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.r(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private void c(float f10, float f11) {
        int i10 = 2;
        if (y6.a.a(getWidth() / 2, getHeight() / 2, f10, f11) > i(2) + p0.i(getContext(), 12)) {
            i10 = 1;
        }
        this.f114312p1 = i10;
    }

    private void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int i10 = i(this.f114312p1);
        float f10 = width;
        float f11 = i10;
        float fCos = (((float) Math.cos(this.f114316w)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f114316w))) + f12;
        this.f114308m.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f114306k, this.f114308m);
        double dSin = Math.sin(this.f114316w);
        double dCos = Math.cos(this.f114316w);
        double d10 = i10 - this.f114306k;
        this.f114308m.setStrokeWidth(this.f114310o);
        canvas.drawLine(f10, f12, width + ((int) (dCos * d10)), height + ((int) (d10 * dSin)), this.f114308m);
        canvas.drawCircle(f10, f12, this.f114307l, this.f114308m);
    }

    private int g(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    @r
    private int i(int i10) {
        int i11 = this.f114311p0;
        return i10 == 2 ? Math.round(i11 * 0.66f) : i11;
    }

    private Pair<Float, Float> k(float f10) {
        float fH = h();
        if (Math.abs(fH - f10) > 180.0f) {
            if (fH > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (fH < 180.0f && f10 > 180.0f) {
                fH += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(fH), Float.valueOf(f10));
    }

    private boolean l(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float fG = g(f10, f11);
        boolean z13 = false;
        boolean z14 = h() != fG;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f114299d) {
            z13 = true;
        }
        q(fG, z13);
        return true;
    }

    private void r(@x(from = 0.0d, to = 360.0d) float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f114313s = f11;
        this.f114316w = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fI = i(this.f114312p1);
        float fCos = width + (((float) Math.cos(this.f114316w)) * fI);
        float fSin = height + (fI * ((float) Math.sin(this.f114316w)));
        RectF rectF = this.f114309n;
        int i10 = this.f114306k;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator<c> it = this.f114305j.iterator();
        while (it.hasNext()) {
            it.next().g(f11, z10);
        }
        invalidate();
    }

    public void b(c cVar) {
        this.f114305j.add(cVar);
    }

    int e() {
        return this.f114312p1;
    }

    public RectF f() {
        return this.f114309n;
    }

    @x(from = 0.0d, to = 360.0d)
    public float h() {
        return this.f114313s;
    }

    public int j() {
        return this.f114306k;
    }

    public void m(boolean z10) {
        this.f114299d = z10;
    }

    public void n(@r int i10) {
        this.f114311p0 = i10;
        invalidate();
    }

    void o(int i10) {
        this.f114312p1 = i10;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f114298c.isRunning()) {
            p(h());
        }
    }

    @Override // android.view.View
    @e.a({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        b bVar;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f114300e = x10;
            this.f114301f = y10;
            this.f114302g = true;
            this.f114314t = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f114300e);
            int i11 = (int) (y10 - this.f114301f);
            this.f114302g = (i10 * i10) + (i11 * i11) > this.f114303h;
            z11 = this.f114314t;
            boolean z13 = actionMasked == 1;
            if (this.f114304i) {
                c(x10, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        boolean zL = l(x10, y10, z11, z10, z12) | this.f114314t;
        this.f114314t = zL;
        if (zL && z12 && (bVar = this.f114315v) != null) {
            bVar.c(g(x10, y10), this.f114302g);
        }
        return true;
    }

    public void p(@x(from = 0.0d, to = 360.0d) float f10) {
        q(f10, false);
    }

    public void q(@x(from = 0.0d, to = 360.0d) float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f114298c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            r(f10, false);
            return;
        }
        Pair<Float, Float> pairK = k(f10);
        this.f114298c.setFloatValues(((Float) pairK.first).floatValue(), ((Float) pairK.second).floatValue());
        this.f114298c.setDuration(this.f114296a);
        this.f114298c.setInterpolator(this.f114297b);
        this.f114298c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.a(this.f114342a, valueAnimator2);
            }
        });
        this.f114298c.addListener(new a());
        this.f114298c.start();
    }

    void s(boolean z10) {
        if (this.f114304i && !z10) {
            this.f114312p1 = 1;
        }
        this.f114304i = z10;
        invalidate();
    }

    public void t(b bVar) {
        this.f114315v = bVar;
    }

    public ClockHandView(Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.Ic);
    }

    public ClockHandView(Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f114298c = new ValueAnimator();
        this.f114305j = new ArrayList();
        Paint paint = new Paint();
        this.f114308m = paint;
        this.f114309n = new RectF();
        this.f114312p1 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.f362185y7, i10, r6.a.n.f361508vk);
        this.f114296a = com.google.android.material.motion.j.f(context, r6.a.c.Fd, 200);
        this.f114297b = com.google.android.material.motion.j.g(context, r6.a.c.Vd, com.google.android.material.animation.b.f111044b);
        this.f114311p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.A7, 0);
        this.f114306k = typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.B7, 0);
        Resources resources = getResources();
        this.f114310o = resources.getDimensionPixelSize(r6.a.f.H9);
        this.f114307l = resources.getDimensionPixelSize(r6.a.f.F9);
        int color = typedArrayObtainStyledAttributes.getColor(r6.a.o.f362209z7, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        p(0.0f);
        this.f114303h = ViewConfiguration.get(context).getScaledTouchSlop();
        u1.Y1(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
