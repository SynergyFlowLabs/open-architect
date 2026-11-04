package androidx.recyclerview.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes3.dex */
@l1
class m extends RecyclerView.o implements RecyclerView.t {
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 2;
    private static final int J = 0;
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 3;
    private static final int N = 500;
    private static final int O = 1500;
    private static final int P = 1200;
    private static final int Q = 500;
    private static final int R = 255;
    private static final int[] S = {R.attr.state_pressed};
    private static final int[] T = new int[0];
    int A;
    private final Runnable B;
    private final RecyclerView.u C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f74413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f74414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final StateListDrawable f74415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Drawable f74416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f74417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f74418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StateListDrawable f74419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Drawable f74420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f74421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f74422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @l1
    int f74423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @l1
    int f74424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @l1
    float f74425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @l1
    int f74426n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @l1
    int f74427o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @l1
    float f74428p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView f74431s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final ValueAnimator f74438z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f74429q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f74430r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f74432t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f74433u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f74434v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f74435w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int[] f74436x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int[] f74437y = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m.this.q(500);
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            m.this.D(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f74441a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f74441a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f74441a) {
                this.f74441a = false;
                return;
            }
            if (((Float) m.this.f74438z.getAnimatedValue()).floatValue() == 0.0f) {
                m mVar = m.this;
                mVar.A = 0;
                mVar.A(0);
            } else {
                m mVar2 = m.this;
                mVar2.A = 2;
                mVar2.x();
            }
        }
    }

    private class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            m.this.f74415c.setAlpha(iFloatValue);
            m.this.f74416d.setAlpha(iFloatValue);
            m.this.x();
        }
    }

    m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i10, int i11, int i12) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f74438z = valueAnimatorOfFloat;
        this.A = 0;
        this.B = new a();
        this.C = new b();
        this.f74415c = stateListDrawable;
        this.f74416d = drawable;
        this.f74419g = stateListDrawable2;
        this.f74420h = drawable2;
        this.f74417e = Math.max(i10, stateListDrawable.getIntrinsicWidth());
        this.f74418f = Math.max(i10, drawable.getIntrinsicWidth());
        this.f74421i = Math.max(i10, stateListDrawable2.getIntrinsicWidth());
        this.f74422j = Math.max(i10, drawable2.getIntrinsicWidth());
        this.f74413a = i11;
        this.f74414b = i12;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new d());
        f(recyclerView);
    }

    private void B() {
        this.f74431s.n(this);
        this.f74431s.q(this);
        this.f74431s.r(this.C);
    }

    private void E(float f10) {
        int[] iArrN = n();
        float fMax = Math.max(iArrN[0], Math.min(iArrN[1], f10));
        if (Math.abs(this.f74424l - fMax) < 2.0f) {
            return;
        }
        int iZ = z(this.f74425m, fMax, iArrN, this.f74431s.computeVerticalScrollRange(), this.f74431s.computeVerticalScrollOffset(), this.f74430r);
        if (iZ != 0) {
            this.f74431s.scrollBy(0, iZ);
        }
        this.f74425m = fMax;
    }

    private void g() {
        this.f74431s.removeCallbacks(this.B);
    }

    private void h() {
        this.f74431s.y1(this);
        this.f74431s.B1(this);
        this.f74431s.C1(this.C);
        g();
    }

    private void i(Canvas canvas) {
        int i10 = this.f74430r;
        int i11 = this.f74421i;
        int i12 = i10 - i11;
        int i13 = this.f74427o;
        int i14 = this.f74426n;
        int i15 = i13 - (i14 / 2);
        this.f74419g.setBounds(0, 0, i14, i11);
        this.f74420h.setBounds(0, 0, this.f74429q, this.f74422j);
        canvas.translate(0.0f, i12);
        this.f74420h.draw(canvas);
        canvas.translate(i15, 0.0f);
        this.f74419g.draw(canvas);
        canvas.translate(-i15, -i12);
    }

    private void j(Canvas canvas) {
        int i10 = this.f74429q;
        int i11 = this.f74417e;
        int i12 = i10 - i11;
        int i13 = this.f74424l;
        int i14 = this.f74423k;
        int i15 = i13 - (i14 / 2);
        this.f74415c.setBounds(0, 0, i11, i14);
        this.f74416d.setBounds(0, 0, this.f74418f, this.f74430r);
        if (!t()) {
            canvas.translate(i12, 0.0f);
            this.f74416d.draw(canvas);
            canvas.translate(0.0f, i15);
            this.f74415c.draw(canvas);
            canvas.translate(-i12, -i15);
            return;
        }
        this.f74416d.draw(canvas);
        canvas.translate(this.f74417e, i15);
        canvas.scale(-1.0f, 1.0f);
        this.f74415c.draw(canvas);
        canvas.scale(-1.0f, 1.0f);
        canvas.translate(-this.f74417e, -i15);
    }

    private int[] k() {
        int[] iArr = this.f74437y;
        int i10 = this.f74414b;
        iArr[0] = i10;
        iArr[1] = this.f74429q - i10;
        return iArr;
    }

    private int[] n() {
        int[] iArr = this.f74436x;
        int i10 = this.f74414b;
        iArr[0] = i10;
        iArr[1] = this.f74430r - i10;
        return iArr;
    }

    private void r(float f10) {
        int[] iArrK = k();
        float fMax = Math.max(iArrK[0], Math.min(iArrK[1], f10));
        if (Math.abs(this.f74427o - fMax) < 2.0f) {
            return;
        }
        int iZ = z(this.f74428p, fMax, iArrK, this.f74431s.computeHorizontalScrollRange(), this.f74431s.computeHorizontalScrollOffset(), this.f74429q);
        if (iZ != 0) {
            this.f74431s.scrollBy(iZ, 0);
        }
        this.f74428p = fMax;
    }

    private boolean t() {
        return u1.c0(this.f74431s) == 1;
    }

    private void y(int i10) {
        g();
        this.f74431s.postDelayed(this.B, i10);
    }

    private int z(float f10, float f11, int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[1] - iArr[0];
        if (i13 == 0) {
            return 0;
        }
        int i14 = i10 - i12;
        int i15 = (int) (((f11 - f10) / i13) * i14);
        int i16 = i11 + i15;
        if (i16 >= i14 || i16 < 0) {
            return 0;
        }
        return i15;
    }

    void A(int i10) {
        if (i10 == 2 && this.f74434v != 2) {
            this.f74415c.setState(S);
            g();
        }
        if (i10 == 0) {
            x();
        } else {
            C();
        }
        if (this.f74434v == 2 && i10 != 2) {
            this.f74415c.setState(T);
            y(P);
        } else if (i10 == 1) {
            y(1500);
        }
        this.f74434v = i10;
    }

    public void C() {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 != 3) {
                return;
            } else {
                this.f74438z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f74438z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f74438z.setDuration(500L);
        this.f74438z.setStartDelay(0L);
        this.f74438z.start();
    }

    void D(int i10, int i11) {
        int iComputeVerticalScrollRange = this.f74431s.computeVerticalScrollRange();
        int i12 = this.f74430r;
        int i13 = (3 >> 0) << 1;
        this.f74432t = iComputeVerticalScrollRange - i12 > 0 && i12 >= this.f74413a;
        int iComputeHorizontalScrollRange = this.f74431s.computeHorizontalScrollRange();
        int i14 = this.f74429q;
        boolean z10 = iComputeHorizontalScrollRange - i14 > 0 && i14 >= this.f74413a;
        this.f74433u = z10;
        boolean z11 = this.f74432t;
        if (!z11 && !z10) {
            if (this.f74434v != 0) {
                A(0);
                return;
            }
            return;
        }
        if (z11) {
            float f10 = i12;
            this.f74424l = (int) ((f10 * (i11 + (f10 / 2.0f))) / iComputeVerticalScrollRange);
            this.f74423k = Math.min(i12, (i12 * i12) / iComputeVerticalScrollRange);
        }
        if (this.f74433u) {
            float f11 = i14;
            this.f74427o = (int) ((f11 * (i10 + (f11 / 2.0f))) / iComputeHorizontalScrollRange);
            this.f74426n = Math.min(i14, (i14 * i14) / iComputeHorizontalScrollRange);
        }
        int i15 = this.f74434v;
        if (i15 == 0 || i15 == 1) {
            A(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        if (this.f74434v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zV = v(motionEvent.getX(), motionEvent.getY());
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            if (zV || zU) {
                if (zU) {
                    this.f74435w = 1;
                    this.f74428p = (int) motionEvent.getX();
                } else if (zV) {
                    this.f74435w = 2;
                    this.f74425m = (int) motionEvent.getY();
                }
                A(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f74434v == 2) {
            this.f74425m = 0.0f;
            this.f74428p = 0.0f;
            A(1);
            this.f74435w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f74434v == 2) {
            C();
            if (this.f74435w == 1) {
                r(motionEvent.getX());
            }
            if (this.f74435w == 2) {
                E(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        int i10 = this.f74434v;
        if (i10 != 1) {
            return i10 == 2;
        }
        boolean zV = v(motionEvent.getX(), motionEvent.getY());
        boolean zU = u(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!zV && !zU)) {
            return false;
        }
        if (zU) {
            this.f74435w = 1;
            this.f74428p = (int) motionEvent.getX();
        } else if (zV) {
            this.f74435w = 2;
            this.f74425m = (int) motionEvent.getY();
        }
        A(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void e(boolean z10) {
    }

    public void f(@p0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f74431s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            h();
        }
        this.f74431s = recyclerView;
        if (recyclerView != null) {
            B();
        }
    }

    @l1
    Drawable l() {
        return this.f74419g;
    }

    @l1
    Drawable m() {
        return this.f74420h;
    }

    @l1
    Drawable o() {
        return this.f74415c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        if (this.f74429q != this.f74431s.getWidth() || this.f74430r != this.f74431s.getHeight()) {
            this.f74429q = this.f74431s.getWidth();
            this.f74430r = this.f74431s.getHeight();
            A(0);
        } else if (this.A != 0) {
            if (this.f74432t) {
                j(canvas);
            }
            if (this.f74433u) {
                i(canvas);
            }
        }
    }

    @l1
    Drawable p() {
        return this.f74416d;
    }

    @l1
    void q(int i10) {
        int i11 = this.A;
        if (i11 == 1) {
            this.f74438z.cancel();
        } else if (i11 != 2) {
            return;
        }
        this.A = 3;
        ValueAnimator valueAnimator = this.f74438z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f74438z.setDuration(i10);
        this.f74438z.start();
    }

    public boolean s() {
        return this.f74434v == 2;
    }

    @l1
    boolean u(float f10, float f11) {
        if (f11 < this.f74430r - this.f74421i) {
            return false;
        }
        int i10 = this.f74427o;
        int i11 = this.f74426n;
        return f10 >= ((float) (i10 - (i11 / 2))) && f10 <= ((float) (i10 + (i11 / 2)));
    }

    @l1
    boolean v(float f10, float f11) {
        int i10;
        int i11;
        if (t()) {
            if (f10 <= this.f74417e) {
                i10 = this.f74424l;
                i11 = this.f74423k;
                if (f11 >= i10 - (i11 / 2) && f11 <= i10 + (i11 / 2)) {
                    int i12 = 2 << 1;
                    return true;
                }
            }
        } else if (f10 >= this.f74429q - this.f74417e) {
            i10 = this.f74424l;
            i11 = this.f74423k;
            if (f11 >= i10 - (i11 / 2)) {
                int i13 = 2 << 1;
                return true;
            }
        }
        return false;
    }

    @l1
    boolean w() {
        return this.f74434v == 1;
    }

    void x() {
        this.f74431s.invalidate();
    }
}
