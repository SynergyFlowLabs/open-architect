package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.j;
import androidx.core.view.accessibility.m;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes4.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    private static final float X = 0.5f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f111309l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f111310m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f111311n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f111312o = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f111313s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f111314t = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f111315v = 0.5f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final float f111316w = 0.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    androidx.customview.widget.d f111317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c f111318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f111319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f111320d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f111322f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f111321e = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f111323g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f111324h = 0.5f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f111325i = 0.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    float f111326j = 0.5f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final androidx.customview.widget.d.c f111327k = new a();

    class a extends androidx.customview.widget.d.c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f111328d = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f111329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f111330b = -1;

        a() {
        }

        private boolean n(@NonNull View view, float f10) {
            if (f10 == 0.0f) {
                return Math.abs(view.getLeft() - this.f111329a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f111324h);
            }
            boolean z10 = u1.c0(view) == 1;
            int i10 = SwipeDismissBehavior.this.f111323g;
            if (i10 == 2) {
                return true;
            }
            if (i10 == 0) {
                if (z10) {
                    return f10 < 0.0f;
                }
                return f10 > 0.0f;
            }
            if (i10 == 1) {
                if (z10) {
                    return f10 > 0.0f;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.customview.widget.d.c
        public int a(@NonNull View view, int i10, int i11) {
            int width;
            int width2;
            int width3;
            boolean z10 = u1.c0(view) == 1;
            int i12 = SwipeDismissBehavior.this.f111323g;
            if (i12 == 0) {
                if (z10) {
                    width = this.f111329a - view.getWidth();
                    width2 = this.f111329a;
                } else {
                    width = this.f111329a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i12 != 1) {
                width = this.f111329a - view.getWidth();
                width2 = this.f111329a + view.getWidth();
            } else if (z10) {
                width = this.f111329a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f111329a - view.getWidth();
                width2 = this.f111329a;
            }
            return SwipeDismissBehavior.Q(width, i10, width2);
        }

        @Override // androidx.customview.widget.d.c
        public int b(@NonNull View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(@NonNull View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.d.c
        public void i(@NonNull View view, int i10) {
            this.f111330b = i10;
            this.f111329a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f111320d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f111320d = false;
            }
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i10) {
            c cVar = SwipeDismissBehavior.this.f111318b;
            if (cVar != null) {
                cVar.b(i10);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(@NonNull View view, int i10, int i11, int i12, int i13) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f111325i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f111326j;
            float fAbs = Math.abs(i10 - this.f111329a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.P(0.0f, 1.0f - SwipeDismissBehavior.S(width, width2, fAbs), 1.0f));
            }
        }

        @Override // androidx.customview.widget.d.c
        public void l(@NonNull View view, float f10, float f11) {
            int i10;
            boolean z10;
            c cVar;
            this.f111330b = -1;
            int width = view.getWidth();
            if (n(view, f10)) {
                if (f10 >= 0.0f) {
                    int left = view.getLeft();
                    int i11 = this.f111329a;
                    i10 = left < i11 ? this.f111329a - width : i11 + width;
                }
                z10 = true;
            } else {
                i10 = this.f111329a;
                z10 = false;
            }
            if (SwipeDismissBehavior.this.f111317a.V(i10, view.getTop())) {
                u1.u1(view, new d(view, z10));
                return;
            }
            if (z10 && (cVar = SwipeDismissBehavior.this.f111318b) != null) {
                cVar.a(view);
            }
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i10) {
            int i11 = this.f111330b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.O(view);
        }
    }

    class b implements m {
        b() {
        }

        @Override // androidx.core.view.accessibility.m
        public boolean a(@NonNull View view, @p0 m.a aVar) {
            if (!SwipeDismissBehavior.this.O(view)) {
                return false;
            }
            boolean z10 = u1.c0(view) == 1;
            int i10 = SwipeDismissBehavior.this.f111323g;
            u1.h1(view, (!(i10 == 0 && z10) && (i10 != 1 || z10)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f111318b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i10);
    }

    private class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f111333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f111334b;

        d(View view, boolean z10) {
            this.f111333a = view;
            this.f111334b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            androidx.customview.widget.d dVar = SwipeDismissBehavior.this.f111317a;
            if (dVar != null && dVar.o(true)) {
                u1.u1(this.f111333a, this);
            } else {
                if (!this.f111334b || (cVar = SwipeDismissBehavior.this.f111318b) == null) {
                    return;
                }
                cVar.a(this.f111333a);
            }
        }
    }

    static float P(float f10, float f11, float f12) {
        return Math.min(Math.max(f10, f11), f12);
    }

    static int Q(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i11), i12);
    }

    private void R(ViewGroup viewGroup) {
        if (this.f111317a == null) {
            this.f111317a = this.f111322f ? androidx.customview.widget.d.p(viewGroup, this.f111321e, this.f111327k) : androidx.customview.widget.d.q(viewGroup, this.f111327k);
        }
    }

    static float S(float f10, float f11, float f12) {
        return (f12 - f10) / (f11 - f10);
    }

    private void b0(View view) {
        u1.w1(view, 1048576);
        if (O(view)) {
            u1.z1(view, j.a.f48563z, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean L(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f111317a == null) {
            return false;
        }
        if (!this.f111320d || motionEvent.getActionMasked() != 3) {
            this.f111317a.M(motionEvent);
        }
        return true;
    }

    public boolean O(@NonNull View view) {
        return true;
    }

    public int T() {
        androidx.customview.widget.d dVar = this.f111317a;
        if (dVar != null) {
            return dVar.F();
        }
        return 0;
    }

    @l1
    @p0
    public c U() {
        return this.f111318b;
    }

    public void V(float f10) {
        this.f111324h = P(0.0f, f10, 1.0f);
    }

    public void W(float f10) {
        this.f111326j = P(0.0f, f10, 1.0f);
    }

    public void X(@p0 c cVar) {
        this.f111318b = cVar;
    }

    public void Y(float f10) {
        this.f111321e = f10;
        this.f111322f = true;
    }

    public void Z(float f10) {
        this.f111325i = P(0.0f, f10, 1.0f);
    }

    public void a0(int i10) {
        this.f111323g = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        boolean zG = this.f111319c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zG = coordinatorLayout.G(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f111319c = zG;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f111319c = false;
        }
        if (zG) {
            R(coordinatorLayout);
            if (!this.f111320d && this.f111317a.W(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        boolean zT = super.t(coordinatorLayout, v10, i10);
        if (u1.X(v10) == 0) {
            u1.Y1(v10, 1);
            b0(v10);
        }
        return zT;
    }
}
