package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.view.a1;
import androidx.core.view.t0;
import androidx.core.view.u0;
import androidx.core.view.u1;
import androidx.core.view.v0;
import androidx.core.view.w0;
import androidx.core.view.x0;
import androidx.core.view.y0;
import androidx.core.view.z0;
import androidx.core.widget.n;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeRefreshLayout extends ViewGroup implements y0, x0, u0, t0, z0, v0 {
    public static final int A3 = 1;
    public static final int B3 = -1;

    @l1
    static final int C3 = 40;

    @l1
    static final int D3 = 56;
    private static final String E3 = "SwipeRefreshLayout";
    private static final int F3 = 255;
    private static final int G3 = 76;
    private static final float H3 = 2.0f;
    private static final int I3 = -1;
    private static final float J3 = 0.5f;
    private static final float K3 = 0.8f;
    private static final int L3 = 150;
    private static final int M3 = 300;
    private static final int N3 = 200;
    private static final int O3 = 200;
    private static final int P3 = 64;
    private static final int[] Q3 = {R.attr.enabled};

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final int f75363z3 = 0;
    androidx.swiperefreshlayout.widget.a H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f75364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j f75365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f75366c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f75367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f75368e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f75369f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a1 f75370g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    protected int f75371g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w0 f75372h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    float f75373h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f75374i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    protected int f75375i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f75376j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    int f75377j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f75378k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    int f75379k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f75380l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.b f75381l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f75382m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private Animation f75383m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f75384n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private Animation f75385n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f75386o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private Animation f75387o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f75388p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final DecelerateInterpolator f75389p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f75390p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private Animation f75391p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private Animation f75392q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    boolean f75393r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f75394s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private int f75395s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f75396t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    boolean f75397t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private i f75398u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f75399v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f75400v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    boolean f75401w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private Animation.AnimationListener f75402w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private final Animation f75403x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private final Animation f75404y3;

    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f75366c) {
                swipeRefreshLayout.x();
                return;
            }
            swipeRefreshLayout.f75381l3.setAlpha(255);
            SwipeRefreshLayout.this.f75381l3.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.f75393r3 && (jVar = swipeRefreshLayout2.f75365b) != null) {
                jVar.a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f75384n = swipeRefreshLayout3.H1.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    class d extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f75409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f75410b;

        d(int i10, int i11) {
            this.f75409a = i10;
            this.f75410b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            androidx.swiperefreshlayout.widget.b bVar = SwipeRefreshLayout.this.f75381l3;
            int i10 = this.f75409a;
            bVar.setAlpha((int) (i10 + ((this.f75410b - i10) * f10)));
        }
    }

    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f75401w) {
                swipeRefreshLayout.F(null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.f75397t3 ? swipeRefreshLayout.f75377j3 - Math.abs(swipeRefreshLayout.f75375i3) : swipeRefreshLayout.f75377j3;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i10 = swipeRefreshLayout2.f75371g3;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i10 + ((int) ((iAbs - i10) * f10))) - swipeRefreshLayout2.H1.getTop());
            SwipeRefreshLayout.this.f75381l3.u(1.0f - f10);
        }
    }

    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.v(f10);
        }
    }

    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.f75373h3;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.v(f10);
        }
    }

    public interface i {
        boolean a(@NonNull SwipeRefreshLayout swipeRefreshLayout, @p0 View view);
    }

    public interface j {
        void a();
    }

    public SwipeRefreshLayout(@NonNull Context context) {
        this(context, null);
    }

    private void A(boolean z10, boolean z11) {
        if (this.f75366c != z10) {
            this.f75393r3 = z11;
            k();
            this.f75366c = z10;
            if (z10) {
                a(this.f75384n, this.f75402w3);
            } else {
                F(this.f75402w3);
            }
        }
    }

    private Animation B(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.H1.c(null);
        this.H1.clearAnimation();
        this.H1.startAnimation(dVar);
        return dVar;
    }

    private void C(float f10) {
        float f11 = this.f75394s;
        float f12 = f10 - f11;
        int i10 = this.f75367d;
        if (f12 > i10 && !this.f75396t) {
            this.f75386o = f11 + i10;
            this.f75396t = true;
            this.f75381l3.setAlpha(76);
        }
    }

    private void D() {
        this.f75391p3 = B(this.f75381l3.getAlpha(), 255);
    }

    private void E() {
        this.f75387o3 = B(this.f75381l3.getAlpha(), 76);
    }

    private void G(int i10, Animation.AnimationListener animationListener) {
        this.f75371g3 = i10;
        this.f75373h3 = this.H1.getScaleX();
        h hVar = new h();
        this.f75392q3 = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.H1.c(animationListener);
        }
        this.H1.clearAnimation();
        this.H1.startAnimation(this.f75392q3);
    }

    private void H(Animation.AnimationListener animationListener) {
        this.H1.setVisibility(0);
        this.f75381l3.setAlpha(255);
        b bVar = new b();
        this.f75383m3 = bVar;
        bVar.setDuration(this.f75382m);
        if (animationListener != null) {
            this.H1.c(animationListener);
        }
        this.H1.clearAnimation();
        this.H1.startAnimation(this.f75383m3);
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.f75371g3 = i10;
        this.f75403x3.reset();
        this.f75403x3.setDuration(200L);
        this.f75403x3.setInterpolator(this.f75389p1);
        if (animationListener != null) {
            this.H1.c(animationListener);
        }
        this.H1.clearAnimation();
        this.H1.startAnimation(this.f75403x3);
    }

    private void h(int i10, Animation.AnimationListener animationListener) {
        if (this.f75401w) {
            G(i10, animationListener);
            return;
        }
        this.f75371g3 = i10;
        this.f75404y3.reset();
        this.f75404y3.setDuration(200L);
        this.f75404y3.setInterpolator(this.f75389p1);
        if (animationListener != null) {
            this.H1.c(animationListener);
        }
        this.H1.clearAnimation();
        this.H1.startAnimation(this.f75404y3);
    }

    private void j() {
        this.H1 = new androidx.swiperefreshlayout.widget.a(getContext());
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.f75381l3 = bVar;
        bVar.E(1);
        this.H1.setImageDrawable(this.f75381l3);
        this.H1.setVisibility(8);
        addView(this.H1);
    }

    private void k() {
        if (this.f75364a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.H1)) {
                    this.f75364a = childAt;
                    return;
                }
            }
        }
    }

    private void n(float f10) {
        if (f10 > this.f75368e) {
            A(true, true);
            return;
        }
        this.f75366c = false;
        this.f75381l3.B(0.0f, 0.0f);
        h(this.f75384n, !this.f75401w ? new e() : null);
        this.f75381l3.t(false);
    }

    private boolean p(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void setColorViewAlpha(int i10) {
        this.H1.getBackground().setAlpha(i10);
        this.f75381l3.setAlpha(i10);
    }

    private void u(float f10) {
        this.f75381l3.t(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f75368e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f75368e;
        int i10 = this.f75379k3;
        if (i10 <= 0) {
            i10 = this.f75397t3 ? this.f75377j3 - this.f75375i3 : this.f75377j3;
        }
        float f11 = i10;
        int i11 = 6 ^ 0;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i12 = this.f75375i3 + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.H1.getVisibility() != 0) {
            this.H1.setVisibility(0);
        }
        if (!this.f75401w) {
            this.H1.setScaleX(1.0f);
            this.H1.setScaleY(1.0f);
        }
        if (this.f75401w) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f75368e));
        }
        if (f10 < this.f75368e) {
            if (this.f75381l3.getAlpha() > 76 && !p(this.f75387o3)) {
                E();
            }
        } else if (this.f75381l3.getAlpha() < 255 && !p(this.f75391p3)) {
            D();
        }
        this.f75381l3.B(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f75381l3.u(Math.min(1.0f, fMax));
        this.f75381l3.y((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i12 - this.f75384n);
    }

    private void w(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f75399v) {
            this.f75399v = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    void F(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.f75385n3 = cVar;
        cVar.setDuration(150L);
        this.H1.c(animationListener);
        this.H1.clearAnimation();
        this.H1.startAnimation(this.f75385n3);
    }

    @Override // androidx.core.view.t0
    public boolean b(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return i12 == 0 && dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    @Override // androidx.core.view.t0
    public void c(int i10) {
        if (i10 == 0) {
            stopNestedScroll();
        }
    }

    @Override // androidx.core.view.u0
    public void d(int i10, int i11, int i12, int i13, @p0 int[] iArr, int i14, @NonNull int[] iArr2) {
        if (i14 == 0) {
            this.f75372h.e(i10, i11, i12, i13, iArr, i14, iArr2);
        }
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f75372h.a(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f75372h.b(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f75372h.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f75372h.f(i10, i11, i12, i13, iArr);
    }

    @Override // androidx.core.view.t0
    public boolean e(int i10) {
        return i10 == 0 && hasNestedScrollingParent();
    }

    @Override // androidx.core.view.t0
    public boolean f(int i10, int i11) {
        return i11 == 0 && startNestedScroll(i10);
    }

    @Override // androidx.core.view.t0
    public boolean g(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return i14 == 0 && this.f75372h.g(i10, i11, i12, i13, iArr, i14);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f75390p2;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        return i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup, androidx.core.view.z0
    public int getNestedScrollAxes() {
        return this.f75370g.a();
    }

    public int getProgressCircleDiameter() {
        return this.f75395s3;
    }

    public int getProgressViewEndOffset() {
        return this.f75377j3;
    }

    public int getProgressViewStartOffset() {
        return this.f75375i3;
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean hasNestedScrollingParent() {
        return this.f75372h.k();
    }

    public boolean i() {
        i iVar = this.f75398u3;
        if (iVar != null) {
            return iVar.a(this, this.f75364a);
        }
        View view = this.f75364a;
        return view instanceof ListView ? n.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean isNestedScrollingEnabled() {
        return this.f75372h.m();
    }

    @Override // androidx.core.view.x0
    public void l(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.x0
    public void m(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.x0
    public void o(View view, int i10, int i11, int i12, int i13, int i14) {
        s(view, i10, i11, i12, i13, i14, this.f75378k);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x005f  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        k();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f75388p0 && actionMasked == 0) {
            this.f75388p0 = false;
        }
        if (!isEnabled() || this.f75388p0 || i() || this.f75366c || this.f75380l) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f75375i3 - this.H1.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f75399v = pointerId;
            this.f75396t = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            this.f75394s = motionEvent.getY(iFindPointerIndex2);
        } else if (actionMasked == 1) {
            this.f75396t = false;
            this.f75399v = -1;
        } else {
            if (actionMasked == 2) {
                int i10 = this.f75399v;
                if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    C(motionEvent.getY(iFindPointerIndex));
                }
                return false;
            }
            if (actionMasked == 3) {
                this.f75396t = false;
                this.f75399v = -1;
            } else if (actionMasked == 6) {
                w(motionEvent);
            }
        }
        return this.f75396t;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f75364a == null) {
                k();
            }
            View view = this.f75364a;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.H1.getMeasuredWidth();
                int measuredHeight2 = this.H1.getMeasuredHeight();
                int i14 = measuredWidth / 2;
                int i15 = measuredWidth2 / 2;
                int i16 = this.f75384n;
                this.H1.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f75364a == null) {
            k();
        }
        View view = this.f75364a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.H1.measure(View.MeasureSpec.makeMeasureSpec(this.f75395s3, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f75395s3, 1073741824));
            this.f75390p2 = -1;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) == this.H1) {
                    this.f75390p2 = i12;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f75369f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f75369f = 0.0f;
                } else {
                    this.f75369f = f10 - f11;
                    iArr[1] = i11;
                }
                u(this.f75369f);
            }
        }
        if (this.f75397t3 && i11 > 0 && this.f75369f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.H1.setVisibility(8);
        }
        int[] iArr2 = this.f75374i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        s(view, i10, i11, i12, i13, 0, this.f75378k);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f75370g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f75369f = 0.0f;
        this.f75380l = true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f75405a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f75366c);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f75388p0 || this.f75366c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onStopNestedScroll(View view) {
        this.f75370g.d(view);
        this.f75380l = false;
        float f10 = this.f75369f;
        if (f10 > 0.0f) {
            n(f10);
            this.f75369f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f75388p0 && actionMasked == 0) {
            this.f75388p0 = false;
        }
        if (!isEnabled() || this.f75388p0 || i() || this.f75366c || this.f75380l) {
            return false;
        }
        if (actionMasked == 0) {
            this.f75399v = motionEvent.getPointerId(0);
            this.f75396t = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f75399v);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                if (this.f75396t) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f75386o) * 0.5f;
                    this.f75396t = false;
                    n(y10);
                }
                this.f75399v = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f75399v);
                if (iFindPointerIndex2 < 0) {
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                C(y11);
                if (this.f75396t) {
                    float f10 = (y11 - this.f75386o) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    u(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.f75399v = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    w(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // androidx.core.view.x0
    public void q(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    public boolean r() {
        return this.f75366c;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent;
        View view = this.f75364a;
        if (view == null || u1.a1(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        } else {
            if (this.f75400v3 || (parent = getParent()) == null) {
                return;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    @Override // androidx.core.view.y0
    public void s(@NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        d(i10, i11, i12, i13, this.f75376j, i14, iArr);
        int i16 = i13 - (iArr[1] - i15);
        int i17 = i16 == 0 ? i13 + this.f75376j[1] : i16;
        if (i17 >= 0 || i()) {
            return;
        }
        float fAbs = this.f75369f + Math.abs(i17);
        this.f75369f = fAbs;
        u(fAbs);
        iArr[1] = iArr[1] + i16;
    }

    void setAnimationProgress(float f10) {
        this.H1.setScaleX(f10);
        this.H1.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(@androidx.annotation.n int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@l int... iArr) {
        k();
        this.f75381l3.x(iArr);
    }

    public void setColorSchemeResources(@androidx.annotation.n int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        int i10 = 6 << 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr2[i11] = androidx.core.content.d.g(context, iArr[i11]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f75368e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        x();
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f75400v3 = z10;
    }

    @Override // android.view.View, androidx.core.view.v0
    public void setNestedScrollingEnabled(boolean z10) {
        this.f75372h.p(z10);
    }

    public void setOnChildScrollUpCallback(@p0 i iVar) {
        this.f75398u3 = iVar;
    }

    public void setOnRefreshListener(@p0 j jVar) {
        this.f75365b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(@l int i10) {
        this.H1.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(@androidx.annotation.n int i10) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.d.g(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f75366c == z10) {
            A(z10, false);
            return;
        }
        this.f75366c = z10;
        setTargetOffsetTopAndBottom((!this.f75397t3 ? this.f75377j3 + this.f75375i3 : this.f75377j3) - this.f75384n);
        this.f75393r3 = false;
        H(this.f75402w3);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.f75395s3 = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f75395s3 = (int) (displayMetrics.density * 40.0f);
            }
            this.H1.setImageDrawable(null);
            this.f75381l3.E(i10);
            this.H1.setImageDrawable(this.f75381l3);
        }
    }

    public void setSlingshotDistance(@androidx.annotation.t0 int i10) {
        this.f75379k3 = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.H1.bringToFront();
        u1.i1(this.H1, i10);
        this.f75384n = this.H1.getTop();
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean startNestedScroll(int i10) {
        return this.f75372h.r(i10);
    }

    @Override // android.view.View, androidx.core.view.v0
    public void stopNestedScroll() {
        this.f75372h.t();
    }

    @Override // androidx.core.view.x0
    public boolean t(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    void v(float f10) {
        int i10 = this.f75371g3;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f75375i3 - i10) * f10))) - this.H1.getTop());
    }

    void x() {
        this.H1.clearAnimation();
        this.f75381l3.stop();
        this.H1.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f75401w) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f75375i3 - this.f75384n);
        }
        this.f75384n = this.H1.getTop();
    }

    public void y(boolean z10, int i10) {
        this.f75377j3 = i10;
        this.f75401w = z10;
        this.H1.invalidate();
    }

    public void z(boolean z10, int i10, int i11) {
        this.f75401w = z10;
        this.f75375i3 = i10;
        this.f75377j3 = i11;
        this.f75397t3 = true;
        x();
        this.f75366c = false;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f75405a;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f75405a = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f75405a ? (byte) 1 : (byte) 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f75405a = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f75366c = false;
        this.f75368e = -1.0f;
        this.f75374i = new int[2];
        this.f75376j = new int[2];
        this.f75378k = new int[2];
        this.f75399v = -1;
        this.f75390p2 = -1;
        this.f75402w3 = new a();
        this.f75403x3 = new f();
        this.f75404y3 = new g();
        this.f75367d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f75382m = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f75389p1 = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f75395s3 = (int) (displayMetrics.density * 40.0f);
        j();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f75377j3 = i10;
        this.f75368e = i10;
        this.f75370g = new a1(this);
        this.f75372h = new w0(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.f75395s3;
        this.f75384n = i11;
        this.f75375i3 = i11;
        v(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q3);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }
}
