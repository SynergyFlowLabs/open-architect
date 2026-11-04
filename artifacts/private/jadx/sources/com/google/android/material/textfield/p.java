package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes4.dex */
class p extends s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.k(api = 21)
    private static final boolean f114159s = true;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f114160t = 50;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f114161u = 67;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f114162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f114163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    private final TimeInterpolator f114164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private AutoCompleteTextView f114165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f114166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnFocusChangeListener f114167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.core.view.accessibility.c.e f114168k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f114169l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f114170m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f114171n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f114172o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private AccessibilityManager f114173p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ValueAnimator f114174q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f114175r;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f114175r.start();
        }
    }

    p(@NonNull r rVar) {
        super(rVar);
        this.f114166i = new View.OnClickListener() { // from class: com.google.android.material.textfield.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114155a.J();
            }
        };
        this.f114167j = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                p.y(this.f114156a, view, z10);
            }
        };
        this.f114168k = new androidx.core.view.accessibility.c.e() { // from class: com.google.android.material.textfield.n
            @Override // androidx.core.view.accessibility.c.e
            public final void onTouchExplorationStateChanged(boolean z10) {
                p.w(this.f114157a, z10);
            }
        };
        this.f114172o = Long.MAX_VALUE;
        this.f114163f = com.google.android.material.motion.j.f(rVar.getContext(), r6.a.c.Od, 67);
        this.f114162e = com.google.android.material.motion.j.f(rVar.getContext(), r6.a.c.Od, 50);
        this.f114164g = com.google.android.material.motion.j.g(rVar.getContext(), r6.a.c.Xd, com.google.android.material.animation.b.f111043a);
    }

    public static /* synthetic */ void A(p pVar) {
        pVar.K();
        pVar.H(false);
    }

    @NonNull
    private static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f114164g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(this.f114152a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void F() {
        this.f114175r = E(this.f114163f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f114162e, 1.0f, 0.0f);
        this.f114174q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    private boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f114172o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    private void H(boolean z10) {
        if (this.f114171n != z10) {
            this.f114171n = z10;
            this.f114175r.cancel();
            this.f114174q.start();
        }
    }

    @e.a({"ClickableViewAccessibility"})
    private void I() {
        this.f114165h.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(this.f114153a, view, motionEvent);
            }
        });
        if (f114159s) {
            this.f114165h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    p.A(this.f114154a);
                }
            });
        }
        this.f114165h.setThreshold(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        if (this.f114165h == null) {
            return;
        }
        if (G()) {
            this.f114170m = false;
        }
        if (this.f114170m) {
            this.f114170m = false;
            return;
        }
        if (f114159s) {
            H(!this.f114171n);
        } else {
            this.f114171n = !this.f114171n;
            r();
        }
        if (!this.f114171n) {
            this.f114165h.dismissDropDown();
        } else {
            this.f114165h.requestFocus();
            this.f114165h.showDropDown();
        }
    }

    private void K() {
        this.f114170m = true;
        this.f114172o = System.currentTimeMillis();
    }

    public static /* synthetic */ void v(p pVar) {
        boolean zIsPopupShowing = pVar.f114165h.isPopupShowing();
        pVar.H(zIsPopupShowing);
        pVar.f114170m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = pVar.f114165h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        u1.Y1(pVar.f114209d, z10 ? 2 : 1);
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f114209d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z10) {
        pVar.f114169l = z10;
        pVar.r();
        if (!z10) {
            pVar.H(false);
            pVar.f114170m = false;
        }
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f114170m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    @Override // com.google.android.material.textfield.s
    public void a(Editable editable) {
        if (this.f114173p.isTouchExplorationEnabled() && q.a(this.f114165h) && !this.f114209d.hasFocus()) {
            this.f114165h.dismissDropDown();
        }
        this.f114165h.post(new Runnable() { // from class: com.google.android.material.textfield.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(this.f114158a);
            }
        });
    }

    @Override // com.google.android.material.textfield.s
    int c() {
        return r6.a.m.V;
    }

    @Override // com.google.android.material.textfield.s
    int d() {
        return f114159s ? r6.a.g.Q1 : r6.a.g.R1;
    }

    @Override // com.google.android.material.textfield.s
    View.OnFocusChangeListener e() {
        return this.f114167j;
    }

    @Override // com.google.android.material.textfield.s
    View.OnClickListener f() {
        return this.f114166i;
    }

    @Override // com.google.android.material.textfield.s
    public androidx.core.view.accessibility.c.e h() {
        return this.f114168k;
    }

    @Override // com.google.android.material.textfield.s
    boolean i(int i10) {
        return i10 != 0;
    }

    @Override // com.google.android.material.textfield.s
    boolean j() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean k() {
        return this.f114169l;
    }

    @Override // com.google.android.material.textfield.s
    boolean l() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    boolean m() {
        return this.f114171n;
    }

    @Override // com.google.android.material.textfield.s
    public void n(@p0 EditText editText) {
        this.f114165h = D(editText);
        I();
        this.f114206a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f114173p.isTouchExplorationEnabled()) {
            u1.Y1(this.f114209d, 2);
        }
        this.f114206a.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.s
    public void o(View view, @NonNull androidx.core.view.accessibility.j jVar) {
        if (!q.a(this.f114165h)) {
            jVar.j1(Spinner.class.getName());
        }
        if (jVar.J0()) {
            jVar.A1(null);
        }
    }

    @Override // com.google.android.material.textfield.s
    @e.a({"WrongConstant"})
    public void p(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        if (this.f114173p.isEnabled() && !q.a(this.f114165h)) {
            boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f114171n && !this.f114165h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z10) {
                J();
                K();
            }
        }
    }

    @Override // com.google.android.material.textfield.s
    void s() {
        F();
        this.f114173p = (AccessibilityManager) this.f114208c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.s
    boolean t() {
        return true;
    }

    @Override // com.google.android.material.textfield.s
    @e.a({"ClickableViewAccessibility"})
    void u() {
        AutoCompleteTextView autoCompleteTextView = this.f114165h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f114159s) {
                this.f114165h.setOnDismissListener(null);
            }
        }
    }
}
