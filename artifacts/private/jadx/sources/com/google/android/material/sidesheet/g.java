package com.google.android.material.sidesheet;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.a0;
import androidx.annotation.g1;
import androidx.annotation.j0;
import androidx.annotation.p0;
import androidx.appcompat.app.q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.d0;
import androidx.core.view.u1;
import com.google.android.material.sidesheet.d;

/* JADX INFO: loaded from: classes4.dex */
abstract class g<C extends d> extends q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f113736n = r6.a.h.R0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f113737o = r6.a.h.f360710l6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private c<C> f113738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private FrameLayout f113739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private FrameLayout f113740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f113741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f113742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f113743k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f113744l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private com.google.android.material.motion.c f113745m;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            if (!g.this.f113742j) {
                jVar.r1(false);
            } else {
                jVar.a(1048576);
                jVar.r1(true);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                g gVar = g.this;
                if (gVar.f113742j) {
                    gVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i10, bundle);
        }
    }

    g(@NonNull Context context, @g1 int i10, @androidx.annotation.f int i11, @g1 int i12) {
        super(context, w(context, i10, i11, i12));
        this.f113742j = true;
        this.f113743k = true;
        l(1);
    }

    private boolean B() {
        if (!this.f113744l) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f113743k = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f113744l = true;
        }
        return this.f113743k;
    }

    private void C() {
        com.google.android.material.motion.c cVar = this.f113745m;
        if (cVar == null) {
            return;
        }
        if (this.f113742j) {
            cVar.c();
        } else {
            cVar.f();
        }
    }

    private View D(int i10, @p0 View view, @p0 ViewGroup.LayoutParams layoutParams) {
        o();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) r().findViewById(f113736n);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayoutU = u();
        frameLayoutU.removeAllViews();
        if (layoutParams == null) {
            frameLayoutU.addView(view);
        } else {
            frameLayoutU.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(f113737o).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.sidesheet.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                g.m(this.f113735a, view2);
            }
        });
        u1.G1(u(), new a());
        return this.f113739g;
    }

    public static /* synthetic */ void m(g gVar, View view) {
        if (gVar.f113742j && gVar.isShowing() && gVar.B()) {
            gVar.cancel();
        }
    }

    private void o() {
        if (this.f113739g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), t(), null);
            this.f113739g = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(s());
            this.f113740h = frameLayout2;
            c<C> cVarQ = q(frameLayout2);
            this.f113738f = cVarQ;
            n(cVarQ);
            this.f113745m = new com.google.android.material.motion.c(this.f113738f, this.f113740h);
        }
    }

    @NonNull
    private FrameLayout r() {
        if (this.f113739g == null) {
            o();
        }
        return this.f113739g;
    }

    @NonNull
    private FrameLayout u() {
        if (this.f113740h == null) {
            o();
        }
        return this.f113740h;
    }

    private static int w(@NonNull Context context, @g1 int i10, @androidx.annotation.f int i11, @g1 int i12) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i11, typedValue, true) ? typedValue.resourceId : i12;
    }

    private void y() {
        FrameLayout frameLayout;
        Window window = getWindow();
        if (window == null || (frameLayout = this.f113740h) == null || !(frameLayout.getLayoutParams() instanceof CoordinatorLayout.g)) {
            return;
        }
        window.setWindowAnimations(d0.d(((CoordinatorLayout.g) this.f113740h.getLayoutParams()).f46850c, u1.c0(this.f113740h)) == 3 ? r6.a.n.f361202i : r6.a.n.f361223j);
    }

    public void A(@a0 int i10) {
        FrameLayout frameLayout = this.f113740h;
        if (frameLayout == null) {
            throw new IllegalStateException("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
        }
        if (u1.Y0(frameLayout)) {
            throw new IllegalStateException("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
        }
        ViewGroup.LayoutParams layoutParams = this.f113740h.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            ((CoordinatorLayout.g) layoutParams).f46850c = i10;
            y();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        c<C> cVarP = p();
        if (!this.f113741i || cVarP.getState() == 5) {
            super.cancel();
        } else {
            cVarP.g(5);
        }
    }

    abstract void n(c<C> cVar);

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
        C();
    }

    @Override // androidx.appcompat.app.q, androidx.activity.t, android.app.Dialog
    protected void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.google.android.material.motion.c cVar = this.f113745m;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // androidx.activity.t, android.app.Dialog
    protected void onStart() {
        super.onStart();
        c<C> cVar = this.f113738f;
        if (cVar == null || cVar.getState() != 5) {
            return;
        }
        this.f113738f.g(v());
    }

    @NonNull
    c<C> p() {
        if (this.f113738f == null) {
            o();
        }
        return this.f113738f;
    }

    @NonNull
    abstract c<C> q(@NonNull FrameLayout frameLayout);

    @androidx.annotation.d0
    abstract int s();

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f113742j != z10) {
            this.f113742j = z10;
        }
        if (getWindow() != null) {
            C();
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f113742j) {
            this.f113742j = true;
        }
        this.f113743k = z10;
        this.f113744l = true;
    }

    @Override // androidx.appcompat.app.q, androidx.activity.t, android.app.Dialog
    public void setContentView(@j0 int i10) {
        super.setContentView(D(i10, null, null));
    }

    @j0
    abstract int t();

    abstract int v();

    public boolean x() {
        return this.f113741i;
    }

    public void z(boolean z10) {
        this.f113741i = z10;
    }

    @Override // androidx.appcompat.app.q, androidx.activity.t, android.app.Dialog
    public void setContentView(@p0 View view) {
        super.setContentView(D(0, view, null));
    }

    @Override // androidx.appcompat.app.q, androidx.activity.t, android.app.Dialog
    public void setContentView(@p0 View view, @p0 ViewGroup.LayoutParams layoutParams) {
        super.setContentView(D(0, view, layoutParams));
    }
}
