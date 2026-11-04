package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.core.view.accessibility.j;
import androidx.core.view.accessibility.m;
import androidx.core.view.d0;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DrawerLayout extends ViewGroup implements androidx.customview.widget.c {
    public static final int A3 = 1;
    public static final int B3 = 2;
    public static final int C3 = 3;
    private static final int D3 = 64;
    private static final int E3 = -1728053248;
    private static final int F3 = 160;
    private static final int G3 = 400;
    private static final boolean H3 = false;
    private static final boolean I3 = true;
    private static final float J3 = 1.0f;
    private static final String N3 = "androidx.drawerlayout.widget.DrawerLayout";

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final String f50907u3 = "DrawerLayout";

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final int f50909w3 = 0;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final int f50910x3 = 1;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final int f50911y3 = 2;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final int f50912z3 = 0;
    private float H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f50913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f50914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f50917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f50918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final androidx.customview.widget.d f50919g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private Drawable f50920g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final androidx.customview.widget.d f50921h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private Drawable f50922h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h f50923i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private CharSequence f50924i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final h f50925j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private CharSequence f50926j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f50927k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private Object f50928k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f50929l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private boolean f50930l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f50931m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private Drawable f50932m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f50933n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private Drawable f50934n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f50935o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private Drawable f50936o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private List<e> f50937p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private float f50938p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private Drawable f50939p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private Drawable f50940p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private final ArrayList<View> f50941q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private Rect f50942r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f50943s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private Matrix f50944s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f50945t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private final m f50946t3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f50947v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private e f50948w;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final int[] f50908v3 = {R.attr.colorPrimaryDark};
    static final int[] K3 = {R.attr.layout_gravity};
    static final boolean L3 = true;
    private static final boolean M3 = true;
    private static boolean O3 = true;

    class a implements m {
        a() {
        }

        @Override // androidx.core.view.accessibility.m
        public boolean a(@NonNull View view, @p0 m.a aVar) {
            if (!DrawerLayout.this.D(view) || DrawerLayout.this.r(view) == 2) {
                return false;
            }
            DrawerLayout.this.f(view);
            return true;
        }
    }

    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    class c extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f50956a = new Rect();

        c() {
        }

        private void c(j jVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.A(childAt)) {
                    jVar.c(childAt);
                }
            }
        }

        private void d(j jVar, j jVar2) {
            Rect rect = this.f50956a;
            jVar2.t(rect);
            jVar.e1(rect);
            jVar.p2(jVar2.M0());
            jVar.N1(jVar2.S());
            jVar.j1(jVar2.y());
            jVar.o1(jVar2.D());
            jVar.u1(jVar2.x0());
            jVar.x1(jVar2.z0());
            jVar.a1(jVar2.p0());
            jVar.Y1(jVar2.I0());
            jVar.a(jVar2.p());
        }

        @Override // androidx.core.view.a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewP = DrawerLayout.this.p();
            if (viewP == null) {
                return true;
            }
            CharSequence charSequenceS = DrawerLayout.this.s(DrawerLayout.this.t(viewP));
            if (charSequenceS == null) {
                return true;
            }
            text.add(charSequenceS);
            return true;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.N3);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j jVar) {
            if (DrawerLayout.L3) {
                super.onInitializeAccessibilityNodeInfo(view, jVar);
            } else {
                j jVarQ0 = j.Q0(jVar);
                super.onInitializeAccessibilityNodeInfo(view, jVarQ0);
                jVar.a2(view);
                Object objO0 = u1.o0(view);
                if (objO0 instanceof View) {
                    jVar.P1((View) objO0);
                }
                d(jVar, jVarQ0);
                jVarQ0.T0();
                c(jVar, (ViewGroup) view);
            }
            jVar.j1(DrawerLayout.N3);
            jVar.w1(false);
            jVar.x1(false);
            jVar.V0(j.a.f48543f);
            jVar.V0(j.a.f48544g);
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.L3 || DrawerLayout.A(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    static final class d extends androidx.core.view.a {
        d() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            if (!DrawerLayout.A(view)) {
                jVar.P1(null);
            }
        }
    }

    public interface e {
        void a(@NonNull View view);

        void b(@NonNull View view);

        void c(int i10);

        void d(@NonNull View view, float f10);
    }

    public static abstract class g implements e {
        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void a(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void b(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void c(int i10) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void d(View view, float f10) {
        }
    }

    private class h extends androidx.customview.widget.d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f50965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.customview.widget.d f50966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f50967c = new a();

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.o();
            }
        }

        h(int i10) {
            this.f50965a = i10;
        }

        private void n() {
            View viewN = DrawerLayout.this.n(this.f50965a == 3 ? 5 : 3);
            if (viewN != null) {
                DrawerLayout.this.f(viewN);
            }
        }

        @Override // androidx.customview.widget.d.c
        public int a(View view, int i10, int i11) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // androidx.customview.widget.d.c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.d.c
        public void f(int i10, int i11) {
            View viewN = (i10 & 1) == 1 ? DrawerLayout.this.n(3) : DrawerLayout.this.n(5);
            if (viewN != null && DrawerLayout.this.r(viewN) == 0) {
                this.f50966b.d(viewN, i11);
            }
        }

        @Override // androidx.customview.widget.d.c
        public boolean g(int i10) {
            return false;
        }

        @Override // androidx.customview.widget.d.c
        public void h(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f50967c, 160L);
        }

        @Override // androidx.customview.widget.d.c
        public void i(View view, int i10) {
            ((f) view.getLayoutParams()).f50963c = false;
            n();
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i10) {
            DrawerLayout.this.b0(i10, this.f50966b.z());
        }

        @Override // androidx.customview.widget.d.c
        public void k(View view, int i10, int i11, int i12, int i13) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.c(view, 3) ? i10 + width : DrawerLayout.this.getWidth() - i10) / width;
            DrawerLayout.this.Y(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public void l(View view, float f10, float f11) {
            int i10;
            float fU = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                i10 = (f10 > 0.0f || (f10 == 0.0f && fU > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && fU > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f50966b.V(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i10) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.c(view, this.f50965a) && DrawerLayout.this.r(view) == 0;
        }

        void o() {
            View viewN;
            int width;
            int iB = this.f50966b.B();
            boolean z10 = this.f50965a == 3;
            if (z10) {
                viewN = DrawerLayout.this.n(3);
                width = (viewN != null ? -viewN.getWidth() : 0) + iB;
            } else {
                viewN = DrawerLayout.this.n(5);
                width = DrawerLayout.this.getWidth() - iB;
            }
            if (viewN != null) {
                if (((!z10 || viewN.getLeft() >= width) && (z10 || viewN.getLeft() <= width)) || DrawerLayout.this.r(viewN) != 0) {
                    return;
                }
                f fVar = (f) viewN.getLayoutParams();
                this.f50966b.X(viewN, width, viewN.getTop());
                fVar.f50963c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f50967c);
        }

        public void q(androidx.customview.widget.d dVar) {
            this.f50966b = dVar;
        }
    }

    public DrawerLayout(@NonNull Context context) {
        this(context, null);
    }

    static boolean A(View view) {
        if (u1.X(view) == 4 || u1.X(view) == 2) {
            return false;
        }
        int i10 = 2 & 1;
        return true;
    }

    private boolean H(float f10, float f11, View view) {
        if (this.f50942r3 == null) {
            this.f50942r3 = new Rect();
        }
        view.getHitRect(this.f50942r3);
        return this.f50942r3.contains((int) f10, (int) f11);
    }

    private void I(Drawable drawable, int i10) {
        if (drawable == null || !androidx.core.graphics.drawable.c.h(drawable)) {
            return;
        }
        androidx.core.graphics.drawable.c.m(drawable, i10);
    }

    private Drawable P() {
        int iC0 = u1.c0(this);
        if (iC0 == 0) {
            Drawable drawable = this.f50932m3;
            if (drawable != null) {
                I(drawable, iC0);
                return this.f50932m3;
            }
        } else {
            Drawable drawable2 = this.f50934n3;
            if (drawable2 != null) {
                I(drawable2, iC0);
                return this.f50934n3;
            }
        }
        return this.f50936o3;
    }

    private Drawable Q() {
        int iC0 = u1.c0(this);
        if (iC0 == 0) {
            Drawable drawable = this.f50934n3;
            if (drawable != null) {
                I(drawable, iC0);
                return this.f50934n3;
            }
        } else {
            Drawable drawable2 = this.f50932m3;
            if (drawable2 != null) {
                I(drawable2, iC0);
                return this.f50932m3;
            }
        }
        return this.f50940p3;
    }

    private void R() {
        if (M3) {
            return;
        }
        this.f50920g3 = P();
        this.f50922h3 = Q();
    }

    private void Z(View view) {
        j.a aVar = j.a.f48563z;
        u1.w1(view, aVar.b());
        if (!D(view) || r(view) == 2) {
            return;
        }
        u1.z1(view, aVar, null, this.f50946t3);
    }

    private void a0(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || E(childAt)) && !(z10 && childAt == view)) {
                u1.Y1(childAt, 4);
            } else {
                u1.Y1(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventV = v(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventV);
            motionEventV.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f50944s3 == null) {
                this.f50944s3 = new Matrix();
            }
            matrix.invert(this.f50944s3);
            motionEventObtain.transform(this.f50944s3);
        }
        return motionEventObtain;
    }

    static String w(int i10) {
        if ((i10 & 3) == 3) {
            return "LEFT";
        }
        return (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((f) getChildAt(i10).getLayoutParams()).f50963c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        if (p() == null) {
            return false;
        }
        int i10 = 3 ^ 1;
        return true;
    }

    boolean B(View view) {
        return ((f) view.getLayoutParams()).f50961a == 0;
    }

    public boolean C(int i10) {
        View viewN = n(i10);
        if (viewN != null) {
            return D(viewN);
        }
        return false;
    }

    public boolean D(@NonNull View view) {
        if (E(view)) {
            return (((f) view.getLayoutParams()).f50964d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean E(View view) {
        int iD = d0.d(((f) view.getLayoutParams()).f50961a, u1.c0(view));
        boolean z10 = !true;
        return ((iD & 3) == 0 && (iD & 5) == 0) ? false : true;
    }

    public boolean F(int i10) {
        View viewN = n(i10);
        if (viewN != null) {
            return G(viewN);
        }
        return false;
    }

    public boolean G(@NonNull View view) {
        if (E(view)) {
            return ((f) view.getLayoutParams()).f50962b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void J(View view, float f10) {
        float fU = u(view);
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (fU * width));
        if (!c(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        Y(view, f10);
    }

    public void K(int i10) {
        L(i10, true);
    }

    public void L(int i10, boolean z10) {
        View viewN = n(i10);
        if (viewN != null) {
            N(viewN, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void M(@NonNull View view) {
        N(view, true);
    }

    public void N(@NonNull View view, boolean z10) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f50931m) {
            fVar.f50962b = 1.0f;
            fVar.f50964d = 1;
            a0(view, true);
            Z(view);
        } else if (z10) {
            fVar.f50964d |= 2;
            if (c(view, 3)) {
                this.f50919g.X(view, 0, view.getTop());
            } else {
                this.f50921h.X(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            J(view, 1.0f);
            b0(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void O(@NonNull e eVar) {
        List<e> list;
        if (eVar == null || (list = this.f50937p0) == null) {
            return;
        }
        list.remove(eVar);
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void S(Object obj, boolean z10) {
        this.f50928k3 = obj;
        this.f50930l3 = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void T(int i10, int i11) {
        View viewN;
        int iD = d0.d(i11, u1.c0(this));
        if (i11 == 3) {
            this.f50933n = i10;
        } else if (i11 == 5) {
            this.f50935o = i10;
        } else if (i11 == 8388611) {
            this.f50943s = i10;
        } else if (i11 == 8388613) {
            this.f50945t = i10;
        }
        if (i10 != 0) {
            (iD == 3 ? this.f50919g : this.f50921h).c();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewN = n(iD)) != null) {
                M(viewN);
                return;
            }
            return;
        }
        View viewN2 = n(iD);
        if (viewN2 != null) {
            f(viewN2);
        }
    }

    public void U(int i10, @NonNull View view) {
        if (E(view)) {
            T(i10, ((f) view.getLayoutParams()).f50961a);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void V(@v int i10, int i11) {
        W(androidx.core.content.d.l(getContext(), i10), i11);
    }

    public void W(Drawable drawable, int i10) {
        if (M3) {
            return;
        }
        if ((i10 & d0.f48643b) == 8388611) {
            this.f50932m3 = drawable;
        } else if ((i10 & d0.f48644c) == 8388613) {
            this.f50934n3 = drawable;
        } else if ((i10 & 3) == 3) {
            this.f50936o3 = drawable;
        } else if ((i10 & 5) != 5) {
            return;
        } else {
            this.f50940p3 = drawable;
        }
        R();
        invalidate();
    }

    public void X(int i10, @p0 CharSequence charSequence) {
        int iD = d0.d(i10, u1.c0(this));
        if (iD == 3) {
            this.f50924i3 = charSequence;
        } else if (iD == 5) {
            this.f50926j3 = charSequence;
        }
    }

    void Y(View view, float f10) {
        f fVar = (f) view.getLayoutParams();
        if (f10 == fVar.f50962b) {
            return;
        }
        fVar.f50962b = f10;
        l(view, f10);
    }

    public void a(@NonNull e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f50937p0 == null) {
            this.f50937p0 = new ArrayList();
        }
        this.f50937p0.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!E(childAt)) {
                this.f50941q3.add(childAt);
            } else if (D(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
        }
        if (!z10) {
            int size = this.f50941q3.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = this.f50941q3.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.f50941q3.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (o() != null || E(view)) {
            u1.Y1(view, 4);
        } else {
            u1.Y1(view, 1);
        }
        if (L3) {
            return;
        }
        u1.G1(view, this.f50913a);
    }

    void b() {
        if (this.f50947v) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f50947v = true;
    }

    void b0(int i10, View view) {
        int i11;
        int iF = this.f50919g.F();
        int iF2 = this.f50921h.F();
        if (iF == 1 || iF2 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (iF != 2 && iF2 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((f) view.getLayoutParams()).f50962b;
            if (f10 == 0.0f) {
                j(view);
            } else if (f10 == 1.0f) {
                k(view);
            }
        }
        if (i11 != this.f50927k) {
            this.f50927k = i11;
            List<e> list = this.f50937p0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f50937p0.get(size).c(i11);
                }
            }
        }
    }

    boolean c(View view, int i10) {
        return (t(view) & i10) == i10;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // androidx.customview.widget.c
    public void close() {
        d(d0.f48643b);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((f) getChildAt(i10).getLayoutParams()).f50962b);
        }
        this.f50917e = fMax;
        boolean zO = this.f50919g.o(true);
        boolean zO2 = this.f50921h.o(true);
        if (zO || zO2) {
            u1.s1(this);
        }
    }

    public void d(int i10) {
        e(i10, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f50917e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (H(x10, y10, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean zB = B(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zB) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        float f10 = this.f50917e;
        if (f10 > 0.0f && zB) {
            int i13 = this.f50916d;
            this.f50918f.setColor((i13 & 16777215) | (((int) ((((-16777216) & i13) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.f50918f);
            return zDrawChild;
        }
        if (this.f50920g3 != null && c(view, 3)) {
            int intrinsicWidth = this.f50920g3.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f50919g.B(), 1.0f));
            this.f50920g3.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f50920g3.setAlpha((int) (fMax * 255.0f));
            this.f50920g3.draw(canvas);
            return zDrawChild;
        }
        if (this.f50922h3 != null && c(view, 5)) {
            int intrinsicWidth2 = this.f50922h3.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f50921h.B(), 1.0f));
            this.f50922h3.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f50922h3.setAlpha((int) (fMax2 * 255.0f));
            this.f50922h3.draw(canvas);
        }
        return zDrawChild;
    }

    public void e(int i10, boolean z10) {
        View viewN = n(i10);
        if (viewN != null) {
            g(viewN, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void f(@NonNull View view) {
        g(view, true);
    }

    public void g(@NonNull View view, boolean z10) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f50931m) {
            fVar.f50962b = 0.0f;
            fVar.f50964d = 0;
        } else if (z10) {
            fVar.f50964d |= 4;
            if (c(view, 3)) {
                this.f50919g.X(view, -view.getWidth(), view.getTop());
            } else {
                this.f50921h.X(view, getWidth(), view.getTop());
            }
        } else {
            J(view, 0.0f);
            b0(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (M3) {
            return this.f50914b;
        }
        return 0.0f;
    }

    @p0
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f50939p2;
    }

    public void h() {
        i(false);
    }

    void i(boolean z10) {
        int childCount = getChildCount();
        boolean zX = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (E(childAt) && (!z10 || fVar.f50963c)) {
                zX |= c(childAt, 3) ? this.f50919g.X(childAt, -childAt.getWidth(), childAt.getTop()) : this.f50921h.X(childAt, getWidth(), childAt.getTop());
                fVar.f50963c = false;
            }
        }
        this.f50923i.p();
        this.f50925j.p();
        if (zX) {
            invalidate();
        }
    }

    @Override // androidx.customview.widget.c
    public boolean isOpen() {
        return C(d0.f48643b);
    }

    void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f50964d & 1) == 1) {
            fVar.f50964d = 0;
            List<e> list = this.f50937p0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f50937p0.get(size).b(view);
                }
            }
            a0(view, false);
            Z(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f50964d & 1) == 0) {
            fVar.f50964d = 1;
            List<e> list = this.f50937p0;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f50937p0.get(size).a(view);
                }
            }
            a0(view, true);
            Z(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f10) {
        List<e> list = this.f50937p0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f50937p0.get(size).d(view, f10);
            }
        }
    }

    View n(int i10) {
        int iD = d0.d(i10, u1.c0(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((t(childAt) & 7) == iD) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((f) childAt.getLayoutParams()).f50964d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50931m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50931m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f50930l3 && this.f50939p2 != null) {
            Object obj = this.f50928k3;
            int i10 = 6 | 0;
            int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.f50939p2.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f50939p2.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View viewV;
        int actionMasked = motionEvent.getActionMasked();
        boolean zW = this.f50919g.W(motionEvent) | this.f50921h.W(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i(true);
                this.f50947v = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i(true);
                    this.f50947v = false;
                }
            } else if (this.f50919g.f(3)) {
                this.f50923i.p();
                this.f50925j.p();
            }
            z10 = false;
        } else {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f50938p1 = x10;
            this.H1 = y10;
            z10 = this.f50917e > 0.0f && (viewV = this.f50919g.v((int) x10, (int) y10)) != null && B(viewV);
            this.f50947v = false;
        }
        return zW || z10 || y() || this.f50947v;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !z()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewP = p();
        if (viewP != null && r(viewP) == 0) {
            h();
        }
        return viewP != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z11 = true;
        this.f50929l = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (fVar.f50962b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        int i18 = i15 - ((int) (fVar.f50962b * f12));
                        f10 = (i15 - i18) / f12;
                        i14 = i18;
                    }
                    boolean z12 = f10 != fVar.f50962b ? z11 : false;
                    int i19 = fVar.f50961a & com.planner5d.library.engine.input.f.b.B;
                    if (i19 == 16) {
                        int i20 = i13 - i11;
                        int i21 = (i20 - measuredHeight) / 2;
                        int i22 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i21 < i22) {
                            i21 = i22;
                        } else {
                            int i23 = i21 + measuredHeight;
                            int i24 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i23 > i20 - i24) {
                                i21 = (i20 - i24) - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i21, measuredWidth + i14, measuredHeight + i21);
                    } else if (i19 != 80) {
                        int i25 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i14, i25, measuredWidth + i14, measuredHeight + i25);
                    } else {
                        int i26 = i13 - i11;
                        childAt.layout(i14, (i26 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i26 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z12) {
                        Y(childAt, f10);
                    }
                    int i27 = fVar.f50962b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i27) {
                        childAt.setVisibility(i27);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (O3 && (rootWindowInsets = getRootWindowInsets()) != null) {
            androidx.core.graphics.j jVarN = g3.K(rootWindowInsets).n();
            androidx.customview.widget.d dVar = this.f50919g;
            dVar.S(Math.max(dVar.A(), jVarN.f47823a));
            androidx.customview.widget.d dVar2 = this.f50921h;
            dVar2.S(Math.max(dVar2.A(), jVarN.f47825c));
        }
        this.f50929l = false;
        this.f50931m = false;
    }

    @Override // android.view.View
    @e.a({"WrongConstant"})
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z10 = this.f50928k3 != null && u1.W(this);
        int iC0 = u1.c0(this);
        int childCount = getChildCount();
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z10) {
                    int iD = d0.d(fVar.f50961a, iC0);
                    if (u1.W(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f50928k3;
                        if (iD == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iD == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f50928k3;
                        if (iD == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iD == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else {
                    if (!E(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (M3) {
                        float fT = u1.T(childAt);
                        float f10 = this.f50914b;
                        if (fT != f10) {
                            u1.U1(childAt, f10);
                        }
                    }
                    int iT = t(childAt) & 7;
                    boolean z13 = iT == 3;
                    if ((z13 && z11) || (!z13 && z12)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(iT) + " but this " + f50907u3 + " already has a drawer view along that edge");
                    }
                    if (z13) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f50915c + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewN;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        int i10 = savedState.f50949c;
        if (i10 != 0 && (viewN = n(i10)) != null) {
            M(viewN);
        }
        int i11 = savedState.f50950d;
        if (i11 != 3) {
            T(i11, 3);
        }
        int i12 = savedState.f50951e;
        if (i12 != 3) {
            T(i12, 5);
        }
        int i13 = savedState.f50952f;
        if (i13 != 3) {
            T(i13, d0.f48643b);
        }
        int i14 = savedState.f50953g;
        if (i14 != 3) {
            T(i14, d0.f48644c);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        R();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            f fVar = (f) getChildAt(i10).getLayoutParams();
            int i11 = fVar.f50964d;
            boolean z10 = true;
            boolean z11 = i11 == 1;
            if (i11 != 2) {
                z10 = false;
            }
            if (z11 || z10) {
                savedState.f50949c = fVar.f50961a;
                break;
            }
        }
        savedState.f50950d = this.f50933n;
        savedState.f50951e = this.f50935o;
        savedState.f50952f = this.f50943s;
        savedState.f50953g = this.f50945t;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View viewO;
        this.f50919g.M(motionEvent);
        this.f50921h.M(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f50938p1 = x10;
            this.H1 = y10;
            this.f50947v = false;
        } else if (action == 1) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            View viewV = this.f50919g.v((int) x11, (int) y11);
            if (viewV != null && B(viewV)) {
                float f10 = x11 - this.f50938p1;
                float f11 = y11 - this.H1;
                int iE = this.f50919g.E();
                z10 = (f10 * f10) + (f11 * f11) >= ((float) (iE * iE)) || (viewO = o()) == null || r(viewO) == 2;
            }
            i(z10);
        } else if (action == 3) {
            i(true);
            this.f50947v = false;
        }
        return true;
    }

    @Override // androidx.customview.widget.c
    public void open() {
        K(d0.f48643b);
    }

    View p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i10) {
        int iC0 = u1.c0(this);
        if (i10 == 3) {
            int i11 = this.f50933n;
            if (i11 != 3) {
                return i11;
            }
            int i12 = iC0 == 0 ? this.f50943s : this.f50945t;
            if (i12 != 3) {
                return i12;
            }
        } else if (i10 == 5) {
            int i13 = this.f50935o;
            if (i13 != 3) {
                return i13;
            }
            int i14 = iC0 == 0 ? this.f50945t : this.f50943s;
            if (i14 != 3) {
                return i14;
            }
        } else if (i10 == 8388611) {
            int i15 = this.f50943s;
            if (i15 != 3) {
                return i15;
            }
            int i16 = iC0 == 0 ? this.f50933n : this.f50935o;
            if (i16 != 3) {
                return i16;
            }
        } else if (i10 == 8388613) {
            int i17 = this.f50945t;
            if (i17 != 3) {
                return i17;
            }
            int i18 = iC0 == 0 ? this.f50935o : this.f50933n;
            if (i18 != 3) {
                return i18;
            }
        }
        return 0;
    }

    public int r(@NonNull View view) {
        if (E(view)) {
            return q(((f) view.getLayoutParams()).f50961a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f50929l) {
            return;
        }
        super.requestLayout();
    }

    @p0
    public CharSequence s(int i10) {
        int iD = d0.d(i10, u1.c0(this));
        if (iD == 3) {
            return this.f50924i3;
        }
        if (iD == 5) {
            return this.f50926j3;
        }
        return null;
    }

    public void setDrawerElevation(float f10) {
        this.f50914b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt)) {
                u1.U1(childAt, this.f50914b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f50948w;
        if (eVar2 != null) {
            O(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f50948w = eVar;
    }

    public void setDrawerLockMode(int i10) {
        T(i10, 3);
        int i11 = 4 & 5;
        T(i10, 5);
    }

    public void setScrimColor(@l int i10) {
        this.f50916d = i10;
        invalidate();
    }

    public void setStatusBarBackground(@p0 Drawable drawable) {
        this.f50939p2 = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@l int i10) {
        this.f50939p2 = new ColorDrawable(i10);
        invalidate();
    }

    int t(View view) {
        return d0.d(((f) view.getLayoutParams()).f50961a, u1.c0(this));
    }

    float u(View view) {
        return ((f) view.getLayoutParams()).f50962b;
    }

    public DrawerLayout(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, y1.a.C2531a.f390681b);
    }

    public DrawerLayout(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f50913a = new d();
        this.f50916d = -1728053248;
        this.f50918f = new Paint();
        this.f50931m = true;
        this.f50933n = 3;
        this.f50935o = 3;
        this.f50943s = 3;
        this.f50945t = 3;
        this.f50932m3 = null;
        this.f50934n3 = null;
        this.f50936o3 = null;
        this.f50940p3 = null;
        this.f50946t3 = new a();
        setDescendantFocusability(262144);
        float f10 = getResources().getDisplayMetrics().density;
        this.f50915c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        h hVar = new h(3);
        this.f50923i = hVar;
        h hVar2 = new h(5);
        this.f50925j = hVar2;
        androidx.customview.widget.d dVarP = androidx.customview.widget.d.p(this, 1.0f, hVar);
        this.f50919g = dVarP;
        dVarP.T(1);
        dVarP.U(f11);
        hVar.q(dVarP);
        androidx.customview.widget.d dVarP2 = androidx.customview.widget.d.p(this, 1.0f, hVar2);
        this.f50921h = dVarP2;
        dVarP2.T(2);
        dVarP2.U(f11);
        hVar2.q(dVarP2);
        setFocusableInTouchMode(true);
        u1.Y1(this, 1);
        u1.G1(this, new c());
        setMotionEventSplittingEnabled(false);
        if (u1.W(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f50908v3);
            try {
                this.f50939p2 = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, y1.a.j.f390796g, i10, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(y1.a.j.f390797h)) {
                this.f50914b = typedArrayObtainStyledAttributes2.getDimension(y1.a.j.f390797h, 0.0f);
            } else {
                this.f50914b = getResources().getDimension(y1.a.c.f390705h);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.f50941q3 = new ArrayList<>();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th3;
        }
    }

    public void setStatusBarBackground(int i10) {
        this.f50939p2 = i10 != 0 ? androidx.core.content.d.l(getContext(), i10) : null;
        invalidate();
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f50958e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f50959f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f50960g = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f50961a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f50962b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f50963c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f50964d;

        public f(@NonNull Context context, @p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f50961a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.K3);
            this.f50961a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public f(int i10, int i11) {
            super(i10, i11);
            this.f50961a = 0;
        }

        public f(int i10, int i11, int i12) {
            this(i10, i11);
            this.f50961a = i12;
        }

        public f(@NonNull f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            int i10 = 5 ^ 0;
            this.f50961a = 0;
            this.f50961a = fVar.f50961a;
        }

        public f(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f50961a = 0;
        }

        public f(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f50961a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f50949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f50950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f50951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f50952f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f50953g;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@NonNull Parcel parcel, @p0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f50949c = 0;
            this.f50949c = parcel.readInt();
            this.f50950d = parcel.readInt();
            this.f50951e = parcel.readInt();
            this.f50952f = parcel.readInt();
            this.f50953g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f50949c);
            parcel.writeInt(this.f50950d);
            parcel.writeInt(this.f50951e);
            parcel.writeInt(this.f50952f);
            parcel.writeInt(this.f50953g);
        }

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
            this.f50949c = 0;
        }
    }
}
