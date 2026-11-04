package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.f2;
import androidx.core.view.g2;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f11132i = 200;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final b f11133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Context f11134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ActionMenuView f11135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ActionMenuPresenter f11136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f11137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected f2 f11138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f11139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11140h;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    class RunnableC0034a implements Runnable {
        RunnableC0034a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.o();
        }
    }

    protected class b implements g2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f11142a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f11143b;

        protected b() {
        }

        @Override // androidx.core.view.g2
        public void a(View view) {
            this.f11142a = true;
        }

        @Override // androidx.core.view.g2
        public void b(View view) {
            if (this.f11142a) {
                return;
            }
            a aVar = a.this;
            aVar.f11138f = null;
            a.super.setVisibility(this.f11143b);
        }

        @Override // androidx.core.view.g2
        public void c(View view) {
            a.super.setVisibility(0);
            this.f11142a = false;
        }

        public b d(f2 f2Var, int i10) {
            a.this.f11138f = f2Var;
            this.f11143b = i10;
            return this;
        }
    }

    a(@NonNull Context context) {
        this(context, null);
    }

    protected static int k(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    public void c(int i10) {
        n(i10, 200L).x();
    }

    public boolean d() {
        return i() && getVisibility() == 0;
    }

    public void e() {
        ActionMenuPresenter actionMenuPresenter = this.f11136d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
        }
    }

    public boolean f() {
        ActionMenuPresenter actionMenuPresenter = this.f11136d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.E();
        }
        return false;
    }

    public boolean g() {
        ActionMenuPresenter actionMenuPresenter = this.f11136d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.G();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        return this.f11138f != null ? this.f11133a.f11143b : getVisibility();
    }

    public int getContentHeight() {
        return this.f11137e;
    }

    public boolean h() {
        ActionMenuPresenter actionMenuPresenter = this.f11136d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.H();
        }
        return false;
    }

    public boolean i() {
        ActionMenuPresenter actionMenuPresenter = this.f11136d;
        return actionMenuPresenter != null && actionMenuPresenter.I();
    }

    protected int j(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    protected int l(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public void m() {
        post(new RunnableC0034a());
    }

    public f2 n(int i10, long j10) {
        f2 f2Var = this.f11138f;
        if (f2Var != null) {
            f2Var.d();
        }
        if (i10 != 0) {
            f2 f2VarB = androidx.core.view.u1.g(this).b(0.0f);
            f2VarB.r(j10);
            f2VarB.t(this.f11133a.d(f2VarB, i10));
            return f2VarB;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        f2 f2VarB2 = androidx.core.view.u1.g(this).b(1.0f);
        f2VarB2.r(j10);
        f2VarB2.t(this.f11133a.d(f2VarB2, i10));
        return f2VarB2;
    }

    public boolean o() {
        ActionMenuPresenter actionMenuPresenter = this.f11136d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.Q();
        }
        return false;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, i.a.m.f286477a, i.a.b.f285909f, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(i.a.m.f286601o, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f11136d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.J(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f11140h = false;
        }
        if (!this.f11140h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f11140h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f11140h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f11139g = false;
        }
        if (!this.f11139g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f11139g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f11139g = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f11137e = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            f2 f2Var = this.f11138f;
            if (f2Var != null) {
                f2Var.d();
            }
            super.setVisibility(i10);
        }
    }

    a(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11133a = new b();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i.a.b.f285891c, typedValue, true) && typedValue.resourceId != 0) {
            this.f11134b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f11134b = context;
        }
    }
}
