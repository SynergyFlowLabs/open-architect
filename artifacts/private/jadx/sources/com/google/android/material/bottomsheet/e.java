package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.g1;
import androidx.annotation.j0;
import androidx.annotation.p0;
import androidx.appcompat.app.q;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.j;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.k2;
import androidx.core.view.u1;
import com.google.android.material.color.u;
import com.google.android.material.shape.k;

/* JADX INFO: loaded from: classes4.dex */
public class e extends q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BottomSheetBehavior<FrameLayout> f111565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private FrameLayout f111566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CoordinatorLayout f111567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private FrameLayout f111568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f111569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean f111570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f111571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f111572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private f f111573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f111574o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private com.google.android.material.motion.c f111575s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    private BottomSheetBehavior.g f111576t;

    class a implements b1 {
        a() {
        }

        @Override // androidx.core.view.b1
        public g3 b(View view, g3 g3Var) {
            if (e.this.f111573n != null) {
                e.this.f111565f.Y0(e.this.f111573n);
            }
            if (g3Var != null) {
                e eVar = e.this;
                eVar.f111573n = new f(eVar.f111568i, g3Var, null);
                e.this.f111573n.b(e.this.getWindow());
                e.this.f111565f.h0(e.this.f111573n);
            }
            return g3Var;
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e eVar = e.this;
            if (eVar.f111570k && eVar.isShowing() && e.this.x()) {
                e.this.cancel();
            }
        }
    }

    class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            if (!e.this.f111570k) {
                jVar.r1(false);
            } else {
                jVar.a(1048576);
                jVar.r1(true);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (i10 == 1048576) {
                e eVar = e.this;
                if (eVar.f111570k) {
                    eVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i10, bundle);
        }
    }

    class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.e$e, reason: collision with other inner class name */
    class C0981e extends BottomSheetBehavior.g {
        C0981e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(@NonNull View view, float f10) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(@NonNull View view, int i10) {
            if (i10 == 5) {
                e.this.cancel();
            }
        }
    }

    private static class f extends BottomSheetBehavior.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        private final Boolean f111582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        private final g3 f111583b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private Window f111584c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f111585d;

        /* synthetic */ f(View view, g3 g3Var, a aVar) {
            this(view, g3Var);
        }

        private void a(View view) {
            if (view.getTop() < this.f111583b.r()) {
                Window window = this.f111584c;
                if (window != null) {
                    Boolean bool = this.f111582a;
                    com.google.android.material.internal.e.g(window, bool == null ? this.f111585d : bool.booleanValue());
                }
                view.setPadding(view.getPaddingLeft(), this.f111583b.r() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.f111584c;
                if (window2 != null) {
                    com.google.android.material.internal.e.g(window2, this.f111585d);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        void b(@p0 Window window) {
            if (this.f111584c != window) {
                this.f111584c = window;
                if (window != null) {
                    this.f111585d = k2.a(window, window.getDecorView()).f();
                }
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        void onLayout(@NonNull View view) {
            a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onSlide(@NonNull View view, float f10) {
            a(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void onStateChanged(@NonNull View view, int i10) {
            a(view);
        }

        private f(@NonNull View view, @NonNull g3 g3Var) {
            this.f111583b = g3Var;
            k kVarE0 = BottomSheetBehavior.x0(view).E0();
            ColorStateList colorStateListZ = kVarE0 != null ? kVarE0.z() : u1.O(view);
            if (colorStateListZ != null) {
                this.f111582a = Boolean.valueOf(u.q(colorStateListZ.getDefaultColor()));
                return;
            }
            Integer numJ = com.google.android.material.internal.p0.j(view);
            if (numJ != null) {
                this.f111582a = Boolean.valueOf(u.q(numJ.intValue()));
            } else {
                this.f111582a = null;
            }
        }
    }

    public e(@NonNull Context context) {
        this(context, 0);
        this.f111574o = getContext().getTheme().obtainStyledAttributes(new int[]{r6.a.c.A6}).getBoolean(0, false);
    }

    private static int j(@NonNull Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        int i11 = 5 & 1;
        return context.getTheme().resolveAttribute(r6.a.c.f359371l1, typedValue, true) ? typedValue.resourceId : r6.a.n.Mb;
    }

    private FrameLayout q() {
        if (this.f111566g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), r6.a.k.E, null);
            this.f111566g = frameLayout;
            this.f111567h = (CoordinatorLayout) frameLayout.findViewById(r6.a.h.R0);
            FrameLayout frameLayout2 = (FrameLayout) this.f111566g.findViewById(r6.a.h.f360649e1);
            this.f111568i = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorX0 = BottomSheetBehavior.x0(frameLayout2);
            this.f111565f = bottomSheetBehaviorX0;
            bottomSheetBehaviorX0.h0(this.f111576t);
            this.f111565f.l1(this.f111570k);
            this.f111575s = new com.google.android.material.motion.c(this.f111565f, this.f111568i);
        }
        return this.f111566g;
    }

    @Deprecated
    public static void w(@NonNull View view, boolean z10) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z10 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    private void y() {
        com.google.android.material.motion.c cVar = this.f111575s;
        if (cVar == null) {
            return;
        }
        if (this.f111570k) {
            cVar.c();
        } else {
            cVar.f();
        }
    }

    private View z(int i10, @p0 View view, @p0 ViewGroup.LayoutParams layoutParams) {
        q();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f111566g.findViewById(r6.a.h.R0);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f111574o) {
            u1.j2(this.f111568i, new a());
        }
        this.f111568i.removeAllViews();
        if (layoutParams == null) {
            this.f111568i.addView(view);
        } else {
            this.f111568i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(r6.a.h.f360710l6).setOnClickListener(new b());
        u1.G1(this.f111568i, new c());
        this.f111568i.setOnTouchListener(new d());
        return this.f111566g;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorR = r();
        if (!this.f111569j || bottomSheetBehaviorR.getState() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorR.g(5);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z10 = this.f111574o && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f111566g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f111567h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            k2.c(window, !z10);
            f fVar = this.f111573n;
            if (fVar != null) {
                fVar.b(window);
            }
        }
        y();
    }

    @Override // androidx.appcompat.app.q, androidx.activity.t, android.app.Dialog
    protected void onCreate(Bundle bundle) {
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
        f fVar = this.f111573n;
        if (fVar != null) {
            fVar.b(null);
        }
        com.google.android.material.motion.c cVar = this.f111575s;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // androidx.activity.t, android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f111565f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.f111565f.g(4);
    }

    @NonNull
    public BottomSheetBehavior<FrameLayout> r() {
        if (this.f111565f == null) {
            q();
        }
        return this.f111565f;
    }

    public boolean s() {
        return this.f111569j;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        if (this.f111570k != z10) {
            this.f111570k = z10;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f111565f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.l1(z10);
            }
            if (getWindow() != null) {
                y();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f111570k) {
            this.f111570k = true;
        }
        this.f111571l = z10;
        this.f111572m = true;
    }

    @Override // androidx.appcompat.app.q, androidx.activity.t, android.app.Dialog
    public void setContentView(@j0 int i10) {
        super.setContentView(z(i10, null, null));
    }

    public boolean t() {
        return this.f111574o;
    }

    void u() {
        this.f111565f.Y0(this.f111576t);
    }

    public void v(boolean z10) {
        this.f111569j = z10;
    }

    boolean x() {
        if (!this.f111572m) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            boolean z10 = false & true;
            this.f111571l = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f111572m = true;
        }
        return this.f111571l;
    }

    @Override // androidx.appcompat.app.q, androidx.activity.t, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(z(0, view, null));
    }

    @Override // androidx.appcompat.app.q, androidx.activity.t, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(z(0, view, layoutParams));
    }

    public e(@NonNull Context context, @g1 int i10) {
        super(context, j(context, i10));
        this.f111570k = true;
        this.f111571l = true;
        this.f111576t = new C0981e();
        l(1);
        this.f111574o = getContext().getTheme().obtainStyledAttributes(new int[]{r6.a.c.A6}).getBoolean(0, false);
    }

    protected e(@NonNull Context context, boolean z10, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
        this.f111570k = true;
        this.f111571l = true;
        this.f111576t = new C0981e();
        l(1);
        this.f111570k = z10;
        this.f111574o = getContext().getTheme().obtainStyledAttributes(new int[]{r6.a.c.A6}).getBoolean(0, false);
    }
}
