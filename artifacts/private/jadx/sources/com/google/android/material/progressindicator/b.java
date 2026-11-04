package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.core.view.u1;
import com.google.android.material.color.u;
import com.google.android.material.internal.g0;
import com.google.android.material.progressindicator.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b<S extends com.google.android.material.progressindicator.c> extends ProgressBar {
    static final int H1 = r6.a.n.Xj;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    static final int f113156g3 = 255;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    static final int f113157h3 = 1000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f113158o = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f113159p0 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f113160p1 = 3;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    static final float f113161p2 = 0.2f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f113162s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f113163t = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f113164v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f113165w = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    S f113166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f113167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f113168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f113169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f113170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f113171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f113172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    com.google.android.material.progressindicator.a f113173h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f113174i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f113175j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f113176k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f113177l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b.a f113178m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final androidx.vectordrawable.graphics.drawable.b.a f113179n;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.l();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.b$b, reason: collision with other inner class name */
    class RunnableC0991b implements Runnable {
        RunnableC0991b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.k();
            b.this.f113172g = -1L;
        }
    }

    class c extends androidx.vectordrawable.graphics.drawable.b.a {
        c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void b(Drawable drawable) {
            b.this.setIndeterminate(false);
            b bVar = b.this;
            bVar.p(bVar.f113167b, b.this.f113168c);
        }
    }

    class d extends androidx.vectordrawable.graphics.drawable.b.a {
        d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.b.a
        public void b(Drawable drawable) {
            super.b(drawable);
            if (b.this.f113174i) {
                return;
            }
            b bVar = b.this;
            bVar.setVisibility(bVar.f113175j);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface e {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface f {
    }

    protected b(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @g1 int i11) {
        super(a7.a.c(context, attributeSet, i10, H1), attributeSet, i10);
        this.f113172g = -1L;
        this.f113174i = false;
        this.f113175j = 4;
        this.f113176k = new a();
        this.f113177l = new RunnableC0991b();
        this.f113178m = new c();
        this.f113179n = new d();
        Context context2 = getContext();
        this.f113166a = (S) i(context2, attributeSet);
        TypedArray typedArrayK = g0.k(context2, attributeSet, r6.a.o.A4, i10, i11, new int[0]);
        this.f113170e = typedArrayK.getInt(r6.a.o.H4, -1);
        this.f113171f = Math.min(typedArrayK.getInt(r6.a.o.F4, -1), 1000);
        typedArrayK.recycle();
        this.f113173h = new com.google.android.material.progressindicator.a();
        this.f113169d = true;
    }

    @p0
    private i<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().C();
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        ((h) getCurrentDrawable()).v(false, false, true);
        if (n()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f113171f > 0) {
            this.f113172g = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    private boolean n() {
        if (getProgressDrawable() == null || !getProgressDrawable().isVisible()) {
            return getIndeterminateDrawable() == null || !getIndeterminateDrawable().isVisible();
        }
        return false;
    }

    private void o() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().B().d(this.f113178m);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().c(this.f113179n);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c(this.f113179n);
        }
    }

    private void r() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().b(this.f113179n);
            getIndeterminateDrawable().B().j();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().b(this.f113179n);
        }
    }

    @Override // android.widget.ProgressBar
    @p0
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f113166a.f113189f;
    }

    @NonNull
    public int[] getIndicatorColor() {
        return this.f113166a.f113186c;
    }

    @t0
    public int getIndicatorTrackGapSize() {
        return this.f113166a.f113190g;
    }

    public int getShowAnimationBehavior() {
        return this.f113166a.f113188e;
    }

    @androidx.annotation.l
    public int getTrackColor() {
        return this.f113166a.f113187d;
    }

    @t0
    public int getTrackCornerRadius() {
        return this.f113166a.f113185b;
    }

    @t0
    public int getTrackThickness() {
        return this.f113166a.f113184a;
    }

    protected void h(boolean z10) {
        if (this.f113169d) {
            ((h) getCurrentDrawable()).v(s(), false, z10);
        }
    }

    abstract S i(@NonNull Context context, @NonNull AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public void j() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f113176k);
            return;
        }
        removeCallbacks(this.f113177l);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f113172g;
        int i10 = this.f113171f;
        if (jUptimeMillis >= i10) {
            this.f113177l.run();
        } else {
            postDelayed(this.f113177l, ((long) i10) - jUptimeMillis);
        }
    }

    boolean m() {
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        o();
        if (s()) {
            l();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f113177l);
        removeCallbacks(this.f113176k);
        ((h) getCurrentDrawable()).l();
        r();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(@NonNull Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i10, int i11) {
        try {
            i<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i10) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i11) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NonNull View view, int i10) {
        super.onVisibilityChanged(view, i10);
        h(i10 == 0);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        h(false);
    }

    public void p(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() == null || z10) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.f113167b = i10;
            this.f113168c = z10;
            this.f113174i = true;
            if (getIndeterminateDrawable().isVisible() && this.f113173h.a(getContext().getContentResolver()) != 0.0f) {
                getIndeterminateDrawable().B().f();
                return;
            }
            this.f113178m.b(getIndeterminateDrawable());
        }
    }

    public void q() {
        if (this.f113170e <= 0) {
            this.f113176k.run();
        } else {
            removeCallbacks(this.f113176k);
            postDelayed(this.f113176k, this.f113170e);
        }
    }

    boolean s() {
        return u1.R0(this) && getWindowVisibility() == 0 && m();
    }

    @l1
    @b1({b1.a.LIBRARY_GROUP})
    public void setAnimatorDurationScaleProvider(@NonNull com.google.android.material.progressindicator.a aVar) {
        this.f113173h = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f113234c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f113234c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f113166a.f113189f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        try {
            if (z10 == isIndeterminate()) {
                return;
            }
            h hVar = (h) getCurrentDrawable();
            if (hVar != null) {
                hVar.l();
            }
            super.setIndeterminate(z10);
            h hVar2 = (h) getCurrentDrawable();
            if (hVar2 != null) {
                hVar2.v(s(), false, false);
            }
            if ((hVar2 instanceof k) && s()) {
                ((k) hVar2).B().i();
            }
            this.f113174i = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(@p0 Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (!(drawable instanceof k)) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            ((h) drawable).l();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(@androidx.annotation.l int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{u.b(getContext(), r6.a.c.R3, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f113166a.f113186c = iArr;
        getIndeterminateDrawable().B().c();
        invalidate();
    }

    public void setIndicatorTrackGapSize(@t0 int i10) {
        S s10 = this.f113166a;
        if (s10.f113190g != i10) {
            s10.f113190g = i10;
            s10.e();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        p(i10, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(@p0 Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (!(drawable instanceof g)) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            g gVar = (g) drawable;
            gVar.l();
            super.setProgressDrawable(gVar);
            gVar.J(getProgress() / getMax());
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f113166a.f113188e = i10;
        invalidate();
    }

    public void setTrackColor(@androidx.annotation.l int i10) {
        S s10 = this.f113166a;
        if (s10.f113187d != i10) {
            s10.f113187d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(@t0 int i10) {
        S s10 = this.f113166a;
        if (s10.f113185b != i10) {
            s10.f113185b = Math.min(i10, s10.f113184a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(@t0 int i10) {
        S s10 = this.f113166a;
        if (s10.f113184a != i10) {
            s10.f113184a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f113175j = i10;
    }

    @Override // android.widget.ProgressBar
    @p0
    public k<S> getIndeterminateDrawable() {
        return (k) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    @p0
    public g<S> getProgressDrawable() {
        return (g) super.getProgressDrawable();
    }
}
