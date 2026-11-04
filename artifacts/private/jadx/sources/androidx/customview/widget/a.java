package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.collection.j3;
import androidx.core.view.accessibility.j;
import androidx.core.view.accessibility.k;
import androidx.core.view.accessibility.l;
import androidx.core.view.u1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends androidx.core.view.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f49193k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f49194l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f49195m = "android.view.View";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Rect f49196n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final androidx.customview.widget.b.a<j> f49197o = new C0421a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final androidx.customview.widget.b.InterfaceC0422b<j3<j>, j> f49198p = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AccessibilityManager f49203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f49204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f49205g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f49199a = new Rect();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f49200b = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f49201c = new Rect();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f49202d = new int[2];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f49206h = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f49207i = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f49208j = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: androidx.customview.widget.a$a, reason: collision with other inner class name */
    class C0421a implements androidx.customview.widget.b.a<j> {
        C0421a() {
        }

        @Override // androidx.customview.widget.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, Rect rect) {
            jVar.s(rect);
        }
    }

    class b implements androidx.customview.widget.b.InterfaceC0422b<j3<j>, j> {
        b() {
        }

        @Override // androidx.customview.widget.b.InterfaceC0422b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public j a(j3<j> j3Var, int i10) {
            return j3Var.z(i10);
        }

        @Override // androidx.customview.widget.b.InterfaceC0422b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(j3<j> j3Var) {
            return j3Var.size();
        }
    }

    private class c extends k {
        c() {
        }

        @Override // androidx.core.view.accessibility.k
        public j b(int i10) {
            return j.Q0(a.this.A(i10));
        }

        @Override // androidx.core.view.accessibility.k
        public j d(int i10) {
            int i11 = i10 == 2 ? a.this.f49206h : a.this.f49207i;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // androidx.core.view.accessibility.k
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.I(i10, i11, bundle);
        }
    }

    public a(@NonNull View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f49204f = view;
        this.f49203e = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (u1.X(view) == 0) {
            u1.Y1(view, 1);
        }
    }

    private boolean J(int i10, int i11, Bundle bundle) {
        if (i11 == 1) {
            return M(i10);
        }
        if (i11 == 2) {
            return d(i10);
        }
        if (i11 != 64) {
            return i11 != 128 ? C(i10, i11, bundle) : c(i10);
        }
        return L(i10);
    }

    private boolean K(int i10, Bundle bundle) {
        return u1.o1(this.f49204f, i10, bundle);
    }

    private boolean L(int i10) {
        int i11;
        if (!this.f49203e.isEnabled() || !this.f49203e.isTouchExplorationEnabled() || (i11 = this.f49206h) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            c(i11);
        }
        this.f49206h = i10;
        this.f49204f.invalidate();
        N(i10, 32768);
        return true;
    }

    private void O(int i10) {
        int i11 = this.f49208j;
        if (i11 == i10) {
            return;
        }
        this.f49208j = i10;
        N(i10, 128);
        N(i11, 256);
    }

    private boolean c(int i10) {
        if (this.f49206h != i10) {
            return false;
        }
        this.f49206h = Integer.MIN_VALUE;
        this.f49204f.invalidate();
        N(i10, 65536);
        return true;
    }

    private boolean e() {
        int i10 = this.f49207i;
        return i10 != Integer.MIN_VALUE && C(i10, 16, null);
    }

    private AccessibilityEvent f(int i10, int i11) {
        return i10 != -1 ? g(i10, i11) : h(i11);
    }

    private AccessibilityEvent g(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        j jVarA = A(i10);
        accessibilityEventObtain.getText().add(jVarA.a0());
        accessibilityEventObtain.setContentDescription(jVarA.D());
        accessibilityEventObtain.setScrollable(jVarA.H0());
        accessibilityEventObtain.setPassword(jVarA.F0());
        accessibilityEventObtain.setEnabled(jVarA.x0());
        accessibilityEventObtain.setChecked(jVarA.r0());
        E(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(jVarA.y());
        l.Y(accessibilityEventObtain, this.f49204f, i10);
        accessibilityEventObtain.setPackageName(this.f49204f.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent h(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f49204f.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @NonNull
    private j i(int i10) {
        j jVarN0 = j.N0();
        jVarN0.u1(true);
        jVarN0.w1(true);
        jVarN0.j1("android.view.View");
        Rect rect = f49196n;
        jVarN0.d1(rect);
        jVarN0.e1(rect);
        jVarN0.P1(this.f49204f);
        G(i10, jVarN0);
        if (jVarN0.a0() == null && jVarN0.D() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        jVarN0.s(this.f49200b);
        if (this.f49200b.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iP = jVarN0.p();
        if ((iP & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iP & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        jVarN0.N1(this.f49204f.getContext().getPackageName());
        jVarN0.b2(this.f49204f, i10);
        if (this.f49206h == i10) {
            jVarN0.a1(true);
            jVarN0.a(128);
        } else {
            jVarN0.a1(false);
            jVarN0.a(64);
        }
        boolean z10 = this.f49207i == i10;
        if (z10) {
            jVarN0.a(2);
        } else if (jVarN0.y0()) {
            jVarN0.a(1);
        }
        jVarN0.x1(z10);
        this.f49204f.getLocationOnScreen(this.f49202d);
        jVarN0.t(this.f49199a);
        if (this.f49199a.equals(rect)) {
            jVarN0.s(this.f49199a);
            int i11 = 3 ^ (-1);
            if (jVarN0.f48540b != -1) {
                j jVarN1 = j.N0();
                for (int i12 = jVarN0.f48540b; i12 != -1; i12 = jVarN1.f48540b) {
                    jVarN1.Q1(this.f49204f, -1);
                    jVarN1.d1(f49196n);
                    G(i12, jVarN1);
                    jVarN1.s(this.f49200b);
                    Rect rect2 = this.f49199a;
                    Rect rect3 = this.f49200b;
                    rect2.offset(rect3.left, rect3.top);
                }
                jVarN1.T0();
            }
            this.f49199a.offset(this.f49202d[0] - this.f49204f.getScrollX(), this.f49202d[1] - this.f49204f.getScrollY());
        }
        if (this.f49204f.getLocalVisibleRect(this.f49201c)) {
            this.f49201c.offset(this.f49202d[0] - this.f49204f.getScrollX(), this.f49202d[1] - this.f49204f.getScrollY());
            if (this.f49199a.intersect(this.f49201c)) {
                jVarN0.e1(this.f49199a);
                if (x(this.f49199a)) {
                    jVarN0.p2(true);
                }
            }
        }
        return jVarN0;
    }

    @NonNull
    private j j() {
        j jVarO0 = j.O0(this.f49204f);
        u1.l1(this.f49204f, jVarO0);
        ArrayList arrayList = new ArrayList();
        s(arrayList);
        if (jVarO0.x() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            jVarO0.d(this.f49204f, ((Integer) arrayList.get(i10)).intValue());
        }
        return jVarO0;
    }

    private j3<j> n() {
        ArrayList arrayList = new ArrayList();
        s(arrayList);
        j3<j> j3Var = new j3<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            j3Var.o(arrayList.get(i10).intValue(), i(arrayList.get(i10).intValue()));
        }
        return j3Var;
    }

    private void o(int i10, Rect rect) {
        A(i10).s(rect);
    }

    private static Rect t(@NonNull View view, int i10, @NonNull Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i10 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i10 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    private boolean x(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f49204f.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f49204f.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int y(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean z(int i10, @p0 Rect rect) {
        j jVarG;
        j jVar;
        j3<j> j3VarN = n();
        int i11 = this.f49207i;
        if (i11 == Integer.MIN_VALUE) {
            jVarG = null;
            int i12 = 3 >> 0;
        } else {
            jVarG = j3VarN.g(i11);
        }
        j jVar2 = jVarG;
        if (i10 == 1 || i10 == 2) {
            jVar = (j) androidx.customview.widget.b.d(j3VarN, f49198p, f49197o, jVar2, i10, u1.c0(this.f49204f) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i13 = this.f49207i;
            if (i13 != Integer.MIN_VALUE) {
                o(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                t(this.f49204f, i10, rect2);
            }
            jVar = (j) androidx.customview.widget.b.c(j3VarN, f49198p, f49197o, jVar2, rect2, i10);
        }
        return M(jVar != null ? j3VarN.n(j3VarN.k(jVar)) : Integer.MIN_VALUE);
    }

    @NonNull
    j A(int i10) {
        return i10 == -1 ? j() : i(i10);
    }

    public final void B(boolean z10, int i10, @p0 Rect rect) {
        int i11 = this.f49207i;
        if (i11 != Integer.MIN_VALUE) {
            d(i11);
        }
        if (z10) {
            z(i10, rect);
        }
    }

    protected abstract boolean C(int i10, int i11, @p0 Bundle bundle);

    protected void D(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    protected void E(int i10, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    protected void F(@NonNull j jVar) {
    }

    protected abstract void G(int i10, @NonNull j jVar);

    protected void H(int i10, boolean z10) {
    }

    boolean I(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? J(i10, i11, bundle) : K(i11, bundle);
    }

    public final boolean M(int i10) {
        int i11;
        if ((!this.f49204f.isFocused() && !this.f49204f.requestFocus()) || (i11 = this.f49207i) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            d(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f49207i = i10;
        H(i10, true);
        N(i10, 8);
        return true;
    }

    public final boolean N(int i10, int i11) {
        if (i10 != Integer.MIN_VALUE && this.f49203e.isEnabled()) {
            ViewParent parent = this.f49204f.getParent();
            if (parent == null) {
                return false;
            }
            return parent.requestSendAccessibilityEvent(this.f49204f, f(i10, i11));
        }
        return false;
    }

    public final boolean d(int i10) {
        if (this.f49207i != i10) {
            return false;
        }
        this.f49207i = Integer.MIN_VALUE;
        H(i10, false);
        N(i10, 8);
        return true;
    }

    @Override // androidx.core.view.a
    public k getAccessibilityNodeProvider(View view) {
        if (this.f49205g == null) {
            this.f49205g = new c();
        }
        return this.f49205g;
    }

    public final boolean k(@NonNull MotionEvent motionEvent) {
        if (this.f49203e.isEnabled() && this.f49203e.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action == 10 && this.f49208j != Integer.MIN_VALUE) {
                    O(Integer.MIN_VALUE);
                    return true;
                }
                return false;
            }
            int iR = r(motionEvent.getX(), motionEvent.getY());
            O(iR);
            if (iR != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    public final boolean l(@NonNull KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int iY = y(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i10 < repeatCount && z(iY, null)) {
                                    i10++;
                                    z10 = true;
                                }
                                return z10;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                e();
                                return true;
                            }
                            break;
                        default:
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    e();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return z(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return z(1, null);
                }
            }
        }
        return false;
    }

    public final int m() {
        return this.f49206h;
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        D(accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public void onInitializeAccessibilityNodeInfo(View view, j jVar) {
        super.onInitializeAccessibilityNodeInfo(view, jVar);
        F(jVar);
    }

    @Deprecated
    public int p() {
        return m();
    }

    public final int q() {
        return this.f49207i;
    }

    protected abstract int r(float f10, float f11);

    protected abstract void s(List<Integer> list);

    public final void u() {
        w(-1, 1);
    }

    public final void v(int i10) {
        w(i10, 0);
    }

    public final void w(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f49203e.isEnabled() || (parent = this.f49204f.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventF = f(i10, 2048);
        androidx.core.view.accessibility.b.k(accessibilityEventF, i11);
        parent.requestSendAccessibilityEvent(this.f49204f, accessibilityEventF);
    }
}
