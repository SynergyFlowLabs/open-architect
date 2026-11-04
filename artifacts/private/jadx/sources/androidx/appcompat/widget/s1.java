package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.y1;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
class s1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f11574k = "TooltipCompatHandler";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f11575l = 2500;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f11576m = 15000;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f11577n = 3000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static s1 f11578o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static s1 f11579s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f11580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f11581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f11583d = new Runnable() { // from class: androidx.appcompat.widget.q1
        @Override // java.lang.Runnable
        public final void run() {
            this.f11506a.h(false);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f11584e = new Runnable() { // from class: androidx.appcompat.widget.r1
        @Override // java.lang.Runnable
        public final void run() {
            this.f11519a.d();
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private t1 f11587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11589j;

    private s1(View view, CharSequence charSequence) {
        this.f11580a = view;
        this.f11581b = charSequence;
        this.f11582c = y1.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void b() {
        this.f11580a.removeCallbacks(this.f11583d);
    }

    private void c() {
        this.f11589j = true;
    }

    private void e() {
        this.f11580a.postDelayed(this.f11583d, ViewConfiguration.getLongPressTimeout());
    }

    private static void f(s1 s1Var) {
        s1 s1Var2 = f11578o;
        if (s1Var2 != null) {
            s1Var2.b();
        }
        f11578o = s1Var;
        if (s1Var != null) {
            s1Var.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        s1 s1Var = f11578o;
        int i10 = 6 << 0;
        if (s1Var != null && s1Var.f11580a == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new s1(view, charSequence);
            return;
        }
        s1 s1Var2 = f11579s;
        if (s1Var2 != null && s1Var2.f11580a == view) {
            s1Var2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean i(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (!this.f11589j && Math.abs(x10 - this.f11585f) <= this.f11582c && Math.abs(y10 - this.f11586g) <= this.f11582c) {
            return false;
        }
        this.f11585f = x10;
        this.f11586g = y10;
        this.f11589j = false;
        return true;
    }

    void d() {
        if (f11579s == this) {
            f11579s = null;
            t1 t1Var = this.f11587h;
            if (t1Var != null) {
                t1Var.c();
                this.f11587h = null;
                c();
                this.f11580a.removeOnAttachStateChangeListener(this);
            }
        }
        if (f11578o == this) {
            f(null);
        }
        this.f11580a.removeCallbacks(this.f11584e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z10) {
        long longPressTimeout;
        long j10;
        long j11;
        if (this.f11580a.isAttachedToWindow()) {
            f(null);
            s1 s1Var = f11579s;
            if (s1Var != null) {
                s1Var.d();
            }
            f11579s = this;
            this.f11588i = z10;
            t1 t1Var = new t1(this.f11580a.getContext());
            this.f11587h = t1Var;
            t1Var.e(this.f11580a, this.f11585f, this.f11586g, this.f11588i, this.f11581b);
            this.f11580a.addOnAttachStateChangeListener(this);
            if (this.f11588i) {
                j11 = f11575l;
            } else {
                if ((androidx.core.view.u1.F0(this.f11580a) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j10 = 15000;
                }
                j11 = j10 - longPressTimeout;
            }
            this.f11580a.removeCallbacks(this.f11584e);
            this.f11580a.postDelayed(this.f11584e, j11);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f11587h != null && this.f11588i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f11580a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f11580a.isEnabled() && this.f11587h == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f11585f = view.getWidth() / 2;
        this.f11586g = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }
}
