package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.os.q0;
import androidx.core.view.ScrollingView;
import androidx.core.view.s0;
import androidx.core.view.t0;
import androidx.core.view.u0;
import androidx.core.view.u1;
import androidx.core.view.w0;
import androidx.core.view.y1;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class RecyclerView extends ViewGroup implements ScrollingView, t0, u0 {
    static final int A4 = 1;
    public static final int B4 = -1;
    public static final long C4 = -1;
    public static final int D4 = -1;
    public static final int E4 = 0;
    public static final int F4 = 1;
    public static final int G4 = Integer.MIN_VALUE;
    static final int H4 = 2000;
    static final String I4 = "RV Scroll";
    private static final String J4 = "RV OnLayout";
    private static final String K4 = "RV FullInvalidate";
    private static final String L4 = "RV PartialInvalidate";
    static final String M4 = "RV OnBindView";
    static final String N4 = "RV Prefetch";
    static final String O4 = "RV Nested Prefetch";
    static final String P4 = "RV CreateView";
    private static final Class<?>[] Q4;
    private static final int R4 = -1;
    public static final int S4 = 0;
    public static final int T4 = 1;
    public static final int U4 = 2;
    static final long V4 = Long.MAX_VALUE;
    static final Interpolator W4;
    static final d0 X4;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    static final String f73880j4 = "RecyclerView";

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    static final boolean f73881k4 = false;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    static final boolean f73882l4 = false;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private static final float f73884n4 = 0.015f;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private static final float f73885o4 = 0.35f;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private static final float f73893w4 = 4.0f;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    static final boolean f73894x4 = false;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final int f73895y4 = 0;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final int f73896z4 = 1;
    private VelocityTracker A3;
    private int B3;
    private int C3;
    private int D3;
    private int E3;
    private int F3;
    private s G3;
    boolean H1;
    private final int H3;
    private final int I3;
    private float J3;
    private float K3;
    private boolean L3;
    final f0 M3;
    androidx.recyclerview.widget.n N3;
    androidx.recyclerview.widget.n.b O3;
    final c0 P3;
    private u Q3;
    private List<u> R3;
    boolean S3;
    boolean T3;
    private m.c U3;
    boolean V3;
    androidx.recyclerview.widget.b0 W3;
    private k X3;
    private final int[] Y3;
    private w0 Z3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f73897a;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private final int[] f73898a4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f73899b;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private final int[] f73900b4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final x f73901c;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    final int[] f73902c4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    SavedState f73903d;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    @l1
    final List<g0> f73904d4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.recyclerview.widget.a f73905e;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private Runnable f73906e4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    androidx.recyclerview.widget.g f73907f;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private boolean f73908f4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final l0 f73909g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private int f73910g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private int f73911g4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f73912h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    boolean f73913h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private int f73914h4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final Runnable f73915i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    boolean f73916i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private final l0.b f73917i4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Rect f73918j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private boolean f73919j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f73920k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f73921k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final RectF f73922l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    boolean f73923l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    h f73924m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private final AccessibilityManager f73925m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @l1
    p f73926n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private List<r> f73927n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    y f73928o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    boolean f73929o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    boolean f73930p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    boolean f73931p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @l1
    boolean f73932p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    boolean f73933p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private int f73934q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private int f73935r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final List<y> f73936s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    @NonNull
    private l f73937s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final ArrayList<o> f73938t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private EdgeEffect f73939t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private EdgeEffect f73940u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ArrayList<t> f73941v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private EdgeEffect f73942v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private t f73943w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private EdgeEffect f73944w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    m f73945x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private int f73946y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private int f73947z3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final int[] f73883m4 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private static final float f73886p4 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    static final boolean f73887q4 = false;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    static final boolean f73888r4 = true;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    static final boolean f73889s4 = true;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    static final boolean f73890t4 = true;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private static final boolean f73891u4 = false;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private static final boolean f73892v4 = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f73932p2 || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f73930p0) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f73916i3) {
                recyclerView2.f73913h3 = true;
            } else {
                recyclerView2.I();
            }
        }
    }

    public static class a0 implements t {
        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z10) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.f73945x3;
            if (mVar != null) {
                mVar.x();
            }
            RecyclerView.this.V3 = false;
        }
    }

    public static abstract class b0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView f73952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p f73953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f73954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f73955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f73956f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f73958h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f73951a = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final a f73957g = new a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f73959h = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f73960a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f73961b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f73962c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f73963d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Interpolator f73964e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f73965f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private int f73966g;

            public a(@androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11) {
                this(i10, i11, Integer.MIN_VALUE, null);
            }

            private void m() {
                if (this.f73964e != null && this.f73962c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f73962c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public int a() {
                return this.f73962c;
            }

            @androidx.annotation.t0
            public int b() {
                return this.f73960a;
            }

            @androidx.annotation.t0
            public int c() {
                return this.f73961b;
            }

            @p0
            public Interpolator d() {
                return this.f73964e;
            }

            boolean e() {
                return this.f73963d >= 0;
            }

            public void f(int i10) {
                this.f73963d = i10;
            }

            void g(RecyclerView recyclerView) {
                int i10 = this.f73963d;
                if (i10 >= 0) {
                    this.f73963d = -1;
                    recyclerView.U0(i10);
                    this.f73965f = false;
                } else {
                    if (!this.f73965f) {
                        this.f73966g = 0;
                        return;
                    }
                    m();
                    recyclerView.M3.e(this.f73960a, this.f73961b, this.f73962c, this.f73964e);
                    this.f73966g++;
                    this.f73965f = false;
                }
            }

            public void h(int i10) {
                this.f73965f = true;
                this.f73962c = i10;
            }

            public void i(@androidx.annotation.t0 int i10) {
                this.f73965f = true;
                this.f73960a = i10;
            }

            public void j(@androidx.annotation.t0 int i10) {
                this.f73965f = true;
                this.f73961b = i10;
            }

            public void k(@p0 Interpolator interpolator) {
                this.f73965f = true;
                this.f73964e = interpolator;
            }

            public void l(@androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, int i12, @p0 Interpolator interpolator) {
                this.f73960a = i10;
                this.f73961b = i11;
                this.f73962c = i12;
                this.f73964e = interpolator;
                int i13 = 3 << 1;
                this.f73965f = true;
            }

            public a(@androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, int i12) {
                this(i10, i11, i12, null);
            }

            public a(@androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, int i12, @p0 Interpolator interpolator) {
                this.f73963d = -1;
                this.f73965f = false;
                this.f73966g = 0;
                this.f73960a = i10;
                this.f73961b = i11;
                this.f73962c = i12;
                this.f73964e = interpolator;
            }
        }

        public interface b {
            @p0
            PointF c(int i10);
        }

        @p0
        public PointF a(int i10) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).c(i10);
            }
            return null;
        }

        public View b(int i10) {
            return this.f73952b.f73926n.O(i10);
        }

        public int c() {
            return this.f73952b.f73926n.V();
        }

        public int d(View view) {
            return this.f73952b.u0(view);
        }

        @p0
        public p e() {
            return this.f73953c;
        }

        public int f() {
            return this.f73951a;
        }

        @Deprecated
        public void g(int i10) {
            this.f73952b.M1(i10);
        }

        public boolean h() {
            return this.f73954d;
        }

        public boolean i() {
            return this.f73955e;
        }

        protected void j(@NonNull PointF pointF) {
            float f10 = pointF.x;
            float f11 = pointF.y;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f11 * f11));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void k(int i10, int i11) {
            PointF pointFA;
            RecyclerView recyclerView = this.f73952b;
            if (this.f73951a == -1 || recyclerView == null) {
                s();
            }
            if (this.f73954d && this.f73956f == null && this.f73953c != null && (pointFA = a(this.f73951a)) != null) {
                float f10 = pointFA.x;
                if (f10 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.L1((int) Math.signum(f10), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f73954d = false;
            View view = this.f73956f;
            if (view != null) {
                if (d(view) == this.f73951a) {
                    p(this.f73956f, recyclerView.P3, this.f73957g);
                    this.f73957g.g(recyclerView);
                    s();
                } else {
                    this.f73956f = null;
                }
            }
            if (this.f73955e) {
                m(i10, i11, recyclerView.P3, this.f73957g);
                boolean zE = this.f73957g.e();
                this.f73957g.g(recyclerView);
                if (zE && this.f73955e) {
                    this.f73954d = true;
                    recyclerView.M3.d();
                }
            }
        }

        protected void l(View view) {
            if (d(view) == f()) {
                this.f73956f = view;
            }
        }

        protected abstract void m(@androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @NonNull c0 c0Var, @NonNull a aVar);

        protected abstract void n();

        protected abstract void o();

        protected abstract void p(@NonNull View view, @NonNull c0 c0Var, @NonNull a aVar);

        public void q(int i10) {
            this.f73951a = i10;
        }

        void r(RecyclerView recyclerView, p pVar) {
            recyclerView.M3.f();
            this.f73952b = recyclerView;
            this.f73953c = pVar;
            int i10 = this.f73951a;
            if (i10 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.P3.f73970a = i10;
            this.f73955e = true;
            this.f73954d = true;
            this.f73956f = b(f());
            n();
            this.f73952b.M3.d();
            this.f73958h = true;
        }

        protected final void s() {
            if (this.f73955e) {
                this.f73955e = false;
                o();
                this.f73952b.P3.f73970a = -1;
                this.f73956f = null;
                this.f73951a = -1;
                this.f73954d = false;
                this.f73953c.A1(this);
                this.f73953c = null;
                this.f73952b = null;
            }
        }
    }

    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public static class c0 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        static final int f73967r = 1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        static final int f73968s = 2;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        static final int f73969t = 4;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f73971b;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f73982m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        long f73983n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f73984o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f73985p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f73986q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f73970a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f73972c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f73973d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73974e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f73975f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f73976g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f73977h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f73978i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f73979j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f73980k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f73981l = false;

        void a(int i10) {
            if ((this.f73974e & i10) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.f73974e));
        }

        public boolean b() {
            return this.f73976g;
        }

        public <T> T c(int i10) {
            SparseArray<Object> sparseArray = this.f73971b;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i10);
        }

        public int d() {
            return this.f73977h ? this.f73972c - this.f73973d : this.f73975f;
        }

        public int e() {
            return this.f73985p;
        }

        public int f() {
            return this.f73986q;
        }

        public int g() {
            return this.f73970a;
        }

        public boolean h() {
            return this.f73970a != -1;
        }

        public boolean i() {
            return this.f73979j;
        }

        public boolean j() {
            return this.f73977h;
        }

        void k(h hVar) {
            this.f73974e = 1;
            this.f73975f = hVar.getItemCount();
            this.f73977h = false;
            this.f73978i = false;
            this.f73979j = false;
        }

        public void l(int i10, Object obj) {
            if (this.f73971b == null) {
                this.f73971b = new SparseArray<>();
            }
            this.f73971b.put(i10, obj);
        }

        public void m(int i10) {
            SparseArray<Object> sparseArray = this.f73971b;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i10);
        }

        public boolean n() {
            return this.f73981l;
        }

        public boolean o() {
            return this.f73980k;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f73970a + ", mData=" + this.f73971b + ", mItemCount=" + this.f73975f + ", mIsMeasuring=" + this.f73979j + ", mPreviousLayoutItemCount=" + this.f73972c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f73973d + ", mStructureChanged=" + this.f73976g + ", mInPreLayout=" + this.f73977h + ", mRunSimpleAnimations=" + this.f73980k + ", mRunPredictiveAnimations=" + this.f73981l + AbstractJsonLexerKt.END_OBJ;
        }
    }

    class d implements l0.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.l0.b
        public void a(g0 g0Var, m.d dVar, m.d dVar2) {
            RecyclerView.this.t(g0Var, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.l0.b
        public void b(g0 g0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f73926n.J1(g0Var.itemView, recyclerView.f73901c);
        }

        @Override // androidx.recyclerview.widget.l0.b
        public void c(g0 g0Var, @NonNull m.d dVar, @p0 m.d dVar2) {
            RecyclerView.this.f73901c.P(g0Var);
            RecyclerView.this.v(g0Var, dVar, dVar2);
        }

        @Override // androidx.recyclerview.widget.l0.b
        public void d(g0 g0Var, @NonNull m.d dVar, @NonNull m.d dVar2) {
            g0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f73929o3) {
                if (recyclerView.f73945x3.b(g0Var, g0Var, dVar, dVar2)) {
                    RecyclerView.this.m1();
                }
            } else if (recyclerView.f73945x3.d(g0Var, dVar, dVar2)) {
                RecyclerView.this.m1();
            }
        }
    }

    static class d0 extends l {
        d0() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        @NonNull
        protected EdgeEffect a(@NonNull RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    class e implements androidx.recyclerview.widget.g.b {
        e() {
        }

        @Override // androidx.recyclerview.widget.g.b
        public View a(int i10) {
            return RecyclerView.this.getChildAt(i10);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void b(View view) {
            g0 g0VarX0 = RecyclerView.x0(view);
            if (g0VarX0 != null) {
                g0VarX0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.g.b
        public int c() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.g.b
        public g0 d(View view) {
            return RecyclerView.x0(view);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void e(View view, int i10) {
            RecyclerView.this.addView(view, i10);
            RecyclerView.this.M(view);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void f() {
            int iC = c();
            for (int i10 = 0; i10 < iC; i10++) {
                View viewA = a(i10);
                RecyclerView.this.N(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.g.b
        public void g(View view, int i10, ViewGroup.LayoutParams layoutParams) {
            g0 g0VarX0 = RecyclerView.x0(view);
            if (g0VarX0 != null) {
                if (!g0VarX0.isTmpDetached() && !g0VarX0.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + g0VarX0 + RecyclerView.this.b0());
                }
                g0VarX0.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i10, layoutParams);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void h(int i10) {
            g0 g0VarX0;
            View viewA = a(i10);
            if (viewA != null && (g0VarX0 = RecyclerView.x0(viewA)) != null) {
                if (g0VarX0.isTmpDetached() && !g0VarX0.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + g0VarX0 + RecyclerView.this.b0());
                }
                g0VarX0.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i10);
        }

        @Override // androidx.recyclerview.widget.g.b
        public int i(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.g.b
        public void j(View view) {
            g0 g0VarX0 = RecyclerView.x0(view);
            if (g0VarX0 != null) {
                g0VarX0.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.g.b
        public void k(int i10) {
            View childAt = RecyclerView.this.getChildAt(i10);
            if (childAt != null) {
                RecyclerView.this.N(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i10);
        }
    }

    public static abstract class e0 {
        @p0
        public abstract View a(@NonNull x xVar, int i10, int i11);
    }

    class f implements androidx.recyclerview.widget.a.InterfaceC0727a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0727a
        public void a(int i10, int i11) {
            RecyclerView.this.c1(i10, i11);
            RecyclerView.this.S3 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0727a
        public void b(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0727a
        public void c(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0727a
        public g0 d(int i10) {
            g0 g0VarO0 = RecyclerView.this.o0(i10, true);
            if (g0VarO0 == null || RecyclerView.this.f73907f.n(g0VarO0.itemView)) {
                return null;
            }
            return g0VarO0;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0727a
        public void e(int i10, int i11) {
            RecyclerView.this.b1(i10, i11);
            RecyclerView.this.S3 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0727a
        public void f(int i10, int i11) {
            RecyclerView.this.d1(i10, i11, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.S3 = true;
            recyclerView.P3.f73973d += i11;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0727a
        public void g(int i10, int i11) {
            RecyclerView.this.d1(i10, i11, false);
            RecyclerView.this.S3 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0727a
        public void h(int i10, int i11, Object obj) {
            RecyclerView.this.c2(i10, i11, obj);
            RecyclerView.this.T3 = true;
        }

        void i(androidx.recyclerview.widget.a.b bVar) {
            int i10 = bVar.f74130a;
            if (i10 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f73926n.m1(recyclerView, bVar.f74131b, bVar.f74133d);
                return;
            }
            if (i10 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f73926n.p1(recyclerView2, bVar.f74131b, bVar.f74133d);
            } else if (i10 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f73926n.r1(recyclerView3, bVar.f74131b, bVar.f74133d, bVar.f74132c);
            } else {
                if (i10 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f73926n.o1(recyclerView4, bVar.f74131b, bVar.f74133d, 1);
            }
        }
    }

    class f0 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f73990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f73991b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        OverScroller f73992c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Interpolator f73993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f73994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f73995f;

        f0() {
            Interpolator interpolator = RecyclerView.W4;
            this.f73993d = interpolator;
            int i10 = 6 << 0;
            this.f73994e = false;
            this.f73995f = false;
            this.f73992c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i10, int i11) {
            int iAbs = Math.abs(i10);
            int iAbs2 = Math.abs(i11);
            boolean z10 = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z10) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            u1.u1(RecyclerView.this, this);
        }

        public void b(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f73991b = 0;
            this.f73990a = 0;
            Interpolator interpolator = this.f73993d;
            Interpolator interpolator2 = RecyclerView.W4;
            if (interpolator != interpolator2) {
                this.f73993d = interpolator2;
                this.f73992c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f73992c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f73994e) {
                this.f73995f = true;
            } else {
                c();
            }
        }

        public void e(int i10, int i11, int i12, @p0 Interpolator interpolator) {
            if (i12 == Integer.MIN_VALUE) {
                i12 = a(i10, i11);
            }
            int i13 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.W4;
            }
            if (this.f73993d != interpolator) {
                this.f73993d = interpolator;
                this.f73992c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f73991b = 0;
            this.f73990a = 0;
            RecyclerView.this.setScrollState(2);
            this.f73992c.startScroll(0, 0, i10, i11, i13);
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f73992c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10;
            int i11;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f73926n == null) {
                f();
                return;
            }
            this.f73995f = false;
            this.f73994e = true;
            recyclerView.I();
            OverScroller overScroller = this.f73992c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f73990a;
                int i14 = currY - this.f73991b;
                this.f73990a = currX;
                this.f73991b = currY;
                int iF = RecyclerView.this.F(i13);
                int iH = RecyclerView.this.H(i14);
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f73902c4;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.b(iF, iH, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f73902c4;
                    iF -= iArr2[0];
                    iH -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.E(iF, iH);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f73924m != null) {
                    int[] iArr3 = recyclerView3.f73902c4;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.L1(iF, iH, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f73902c4;
                    int i15 = iArr4[0];
                    int i16 = iArr4[1];
                    iF -= i15;
                    iH -= i16;
                    b0 b0Var = recyclerView4.f73926n.f74029g;
                    if (b0Var != null && !b0Var.h() && b0Var.i()) {
                        int iD = RecyclerView.this.P3.d();
                        if (iD == 0) {
                            b0Var.s();
                        } else if (b0Var.f() >= iD) {
                            b0Var.q(iD - 1);
                            b0Var.k(i15, i16);
                        } else {
                            b0Var.k(i15, i16);
                        }
                    }
                    i11 = i16;
                    i10 = i15;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int i17 = iF;
                int i18 = iH;
                if (!RecyclerView.this.f73938t.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f73902c4;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.d(i10, i11, i17, i18, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f73902c4;
                int i19 = i17 - iArr6[0];
                int i20 = i18 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.U(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i19 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i20 != 0));
                b0 b0Var2 = RecyclerView.this.f73926n.f74029g;
                if ((b0Var2 == null || !b0Var2.h()) && z10) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i19 < 0) {
                            i12 = -currVelocity;
                        } else {
                            i12 = i19 > 0 ? currVelocity : 0;
                        }
                        if (i20 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i20 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.h(i12, currVelocity);
                    }
                    if (RecyclerView.f73890t4) {
                        RecyclerView.this.O3.b();
                    }
                } else {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.n nVar = recyclerView7.N3;
                    if (nVar != null) {
                        nVar.f(recyclerView7, i10, i11);
                    }
                }
            }
            b0 b0Var3 = RecyclerView.this.f73926n.f74029g;
            if (b0Var3 != null && b0Var3.h()) {
                b0Var3.k(0, 0);
            }
            this.f73994e = false;
            if (this.f73995f) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.c(1);
            }
        }
    }

    static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f73997a;

        static {
            int[] iArr = new int[h.a.values().length];
            f73997a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f73997a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class g0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @NonNull
        public final View itemView;
        h<? extends g0> mBindingAdapter;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        g0 mShadowedHolder = null;
        g0 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        x mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @l1
        int mPendingAccessibilityState = -1;

        public g0(@NonNull View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        private void f() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                f();
                this.mPayloads.add(obj);
            }
        }

        void addFlags(int i10) {
            this.mFlags = i10 | this.mFlags;
        }

        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && u1.P0(this.itemView);
        }

        void flagRemovedAndOffsetPosition(int i10, int i11, boolean z10) {
            addFlags(8);
            offsetPosition(i11, z10);
            this.mPosition = i10;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.q0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        @p0
        public final h<? extends g0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            h adapter;
            int iQ0;
            if (this.mBindingAdapter != null && (recyclerView = this.mOwnerRecyclerView) != null && (adapter = recyclerView.getAdapter()) != null && (iQ0 = this.mOwnerRecyclerView.q0(this)) != -1) {
                return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, iQ0);
            }
            return -1;
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i10 = this.mPreLayoutPosition;
            return i10 == -1 ? this.mPosition : i10;
        }

        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        boolean hasAnyOfTheFlags(int i10) {
            return (this.mFlags & i10) != 0;
        }

        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !u1.P0(this.itemView);
        }

        boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        boolean isScrap() {
            return this.mScrapContainer != null;
        }

        boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        void offsetPosition(int i10, boolean z10) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z10) {
                this.mPreLayoutPosition += i10;
            }
            this.mPosition += i10;
            if (this.itemView.getLayoutParams() != null) {
                ((q) this.itemView.getLayoutParams()).f74049c = true;
            }
        }

        void onEnteredHiddenState(RecyclerView recyclerView) {
            int i10 = this.mPendingAccessibilityState;
            if (i10 != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i10;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = u1.X(this.itemView);
            }
            recyclerView.O1(this, 4);
        }

        void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.O1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.A(this);
        }

        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        void setFlags(int i10, int i11) {
            this.mFlags = (i10 & i11) | (this.mFlags & (~i11));
        }

        public final void setIsRecyclable(boolean z10) {
            int i10 = this.mIsRecyclableCount;
            int i11 = z10 ? i10 - 1 : i10 + 1;
            this.mIsRecyclableCount = i11;
            if (i11 < 0) {
                this.mIsRecyclableCount = 0;
                toString();
            } else {
                if (!z10 && i11 == 1) {
                    this.mFlags |= 16;
                    return;
                }
                if (z10 && i11 == 0) {
                    this.mFlags &= -17;
                }
            }
        }

        void setScrapContainer(x xVar, boolean z10) {
            this.mScrapContainer = xVar;
            this.mInChangeScrap = z10;
        }

        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb2.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        void unScrap() {
            this.mScrapContainer.P(this);
        }

        boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public static abstract class h<VH extends g0> {
        private final i mObservable = new i();
        private boolean mHasStableIds = false;
        private a mStateRestorationPolicy = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void bindViewHolder(@NonNull VH vh2, int i10) {
            boolean z10 = vh2.mBindingAdapter == null;
            if (z10) {
                vh2.mPosition = i10;
                if (hasStableIds()) {
                    vh2.mItemId = getItemId(i10);
                }
                vh2.setFlags(1, 519);
                q0.b(RecyclerView.M4);
            }
            vh2.mBindingAdapter = this;
            onBindViewHolder(vh2, i10, vh2.getUnmodifiedPayloads());
            if (z10) {
                vh2.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh2.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f74049c = true;
                }
                q0.d();
            }
        }

        boolean canRestoreState() {
            int i10 = g.f73997a[this.mStateRestorationPolicy.ordinal()];
            return i10 != 1 && (i10 != 2 || getItemCount() > 0);
        }

        @NonNull
        public final VH createViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            try {
                q0.b(RecyclerView.P4);
                VH vh2 = (VH) onCreateViewHolder(viewGroup, i10);
                if (vh2.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh2.mItemViewType = i10;
                q0.d();
                return vh2;
            } catch (Throwable th2) {
                q0.d();
                throw th2;
            }
        }

        public int findRelativeAdapterPositionIn(@NonNull h<? extends g0> hVar, @NonNull g0 g0Var, int i10) {
            if (hVar == this) {
                return i10;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i10) {
            return -1L;
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        @NonNull
        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i10) {
            this.mObservable.d(i10, 1);
        }

        public final void notifyItemInserted(int i10) {
            this.mObservable.f(i10, 1);
        }

        public final void notifyItemMoved(int i10, int i11) {
            this.mObservable.c(i10, i11);
        }

        public final void notifyItemRangeChanged(int i10, int i11) {
            this.mObservable.d(i10, i11);
        }

        public final void notifyItemRangeInserted(int i10, int i11) {
            this.mObservable.f(i10, i11);
        }

        public final void notifyItemRangeRemoved(int i10, int i11) {
            this.mObservable.g(i10, i11);
        }

        public final void notifyItemRemoved(int i10) {
            this.mObservable.g(i10, 1);
        }

        public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@NonNull VH vh2, int i10);

        public void onBindViewHolder(@NonNull VH vh2, int i10, @NonNull List<Object> list) {
            onBindViewHolder(vh2, i10);
        }

        @NonNull
        public abstract VH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10);

        public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@NonNull VH vh2) {
            return false;
        }

        public void onViewAttachedToWindow(@NonNull VH vh2) {
        }

        public void onViewDetachedFromWindow(@NonNull VH vh2) {
        }

        public void onViewRecycled(@NonNull VH vh2) {
        }

        public void registerAdapterDataObserver(@NonNull j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z10) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z10;
        }

        public void setStateRestorationPolicy(@NonNull a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.h();
        }

        public void unregisterAdapterDataObserver(@NonNull j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i10, @p0 Object obj) {
            this.mObservable.e(i10, 1, obj);
        }

        public final void notifyItemRangeChanged(int i10, int i11, @p0 Object obj) {
            this.mObservable.e(i10, i11, obj);
        }
    }

    static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).e(i10, i11, 1);
            }
        }

        public void d(int i10, int i11) {
            e(i10, i11, null);
        }

        public void e(int i10, int i11, @p0 Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i10, i11, obj);
            }
        }

        public void f(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }

        public void g(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).f(i10, i11);
            }
        }

        public void h() {
            int size = ((Observable) this).mObservers.size();
            while (true) {
                size--;
                if (size < 0) {
                    return;
                } else {
                    ((j) ((Observable) this).mObservers.get(size)).g();
                }
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int i10, int i11) {
        }

        public void c(int i10, int i11, @p0 Object obj) {
            b(i10, i11);
        }

        public void d(int i10, int i11) {
        }

        public void e(int i10, int i11, int i12) {
        }

        public void f(int i10, int i11) {
        }

        public void g() {
        }
    }

    public interface k {
        int a(int i10, int i11);
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f74002a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f74003b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f74004c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f74005d = 3;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @NonNull
        protected EdgeEffect a(@NonNull RecyclerView recyclerView, int i10) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class m {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f74006g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f74007h = 8;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f74008i = 4;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f74009j = 2048;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f74010k = 4096;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f74011a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList<b> f74012b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f74013c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f74014d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f74015e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f74016f = 250;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        public interface b {
            void a();
        }

        interface c {
            void a(@NonNull g0 g0Var);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f74017a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f74018b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f74019c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f74020d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f74021e;

            @NonNull
            public d a(@NonNull g0 g0Var) {
                return b(g0Var, 0);
            }

            @NonNull
            public d b(@NonNull g0 g0Var, int i10) {
                View view = g0Var.itemView;
                this.f74017a = view.getLeft();
                this.f74018b = view.getTop();
                this.f74019c = view.getRight();
                this.f74020d = view.getBottom();
                return this;
            }
        }

        static int e(g0 g0Var) {
            int i10 = g0Var.mFlags;
            int i11 = i10 & 14;
            if (g0Var.isInvalid()) {
                return 4;
            }
            if ((i10 & 4) == 0) {
                int oldPosition = g0Var.getOldPosition();
                int absoluteAdapterPosition = g0Var.getAbsoluteAdapterPosition();
                if (oldPosition != -1 && absoluteAdapterPosition != -1 && oldPosition != absoluteAdapterPosition) {
                    return i11 | 2048;
                }
            }
            return i11;
        }

        void A(c cVar) {
            this.f74011a = cVar;
        }

        public void B(long j10) {
            this.f74015e = j10;
        }

        public void C(long j10) {
            this.f74014d = j10;
        }

        public abstract boolean a(@NonNull g0 g0Var, @p0 d dVar, @NonNull d dVar2);

        public abstract boolean b(@NonNull g0 g0Var, @NonNull g0 g0Var2, @NonNull d dVar, @NonNull d dVar2);

        public abstract boolean c(@NonNull g0 g0Var, @NonNull d dVar, @p0 d dVar2);

        public abstract boolean d(@NonNull g0 g0Var, @NonNull d dVar, @NonNull d dVar2);

        public boolean f(@NonNull g0 g0Var) {
            return true;
        }

        public boolean g(@NonNull g0 g0Var, @NonNull List<Object> list) {
            return f(g0Var);
        }

        public final void h(@NonNull g0 g0Var) {
            t(g0Var);
            c cVar = this.f74011a;
            if (cVar != null) {
                cVar.a(g0Var);
            }
        }

        public final void i(@NonNull g0 g0Var) {
            u(g0Var);
        }

        public final void j() {
            int size = this.f74012b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f74012b.get(i10).a();
            }
            this.f74012b.clear();
        }

        public abstract void k(@NonNull g0 g0Var);

        public abstract void l();

        public long m() {
            return this.f74013c;
        }

        public long n() {
            return this.f74016f;
        }

        public long o() {
            return this.f74015e;
        }

        public long p() {
            return this.f74014d;
        }

        public abstract boolean q();

        public final boolean r(@p0 b bVar) {
            boolean zQ = q();
            if (bVar != null) {
                if (!zQ) {
                    bVar.a();
                    return zQ;
                }
                this.f74012b.add(bVar);
            }
            return zQ;
        }

        @NonNull
        public d s() {
            return new d();
        }

        public void t(@NonNull g0 g0Var) {
        }

        public void u(@NonNull g0 g0Var) {
        }

        @NonNull
        public d v(@NonNull c0 c0Var, @NonNull g0 g0Var) {
            return s().a(g0Var);
        }

        @NonNull
        public d w(@NonNull c0 c0Var, @NonNull g0 g0Var, int i10, @NonNull List<Object> list) {
            return s().a(g0Var);
        }

        public abstract void x();

        public void y(long j10) {
            this.f74013c = j10;
        }

        public void z(long j10) {
            this.f74016f = j10;
        }
    }

    private class n implements m.c {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.c
        public void a(g0 g0Var) {
            g0Var.setIsRecyclable(true);
            if (g0Var.mShadowedHolder != null && g0Var.mShadowingHolder == null) {
                g0Var.mShadowedHolder = null;
            }
            g0Var.mShadowingHolder = null;
            if (!g0Var.shouldBeKeptAsChild() && !RecyclerView.this.x1(g0Var.itemView) && g0Var.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(g0Var.itemView, false);
            }
        }
    }

    public static abstract class o {
        @Deprecated
        public void getItemOffsets(@NonNull Rect rect, int i10, @NonNull RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView) {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull c0 c0Var) {
            getItemOffsets(rect, ((q) view.getLayoutParams()).d(), recyclerView);
        }

        public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull c0 c0Var) {
            onDraw(canvas, recyclerView);
        }

        public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull c0 c0Var) {
            onDrawOver(canvas, recyclerView);
        }
    }

    public static abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.g f74023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView f74024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final k0.b f74025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final k0.b f74026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        k0 f74027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        k0 f74028f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        b0 f74029g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f74030h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f74031i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f74032j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f74033k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f74034l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f74035m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f74036n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f74037o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f74038p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f74039q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f74040r;

        class a implements k0.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.k0.b
            public View a(int i10) {
                return p.this.U(i10);
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int b() {
                return p.this.s0();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int c() {
                return p.this.D0() - p.this.t0();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int d(View view) {
                return p.this.d0(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int e(View view) {
                return p.this.g0(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }
        }

        class b implements k0.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.k0.b
            public View a(int i10) {
                return p.this.U(i10);
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int b() {
                return p.this.v0();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int c() {
                return p.this.j0() - p.this.q0();
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int d(View view) {
                return p.this.h0(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.k0.b
            public int e(View view) {
                return p.this.b0(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }
        }

        public interface c {
            void a(int i10, int i11);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f74043a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f74044b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f74045c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f74046d;
        }

        public p() {
            a aVar = new a();
            this.f74025c = aVar;
            b bVar = new b();
            this.f74026d = bVar;
            this.f74027e = new k0(aVar);
            this.f74028f = new k0(bVar);
            this.f74030h = false;
            this.f74031i = false;
            this.f74032j = false;
            this.f74033k = true;
            this.f74034l = true;
        }

        private void J(int i10, @NonNull View view) {
            this.f74023a.d(i10);
        }

        private boolean L0(RecyclerView recyclerView, int i10, int i11) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iS0 = s0();
            int iV0 = v0();
            int iD0 = D0() - t0();
            int iJ0 = j0() - q0();
            Rect rect = this.f74024b.f73918j;
            c0(focusedChild, rect);
            if (rect.left - i10 < iD0 && rect.right - i10 > iS0 && rect.top - i11 < iJ0 && rect.bottom - i11 > iV0) {
                return true;
            }
            return false;
        }

        private static boolean P0(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i10;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i10;
            }
            return true;
        }

        private void T1(x xVar, int i10, View view) {
            g0 g0VarX0 = RecyclerView.x0(view);
            if (g0VarX0.shouldIgnore()) {
                return;
            }
            if (g0VarX0.isInvalid() && !g0VarX0.isRemoved() && !this.f74024b.f73924m.hasStableIds()) {
                O1(i10);
                xVar.I(g0VarX0);
            } else {
                I(i10);
                xVar.J(view);
                this.f74024b.f73909g.k(g0VarX0);
            }
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0020  */
        /* JADX WARN: Code duplicated, block: B:17:0x002c  */
        /* JADX WARN: Code duplicated, block: B:6:0x0016  */
        public static int W(int i10, int i11, int i12, int i13, boolean z10) {
            int iMax = Math.max(0, i10 - i12);
            if (z10) {
                if (i13 >= 0) {
                    i11 = 1073741824;
                } else if (i13 != -1 || (i11 != Integer.MIN_VALUE && (i11 == 0 || i11 != 1073741824))) {
                    i11 = 0;
                    i13 = 0;
                } else {
                    i13 = iMax;
                }
            } else if (i13 >= 0) {
                i11 = 1073741824;
            } else if (i13 == -1) {
                i13 = iMax;
            } else if (i13 != -2) {
                i11 = 0;
                i13 = 0;
            } else if (i11 == Integer.MIN_VALUE || i11 == 1073741824) {
                i13 = iMax;
                i11 = Integer.MIN_VALUE;
            } else {
                i13 = iMax;
                i11 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i13, i11);
        }

        /* JADX WARN: Code duplicated, block: B:5:0x000f A[PHI: r4
          0x000f: PHI (r4v5 int) = (r4v0 int), (r4v2 int), (r4v0 int) binds: [B:8:0x0014, B:12:0x001b, B:4:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:6:0x0011  */
        @Deprecated
        public static int X(int i10, int i11, int i12, boolean z10) {
            int i13 = i10 - i11;
            int i14 = 0;
            int iMax = Math.max(0, i13);
            if (z10) {
                if (i12 >= 0) {
                    i14 = 1073741824;
                } else {
                    i12 = 0;
                }
            } else if (i12 >= 0) {
                i14 = 1073741824;
            } else if (i12 == -1) {
                i12 = iMax;
                i14 = 1073741824;
            } else if (i12 == -2) {
                i14 = Integer.MIN_VALUE;
                i12 = iMax;
            } else {
                i12 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i12, i14);
        }

        private int[] Y(View view, Rect rect) {
            int iS0 = s0();
            int iV0 = v0();
            int iD0 = D0() - t0();
            int iJ0 = j0() - q0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i10 = left - iS0;
            int iMin = Math.min(0, i10);
            int i11 = top - iV0;
            int iMin2 = Math.min(0, i11);
            int i12 = iWidth - iD0;
            int iMax = Math.max(0, i12);
            int iMax2 = Math.max(0, iHeight - iJ0);
            if (m0() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i10, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i12);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i11, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        private void l(View view, int i10, boolean z10) {
            g0 g0VarX0 = RecyclerView.x0(view);
            if (z10 || g0VarX0.isRemoved()) {
                this.f74024b.f73909g.b(g0VarX0);
            } else {
                this.f74024b.f73909g.p(g0VarX0);
            }
            q qVar = (q) view.getLayoutParams();
            if (g0VarX0.wasReturnedFromScrap() || g0VarX0.isScrap()) {
                if (g0VarX0.isScrap()) {
                    g0VarX0.unScrap();
                } else {
                    g0VarX0.clearReturnedFromScrapFlag();
                }
                this.f74023a.c(view, i10, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f74024b) {
                int iM = this.f74023a.m(view);
                if (i10 == -1) {
                    i10 = this.f74023a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f74024b.indexOfChild(view) + this.f74024b.b0());
                }
                if (iM != i10) {
                    this.f74024b.f73926n.W0(iM, i10);
                }
            } else {
                this.f74023a.a(view, i10, false);
                qVar.f74049c = true;
                b0 b0Var = this.f74029g;
                if (b0Var != null && b0Var.i()) {
                    this.f74029g.l(view);
                }
            }
            if (qVar.f74050d) {
                g0VarX0.itemView.invalidate();
                qVar.f74050d = false;
            }
        }

        public static int v(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i11, i12) : size;
            }
            return Math.min(size, Math.max(i11, i12));
        }

        public static d x0(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3.a.d.f340757a, i10, i11);
            dVar.f74043a = typedArrayObtainStyledAttributes.getInt(p3.a.d.f340758b, 1);
            dVar.f74044b = typedArrayObtainStyledAttributes.getInt(p3.a.d.f340768l, 1);
            dVar.f74045c = typedArrayObtainStyledAttributes.getBoolean(p3.a.d.f340767k, false);
            dVar.f74046d = typedArrayObtainStyledAttributes.getBoolean(p3.a.d.f340769m, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public int A(@NonNull c0 c0Var) {
            return 0;
        }

        public int A0(@NonNull x xVar, @NonNull c0 c0Var) {
            return 0;
        }

        void A1(b0 b0Var) {
            if (this.f74029g == b0Var) {
                this.f74029g = null;
            }
        }

        public int B(@NonNull c0 c0Var) {
            return 0;
        }

        public int B0(@NonNull View view) {
            return ((q) view.getLayoutParams()).f74048b.top;
        }

        boolean B1(int i10, @p0 Bundle bundle) {
            RecyclerView recyclerView = this.f74024b;
            return C1(recyclerView.f73901c, recyclerView.P3, i10, bundle);
        }

        public int C(@NonNull c0 c0Var) {
            return 0;
        }

        public void C0(@NonNull View view, boolean z10, @NonNull Rect rect) {
            Matrix matrix;
            if (z10) {
                Rect rect2 = ((q) view.getLayoutParams()).f74048b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                boolean z11 = true & false;
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f74024b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f74024b.f73922l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* JADX WARN: Code duplicated, block: B:24:0x007e A[PHI: r10
          0x007e: PHI (r10v8 int) = (r10v5 int), (r10v11 int) binds: [B:30:0x00a3, B:21:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean C1(@NonNull x xVar, @NonNull c0 c0Var, int i10, @p0 Bundle bundle) {
            int iV0;
            int iS0;
            int i11;
            int i12;
            if (this.f74024b == null) {
                return false;
            }
            int iJ0 = j0();
            int iD0 = D0();
            Rect rect = new Rect();
            if (this.f74024b.getMatrix().isIdentity() && this.f74024b.getGlobalVisibleRect(rect)) {
                iJ0 = rect.height();
                iD0 = rect.width();
            }
            if (i10 == 4096) {
                iV0 = this.f74024b.canScrollVertically(1) ? (iJ0 - v0()) - q0() : 0;
                if (this.f74024b.canScrollHorizontally(1)) {
                    iS0 = (iD0 - s0()) - t0();
                    i11 = iV0;
                    i12 = iS0;
                } else {
                    i11 = iV0;
                    i12 = 0;
                }
            } else if (i10 != 8192) {
                i12 = 0;
                i11 = 0;
            } else {
                iV0 = this.f74024b.canScrollVertically(-1) ? -((iJ0 - v0()) - q0()) : 0;
                if (this.f74024b.canScrollHorizontally(-1)) {
                    iS0 = -((iD0 - s0()) - t0());
                    i11 = iV0;
                    i12 = iS0;
                } else {
                    i11 = iV0;
                    i12 = 0;
                }
            }
            if (i11 == 0 && i12 == 0) {
                return false;
            }
            this.f74024b.U1(i12, i11, null, Integer.MIN_VALUE, true);
            return true;
        }

        public int D(@NonNull c0 c0Var) {
            return 0;
        }

        @androidx.annotation.t0
        public int D0() {
            return this.f74039q;
        }

        boolean D1(@NonNull View view, int i10, @p0 Bundle bundle) {
            RecyclerView recyclerView = this.f74024b;
            return E1(recyclerView.f73901c, recyclerView.P3, view, i10, bundle);
        }

        public void E(@NonNull x xVar) {
            for (int iV = V() - 1; iV >= 0; iV--) {
                T1(xVar, iV, U(iV));
            }
        }

        public int E0() {
            return this.f74037o;
        }

        public boolean E1(@NonNull x xVar, @NonNull c0 c0Var, @NonNull View view, int i10, @p0 Bundle bundle) {
            return false;
        }

        public void F(@NonNull View view, @NonNull x xVar) {
            T1(xVar, this.f74023a.m(view), view);
        }

        boolean F0() {
            int iV = V();
            for (int i10 = 0; i10 < iV; i10++) {
                ViewGroup.LayoutParams layoutParams = U(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    int i11 = 4 ^ 1;
                    return true;
                }
            }
            return false;
        }

        public void F1(Runnable runnable) {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null) {
                u1.u1(recyclerView, runnable);
            }
        }

        public void G(int i10, @NonNull x xVar) {
            T1(xVar, i10, U(i10));
        }

        public boolean G0() {
            RecyclerView recyclerView = this.f74024b;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void G1() {
            for (int iV = V() - 1; iV >= 0; iV--) {
                this.f74023a.q(iV);
            }
        }

        public void H(@NonNull View view) {
            int iM = this.f74023a.m(view);
            if (iM >= 0) {
                J(iM, view);
            }
        }

        public void H0(@NonNull View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.f74024b;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.f74024b.b0());
            }
            g0 g0VarX0 = RecyclerView.x0(view);
            g0VarX0.addFlags(128);
            this.f74024b.f73909g.q(g0VarX0);
        }

        public void H1(@NonNull x xVar) {
            for (int iV = V() - 1; iV >= 0; iV--) {
                if (!RecyclerView.x0(U(iV)).shouldIgnore()) {
                    K1(iV, xVar);
                }
            }
        }

        public void I(int i10) {
            J(i10, U(i10));
        }

        public boolean I0() {
            return this.f74031i;
        }

        void I1(x xVar) {
            int iK = xVar.k();
            for (int i10 = iK - 1; i10 >= 0; i10--) {
                View viewO = xVar.o(i10);
                g0 g0VarX0 = RecyclerView.x0(viewO);
                if (!g0VarX0.shouldIgnore()) {
                    g0VarX0.setIsRecyclable(false);
                    if (g0VarX0.isTmpDetached()) {
                        this.f74024b.removeDetachedView(viewO, false);
                    }
                    m mVar = this.f74024b.f73945x3;
                    if (mVar != null) {
                        mVar.k(g0VarX0);
                    }
                    g0VarX0.setIsRecyclable(true);
                    xVar.E(viewO);
                }
            }
            xVar.f();
            if (iK > 0) {
                this.f74024b.invalidate();
            }
        }

        public boolean J0() {
            return this.f74032j;
        }

        public void J1(@NonNull View view, @NonNull x xVar) {
            N1(view);
            xVar.H(view);
        }

        void K(RecyclerView recyclerView) {
            this.f74031i = true;
            b1(recyclerView);
        }

        public boolean K0() {
            RecyclerView recyclerView = this.f74024b;
            return recyclerView != null && recyclerView.isFocused();
        }

        public void K1(int i10, @NonNull x xVar) {
            View viewU = U(i10);
            O1(i10);
            xVar.H(viewU);
        }

        void L(RecyclerView recyclerView, x xVar) {
            this.f74031i = false;
            d1(recyclerView, xVar);
        }

        public boolean L1(Runnable runnable) {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        @e.a({"UnknownNullness"})
        public void M(View view) {
            m mVar = this.f74024b.f73945x3;
            if (mVar != null) {
                mVar.k(RecyclerView.x0(view));
            }
        }

        public final boolean M0() {
            return this.f74034l;
        }

        public void M1(@NonNull View view) {
            this.f74024b.removeDetachedView(view, false);
        }

        @p0
        public View N(@NonNull View view) {
            View viewE0;
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView == null || (viewE0 = recyclerView.e0(view)) == null || this.f74023a.n(viewE0)) {
                return null;
            }
            return viewE0;
        }

        public boolean N0(@NonNull x xVar, @NonNull c0 c0Var) {
            return false;
        }

        @e.a({"UnknownNullness"})
        public void N1(View view) {
            this.f74023a.p(view);
        }

        @p0
        public View O(int i10) {
            int iV = V();
            for (int i11 = 0; i11 < iV; i11++) {
                View viewU = U(i11);
                g0 g0VarX0 = RecyclerView.x0(viewU);
                if (g0VarX0 != null && g0VarX0.getLayoutPosition() == i10 && !g0VarX0.shouldIgnore() && (this.f74024b.P3.j() || !g0VarX0.isRemoved())) {
                    return viewU;
                }
            }
            return null;
        }

        public boolean O0() {
            return this.f74033k;
        }

        public void O1(int i10) {
            if (U(i10) != null) {
                this.f74023a.q(i10);
            }
        }

        @e.a({"UnknownNullness"})
        public abstract q P();

        public boolean P1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10) {
            return Q1(recyclerView, view, rect, z10, false);
        }

        @e.a({"UnknownNullness"})
        public q Q(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public boolean Q0() {
            b0 b0Var = this.f74029g;
            return b0Var != null && b0Var.i();
        }

        public boolean Q1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
            int[] iArrY = Y(view, rect);
            int i10 = iArrY[0];
            int i11 = iArrY[1];
            if ((z11 && !L0(recyclerView, i10, i11)) || (i10 == 0 && i11 == 0)) {
                return false;
            }
            if (z10) {
                recyclerView.scrollBy(i10, i11);
            } else {
                recyclerView.R1(i10, i11);
            }
            return true;
        }

        @e.a({"UnknownNullness"})
        public q R(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public boolean R0(@NonNull View view, boolean z10, boolean z11) {
            boolean z12 = this.f74027e.b(view, 24579) && this.f74028f.b(view, 24579);
            return z10 ? z12 : !z12;
        }

        public void R1() {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int S() {
            return -1;
        }

        public void S0(@NonNull View view, int i10, int i11, int i12, int i13) {
            Rect rect = ((q) view.getLayoutParams()).f74048b;
            view.layout(i10 + rect.left, i11 + rect.top, i12 - rect.right, i13 - rect.bottom);
        }

        public void S1() {
            this.f74030h = true;
        }

        public int T(@NonNull View view) {
            return ((q) view.getLayoutParams()).f74048b.bottom;
        }

        public void T0(@NonNull View view, int i10, int i11, int i12, int i13) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f74048b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        @p0
        public View U(int i10) {
            androidx.recyclerview.widget.g gVar = this.f74023a;
            if (gVar != null) {
                return gVar.f(i10);
            }
            return null;
        }

        public void U0(@NonNull View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect rectC0 = this.f74024b.C0(view);
            int i12 = i10 + rectC0.left + rectC0.right;
            int i13 = i11 + rectC0.top + rectC0.bottom;
            int iW = W(D0(), E0(), s0() + t0() + i12, ((ViewGroup.MarginLayoutParams) qVar).width, s());
            int iW2 = W(j0(), k0(), v0() + q0() + i13, ((ViewGroup.MarginLayoutParams) qVar).height, t());
            if (g2(view, iW, iW2, qVar)) {
                view.measure(iW, iW2);
            }
        }

        @e.a({"UnknownNullness"})
        public int U1(int i10, x xVar, c0 c0Var) {
            return 0;
        }

        public int V() {
            androidx.recyclerview.widget.g gVar = this.f74023a;
            if (gVar != null) {
                return gVar.g();
            }
            return 0;
        }

        public void V0(@NonNull View view, int i10, int i11) {
            q qVar = (q) view.getLayoutParams();
            Rect rectC0 = this.f74024b.C0(view);
            int i12 = i10 + rectC0.left + rectC0.right;
            int i13 = i11 + rectC0.top + rectC0.bottom;
            int iW = W(D0(), E0(), s0() + t0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i12, ((ViewGroup.MarginLayoutParams) qVar).width, s());
            int iW2 = W(j0(), k0(), v0() + q0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) qVar).height, t());
            if (g2(view, iW, iW2, qVar)) {
                view.measure(iW, iW2);
            }
        }

        public void V1(int i10) {
        }

        public void W0(int i10, int i11) {
            View viewU = U(i10);
            if (viewU != null) {
                I(i10);
                p(viewU, i11);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i10 + this.f74024b.toString());
            }
        }

        @e.a({"UnknownNullness"})
        public int W1(int i10, x xVar, c0 c0Var) {
            return 0;
        }

        public void X0(@androidx.annotation.t0 int i10) {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null) {
                recyclerView.Z0(i10);
            }
        }

        @Deprecated
        public void X1(boolean z10) {
            this.f74032j = z10;
        }

        public void Y0(@androidx.annotation.t0 int i10) {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null) {
                recyclerView.a1(i10);
            }
        }

        void Y1(RecyclerView recyclerView) {
            a2(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public boolean Z() {
            RecyclerView recyclerView = this.f74024b;
            return recyclerView != null && recyclerView.f73912h;
        }

        public void Z0(@p0 h hVar, @p0 h hVar2) {
        }

        public final void Z1(boolean z10) {
            if (z10 != this.f74034l) {
                this.f74034l = z10;
                this.f74035m = 0;
                RecyclerView recyclerView = this.f74024b;
                if (recyclerView != null) {
                    recyclerView.f73901c.Q();
                }
            }
        }

        public int a() {
            RecyclerView recyclerView = this.f74024b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int a0(@NonNull x xVar, @NonNull c0 c0Var) {
            return -1;
        }

        public boolean a1(@NonNull RecyclerView recyclerView, @NonNull ArrayList<View> arrayList, int i10, int i11) {
            return false;
        }

        void a2(int i10, int i11) {
            this.f74039q = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f74037o = mode;
            if (mode == 0 && !RecyclerView.f73888r4) {
                this.f74039q = 0;
            }
            this.f74040r = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f74038p = mode2;
            if (mode2 != 0 || RecyclerView.f73888r4) {
                return;
            }
            this.f74040r = 0;
        }

        public int b0(@NonNull View view) {
            return view.getBottom() + T(view);
        }

        @androidx.annotation.i
        public void b1(RecyclerView recyclerView) {
        }

        public void b2(int i10, int i11) {
            this.f74024b.setMeasuredDimension(i10, i11);
        }

        public void c0(@NonNull View view, @NonNull Rect rect) {
            RecyclerView.z0(view, rect);
        }

        @Deprecated
        public void c1(RecyclerView recyclerView) {
        }

        public void c2(Rect rect, int i10, int i11) {
            b2(v(i10, rect.width() + s0() + t0(), p0()), v(i11, rect.height() + v0() + q0(), o0()));
        }

        public int d0(@NonNull View view) {
            return view.getLeft() - n0(view);
        }

        @androidx.annotation.i
        @e.a({"UnknownNullness"})
        public void d1(RecyclerView recyclerView, x xVar) {
            c1(recyclerView);
        }

        void d2(int i10, int i11) {
            int iV = V();
            if (iV == 0) {
                this.f74024b.K(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < iV; i16++) {
                View viewU = U(i16);
                Rect rect = this.f74024b.f73918j;
                c0(viewU, rect);
                int i17 = rect.left;
                if (i17 < i15) {
                    i15 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i13) {
                    i13 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i14) {
                    i14 = i20;
                }
            }
            this.f74024b.f73918j.set(i15, i13, i12, i14);
            c2(this.f74024b.f73918j, i10, i11);
        }

        public int e0(@NonNull View view) {
            Rect rect = ((q) view.getLayoutParams()).f74048b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        @p0
        public View e1(@NonNull View view, int i10, @NonNull x xVar, @NonNull c0 c0Var) {
            return null;
        }

        public void e2(boolean z10) {
            this.f74033k = z10;
        }

        public int f0(@NonNull View view) {
            Rect rect = ((q) view.getLayoutParams()).f74048b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void f1(@NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f74024b;
            g1(recyclerView.f73901c, recyclerView.P3, accessibilityEvent);
        }

        void f2(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f74024b = null;
                this.f74023a = null;
                this.f74039q = 0;
                this.f74040r = 0;
            } else {
                this.f74024b = recyclerView;
                this.f74023a = recyclerView.f73907f;
                this.f74039q = recyclerView.getWidth();
                this.f74040r = recyclerView.getHeight();
            }
            this.f74037o = 1073741824;
            this.f74038p = 1073741824;
        }

        @e.a({"UnknownNullness"})
        public void g(View view) {
            h(view, -1);
        }

        public int g0(@NonNull View view) {
            return view.getRight() + y0(view);
        }

        public void g1(@NonNull x xVar, @NonNull c0 c0Var, @NonNull AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f74024b.canScrollVertically(-1) && !this.f74024b.canScrollHorizontally(-1) && !this.f74024b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                h hVar = this.f74024b.f73924m;
                if (hVar != null) {
                    accessibilityEvent.setItemCount(hVar.getItemCount());
                }
            }
        }

        boolean g2(View view, int i10, int i11, q qVar) {
            return (!view.isLayoutRequested() && this.f74033k && P0(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && P0(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        @e.a({"UnknownNullness"})
        public void h(View view, int i10) {
            l(view, i10, true);
        }

        public int h0(@NonNull View view) {
            return view.getTop() - B0(view);
        }

        void h1(androidx.core.view.accessibility.j jVar) {
            RecyclerView recyclerView = this.f74024b;
            i1(recyclerView.f73901c, recyclerView.P3, jVar);
        }

        boolean h2() {
            return false;
        }

        @p0
        public View i0() {
            View focusedChild;
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f74023a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void i1(@NonNull x xVar, @NonNull c0 c0Var, @NonNull androidx.core.view.accessibility.j jVar) {
            if (this.f74024b.canScrollVertically(-1) || this.f74024b.canScrollHorizontally(-1)) {
                jVar.a(8192);
                jVar.X1(true);
            }
            if (this.f74024b.canScrollVertically(1) || this.f74024b.canScrollHorizontally(1)) {
                jVar.a(4096);
                jVar.X1(true);
            }
            jVar.l1(androidx.core.view.accessibility.j.f.h(z0(xVar, c0Var), a0(xVar, c0Var), N0(xVar, c0Var), A0(xVar, c0Var)));
        }

        boolean i2(View view, int i10, int i11, q qVar) {
            return (this.f74033k && P0(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) qVar).width) && P0(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        @e.a({"UnknownNullness"})
        public void j(View view) {
            k(view, -1);
        }

        @androidx.annotation.t0
        public int j0() {
            return this.f74040r;
        }

        void j1(View view, androidx.core.view.accessibility.j jVar) {
            g0 g0VarX0 = RecyclerView.x0(view);
            if (g0VarX0 == null || g0VarX0.isRemoved() || this.f74023a.n(g0VarX0.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.f74024b;
            k1(recyclerView.f73901c, recyclerView.P3, view, jVar);
        }

        @e.a({"UnknownNullness"})
        public void j2(RecyclerView recyclerView, c0 c0Var, int i10) {
        }

        @e.a({"UnknownNullness"})
        public void k(View view, int i10) {
            l(view, i10, false);
        }

        public int k0() {
            return this.f74038p;
        }

        public void k1(@NonNull x xVar, @NonNull c0 c0Var, @NonNull View view, @NonNull androidx.core.view.accessibility.j jVar) {
        }

        @e.a({"UnknownNullness"})
        public void k2(b0 b0Var) {
            b0 b0Var2 = this.f74029g;
            if (b0Var2 != null && b0Var != b0Var2 && b0Var2.i()) {
                this.f74029g.s();
            }
            this.f74029g = b0Var;
            b0Var.r(this.f74024b, this);
        }

        public int l0(@NonNull View view) {
            return RecyclerView.x0(view).getItemViewType();
        }

        @p0
        public View l1(@NonNull View view, int i10) {
            return null;
        }

        public void l2(@NonNull View view) {
            g0 g0VarX0 = RecyclerView.x0(view);
            g0VarX0.stopIgnoring();
            g0VarX0.resetInternal();
            g0VarX0.addFlags(4);
        }

        public void m(String str) {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null) {
                recyclerView.w(str);
            }
        }

        public int m0() {
            return u1.c0(this.f74024b);
        }

        public void m1(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        void m2() {
            b0 b0Var = this.f74029g;
            if (b0Var != null) {
                b0Var.s();
            }
        }

        @e.a({"UnknownNullness"})
        public void n(String str) {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null) {
                recyclerView.x(str);
            }
        }

        public int n0(@NonNull View view) {
            return ((q) view.getLayoutParams()).f74048b.left;
        }

        public void n1(@NonNull RecyclerView recyclerView) {
        }

        public boolean n2() {
            return false;
        }

        public void o(@NonNull View view) {
            p(view, -1);
        }

        @androidx.annotation.t0
        public int o0() {
            return u1.h0(this.f74024b);
        }

        public void o1(@NonNull RecyclerView recyclerView, int i10, int i11, int i12) {
        }

        public void p(@NonNull View view, int i10) {
            q(view, i10, (q) view.getLayoutParams());
        }

        @androidx.annotation.t0
        public int p0() {
            return u1.i0(this.f74024b);
        }

        public void p1(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public void q(@NonNull View view, int i10, q qVar) {
            g0 g0VarX0 = RecyclerView.x0(view);
            if (g0VarX0.isRemoved()) {
                this.f74024b.f73909g.b(g0VarX0);
            } else {
                this.f74024b.f73909g.p(g0VarX0);
            }
            this.f74023a.c(view, i10, qVar, g0VarX0.isRemoved());
        }

        @androidx.annotation.t0
        public int q0() {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void q1(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }

        public void r(@NonNull View view, @NonNull Rect rect) {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.C0(view));
            }
        }

        @androidx.annotation.t0
        public int r0() {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null) {
                return u1.m0(recyclerView);
            }
            return 0;
        }

        public void r1(@NonNull RecyclerView recyclerView, int i10, int i11, @p0 Object obj) {
            q1(recyclerView, i10, i11);
        }

        public boolean s() {
            return false;
        }

        @androidx.annotation.t0
        public int s0() {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @e.a({"UnknownNullness"})
        public void s1(x xVar, c0 c0Var) {
        }

        public boolean t() {
            return false;
        }

        @androidx.annotation.t0
        public int t0() {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @e.a({"UnknownNullness"})
        public void t1(c0 c0Var) {
        }

        public boolean u(q qVar) {
            return qVar != null;
        }

        @androidx.annotation.t0
        public int u0() {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null) {
                return u1.n0(recyclerView);
            }
            return 0;
        }

        public void u1(@NonNull x xVar, @NonNull c0 c0Var, int i10, int i11) {
            this.f74024b.K(i10, i11);
        }

        @androidx.annotation.t0
        public int v0() {
            RecyclerView recyclerView = this.f74024b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        @Deprecated
        public boolean v1(@NonNull RecyclerView recyclerView, @NonNull View view, @p0 View view2) {
            return Q0() || recyclerView.R0();
        }

        @e.a({"UnknownNullness"})
        public void w(int i10, int i11, c0 c0Var, c cVar) {
        }

        public int w0(@NonNull View view) {
            return ((q) view.getLayoutParams()).d();
        }

        public boolean w1(@NonNull RecyclerView recyclerView, @NonNull c0 c0Var, @NonNull View view, @p0 View view2) {
            return v1(recyclerView, view, view2);
        }

        @e.a({"UnknownNullness"})
        public void x(int i10, c cVar) {
        }

        @e.a({"UnknownNullness"})
        public void x1(Parcelable parcelable) {
        }

        public int y(@NonNull c0 c0Var) {
            return 0;
        }

        public int y0(@NonNull View view) {
            return ((q) view.getLayoutParams()).f74048b.right;
        }

        @p0
        public Parcelable y1() {
            return null;
        }

        public int z(@NonNull c0 c0Var) {
            return 0;
        }

        public int z0(@NonNull x xVar, @NonNull c0 c0Var) {
            return -1;
        }

        public void z1(int i10) {
        }
    }

    public interface r {
        void b(@NonNull View view);

        void d(@NonNull View view);
    }

    public static abstract class s {
        public abstract boolean a(int i10, int i11);
    }

    public interface t {
        void a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        boolean c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent);

        void e(boolean z10);
    }

    public static abstract class u {
        public void a(@NonNull RecyclerView recyclerView, int i10) {
        }

        public void b(@NonNull RecyclerView recyclerView, int i10, int i11) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface v {
    }

    public static class w {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f74051d = 5;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray<a> f74052a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f74053b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Set<h<?>> f74054c = Collections.newSetFromMap(new IdentityHashMap());

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ArrayList<g0> f74055a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f74056b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f74057c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f74058d = 0;

            a() {
            }
        }

        private a j(int i10) {
            a aVar = this.f74052a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f74052a.put(i10, aVar2);
            return aVar2;
        }

        void a() {
            this.f74053b++;
        }

        void b(@NonNull h<?> hVar) {
            this.f74054c.add(hVar);
        }

        public void c() {
            for (int i10 = 0; i10 < this.f74052a.size(); i10++) {
                a aVarValueAt = this.f74052a.valueAt(i10);
                Iterator<g0> it = aVarValueAt.f74055a.iterator();
                while (it.hasNext()) {
                    androidx.customview.poolingcontainer.a.b(it.next().itemView);
                }
                aVarValueAt.f74055a.clear();
            }
        }

        void d() {
            this.f74053b--;
        }

        void e(@NonNull h<?> hVar, boolean z10) {
            this.f74054c.remove(hVar);
            if (this.f74054c.size() != 0 || z10) {
                return;
            }
            for (int i10 = 0; i10 < this.f74052a.size(); i10++) {
                SparseArray<a> sparseArray = this.f74052a;
                ArrayList<g0> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f74055a;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    androidx.customview.poolingcontainer.a.b(arrayList.get(i11).itemView);
                }
            }
        }

        void f(int i10, long j10) {
            a aVarJ = j(i10);
            aVarJ.f74058d = m(aVarJ.f74058d, j10);
        }

        void g(int i10, long j10) {
            a aVarJ = j(i10);
            aVarJ.f74057c = m(aVarJ.f74057c, j10);
        }

        @p0
        public g0 h(int i10) {
            a aVar = this.f74052a.get(i10);
            if (aVar != null && !aVar.f74055a.isEmpty()) {
                ArrayList<g0> arrayList = aVar.f74055a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                        return arrayList.remove(size);
                    }
                }
            }
            return null;
        }

        public int i(int i10) {
            return j(i10).f74055a.size();
        }

        void k(h<?> hVar, h<?> hVar2, boolean z10) {
            if (hVar != null) {
                d();
            }
            if (!z10 && this.f74053b == 0) {
                c();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void l(g0 g0Var) {
            int itemViewType = g0Var.getItemViewType();
            ArrayList<g0> arrayList = j(itemViewType).f74055a;
            if (this.f74052a.get(itemViewType).f74056b <= arrayList.size()) {
                androidx.customview.poolingcontainer.a.b(g0Var.itemView);
            } else {
                g0Var.resetInternal();
                arrayList.add(g0Var);
            }
        }

        long m(long j10, long j11) {
            return j10 == 0 ? j11 : ((j10 / 4) * 3) + (j11 / 4);
        }

        public void n(int i10, int i11) {
            a aVarJ = j(i10);
            aVarJ.f74056b = i11;
            ArrayList<g0> arrayList = aVarJ.f74055a;
            while (arrayList.size() > i11) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        int o() {
            int size = 0;
            for (int i10 = 0; i10 < this.f74052a.size(); i10++) {
                ArrayList<g0> arrayList = this.f74052a.valueAt(i10).f74055a;
                if (arrayList != null) {
                    size += arrayList.size();
                }
            }
            return size;
        }

        boolean p(int i10, long j10, long j11) {
            long j12 = j(i10).f74058d;
            return j12 == 0 || j10 + j12 < j11;
        }

        boolean q(int i10, long j10, long j11) {
            long j12 = j(i10).f74057c;
            return j12 == 0 || j10 + j12 < j11;
        }
    }

    public final class x {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final int f74059j = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList<g0> f74060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<g0> f74061b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<g0> f74062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<g0> f74063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f74064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f74065f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        w f74066g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private e0 f74067h;

        public x() {
            ArrayList<g0> arrayList = new ArrayList<>();
            this.f74060a = arrayList;
            this.f74061b = null;
            this.f74062c = new ArrayList<>();
            this.f74063d = Collections.unmodifiableList(arrayList);
            this.f74064e = 2;
            this.f74065f = 2;
        }

        private void C(h<?> hVar) {
            D(hVar, false);
        }

        private void D(h<?> hVar, boolean z10) {
            w wVar = this.f74066g;
            if (wVar != null) {
                wVar.e(hVar, z10);
            }
        }

        private boolean N(@NonNull g0 g0Var, int i10, int i11, long j10) {
            g0Var.mBindingAdapter = null;
            g0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = g0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j10 != Long.MAX_VALUE && !this.f74066g.p(itemViewType, nanoTime, j10)) {
                int i12 = 6 & 0;
                return false;
            }
            RecyclerView.this.f73924m.bindViewHolder(g0Var, i10);
            this.f74066g.f(g0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            b(g0Var);
            if (!RecyclerView.this.P3.j()) {
                return true;
            }
            g0Var.mPreLayoutPosition = i11;
            return true;
        }

        private void b(g0 g0Var) {
            if (RecyclerView.this.P0()) {
                View view = g0Var.itemView;
                if (u1.X(view) == 0) {
                    u1.Y1(view, 1);
                }
                androidx.recyclerview.widget.b0 b0Var = RecyclerView.this.W3;
                if (b0Var == null) {
                    return;
                }
                androidx.core.view.a aVarC = b0Var.c();
                if (aVarC instanceof androidx.recyclerview.widget.b0.a) {
                    ((androidx.recyclerview.widget.b0.a) aVarC).d(view);
                }
                u1.G1(view, aVarC);
            }
        }

        private void r(ViewGroup viewGroup, boolean z10) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    r((ViewGroup) childAt, true);
                }
            }
            if (z10) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void s(g0 g0Var) {
            View view = g0Var.itemView;
            if (view instanceof ViewGroup) {
                r((ViewGroup) view, false);
            }
        }

        private void v() {
            if (this.f74066g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f73924m == null || !recyclerView.isAttachedToWindow()) {
                    return;
                }
                this.f74066g.b(RecyclerView.this.f73924m);
            }
        }

        void A() {
            v();
        }

        void B() {
            for (int i10 = 0; i10 < this.f74062c.size(); i10++) {
                androidx.customview.poolingcontainer.a.b(this.f74062c.get(i10).itemView);
            }
            C(RecyclerView.this.f73924m);
        }

        void E(View view) {
            g0 g0VarX0 = RecyclerView.x0(view);
            g0VarX0.mScrapContainer = null;
            g0VarX0.mInChangeScrap = false;
            g0VarX0.clearReturnedFromScrapFlag();
            I(g0VarX0);
        }

        void F() {
            for (int size = this.f74062c.size() - 1; size >= 0; size--) {
                G(size);
            }
            this.f74062c.clear();
            if (RecyclerView.f73890t4) {
                RecyclerView.this.O3.b();
            }
        }

        void G(int i10) {
            a(this.f74062c.get(i10), true);
            this.f74062c.remove(i10);
        }

        public void H(@NonNull View view) {
            g0 g0VarX0 = RecyclerView.x0(view);
            if (g0VarX0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (g0VarX0.isScrap()) {
                g0VarX0.unScrap();
            } else if (g0VarX0.wasReturnedFromScrap()) {
                g0VarX0.clearReturnedFromScrapFlag();
            }
            I(g0VarX0);
            if (RecyclerView.this.f73945x3 == null || g0VarX0.isRecyclable()) {
                return;
            }
            RecyclerView.this.f73945x3.k(g0VarX0);
        }

        void I(g0 g0Var) {
            boolean z10;
            boolean z11 = false;
            boolean z12 = true;
            if (g0Var.isScrap() || g0Var.itemView.getParent() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scrapped or attached views may not be recycled. isScrap:");
                sb2.append(g0Var.isScrap());
                sb2.append(" isAttached:");
                sb2.append(g0Var.itemView.getParent() != null);
                sb2.append(RecyclerView.this.b0());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (g0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + g0Var + RecyclerView.this.b0());
            }
            if (g0Var.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.b0());
            }
            boolean zDoesTransientStatePreventRecycling = g0Var.doesTransientStatePreventRecycling();
            h hVar = RecyclerView.this.f73924m;
            if ((hVar != null && zDoesTransientStatePreventRecycling && hVar.onFailedToRecycleView(g0Var)) || g0Var.isRecyclable()) {
                if (this.f74065f <= 0 || g0Var.hasAnyOfTheFlags(526)) {
                    z10 = false;
                } else {
                    int size = this.f74062c.size();
                    if (size >= this.f74065f && size > 0) {
                        G(0);
                        size--;
                    }
                    if (RecyclerView.f73890t4 && size > 0 && !RecyclerView.this.O3.d(g0Var.mPosition)) {
                        do {
                            size--;
                            if (size < 0) {
                                break;
                            }
                        } while (RecyclerView.this.O3.d(this.f74062c.get(size).mPosition));
                        size++;
                    }
                    this.f74062c.add(size, g0Var);
                    z10 = true;
                }
                if (z10) {
                    z12 = false;
                } else {
                    a(g0Var, true);
                }
                z11 = z10;
            } else {
                z12 = false;
            }
            RecyclerView.this.f73909g.q(g0Var);
            if (!z11 && !z12 && zDoesTransientStatePreventRecycling) {
                androidx.customview.poolingcontainer.a.b(g0Var.itemView);
                g0Var.mBindingAdapter = null;
                g0Var.mOwnerRecyclerView = null;
            }
        }

        void J(View view) {
            g0 g0VarX0 = RecyclerView.x0(view);
            if (!g0VarX0.hasAnyOfTheFlags(12) && g0VarX0.isUpdated() && !RecyclerView.this.y(g0VarX0)) {
                if (this.f74061b == null) {
                    this.f74061b = new ArrayList<>();
                }
                g0VarX0.setScrapContainer(this, true);
                this.f74061b.add(g0VarX0);
                return;
            }
            if (g0VarX0.isInvalid() && !g0VarX0.isRemoved() && !RecyclerView.this.f73924m.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.b0());
            }
            g0VarX0.setScrapContainer(this, false);
            this.f74060a.add(g0VarX0);
        }

        void K(w wVar) {
            C(RecyclerView.this.f73924m);
            w wVar2 = this.f74066g;
            if (wVar2 != null) {
                wVar2.d();
            }
            this.f74066g = wVar;
            if (wVar != null && RecyclerView.this.getAdapter() != null) {
                this.f74066g.a();
            }
            v();
        }

        void L(e0 e0Var) {
            this.f74067h = e0Var;
        }

        public void M(int i10) {
            this.f74064e = i10;
            Q();
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0214  */
        /* JADX WARN: Code duplicated, block: B:102:0x0222  */
        /* JADX WARN: Code duplicated, block: B:105:0x0229 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:107:0x022c  */
        /* JADX WARN: Code duplicated, block: B:18:0x003a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x003c  */
        /* JADX WARN: Code duplicated, block: B:21:0x0046  */
        /* JADX WARN: Code duplicated, block: B:22:0x0051  */
        /* JADX WARN: Code duplicated, block: B:24:0x0057  */
        /* JADX WARN: Code duplicated, block: B:27:0x005f  */
        /* JADX WARN: Code duplicated, block: B:29:0x0063  */
        /* JADX WARN: Code duplicated, block: B:81:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:87:0x01d3  */
        /* JADX WARN: Code duplicated, block: B:89:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:98:0x01fe  */
        /* JADX WARN: Code duplicated, block: B:99:0x020c  */
        @p0
        g0 O(int i10, boolean z10, long j10) {
            g0 g0VarCreateViewHolder;
            boolean z11;
            g0 g0Var;
            boolean z12;
            boolean zN;
            ViewGroup.LayoutParams layoutParams;
            q qVar;
            int iN;
            RecyclerView recyclerViewI0;
            e0 e0Var;
            View viewA;
            if (i10 < 0 || i10 >= RecyclerView.this.P3.d()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i10 + "(" + i10 + "). Item count:" + RecyclerView.this.P3.d() + RecyclerView.this.b0());
            }
            if (RecyclerView.this.P3.j()) {
                g0VarCreateViewHolder = i(i10);
                if (g0VarCreateViewHolder != null) {
                    z11 = true;
                }
                if (g0VarCreateViewHolder == null && (g0VarCreateViewHolder = n(i10, z10)) != null) {
                    if (R(g0VarCreateViewHolder)) {
                        z11 = true;
                    } else {
                        if (!z10) {
                            g0VarCreateViewHolder.addFlags(4);
                            if (g0VarCreateViewHolder.isScrap()) {
                                RecyclerView.this.removeDetachedView(g0VarCreateViewHolder.itemView, false);
                                g0VarCreateViewHolder.unScrap();
                            } else if (g0VarCreateViewHolder.wasReturnedFromScrap()) {
                                g0VarCreateViewHolder.clearReturnedFromScrapFlag();
                            }
                            I(g0VarCreateViewHolder);
                        }
                        g0VarCreateViewHolder = null;
                    }
                }
                if (g0VarCreateViewHolder == null) {
                    iN = RecyclerView.this.f73905e.n(i10);
                    if (iN >= 0 || iN >= RecyclerView.this.f73924m.getItemCount()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iN + ").state:" + RecyclerView.this.P3.d() + RecyclerView.this.b0());
                    }
                    int itemViewType = RecyclerView.this.f73924m.getItemViewType(iN);
                    if (RecyclerView.this.f73924m.hasStableIds() && (g0VarCreateViewHolder = m(RecyclerView.this.f73924m.getItemId(iN), itemViewType, z10)) != null) {
                        g0VarCreateViewHolder.mPosition = iN;
                        z11 = true;
                    }
                    if (g0VarCreateViewHolder == null && (e0Var = this.f74067h) != null && (viewA = e0Var.a(this, i10, itemViewType)) != null) {
                        g0VarCreateViewHolder = RecyclerView.this.w0(viewA);
                        if (g0VarCreateViewHolder == null) {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + RecyclerView.this.b0());
                        }
                        if (g0VarCreateViewHolder.shouldIgnore()) {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + RecyclerView.this.b0());
                        }
                    }
                    if (g0VarCreateViewHolder == null) {
                        g0 g0VarH = j().h(itemViewType);
                        if (g0VarH != null) {
                            g0VarH.resetInternal();
                            if (RecyclerView.f73887q4) {
                                s(g0VarH);
                            }
                        }
                        g0VarCreateViewHolder = g0VarH;
                    }
                    if (g0VarCreateViewHolder == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j10 != Long.MAX_VALUE && !this.f74066g.q(itemViewType, nanoTime, j10)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        g0VarCreateViewHolder = recyclerView.f73924m.createViewHolder(recyclerView, itemViewType);
                        if (RecyclerView.f73890t4 && (recyclerViewI0 = RecyclerView.i0(g0VarCreateViewHolder.itemView)) != null) {
                            g0VarCreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewI0);
                        }
                        this.f74066g.g(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                    }
                }
                g0Var = g0VarCreateViewHolder;
                z12 = z11;
                if (z12 && !RecyclerView.this.P3.j() && g0Var.hasAnyOfTheFlags(8192)) {
                    g0Var.setFlags(0, 8192);
                    if (RecyclerView.this.P3.f73980k) {
                        int iE = m.e(g0Var) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.r1(g0Var, recyclerView2.f73945x3.w(recyclerView2.P3, g0Var, iE, g0Var.getUnmodifiedPayloads()));
                    }
                }
                if (RecyclerView.this.P3.j() || !g0Var.isBound()) {
                    if (g0Var.isBound() || g0Var.needsUpdate() || g0Var.isInvalid()) {
                        zN = N(g0Var, RecyclerView.this.f73905e.n(i10), i10, j10);
                    }
                    layoutParams = g0Var.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                        g0Var.itemView.setLayoutParams(qVar);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        qVar = (q) layoutParams;
                    } else {
                        qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                        g0Var.itemView.setLayoutParams(qVar);
                    }
                    qVar.f74047a = g0Var;
                    qVar.f74050d = !z12 && zN;
                    return g0Var;
                }
                g0Var.mPreLayoutPosition = i10;
                zN = false;
                layoutParams = g0Var.itemView.getLayoutParams();
                if (layoutParams == null) {
                    qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                    g0Var.itemView.setLayoutParams(qVar);
                } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                    g0Var.itemView.setLayoutParams(qVar);
                } else {
                    qVar = (q) layoutParams;
                }
                qVar.f74047a = g0Var;
                qVar.f74050d = !z12 && zN;
                return g0Var;
            }
            g0VarCreateViewHolder = null;
            z11 = false;
            if (g0VarCreateViewHolder == null) {
                if (R(g0VarCreateViewHolder)) {
                    if (!z10) {
                        g0VarCreateViewHolder.addFlags(4);
                        if (g0VarCreateViewHolder.isScrap()) {
                            RecyclerView.this.removeDetachedView(g0VarCreateViewHolder.itemView, false);
                            g0VarCreateViewHolder.unScrap();
                        } else if (g0VarCreateViewHolder.wasReturnedFromScrap()) {
                            g0VarCreateViewHolder.clearReturnedFromScrapFlag();
                        }
                        I(g0VarCreateViewHolder);
                    }
                    g0VarCreateViewHolder = null;
                } else {
                    z11 = true;
                }
            }
            if (g0VarCreateViewHolder == null) {
                iN = RecyclerView.this.f73905e.n(i10);
                if (iN >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iN + ").state:" + RecyclerView.this.P3.d() + RecyclerView.this.b0());
            }
            g0Var = g0VarCreateViewHolder;
            z12 = z11;
            if (z12) {
                g0Var.setFlags(0, 8192);
                if (RecyclerView.this.P3.f73980k) {
                    int iE2 = m.e(g0Var) | 4096;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.r1(g0Var, recyclerView3.f73945x3.w(recyclerView3.P3, g0Var, iE2, g0Var.getUnmodifiedPayloads()));
                }
            }
            if (RecyclerView.this.P3.j()) {
                if (g0Var.isBound()) {
                }
                zN = N(g0Var, RecyclerView.this.f73905e.n(i10), i10, j10);
            } else {
                if (g0Var.isBound()) {
                }
                zN = N(g0Var, RecyclerView.this.f73905e.n(i10), i10, j10);
            }
            layoutParams = g0Var.itemView.getLayoutParams();
            if (layoutParams == null) {
                qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                g0Var.itemView.setLayoutParams(qVar);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                g0Var.itemView.setLayoutParams(qVar);
            } else {
                qVar = (q) layoutParams;
            }
            qVar.f74047a = g0Var;
            qVar.f74050d = !z12 && zN;
            return g0Var;
        }

        void P(g0 g0Var) {
            if (g0Var.mInChangeScrap) {
                this.f74061b.remove(g0Var);
            } else {
                this.f74060a.remove(g0Var);
            }
            g0Var.mScrapContainer = null;
            g0Var.mInChangeScrap = false;
            g0Var.clearReturnedFromScrapFlag();
        }

        void Q() {
            p pVar = RecyclerView.this.f73926n;
            this.f74065f = this.f74064e + (pVar != null ? pVar.f74035m : 0);
            for (int size = this.f74062c.size() - 1; size >= 0 && this.f74062c.size() > this.f74065f; size--) {
                G(size);
            }
        }

        boolean R(g0 g0Var) {
            if (g0Var.isRemoved()) {
                return RecyclerView.this.P3.j();
            }
            int i10 = g0Var.mPosition;
            if (i10 >= 0 && i10 < RecyclerView.this.f73924m.getItemCount()) {
                if (RecyclerView.this.P3.j() || RecyclerView.this.f73924m.getItemViewType(g0Var.mPosition) == g0Var.getItemViewType()) {
                    return !RecyclerView.this.f73924m.hasStableIds() || g0Var.getItemId() == RecyclerView.this.f73924m.getItemId(g0Var.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + g0Var + RecyclerView.this.b0());
        }

        void S(int i10, int i11) {
            int i12;
            int i13 = i11 + i10;
            for (int size = this.f74062c.size() - 1; size >= 0; size--) {
                g0 g0Var = this.f74062c.get(size);
                if (g0Var != null && (i12 = g0Var.mPosition) >= i10 && i12 < i13) {
                    g0Var.addFlags(2);
                    G(size);
                }
            }
        }

        void a(@NonNull g0 g0Var, boolean z10) {
            RecyclerView.A(g0Var);
            View view = g0Var.itemView;
            androidx.recyclerview.widget.b0 b0Var = RecyclerView.this.W3;
            if (b0Var != null) {
                androidx.core.view.a aVarC = b0Var.c();
                u1.G1(view, aVarC instanceof androidx.recyclerview.widget.b0.a ? ((androidx.recyclerview.widget.b0.a) aVarC).c(view) : null);
            }
            if (z10) {
                h(g0Var);
            }
            g0Var.mBindingAdapter = null;
            g0Var.mOwnerRecyclerView = null;
            j().l(g0Var);
        }

        public void c(@NonNull View view, int i10) {
            q qVar;
            g0 g0VarX0 = RecyclerView.x0(view);
            if (g0VarX0 == null) {
                throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.b0());
            }
            int iN = RecyclerView.this.f73905e.n(i10);
            if (iN < 0 || iN >= RecyclerView.this.f73924m.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i10 + "(offset:" + iN + ").state:" + RecyclerView.this.P3.d() + RecyclerView.this.b0());
            }
            N(g0VarX0, iN, i10, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams = g0VarX0.itemView.getLayoutParams();
            if (layoutParams == null) {
                qVar = (q) RecyclerView.this.generateDefaultLayoutParams();
                g0VarX0.itemView.setLayoutParams(qVar);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                qVar = (q) layoutParams;
            } else {
                qVar = (q) RecyclerView.this.generateLayoutParams(layoutParams);
                g0VarX0.itemView.setLayoutParams(qVar);
            }
            qVar.f74049c = true;
            qVar.f74047a = g0VarX0;
            qVar.f74050d = g0VarX0.itemView.getParent() == null;
        }

        public void d() {
            this.f74060a.clear();
            F();
        }

        void e() {
            int size = this.f74062c.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f74062c.get(i10).clearOldPosition();
            }
            int size2 = this.f74060a.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f74060a.get(i11).clearOldPosition();
            }
            ArrayList<g0> arrayList = this.f74061b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i12 = 0; i12 < size3; i12++) {
                    this.f74061b.get(i12).clearOldPosition();
                }
            }
        }

        void f() {
            this.f74060a.clear();
            ArrayList<g0> arrayList = this.f74061b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int g(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.P3.d()) {
                return !RecyclerView.this.P3.j() ? i10 : RecyclerView.this.f73905e.n(i10);
            }
            throw new IndexOutOfBoundsException("invalid position " + i10 + ". State item count is " + RecyclerView.this.P3.d() + RecyclerView.this.b0());
        }

        void h(@NonNull g0 g0Var) {
            y yVar = RecyclerView.this.f73928o;
            if (yVar != null) {
                yVar.onViewRecycled(g0Var);
            }
            int size = RecyclerView.this.f73936s.size();
            for (int i10 = 0; i10 < size; i10++) {
                RecyclerView.this.f73936s.get(i10).onViewRecycled(g0Var);
            }
            h hVar = RecyclerView.this.f73924m;
            if (hVar != null) {
                hVar.onViewRecycled(g0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.P3 != null) {
                recyclerView.f73909g.q(g0Var);
            }
        }

        g0 i(int i10) {
            int size;
            int iN;
            ArrayList<g0> arrayList = this.f74061b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    g0 g0Var = this.f74061b.get(i11);
                    if (!g0Var.wasReturnedFromScrap() && g0Var.getLayoutPosition() == i10) {
                        g0Var.addFlags(32);
                        return g0Var;
                    }
                }
                if (RecyclerView.this.f73924m.hasStableIds() && (iN = RecyclerView.this.f73905e.n(i10)) > 0 && iN < RecyclerView.this.f73924m.getItemCount()) {
                    long itemId = RecyclerView.this.f73924m.getItemId(iN);
                    for (int i12 = 0; i12 < size; i12++) {
                        g0 g0Var2 = this.f74061b.get(i12);
                        if (!g0Var2.wasReturnedFromScrap() && g0Var2.getItemId() == itemId) {
                            g0Var2.addFlags(32);
                            return g0Var2;
                        }
                    }
                }
            }
            return null;
        }

        w j() {
            if (this.f74066g == null) {
                this.f74066g = new w();
                v();
            }
            return this.f74066g;
        }

        int k() {
            return this.f74060a.size();
        }

        @NonNull
        public List<g0> l() {
            return this.f74063d;
        }

        g0 m(long j10, int i10, boolean z10) {
            for (int size = this.f74060a.size() - 1; size >= 0; size--) {
                g0 g0Var = this.f74060a.get(size);
                if (g0Var.getItemId() == j10 && !g0Var.wasReturnedFromScrap()) {
                    if (i10 == g0Var.getItemViewType()) {
                        g0Var.addFlags(32);
                        if (g0Var.isRemoved() && !RecyclerView.this.P3.j()) {
                            g0Var.setFlags(2, 14);
                        }
                        return g0Var;
                    }
                    if (!z10) {
                        this.f74060a.remove(size);
                        int i11 = 2 ^ 0;
                        RecyclerView.this.removeDetachedView(g0Var.itemView, false);
                        E(g0Var.itemView);
                    }
                }
            }
            int size2 = this.f74062c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                g0 g0Var2 = this.f74062c.get(size2);
                if (g0Var2.getItemId() == j10 && !g0Var2.isAttachedToTransitionOverlay()) {
                    if (i10 == g0Var2.getItemViewType()) {
                        if (!z10) {
                            this.f74062c.remove(size2);
                        }
                        return g0Var2;
                    }
                    if (!z10) {
                        G(size2);
                        return null;
                    }
                }
            }
        }

        g0 n(int i10, boolean z10) {
            View viewE;
            int size = this.f74060a.size();
            for (int i11 = 0; i11 < size; i11++) {
                g0 g0Var = this.f74060a.get(i11);
                if (!g0Var.wasReturnedFromScrap() && g0Var.getLayoutPosition() == i10 && !g0Var.isInvalid() && (RecyclerView.this.P3.f73977h || !g0Var.isRemoved())) {
                    g0Var.addFlags(32);
                    return g0Var;
                }
            }
            if (z10 || (viewE = RecyclerView.this.f73907f.e(i10)) == null) {
                int size2 = this.f74062c.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    g0 g0Var2 = this.f74062c.get(i12);
                    if (!g0Var2.isInvalid() && g0Var2.getLayoutPosition() == i10 && !g0Var2.isAttachedToTransitionOverlay()) {
                        if (!z10) {
                            this.f74062c.remove(i12);
                        }
                        return g0Var2;
                    }
                }
                return null;
            }
            g0 g0VarX0 = RecyclerView.x0(viewE);
            RecyclerView.this.f73907f.s(viewE);
            int iM = RecyclerView.this.f73907f.m(viewE);
            if (iM != -1) {
                RecyclerView.this.f73907f.d(iM);
                J(viewE);
                g0VarX0.addFlags(8224);
                return g0VarX0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + g0VarX0 + RecyclerView.this.b0());
        }

        View o(int i10) {
            return this.f74060a.get(i10).itemView;
        }

        @NonNull
        public View p(int i10) {
            return q(i10, false);
        }

        View q(int i10, boolean z10) {
            return O(i10, z10, Long.MAX_VALUE).itemView;
        }

        void t() {
            int size = this.f74062c.size();
            for (int i10 = 0; i10 < size; i10++) {
                q qVar = (q) this.f74062c.get(i10).itemView.getLayoutParams();
                if (qVar != null) {
                    qVar.f74049c = true;
                }
            }
        }

        void u() {
            int size = this.f74062c.size();
            for (int i10 = 0; i10 < size; i10++) {
                g0 g0Var = this.f74062c.get(i10);
                if (g0Var != null) {
                    g0Var.addFlags(6);
                    g0Var.addChangePayload(null);
                }
            }
            h hVar = RecyclerView.this.f73924m;
            if (hVar == null || !hVar.hasStableIds()) {
                F();
            }
        }

        void w(int i10, int i11) {
            int size = this.f74062c.size();
            for (int i12 = 0; i12 < size; i12++) {
                g0 g0Var = this.f74062c.get(i12);
                if (g0Var != null && g0Var.mPosition >= i10) {
                    g0Var.offsetPosition(i11, false);
                }
            }
        }

        void x(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            if (i10 < i11) {
                i12 = -1;
                i14 = i10;
                i13 = i11;
            } else {
                i12 = 1;
                i13 = i10;
                i14 = i11;
            }
            int size = this.f74062c.size();
            for (int i16 = 0; i16 < size; i16++) {
                g0 g0Var = this.f74062c.get(i16);
                if (g0Var != null && (i15 = g0Var.mPosition) >= i14 && i15 <= i13) {
                    if (i15 == i10) {
                        g0Var.offsetPosition(i11 - i10, false);
                    } else {
                        g0Var.offsetPosition(i12, false);
                    }
                }
            }
        }

        void y(int i10, int i11, boolean z10) {
            int i12 = i10 + i11;
            for (int size = this.f74062c.size() - 1; size >= 0; size--) {
                g0 g0Var = this.f74062c.get(size);
                if (g0Var != null) {
                    int i13 = g0Var.mPosition;
                    if (i13 >= i12) {
                        g0Var.offsetPosition(-i11, z10);
                    } else if (i13 >= i10) {
                        g0Var.addFlags(8);
                        G(size);
                    }
                }
            }
        }

        void z(h<?> hVar, h<?> hVar2, boolean z10) {
            d();
            D(hVar, true);
            j().k(hVar, hVar2, z10);
            v();
        }
    }

    public interface y {
        void onViewRecycled(@NonNull g0 g0Var);
    }

    private class z extends j {
        z() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.x(null);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z10 = true | true;
            recyclerView.P3.f73976g = true;
            recyclerView.p1(true);
            if (RecyclerView.this.f73905e.q()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11, Object obj) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.f73905e.s(i10, i11, obj)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.f73905e.t(i10, i11)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i10, int i11, int i12) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.f73905e.u(i10, i11, i12)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i10, int i11) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.f73905e.v(i10, i11)) {
                h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f73903d != null && (hVar = recyclerView.f73924m) != null && hVar.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        void h() {
            if (RecyclerView.f73889s4) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f73931p1 && recyclerView.f73930p0) {
                    u1.u1(recyclerView, recyclerView.f73915i);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f73923l3 = true;
            recyclerView2.requestLayout();
        }
    }

    static {
        Class cls = Integer.TYPE;
        Q4 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        W4 = new c();
        X4 = new d0();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    static void A(@NonNull g0 g0Var) {
        WeakReference<RecyclerView> weakReference = g0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == g0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            g0Var.mNestedRecyclerView = null;
        }
    }

    private int A0(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            int i10 = 2 ^ (-1);
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String B0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private float E0(int i10) {
        double dLog = Math.log((Math.abs(i10) * f73885o4) / (this.f73897a * f73884n4));
        float f10 = f73886p4;
        return (float) (((double) (this.f73897a * f73884n4)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    private void F0(long j10, g0 g0Var, g0 g0Var2) {
        int iG = this.f73907f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            g0 g0VarX0 = x0(this.f73907f.f(i10));
            if (g0VarX0 != g0Var && r0(g0VarX0) == j10) {
                h hVar = this.f73924m;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + g0VarX0 + " \n View Holder 2:" + g0Var + b0());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + g0VarX0 + " \n View Holder 2:" + g0Var + b0());
            }
        }
        Objects.toString(g0Var2);
        Objects.toString(g0Var);
        b0();
    }

    private void F1(@NonNull View view, @p0 View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f73918j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f74049c) {
                Rect rect = qVar.f74048b;
                Rect rect2 = this.f73918j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f73918j);
            offsetRectIntoDescendantCoords(view, this.f73918j);
        }
        this.f73926n.Q1(this, view, this.f73918j, !this.f73932p2, view2 == null);
    }

    private int G(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && androidx.core.widget.j.d(edgeEffect) != 0.0f) {
            int iRound = Math.round(((-i11) / 4.0f) * androidx.core.widget.j.j(edgeEffect, ((-i10) * 4.0f) / i11, 0.5f));
            if (iRound != i10) {
                edgeEffect.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || edgeEffect2 == null || androidx.core.widget.j.d(edgeEffect2) == 0.0f) {
            return i10;
        }
        float f10 = i11;
        int iRound2 = Math.round((f10 / 4.0f) * androidx.core.widget.j.j(edgeEffect2, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            edgeEffect2.finish();
        }
        return i10 - iRound2;
    }

    private void G1() {
        c0 c0Var = this.P3;
        c0Var.f73983n = -1L;
        c0Var.f73982m = -1;
        c0Var.f73984o = -1;
    }

    private void H1() {
        VelocityTracker velocityTracker = this.A3;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        c(0);
        t1();
    }

    private boolean I0() {
        int iG = this.f73907f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            g0 g0VarX0 = x0(this.f73907f.f(i10));
            if (g0VarX0 != null && !g0VarX0.shouldIgnore() && g0VarX0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void I1() {
        int absoluteAdapterPosition;
        View focusedChild = (this.L3 && hasFocus() && this.f73924m != null) ? getFocusedChild() : null;
        g0 g0VarF0 = focusedChild != null ? f0(focusedChild) : null;
        if (g0VarF0 == null) {
            G1();
            return;
        }
        this.P3.f73983n = this.f73924m.hasStableIds() ? g0VarF0.getItemId() : -1L;
        c0 c0Var = this.P3;
        if (this.f73929o3) {
            absoluteAdapterPosition = -1;
            int i10 = 4 & (-1);
        } else {
            absoluteAdapterPosition = g0VarF0.isRemoved() ? g0VarF0.mOldPosition : g0VarF0.getAbsoluteAdapterPosition();
        }
        c0Var.f73982m = absoluteAdapterPosition;
        this.P3.f73984o = A0(g0VarF0.itemView);
    }

    private void J(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                String strB0 = B0(context, strTrim);
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(strB0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(Q4);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                    } catch (NoSuchMethodException e10) {
                        objArr = null;
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e11) {
                            e11.initCause(e10);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strB0, e11);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((p) constructor.newInstance(objArr));
                } catch (ClassCastException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strB0, e12);
                } catch (ClassNotFoundException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strB0, e13);
                } catch (IllegalAccessException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strB0, e14);
                } catch (InstantiationException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strB0, e15);
                } catch (InvocationTargetException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strB0, e16);
                }
            }
        }
    }

    @e.a({"InlinedApi"})
    private void K0() {
        if (u1.Y(this) == 0) {
            u1.a2(this, 8);
        }
    }

    private boolean L(int i10, int i11) {
        h0(this.Y3);
        int[] iArr = this.Y3;
        return (iArr[0] == i10 && iArr[1] == i11) ? false : true;
    }

    private void L0() {
        this.f73907f = new androidx.recyclerview.widget.g(new e());
    }

    private void N1(@p0 h<?> hVar, boolean z10, boolean z11) {
        h hVar2 = this.f73924m;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f73899b);
            this.f73924m.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            w1();
        }
        this.f73905e.z();
        h<?> hVar3 = this.f73924m;
        this.f73924m = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f73899b);
            hVar.onAttachedToRecyclerView(this);
        }
        p pVar = this.f73926n;
        if (pVar != null) {
            pVar.Z0(hVar3, this.f73924m);
        }
        this.f73901c.z(hVar3, this.f73924m, z10);
        this.P3.f73976g = true;
    }

    private void O() {
        int i10 = this.f73921k3;
        this.f73921k3 = 0;
        if (i10 != 0 && P0()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(2048);
            androidx.core.view.accessibility.b.k(accessibilityEventObtain, i10);
            sendAccessibilityEventUnchecked(accessibilityEventObtain);
        }
    }

    private boolean P1(@NonNull EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        return E0(-i10) < androidx.core.widget.j.d(edgeEffect) * ((float) i11);
    }

    private void Q() {
        boolean z10 = true;
        this.P3.a(1);
        c0(this.P3);
        this.P3.f73979j = false;
        W1();
        this.f73909g.f();
        g1();
        o1();
        I1();
        c0 c0Var = this.P3;
        if (!c0Var.f73980k || !this.T3) {
            z10 = false;
        }
        c0Var.f73978i = z10;
        this.T3 = false;
        this.S3 = false;
        c0Var.f73977h = c0Var.f73981l;
        c0Var.f73975f = this.f73924m.getItemCount();
        h0(this.Y3);
        if (this.P3.f73980k) {
            int iG = this.f73907f.g();
            for (int i10 = 0; i10 < iG; i10++) {
                g0 g0VarX0 = x0(this.f73907f.f(i10));
                if (!g0VarX0.shouldIgnore() && (!g0VarX0.isInvalid() || this.f73924m.hasStableIds())) {
                    this.f73909g.e(g0VarX0, this.f73945x3.w(this.P3, g0VarX0, m.e(g0VarX0), g0VarX0.getUnmodifiedPayloads()));
                    if (this.P3.f73978i && g0VarX0.isUpdated() && !g0VarX0.isRemoved() && !g0VarX0.shouldIgnore() && !g0VarX0.isInvalid()) {
                        this.f73909g.c(r0(g0VarX0), g0VarX0);
                    }
                }
            }
        }
        if (this.P3.f73981l) {
            J1();
            c0 c0Var2 = this.P3;
            boolean z11 = c0Var2.f73976g;
            c0Var2.f73976g = false;
            this.f73926n.s1(this.f73901c, c0Var2);
            this.P3.f73976g = z11;
            for (int i11 = 0; i11 < this.f73907f.g(); i11++) {
                g0 g0VarX1 = x0(this.f73907f.f(i11));
                if (!g0VarX1.shouldIgnore() && !this.f73909g.i(g0VarX1)) {
                    int iE = m.e(g0VarX1);
                    boolean zHasAnyOfTheFlags = g0VarX1.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iE |= 4096;
                    }
                    m.d dVarW = this.f73945x3.w(this.P3, g0VarX1, iE, g0VarX1.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        r1(g0VarX1, dVarW);
                    } else {
                        this.f73909g.a(g0VarX1, dVarW);
                    }
                }
            }
            B();
        } else {
            B();
        }
        h1();
        Y1(false);
        this.P3.f73974e = 2;
    }

    private void R() {
        W1();
        g1();
        this.P3.a(6);
        this.f73905e.k();
        this.P3.f73975f = this.f73924m.getItemCount();
        this.P3.f73973d = 0;
        if (this.f73903d != null && this.f73924m.canRestoreState()) {
            Parcelable parcelable = this.f73903d.f73948c;
            if (parcelable != null) {
                this.f73926n.x1(parcelable);
            }
            this.f73903d = null;
        }
        c0 c0Var = this.P3;
        c0Var.f73977h = false;
        this.f73926n.s1(this.f73901c, c0Var);
        c0 c0Var2 = this.P3;
        c0Var2.f73976g = false;
        c0Var2.f73980k = c0Var2.f73980k && this.f73945x3 != null;
        c0Var2.f73974e = 4;
        h1();
        Y1(false);
    }

    private void S() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        this.P3.a(4);
        W1();
        g1();
        c0 c0Var = this.P3;
        c0Var.f73974e = 1;
        if (c0Var.f73980k) {
            int iG = this.f73907f.g() - 1;
            while (iG >= 0) {
                g0 g0VarX0 = x0(this.f73907f.f(iG));
                if (g0VarX0.shouldIgnore()) {
                    recyclerView2 = this;
                } else {
                    long jR0 = this.r0(g0VarX0);
                    m.d dVarV = this.f73945x3.v(this.P3, g0VarX0);
                    g0 g0VarG = this.f73909g.g(jR0);
                    if (g0VarG == null || g0VarG.shouldIgnore()) {
                        recyclerView2 = this;
                        recyclerView2.f73909g.d(g0VarX0, dVarV);
                    } else {
                        boolean zH = this.f73909g.h(g0VarG);
                        boolean zH2 = this.f73909g.h(g0VarX0);
                        if (zH && g0VarG == g0VarX0) {
                            this.f73909g.d(g0VarX0, dVarV);
                        } else {
                            m.d dVarN = this.f73909g.n(g0VarG);
                            this.f73909g.d(g0VarX0, dVarV);
                            m.d dVarM = this.f73909g.m(g0VarX0);
                            if (dVarN == null) {
                                this.F0(jR0, g0VarX0, g0VarG);
                            } else {
                                recyclerView2 = this;
                                recyclerView2.u(g0VarG, g0VarX0, dVarN, dVarM, zH, zH2);
                            }
                        }
                        recyclerView2 = this;
                    }
                }
                iG--;
                this = recyclerView2;
            }
            recyclerView = this;
            recyclerView.f73909g.o(recyclerView.f73917i4);
        } else {
            recyclerView = this;
        }
        recyclerView.f73926n.I1(recyclerView.f73901c);
        c0 c0Var2 = recyclerView.P3;
        c0Var2.f73972c = c0Var2.f73975f;
        recyclerView.f73929o3 = false;
        recyclerView.f73933p3 = false;
        c0Var2.f73980k = false;
        c0Var2.f73981l = false;
        recyclerView.f73926n.f74030h = false;
        ArrayList<g0> arrayList = recyclerView.f73901c.f74061b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = recyclerView.f73926n;
        if (pVar.f74036n) {
            pVar.f74035m = 0;
            pVar.f74036n = false;
            recyclerView.f73901c.Q();
        }
        recyclerView.f73926n.t1(recyclerView.P3);
        recyclerView.h1();
        recyclerView.Y1(false);
        recyclerView.f73909g.f();
        int[] iArr = recyclerView.Y3;
        if (recyclerView.L(iArr[0], iArr[1])) {
            recyclerView.U(0, 0);
        }
        recyclerView.s1();
        recyclerView.G1();
    }

    private boolean T0(View view, View view2, int i10) {
        int i11;
        if (view2 != null && view2 != this && view2 != view && e0(view2) != null) {
            if (view == null || e0(view) == null) {
                return true;
            }
            this.f73918j.set(0, 0, view.getWidth(), view.getHeight());
            this.f73920k.set(0, 0, view2.getWidth(), view2.getHeight());
            offsetDescendantRectToMyCoords(view, this.f73918j);
            offsetDescendantRectToMyCoords(view2, this.f73920k);
            byte b10 = -1;
            int i12 = this.f73926n.m0() == 1 ? -1 : 1;
            Rect rect = this.f73918j;
            int i13 = rect.left;
            Rect rect2 = this.f73920k;
            int i14 = rect2.left;
            if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
                i11 = 1;
            } else {
                int i15 = rect.right;
                int i16 = rect2.right;
                i11 = ((i15 > i16 || i13 >= i16) && i13 > i14) ? -1 : 0;
            }
            int i17 = rect.top;
            int i18 = rect2.top;
            if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
                b10 = 1;
            } else {
                int i19 = rect.bottom;
                int i20 = rect2.bottom;
                if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                    b10 = 0;
                }
            }
            if (i10 == 1) {
                return b10 < 0 || (b10 == 0 && i11 * i12 < 0);
            }
            if (i10 == 2) {
                return b10 > 0 || (b10 == 0 && i11 * i12 > 0);
            }
            if (i10 == 17) {
                return i11 < 0;
            }
            if (i10 == 33) {
                return b10 < 0;
            }
            if (i10 == 66) {
                return i11 > 0;
            }
            if (i10 == 130) {
                return b10 > 0;
            }
            throw new IllegalArgumentException("Invalid direction: " + i10 + b0());
        }
        return false;
    }

    private boolean W(MotionEvent motionEvent) {
        t tVar = this.f73943w;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return g0(motionEvent);
        }
        tVar.a(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f73943w = null;
        }
        return true;
    }

    private boolean X1(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f73939t3;
        if (edgeEffect == null || androidx.core.widget.j.d(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z10 = false;
        } else {
            androidx.core.widget.j.j(this.f73939t3, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        }
        EdgeEffect edgeEffect2 = this.f73942v3;
        if (edgeEffect2 != null && androidx.core.widget.j.d(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            androidx.core.widget.j.j(this.f73942v3, 0.0f, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.f73940u3;
        if (edgeEffect3 != null && androidx.core.widget.j.d(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            androidx.core.widget.j.j(this.f73940u3, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.f73944w3;
        if (edgeEffect4 == null || androidx.core.widget.j.d(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z10;
        }
        androidx.core.widget.j.j(this.f73944w3, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void Y0(int i10, int i11, @p0 MotionEvent motionEvent, int i12) {
        p pVar = this.f73926n;
        if (pVar == null || this.f73916i3) {
            return;
        }
        int[] iArr = this.f73902c4;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zS = pVar.s();
        boolean zT = this.f73926n.t();
        int i13 = zT ? (zS ? 1 : 0) | 2 : zS ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iU1 = i10 - u1(i10, height);
        int iV1 = i11 - v1(i11, width);
        f(i13, i12);
        if (b(zS ? iU1 : 0, zT ? iV1 : 0, this.f73902c4, this.f73898a4, i12)) {
            int[] iArr2 = this.f73902c4;
            iU1 -= iArr2[0];
            iV1 -= iArr2[1];
        }
        K1(zS ? iU1 : 0, zT ? iV1 : 0, motionEvent, i12);
        androidx.recyclerview.widget.n nVar = this.N3;
        if (nVar != null && (iU1 != 0 || iV1 != 0)) {
            nVar.f(this, iU1, iV1);
        }
        c(i12);
    }

    private void a2() {
        this.M3.f();
        p pVar = this.f73926n;
        if (pVar != null) {
            pVar.m2();
        }
    }

    private boolean g0(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f73941v.size();
        for (int i10 = 0; i10 < size; i10++) {
            t tVar = this.f73941v.get(i10);
            if (tVar.c(this, motionEvent) && action != 3) {
                this.f73943w = tVar;
                int i11 = 7 ^ 1;
                return true;
            }
        }
        return false;
    }

    private w0 getScrollingChildHelper() {
        if (this.Z3 == null) {
            this.Z3 = new w0(this);
        }
        return this.Z3;
    }

    private void h0(int[] iArr) {
        int iG = this.f73907f.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < iG; i12++) {
            g0 g0VarX0 = x0(this.f73907f.f(i12));
            if (!g0VarX0.shouldIgnore()) {
                int layoutPosition = g0VarX0.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    @p0
    static RecyclerView i0(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView recyclerViewI0 = i0(viewGroup.getChildAt(i10));
            if (recyclerViewI0 != null) {
                return recyclerViewI0;
            }
        }
        return null;
    }

    @p0
    private View j0() {
        g0 g0VarK0;
        g0 g0VarK1;
        c0 c0Var = this.P3;
        int i10 = c0Var.f73982m;
        if (i10 == -1) {
            i10 = 0;
        }
        int iD = c0Var.d();
        for (int i11 = i10; i11 < iD && (g0VarK1 = k0(i11)) != null; i11++) {
            if (g0VarK1.itemView.hasFocusable()) {
                return g0VarK1.itemView;
            }
        }
        for (int iMin = Math.min(iD, i10) - 1; iMin >= 0 && (g0VarK0 = k0(iMin)) != null; iMin--) {
            if (g0VarK0.itemView.hasFocusable()) {
                return g0VarK0.itemView;
            }
        }
        return null;
    }

    private void j1(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f73947z3) {
            if (actionIndex == 0) {
                i10 = 1;
                int i11 = 6 << 1;
            } else {
                i10 = 0;
            }
            this.f73947z3 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.D3 = x10;
            this.B3 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.E3 = y10;
            this.C3 = y10;
        }
    }

    private void m(g0 g0Var) {
        View view = g0Var.itemView;
        boolean z10 = view.getParent() == this;
        this.f73901c.P(w0(view));
        if (g0Var.isTmpDetached()) {
            this.f73907f.c(view, -1, view.getLayoutParams(), true);
        } else if (z10) {
            this.f73907f.k(view);
        } else {
            this.f73907f.b(view, true);
        }
    }

    private boolean n1() {
        return this.f73945x3 != null && this.f73926n.n2();
    }

    private void o1() {
        boolean z10;
        if (this.f73929o3) {
            this.f73905e.z();
            if (this.f73933p3) {
                this.f73926n.n1(this);
            }
        }
        if (n1()) {
            this.f73905e.x();
        } else {
            this.f73905e.k();
        }
        boolean z11 = this.S3 || this.T3;
        this.P3.f73980k = this.f73932p2 && this.f73945x3 != null && ((z10 = this.f73929o3) || z11 || this.f73926n.f74030h) && (!z10 || this.f73924m.hasStableIds());
        c0 c0Var = this.P3;
        c0Var.f73981l = c0Var.f73980k && z11 && !this.f73929o3 && n1();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:13:0x005f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX WARN: Code duplicated, block: B:16:0x0081  */
    private void q1(float f10, float f11, float f12, float f13) {
        boolean z10;
        boolean z11 = true;
        if (f11 >= 0.0f) {
            if (f11 > 0.0f) {
                Z();
                androidx.core.widget.j.j(this.f73942v3, f11 / getWidth(), f12 / getHeight());
            } else {
                z10 = false;
            }
            if (f13 < 0.0f) {
                a0();
                androidx.core.widget.j.j(this.f73940u3, (-f13) / getHeight(), f10 / getWidth());
            } else if (f13 > 0.0f) {
                X();
                androidx.core.widget.j.j(this.f73944w3, f13 / getHeight(), 1.0f - (f10 / getWidth()));
            } else {
                z11 = z10;
            }
            if (z11 && f11 == 0.0f && f13 == 0.0f) {
                return;
            }
            u1.s1(this);
        }
        Y();
        androidx.core.widget.j.j(this.f73939t3, (-f11) / getWidth(), 1.0f - (f12 / getHeight()));
        z10 = true;
        if (f13 < 0.0f) {
            a0();
            androidx.core.widget.j.j(this.f73940u3, (-f13) / getHeight(), f10 / getWidth());
        } else if (f13 > 0.0f) {
            X();
            androidx.core.widget.j.j(this.f73944w3, f13 / getHeight(), 1.0f - (f10 / getWidth()));
        } else {
            z11 = z10;
        }
        if (z11) {
        }
        u1.s1(this);
    }

    private void s1() {
        View viewFindViewById;
        if (!this.L3 || this.f73924m == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f73892v4 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f73907f.n(focusedChild)) {
                    return;
                }
            } else if (this.f73907f.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewJ0 = null;
        g0 g0VarL0 = (this.P3.f73983n == -1 || !this.f73924m.hasStableIds()) ? null : l0(this.P3.f73983n);
        if (g0VarL0 != null && !this.f73907f.n(g0VarL0.itemView) && g0VarL0.itemView.hasFocusable()) {
            viewJ0 = g0VarL0.itemView;
        } else if (this.f73907f.g() > 0) {
            viewJ0 = j0();
        }
        if (viewJ0 != null) {
            int i10 = this.P3.f73984o;
            if (i10 != -1 && (viewFindViewById = viewJ0.findViewById(i10)) != null && viewFindViewById.isFocusable()) {
                viewJ0 = viewFindViewById;
            }
            viewJ0.requestFocus();
        }
    }

    private void t1() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f73939t3;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f73939t3.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f73940u3;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f73940u3.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f73942v3;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f73942v3.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f73944w3;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f73944w3.isFinished();
        }
        if (zIsFinished) {
            u1.s1(this);
        }
    }

    private void u(@NonNull g0 g0Var, @NonNull g0 g0Var2, @NonNull m.d dVar, @NonNull m.d dVar2, boolean z10, boolean z11) {
        g0Var.setIsRecyclable(false);
        if (z10) {
            m(g0Var);
        }
        if (g0Var != g0Var2) {
            if (z11) {
                m(g0Var2);
            }
            g0Var.mShadowedHolder = g0Var2;
            m(g0Var);
            this.f73901c.P(g0Var);
            g0Var2.setIsRecyclable(false);
            g0Var2.mShadowingHolder = g0Var;
        }
        if (this.f73945x3.b(g0Var, g0Var2, dVar, dVar2)) {
            m1();
        }
    }

    private int u1(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.f73939t3;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.j.d(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f73942v3;
            if (edgeEffect2 != null && androidx.core.widget.j.d(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.f73942v3.onRelease();
                } else {
                    float fJ = androidx.core.widget.j.j(this.f73942v3, width, height);
                    if (androidx.core.widget.j.d(this.f73942v3) == 0.0f) {
                        this.f73942v3.onRelease();
                    }
                    f11 = fJ;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.f73939t3.onRelease();
            } else {
                float f12 = -androidx.core.widget.j.j(this.f73939t3, -width, 1.0f - height);
                if (androidx.core.widget.j.d(this.f73939t3) == 0.0f) {
                    this.f73939t3.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    private int v1(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.f73940u3;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.j.d(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.f73944w3;
            if (edgeEffect2 != null && androidx.core.widget.j.d(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.f73944w3.onRelease();
                } else {
                    float fJ = androidx.core.widget.j.j(this.f73944w3, height, 1.0f - width);
                    if (androidx.core.widget.j.d(this.f73944w3) == 0.0f) {
                        this.f73944w3.onRelease();
                    }
                    f11 = fJ;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.f73940u3.onRelease();
            } else {
                float f12 = -androidx.core.widget.j.j(this.f73940u3, -height, width);
                if (androidx.core.widget.j.d(this.f73940u3) == 0.0f) {
                    this.f73940u3.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    static g0 x0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f74047a;
    }

    private void z() {
        H1();
        setScrollState(0);
    }

    static void z0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f74048b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    public void A1(@NonNull r rVar) {
        List<r> list = this.f73927n3;
        if (list == null) {
            return;
        }
        list.remove(rVar);
    }

    void B() {
        int iJ = this.f73907f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            g0 g0VarX0 = x0(this.f73907f.i(i10));
            if (!g0VarX0.shouldIgnore()) {
                g0VarX0.clearOldPosition();
            }
        }
        this.f73901c.e();
    }

    public void B1(@NonNull t tVar) {
        this.f73941v.remove(tVar);
        if (this.f73943w == tVar) {
            this.f73943w = null;
        }
    }

    public void C() {
        List<r> list = this.f73927n3;
        if (list != null) {
            list.clear();
        }
    }

    Rect C0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f74049c) {
            return qVar.f74048b;
        }
        if (this.P3.j() && (qVar.f() || qVar.h())) {
            return qVar.f74048b;
        }
        Rect rect = qVar.f74048b;
        rect.set(0, 0, 0, 0);
        int size = this.f73938t.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f73918j.set(0, 0, 0, 0);
            this.f73938t.get(i10).getItemOffsets(this.f73918j, view, this, this.P3);
            int i11 = rect.left;
            Rect rect2 = this.f73918j;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f74049c = false;
        return rect;
    }

    public void C1(@NonNull u uVar) {
        List<u> list = this.R3;
        if (list != null) {
            list.remove(uVar);
        }
    }

    public void D() {
        List<u> list = this.R3;
        if (list != null) {
            list.clear();
        }
    }

    @NonNull
    public o D0(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.f73938t.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void D1(@NonNull y yVar) {
        this.f73936s.remove(yVar);
    }

    void E(int i10, int i11) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f73939t3;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            zIsFinished = false;
        } else {
            this.f73939t3.onRelease();
            zIsFinished = this.f73939t3.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f73942v3;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f73942v3.onRelease();
            zIsFinished |= this.f73942v3.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f73940u3;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f73940u3.onRelease();
            zIsFinished |= this.f73940u3.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f73944w3;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f73944w3.onRelease();
            zIsFinished |= this.f73944w3.isFinished();
        }
        if (zIsFinished) {
            u1.s1(this);
        }
    }

    void E1() {
        g0 g0Var;
        int iG = this.f73907f.g();
        for (int i10 = 0; i10 < iG; i10++) {
            View viewF = this.f73907f.f(i10);
            g0 g0VarW0 = w0(viewF);
            if (g0VarW0 != null && (g0Var = g0VarW0.mShadowingHolder) != null) {
                View view = g0Var.itemView;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    int F(int i10) {
        return G(i10, this.f73939t3, this.f73942v3, getWidth());
    }

    public boolean G0() {
        return this.f73931p1;
    }

    int H(int i10) {
        return G(i10, this.f73940u3, this.f73944w3, getHeight());
    }

    public boolean H0() {
        if (this.f73932p2 && !this.f73929o3 && !this.f73905e.q()) {
            return false;
        }
        return true;
    }

    void I() {
        if (!this.f73932p2 || this.f73929o3) {
            q0.b(K4);
            P();
            q0.d();
            return;
        }
        if (this.f73905e.q()) {
            if (this.f73905e.p(4) && !this.f73905e.p(11)) {
                q0.b(L4);
                W1();
                g1();
                this.f73905e.x();
                if (!this.f73913h3) {
                    if (I0()) {
                        P();
                    } else {
                        this.f73905e.j();
                    }
                }
                Y1(true);
                h1();
                q0.d();
                return;
            }
            if (this.f73905e.q()) {
                q0.b(K4);
                P();
                q0.d();
            }
        }
    }

    void J0() {
        this.f73905e = new androidx.recyclerview.widget.a(new f());
    }

    void J1() {
        int iJ = this.f73907f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            g0 g0VarX0 = x0(this.f73907f.i(i10));
            if (!g0VarX0.shouldIgnore()) {
                g0VarX0.saveOldPosition();
            }
        }
    }

    void K(int i10, int i11) {
        setMeasuredDimension(p.v(i10, getPaddingLeft() + getPaddingRight(), u1.i0(this)), p.v(i11, getPaddingTop() + getPaddingBottom(), u1.h0(this)));
    }

    boolean K1(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        I();
        if (this.f73924m != null) {
            int[] iArr = this.f73902c4;
            iArr[0] = 0;
            iArr[1] = 0;
            L1(i10, i11, iArr);
            int[] iArr2 = this.f73902c4;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i15 = i10 - i17;
            i16 = i11 - i18;
            i14 = i18;
            i13 = i17;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.f73938t.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f73902c4;
        iArr3[0] = 0;
        iArr3[1] = 0;
        d(i13, i14, i15, i16, this.f73898a4, i12, iArr3);
        int[] iArr4 = this.f73902c4;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        boolean z10 = (i19 == 0 && i21 == 0) ? false : true;
        int i23 = this.D3;
        int[] iArr5 = this.f73898a4;
        int i24 = iArr5[0];
        this.D3 = i23 - i24;
        int i25 = this.E3;
        int i26 = iArr5[1];
        this.E3 = i25 - i26;
        int[] iArr6 = this.f73900b4;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !s0.l(motionEvent, 8194)) {
                q1(motionEvent.getX(), i20, motionEvent.getY(), i22);
            }
            E(i10, i11);
        }
        if (i13 != 0 || i14 != 0) {
            U(i13, i14);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z10 && i13 == 0 && i14 == 0) ? false : true;
    }

    void L1(int i10, int i11, @p0 int[] iArr) {
        W1();
        g1();
        q0.b(I4);
        c0(this.P3);
        int iU1 = i10 != 0 ? this.f73926n.U1(i10, this.f73901c, this.P3) : 0;
        int iW1 = i11 != 0 ? this.f73926n.W1(i11, this.f73901c, this.P3) : 0;
        q0.d();
        E1();
        h1();
        Y1(false);
        if (iArr != null) {
            iArr[0] = iU1;
            iArr[1] = iW1;
        }
    }

    void M(View view) {
        g0 g0VarX0 = x0(view);
        e1(view);
        h hVar = this.f73924m;
        if (hVar != null && g0VarX0 != null) {
            hVar.onViewAttachedToWindow(g0VarX0);
        }
        List<r> list = this.f73927n3;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f73927n3.get(size).d(view);
            }
        }
    }

    @l1
    void M0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(p3.a.b.f340750a), resources.getDimensionPixelSize(p3.a.b.f340752c), resources.getDimensionPixelOffset(p3.a.b.f340751b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + b0());
        }
    }

    public void M1(int i10) {
        if (this.f73916i3) {
            return;
        }
        Z1();
        p pVar = this.f73926n;
        if (pVar == null) {
            return;
        }
        pVar.V1(i10);
        awakenScrollBars();
    }

    void N(View view) {
        g0 g0VarX0 = x0(view);
        f1(view);
        h hVar = this.f73924m;
        if (hVar != null && g0VarX0 != null) {
            hVar.onViewDetachedFromWindow(g0VarX0);
        }
        List<r> list = this.f73927n3;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f73927n3.get(size).b(view);
            }
        }
    }

    void N0() {
        this.f73944w3 = null;
        this.f73940u3 = null;
        this.f73942v3 = null;
        this.f73939t3 = null;
    }

    public void O0() {
        if (this.f73938t.size() == 0) {
            return;
        }
        p pVar = this.f73926n;
        if (pVar != null) {
            pVar.n("Cannot invalidate item decorations during a scroll or layout");
        }
        V0();
        requestLayout();
    }

    @l1
    boolean O1(g0 g0Var, int i10) {
        if (!R0()) {
            u1.Y1(g0Var.itemView, i10);
            return true;
        }
        g0Var.mPendingAccessibilityState = i10;
        this.f73904d4.add(g0Var);
        return false;
    }

    void P() {
        if (this.f73924m != null && this.f73926n != null) {
            this.P3.f73979j = false;
            boolean z10 = this.f73908f4 && !(this.f73911g4 == getWidth() && this.f73914h4 == getHeight());
            this.f73911g4 = 0;
            this.f73914h4 = 0;
            this.f73908f4 = false;
            if (this.P3.f73974e == 1) {
                Q();
                this.f73926n.Y1(this);
                R();
            } else if (this.f73905e.r() || z10 || this.f73926n.D0() != getWidth() || this.f73926n.j0() != getHeight()) {
                this.f73926n.Y1(this);
                R();
            } else {
                this.f73926n.Y1(this);
            }
            S();
        }
    }

    boolean P0() {
        AccessibilityManager accessibilityManager = this.f73925m3;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean Q0() {
        m mVar = this.f73945x3;
        return mVar != null && mVar.q();
    }

    boolean Q1(AccessibilityEvent accessibilityEvent) {
        if (!R0()) {
            return false;
        }
        int iD = accessibilityEvent != null ? androidx.core.view.accessibility.b.d(accessibilityEvent) : 0;
        this.f73921k3 |= iD != 0 ? iD : 0;
        return true;
    }

    public boolean R0() {
        return this.f73934q3 > 0;
    }

    public void R1(@androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11) {
        S1(i10, i11, null);
    }

    @Deprecated
    public boolean S0() {
        return isLayoutSuppressed();
    }

    public void S1(@androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @p0 Interpolator interpolator) {
        T1(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    void T(int i10) {
        p pVar = this.f73926n;
        if (pVar != null) {
            pVar.z1(i10);
        }
        k1(i10);
        u uVar = this.Q3;
        if (uVar != null) {
            uVar.a(this, i10);
        }
        List<u> list = this.R3;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.R3.get(size).a(this, i10);
            }
        }
    }

    public void T1(@androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @p0 Interpolator interpolator, int i12) {
        U1(i10, i11, interpolator, i12, false);
    }

    void U(int i10, int i11) {
        this.f73935r3++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        l1(i10, i11);
        u uVar = this.Q3;
        if (uVar != null) {
            uVar.b(this, i10, i11);
        }
        List<u> list = this.R3;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.R3.get(size).b(this, i10, i11);
            }
        }
        this.f73935r3--;
    }

    void U0(int i10) {
        if (this.f73926n == null) {
            return;
        }
        setScrollState(2);
        this.f73926n.V1(i10);
        awakenScrollBars();
    }

    void U1(@androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11, @p0 Interpolator interpolator, int i12, boolean z10) {
        p pVar = this.f73926n;
        if (pVar == null || this.f73916i3) {
            return;
        }
        if (!pVar.s()) {
            i10 = 0;
        }
        if (!this.f73926n.t()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 != Integer.MIN_VALUE && i12 <= 0) {
            scrollBy(i10, i11);
            return;
        }
        if (z10) {
            int i13 = i10 != 0 ? 1 : 0;
            if (i11 != 0) {
                i13 |= 2;
            }
            f(i13, 1);
        }
        this.M3.e(i10, i11, i12, interpolator);
    }

    void V() {
        int i10;
        int size = this.f73904d4.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f73904d4.clear();
                return;
            }
            g0 g0Var = this.f73904d4.get(size);
            if (g0Var.itemView.getParent() == this && !g0Var.shouldIgnore() && (i10 = g0Var.mPendingAccessibilityState) != -1) {
                u1.Y1(g0Var.itemView, i10);
                g0Var.mPendingAccessibilityState = -1;
            }
        }
    }

    void V0() {
        int iJ = this.f73907f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            ((q) this.f73907f.i(i10).getLayoutParams()).f74049c = true;
        }
        this.f73901c.t();
    }

    public void V1(int i10) {
        p pVar;
        if (this.f73916i3 || (pVar = this.f73926n) == null) {
            return;
        }
        pVar.j2(this, this.P3, i10);
    }

    void W0() {
        int iJ = this.f73907f.j();
        for (int i10 = 0; i10 < iJ; i10++) {
            g0 g0VarX0 = x0(this.f73907f.i(i10));
            if (g0VarX0 != null && !g0VarX0.shouldIgnore()) {
                g0VarX0.addFlags(6);
            }
        }
        V0();
        this.f73901c.u();
    }

    void W1() {
        int i10 = this.f73910g3 + 1;
        this.f73910g3 = i10;
        if (i10 != 1 || this.f73916i3) {
            return;
        }
        this.f73913h3 = false;
    }

    void X() {
        if (this.f73944w3 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f73937s3.a(this, 3);
        this.f73944w3 = edgeEffectA;
        if (this.f73912h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void X0(int i10, int i11) {
        Y0(i10, i11, null, 1);
    }

    void Y() {
        if (this.f73939t3 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f73937s3.a(this, 0);
        this.f73939t3 = edgeEffectA;
        if (this.f73912h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void Y1(boolean z10) {
        if (this.f73910g3 < 1) {
            this.f73910g3 = 1;
        }
        if (!z10 && !this.f73916i3) {
            this.f73913h3 = false;
        }
        if (this.f73910g3 == 1) {
            if (z10 && this.f73913h3 && !this.f73916i3 && this.f73926n != null && this.f73924m != null) {
                P();
            }
            if (!this.f73916i3) {
                this.f73913h3 = false;
            }
        }
        this.f73910g3--;
    }

    void Z() {
        if (this.f73942v3 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f73937s3.a(this, 2);
        this.f73942v3 = edgeEffectA;
        if (this.f73912h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void Z0(@androidx.annotation.t0 int i10) {
        int iG = this.f73907f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f73907f.f(i11).offsetLeftAndRight(i10);
        }
    }

    public void Z1() {
        setScrollState(0);
        a2();
    }

    void a0() {
        if (this.f73940u3 != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f73937s3.a(this, 1);
        this.f73940u3 = edgeEffectA;
        if (this.f73912h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void a1(@androidx.annotation.t0 int i10) {
        int iG = this.f73907f.g();
        for (int i11 = 0; i11 < iG; i11++) {
            this.f73907f.f(i11).offsetTopAndBottom(i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        p pVar = this.f73926n;
        if (pVar != null && pVar.a1(this, arrayList, i10, i11)) {
            return;
        }
        super.addFocusables(arrayList, i10, i11);
    }

    @Override // androidx.core.view.t0
    public boolean b(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().d(i10, i11, iArr, iArr2, i12);
    }

    String b0() {
        return " " + super.toString() + ", adapter:" + this.f73924m + ", layout:" + this.f73926n + ", context:" + getContext();
    }

    void b1(int i10, int i11) {
        int iJ = this.f73907f.j();
        for (int i12 = 0; i12 < iJ; i12++) {
            g0 g0VarX0 = x0(this.f73907f.i(i12));
            if (g0VarX0 != null && !g0VarX0.shouldIgnore() && g0VarX0.mPosition >= i10) {
                g0VarX0.offsetPosition(i11, false);
                this.P3.f73976g = true;
            }
        }
        this.f73901c.w(i10, i11);
        requestLayout();
    }

    public void b2(@p0 h hVar, boolean z10) {
        setLayoutFrozen(false);
        N1(hVar, true, z10);
        p1(true);
        requestLayout();
    }

    @Override // androidx.core.view.t0
    public void c(int i10) {
        getScrollingChildHelper().u(i10);
    }

    final void c0(c0 c0Var) {
        if (getScrollState() != 2) {
            c0Var.f73985p = 0;
            c0Var.f73986q = 0;
        } else {
            OverScroller overScroller = this.M3.f73992c;
            c0Var.f73985p = overScroller.getFinalX() - overScroller.getCurrX();
            c0Var.f73986q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    void c1(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int iJ = this.f73907f.j();
        if (i10 < i11) {
            i14 = -1;
            i13 = i10;
            i12 = i11;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i16 = 0; i16 < iJ; i16++) {
            g0 g0VarX0 = x0(this.f73907f.i(i16));
            if (g0VarX0 != null && (i15 = g0VarX0.mPosition) >= i13 && i15 <= i12) {
                if (i15 == i10) {
                    g0VarX0.offsetPosition(i11 - i10, false);
                } else {
                    g0VarX0.offsetPosition(i14, false);
                }
                this.P3.f73976g = true;
            }
        }
        this.f73901c.x(i10, i11);
        requestLayout();
    }

    void c2(int i10, int i11, Object obj) {
        int i12;
        int iJ = this.f73907f.j();
        int i13 = i10 + i11;
        for (int i14 = 0; i14 < iJ; i14++) {
            View viewI = this.f73907f.i(i14);
            g0 g0VarX0 = x0(viewI);
            if (g0VarX0 != null && !g0VarX0.shouldIgnore() && (i12 = g0VarX0.mPosition) >= i10 && i12 < i13) {
                g0VarX0.addFlags(2);
                g0VarX0.addChangePayload(obj);
                ((q) viewI.getLayoutParams()).f74049c = true;
            }
        }
        this.f73901c.S(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.f73926n.u((q) layoutParams);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        p pVar = this.f73926n;
        if (pVar != null && pVar.s()) {
            return this.f73926n.y(this.P3);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        p pVar = this.f73926n;
        if (pVar != null && pVar.s()) {
            return this.f73926n.z(this.P3);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        p pVar = this.f73926n;
        if (pVar != null && pVar.s()) {
            return this.f73926n.A(this.P3);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        p pVar = this.f73926n;
        if (pVar != null && pVar.t()) {
            return this.f73926n.B(this.P3);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        p pVar = this.f73926n;
        if (pVar != null && pVar.t()) {
            return this.f73926n.C(this.P3);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        p pVar = this.f73926n;
        if (pVar != null && pVar.t()) {
            return this.f73926n.D(this.P3);
        }
        return 0;
    }

    @Override // androidx.core.view.u0
    public final void d(int i10, int i11, int i12, int i13, int[] iArr, int i14, @NonNull int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @p0
    public View d0(float f10, float f11) {
        int iG = this.f73907f.g();
        while (true) {
            iG--;
            if (iG < 0) {
                return null;
            }
            View viewF = this.f73907f.f(iG);
            float translationX = viewF.getTranslationX();
            float translationY = viewF.getTranslationY();
            if (f10 >= viewF.getLeft() + translationX && f10 <= viewF.getRight() + translationX && f11 >= viewF.getTop() + translationY && f11 <= viewF.getBottom() + translationY) {
                return viewF;
            }
        }
    }

    void d1(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int iJ = this.f73907f.j();
        for (int i13 = 0; i13 < iJ; i13++) {
            g0 g0VarX0 = x0(this.f73907f.i(i13));
            if (g0VarX0 != null && !g0VarX0.shouldIgnore()) {
                int i14 = g0VarX0.mPosition;
                if (i14 >= i12) {
                    g0VarX0.offsetPosition(-i11, z10);
                    this.P3.f73976g = true;
                } else if (i14 >= i10) {
                    g0VarX0.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.P3.f73976g = true;
                }
            }
        }
        this.f73901c.y(i10, i11, z10);
        requestLayout();
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        int size = this.f73938t.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.f73938t.get(i10).onDrawOver(canvas, this, this.P3);
        }
        EdgeEffect edgeEffect = this.f73939t3;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f73912h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f73939t3;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f73940u3;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f73912h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f73940u3;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f73942v3;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f73912h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f73942v3;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f73944w3;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f73912h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f73944w3;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(iSave4);
        }
        if ((z10 || this.f73945x3 == null || this.f73938t.size() <= 0 || !this.f73945x3.q()) ? z10 : true) {
            u1.s1(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    @Override // androidx.core.view.t0
    public boolean e(int i10) {
        return getScrollingChildHelper().l(i10);
    }

    @p0
    public View e0(@NonNull View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public void e1(@NonNull View view) {
    }

    @Override // androidx.core.view.t0
    public boolean f(int i10, int i11) {
        return getScrollingChildHelper().s(i10, i11);
    }

    @p0
    public g0 f0(@NonNull View view) {
        View viewE0 = e0(view);
        if (viewE0 == null) {
            return null;
        }
        return w0(viewE0);
    }

    public void f1(@NonNull View view) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        View viewE1;
        boolean z10;
        View viewL1 = this.f73926n.l1(view, i10);
        if (viewL1 != null) {
            return viewL1;
        }
        boolean z11 = (this.f73924m == null || this.f73926n == null || R0() || this.f73916i3) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z11 && (i10 == 2 || i10 == 1)) {
            if (this.f73926n.t()) {
                int i11 = i10 == 2 ? 130 : 33;
                z10 = focusFinder.findNextFocus(this, view, i11) == null;
                if (f73891u4) {
                    i10 = i11;
                }
            } else {
                z10 = false;
            }
            if (!z10 && this.f73926n.s()) {
                int i12 = (this.f73926n.m0() == 1) ^ (i10 == 2) ? 66 : 17;
                boolean z12 = focusFinder.findNextFocus(this, view, i12) == null;
                if (f73891u4) {
                    i10 = i12;
                }
                z10 = z12;
            }
            if (z10) {
                I();
                if (e0(view) == null) {
                    return null;
                }
                W1();
                this.f73926n.e1(view, i10, this.f73901c, this.P3);
                Y1(false);
            }
            viewE1 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (viewFindNextFocus == null && z11) {
                I();
                if (e0(view) == null) {
                    return null;
                }
                W1();
                viewE1 = this.f73926n.e1(view, i10, this.f73901c, this.P3);
                Y1(false);
            } else {
                viewE1 = viewFindNextFocus;
            }
        }
        if (viewE1 == null || viewE1.hasFocusable()) {
            return T0(view, viewE1, i10) ? viewE1 : super.focusSearch(view, i10);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i10);
        }
        F1(viewE1, null);
        return view;
    }

    @Override // androidx.core.view.t0
    public boolean g(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().g(i10, i11, i12, i13, iArr, i14);
    }

    void g1() {
        this.f73934q3++;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.f73926n;
        if (pVar != null) {
            return pVar.P();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + b0());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.f73926n;
        if (pVar != null) {
            return pVar.Q(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + b0());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @p0
    public h getAdapter() {
        return this.f73924m;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.f73926n;
        return pVar != null ? pVar.S() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        k kVar = this.X3;
        return kVar == null ? super.getChildDrawingOrder(i10, i11) : kVar.a(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f73912h;
    }

    @p0
    public androidx.recyclerview.widget.b0 getCompatAccessibilityDelegate() {
        return this.W3;
    }

    @NonNull
    public l getEdgeEffectFactory() {
        return this.f73937s3;
    }

    @p0
    public m getItemAnimator() {
        return this.f73945x3;
    }

    public int getItemDecorationCount() {
        return this.f73938t.size();
    }

    @p0
    public p getLayoutManager() {
        return this.f73926n;
    }

    public int getMaxFlingVelocity() {
        return this.I3;
    }

    public int getMinFlingVelocity() {
        return this.H3;
    }

    long getNanoTime() {
        if (f73890t4) {
            return System.nanoTime();
        }
        return 0L;
    }

    @p0
    public s getOnFlingListener() {
        return this.G3;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.L3;
    }

    @NonNull
    public w getRecycledViewPool() {
        return this.f73901c.j();
    }

    public int getScrollState() {
        return this.f73946y3;
    }

    void h(int i10, int i11) {
        if (i10 < 0) {
            Y();
            if (this.f73939t3.isFinished()) {
                this.f73939t3.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            Z();
            if (this.f73942v3.isFinished()) {
                this.f73942v3.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            a0();
            if (this.f73940u3.isFinished()) {
                this.f73940u3.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            X();
            if (this.f73944w3.isFinished()) {
                this.f73944w3.onAbsorb(i11);
            }
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        u1.s1(this);
    }

    void h1() {
        i1(true);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    void i1(boolean z10) {
        int i10 = this.f73934q3 - 1;
        this.f73934q3 = i10;
        if (i10 < 1) {
            this.f73934q3 = 0;
            if (z10) {
                O();
                V();
            }
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f73930p0;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f73916i3;
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    @p0
    public g0 k0(int i10) {
        g0 g0Var = null;
        if (this.f73929o3) {
            return null;
        }
        int iJ = this.f73907f.j();
        for (int i11 = 0; i11 < iJ; i11++) {
            g0 g0VarX0 = x0(this.f73907f.i(i11));
            if (g0VarX0 != null && !g0VarX0.isRemoved() && q0(g0VarX0) == i10) {
                if (!this.f73907f.n(g0VarX0.itemView)) {
                    return g0VarX0;
                }
                g0Var = g0VarX0;
            }
        }
        return g0Var;
    }

    public void k1(int i10) {
    }

    public g0 l0(long j10) {
        h hVar = this.f73924m;
        g0 g0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int iJ = this.f73907f.j();
            for (int i10 = 0; i10 < iJ; i10++) {
                g0 g0VarX0 = x0(this.f73907f.i(i10));
                if (g0VarX0 != null && !g0VarX0.isRemoved() && g0VarX0.getItemId() == j10) {
                    if (!this.f73907f.n(g0VarX0.itemView)) {
                        return g0VarX0;
                    }
                    g0Var = g0VarX0;
                }
            }
        }
        return g0Var;
    }

    public void l1(@androidx.annotation.t0 int i10, @androidx.annotation.t0 int i11) {
    }

    @p0
    public g0 m0(int i10) {
        return o0(i10, false);
    }

    void m1() {
        if (!this.V3 && this.f73930p0) {
            u1.u1(this, this.f73906e4);
            this.V3 = true;
        }
    }

    public void n(@NonNull o oVar) {
        o(oVar, -1);
    }

    @p0
    @Deprecated
    public g0 n0(int i10) {
        return o0(i10, false);
    }

    public void o(@NonNull o oVar, int i10) {
        p pVar = this.f73926n;
        if (pVar != null) {
            pVar.n("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f73938t.isEmpty()) {
            boolean z10 = false;
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.f73938t.add(oVar);
        } else {
            this.f73938t.add(i10, oVar);
        }
        V0();
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x003d A[SYNTHETIC] */
    @p0
    g0 o0(int i10, boolean z10) {
        int iJ = this.f73907f.j();
        g0 g0Var = null;
        for (int i11 = 0; i11 < iJ; i11++) {
            g0 g0VarX0 = x0(this.f73907f.i(i11));
            if (g0VarX0 != null && !g0VarX0.isRemoved()) {
                if (z10) {
                    if (g0VarX0.mPosition != i10) {
                        continue;
                    } else {
                        if (this.f73907f.n(g0VarX0.itemView)) {
                            return g0VarX0;
                        }
                        g0Var = g0VarX0;
                    }
                } else if (g0VarX0.getLayoutPosition() != i10) {
                    continue;
                } else {
                    if (this.f73907f.n(g0VarX0.itemView)) {
                        return g0VarX0;
                    }
                    g0Var = g0VarX0;
                }
            }
        }
        return g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.f73934q3 = 0;
        this.f73930p0 = true;
        this.f73932p2 = this.f73932p2 && !isLayoutRequested();
        this.f73901c.A();
        p pVar = this.f73926n;
        if (pVar != null) {
            pVar.K(this);
        }
        this.V3 = false;
        if (f73890t4) {
            ThreadLocal<androidx.recyclerview.widget.n> threadLocal = androidx.recyclerview.widget.n.f74453e;
            androidx.recyclerview.widget.n nVar = threadLocal.get();
            this.N3 = nVar;
            if (nVar == null) {
                this.N3 = new androidx.recyclerview.widget.n();
                Display displayS = u1.S(this);
                if (isInEditMode() || displayS == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayS.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                androidx.recyclerview.widget.n nVar2 = this.N3;
                nVar2.f74457c = (long) (1.0E9f / refreshRate);
                threadLocal.set(nVar2);
            }
            this.N3.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.n nVar;
        super.onDetachedFromWindow();
        m mVar = this.f73945x3;
        if (mVar != null) {
            mVar.l();
        }
        Z1();
        this.f73930p0 = false;
        p pVar = this.f73926n;
        if (pVar != null) {
            pVar.L(this, this.f73901c);
        }
        this.f73904d4.clear();
        removeCallbacks(this.f73906e4);
        this.f73909g.j();
        this.f73901c.B();
        androidx.customview.poolingcontainer.a.c(this);
        if (!f73890t4 || (nVar = this.N3) == null) {
            return;
        }
        nVar.j(this);
        this.N3 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f73938t.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f73938t.get(i10).onDraw(canvas, this, this.P3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.f73926n != null && !this.f73916i3) {
            if (motionEvent.getAction() == 8) {
                if ((motionEvent.getSource() & 2) != 0) {
                    f10 = this.f73926n.t() ? -motionEvent.getAxisValue(9) : 0.0f;
                    axisValue = this.f73926n.s() ? motionEvent.getAxisValue(10) : 0.0f;
                } else if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue2 = motionEvent.getAxisValue(26);
                    if (this.f73926n.t()) {
                        f10 = -axisValue2;
                    } else if (this.f73926n.s()) {
                        axisValue = axisValue2;
                        f10 = 0.0f;
                    } else {
                        f10 = 0.0f;
                        axisValue = 0.0f;
                    }
                } else {
                    f10 = 0.0f;
                    axisValue = 0.0f;
                }
                if (f10 != 0.0f || axisValue != 0.0f) {
                    Y0((int) (axisValue * this.J3), (int) (f10 * this.K3), motionEvent, 1);
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.f73916i3) {
            return false;
        }
        this.f73943w = null;
        if (g0(motionEvent)) {
            z();
            return true;
        }
        p pVar = this.f73926n;
        if (pVar == null) {
            return false;
        }
        boolean zS = pVar.s();
        boolean zT = this.f73926n.t();
        if (this.A3 == null) {
            this.A3 = VelocityTracker.obtain();
        }
        this.A3.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f73919j3) {
                this.f73919j3 = false;
            }
            this.f73947z3 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.D3 = x10;
            this.B3 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.E3 = y10;
            this.C3 = y10;
            if (X1(motionEvent) || this.f73946y3 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                c(1);
            }
            int[] iArr = this.f73900b4;
            iArr[1] = 0;
            iArr[0] = 0;
            int i10 = zS;
            if (zT) {
                i10 = (zS ? 1 : 0) | 2;
            }
            f(i10, 0);
        } else if (actionMasked == 1) {
            this.A3.clear();
            c(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f73947z3);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x11 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f73946y3 != 1) {
                int i11 = x11 - this.B3;
                int i12 = y11 - this.C3;
                if (!zS || Math.abs(i11) <= this.F3) {
                    z10 = false;
                } else {
                    this.D3 = x11;
                    z10 = true;
                }
                if (zT && Math.abs(i12) > this.F3) {
                    this.E3 = y11;
                    z10 = true;
                }
                if (z10) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            z();
        } else if (actionMasked == 5) {
            this.f73947z3 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.D3 = x12;
            this.B3 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.E3 = y12;
            this.C3 = y12;
        } else if (actionMasked == 6) {
            j1(motionEvent);
        }
        return this.f73946y3 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        q0.b(J4);
        P();
        q0.d();
        this.f73932p2 = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        p pVar = this.f73926n;
        if (pVar == null) {
            K(i10, i11);
            return;
        }
        boolean z10 = false;
        if (pVar.J0()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f73926n.u1(this.f73901c, this.P3, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.f73908f4 = z10;
            if (z10 || this.f73924m == null) {
                return;
            }
            if (this.P3.f73974e == 1) {
                Q();
            }
            this.f73926n.a2(i10, i11);
            this.P3.f73979j = true;
            R();
            this.f73926n.d2(i10, i11);
            if (this.f73926n.h2()) {
                this.f73926n.a2(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.P3.f73979j = true;
                R();
                this.f73926n.d2(i10, i11);
            }
            this.f73911g4 = getMeasuredWidth();
            this.f73914h4 = getMeasuredHeight();
            return;
        }
        if (this.f73931p1) {
            this.f73926n.u1(this.f73901c, this.P3, i10, i11);
            return;
        }
        if (this.f73923l3) {
            W1();
            g1();
            o1();
            h1();
            c0 c0Var = this.P3;
            if (c0Var.f73981l) {
                c0Var.f73977h = true;
            } else {
                this.f73905e.k();
                this.P3.f73977h = false;
            }
            this.f73923l3 = false;
            Y1(false);
        } else if (this.P3.f73981l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.f73924m;
        if (hVar != null) {
            this.P3.f73975f = hVar.getItemCount();
        } else {
            this.P3.f73975f = 0;
        }
        W1();
        this.f73926n.u1(this.f73901c, this.P3, i10, i11);
        Y1(false);
        this.P3.f73977h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (R0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f73903d = savedState;
        super.onRestoreInstanceState(savedState.a());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f73903d;
        if (savedState2 != null) {
            savedState.b(savedState2);
            return savedState;
        }
        p pVar = this.f73926n;
        if (pVar != null) {
            savedState.f73948c = pVar.y1();
            return savedState;
        }
        savedState.f73948c = null;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        N0();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c2 A[PHI: r1
      0x00c2: PHI (r1v46 int) = (r1v25 int), (r1v50 int) binds: [B:40:0x00ab, B:44:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        boolean z10;
        if (this.f73916i3 || this.f73919j3) {
            return false;
        }
        if (W(motionEvent)) {
            z();
            return true;
        }
        p pVar = this.f73926n;
        if (pVar == null) {
            return false;
        }
        boolean zS = pVar.s();
        boolean zT = this.f73926n.t();
        if (this.A3 == null) {
            this.A3 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.f73900b4;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.f73900b4;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.A3.addMovement(motionEventObtain);
                this.A3.computeCurrentVelocity(1000, this.I3);
                float f10 = zS ? -this.A3.getXVelocity(this.f73947z3) : 0.0f;
                float f11 = zT ? -this.A3.getYVelocity(this.f73947z3) : 0.0f;
                if ((f10 == 0.0f && f11 == 0.0f) || !p0((int) f10, (int) f11)) {
                    setScrollState(0);
                }
                H1();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f73947z3);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y10 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.D3 - x10;
                int iMax2 = this.E3 - y10;
                if (this.f73946y3 != 1) {
                    if (zS) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.F3) : Math.min(0, iMax + this.F3);
                        if (iMax != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (zT) {
                        iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.F3) : Math.min(0, iMax2 + this.F3);
                        if (iMax2 != 0) {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        setScrollState(1);
                    }
                }
                if (this.f73946y3 == 1) {
                    int[] iArr3 = this.f73902c4;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iU1 = iMax - u1(iMax, motionEvent.getY());
                    int iV1 = iMax2 - v1(iMax2, motionEvent.getX());
                    if (b(zS ? iU1 : 0, zT ? iV1 : 0, this.f73902c4, this.f73898a4, 0)) {
                        int[] iArr4 = this.f73902c4;
                        iU1 -= iArr4[0];
                        iV1 -= iArr4[1];
                        int[] iArr5 = this.f73900b4;
                        int i11 = iArr5[0];
                        int[] iArr6 = this.f73898a4;
                        iArr5[0] = i11 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.f73898a4;
                    this.D3 = x10 - iArr7[0];
                    this.E3 = y10 - iArr7[1];
                    if (K1(zS ? iU1 : 0, zT ? iV1 : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    androidx.recyclerview.widget.n nVar = this.N3;
                    if (nVar != null && (iU1 != 0 || iV1 != 0)) {
                        nVar.f(this, iU1, iV1);
                    }
                }
            } else if (actionMasked == 3) {
                z();
            } else if (actionMasked == 5) {
                this.f73947z3 = motionEvent.getPointerId(actionIndex);
                int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.D3 = x11;
                this.B3 = x11;
                int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.E3 = y11;
                this.C3 = y11;
            } else if (actionMasked == 6) {
                j1(motionEvent);
            }
            motionEventObtain.recycle();
            return true;
        }
        this.f73947z3 = motionEvent.getPointerId(0);
        int x12 = (int) (motionEvent.getX() + 0.5f);
        this.D3 = x12;
        this.B3 = x12;
        int y12 = (int) (motionEvent.getY() + 0.5f);
        this.E3 = y12;
        this.C3 = y12;
        if (zT) {
            i10 = zS;
            i10 = (zS ? 1 : 0) | 2;
        }
        i10 = zS;
        f(i10, 0);
        this.A3.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public void p(@NonNull r rVar) {
        if (this.f73927n3 == null) {
            this.f73927n3 = new ArrayList();
        }
        this.f73927n3.add(rVar);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean p0(int i10, int i11) {
        int iMax;
        int i12;
        int i13;
        p pVar = this.f73926n;
        if (pVar == null || this.f73916i3) {
            return false;
        }
        boolean zS = pVar.s();
        boolean zT = this.f73926n.t();
        if (!zS || Math.abs(i10) < this.H3) {
            i10 = 0;
        }
        if (!zT || Math.abs(i11) < this.H3) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return false;
        }
        if (i10 == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.f73939t3;
            if (edgeEffect == null || androidx.core.widget.j.d(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.f73942v3;
                if (edgeEffect2 == null || androidx.core.widget.j.d(edgeEffect2) == 0.0f) {
                    iMax = 0;
                } else if (P1(this.f73942v3, i10, getWidth())) {
                    this.f73942v3.onAbsorb(i10);
                    i10 = 0;
                }
            } else {
                int i14 = -i10;
                if (P1(this.f73939t3, i14, getWidth())) {
                    this.f73939t3.onAbsorb(i14);
                    i10 = 0;
                }
            }
            iMax = i10;
            i10 = 0;
        }
        if (i11 == 0) {
            i12 = i11;
            i11 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.f73940u3;
            if (edgeEffect3 == null || androidx.core.widget.j.d(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.f73944w3;
                if (edgeEffect4 == null || androidx.core.widget.j.d(edgeEffect4) == 0.0f) {
                    i12 = i11;
                    i11 = 0;
                } else if (P1(this.f73944w3, i11, getHeight())) {
                    this.f73944w3.onAbsorb(i11);
                    i11 = 0;
                }
            } else {
                int i15 = -i11;
                if (P1(this.f73940u3, i15, getHeight())) {
                    this.f73940u3.onAbsorb(i15);
                    i11 = 0;
                }
            }
            i12 = 0;
        }
        if (iMax != 0 || i11 != 0) {
            int i16 = this.I3;
            iMax = Math.max(-i16, Math.min(iMax, i16));
            int i17 = this.I3;
            i11 = Math.max(-i17, Math.min(i11, i17));
            this.M3.b(iMax, i11);
        }
        if (i10 == 0 && i12 == 0) {
            return (iMax == 0 && i11 == 0) ? false : true;
        }
        float f10 = i10;
        float f11 = i12;
        if (!dispatchNestedPreFling(f10, f11)) {
            boolean z10 = zS || zT;
            dispatchNestedFling(f10, f11, z10);
            s sVar = this.G3;
            if (sVar != null && sVar.a(i10, i12)) {
                return true;
            }
            if (z10) {
                if (zT) {
                    i13 = zS;
                    i13 = (zS ? 1 : 0) | 2;
                }
                i13 = zS;
                f(i13, 1);
                int i18 = this.I3;
                int iMax2 = Math.max(-i18, Math.min(i10, i18));
                int i19 = this.I3;
                this.M3.b(iMax2, Math.max(-i19, Math.min(i12, i19)));
                return true;
            }
        }
        return false;
    }

    void p1(boolean z10) {
        this.f73933p3 = z10 | this.f73933p3;
        int i10 = 7 << 1;
        this.f73929o3 = true;
        W0();
    }

    public void q(@NonNull t tVar) {
        this.f73941v.add(tVar);
    }

    int q0(g0 g0Var) {
        if (g0Var.hasAnyOfTheFlags(524) || !g0Var.isBound()) {
            return -1;
        }
        return this.f73905e.f(g0Var.mPosition);
    }

    public void r(@NonNull u uVar) {
        if (this.R3 == null) {
            this.R3 = new ArrayList();
        }
        this.R3.add(uVar);
    }

    long r0(g0 g0Var) {
        return this.f73924m.hasStableIds() ? g0Var.getItemId() : g0Var.mPosition;
    }

    void r1(g0 g0Var, m.d dVar) {
        g0Var.setFlags(0, 8192);
        if (this.P3.f73978i && g0Var.isUpdated() && !g0Var.isRemoved() && !g0Var.shouldIgnore()) {
            this.f73909g.c(r0(g0Var), g0Var);
        }
        this.f73909g.e(g0Var, dVar);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z10) {
        g0 g0VarX0 = x0(view);
        if (g0VarX0 != null) {
            if (g0VarX0.isTmpDetached()) {
                g0VarX0.clearTmpDetachFlag();
            } else if (!g0VarX0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + g0VarX0 + b0());
            }
        }
        view.clearAnimation();
        N(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f73926n.w1(this, this.P3, view, view2) && view2 != null) {
            F1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f73926n.P1(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f73941v.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f73941v.get(i10).e(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f73910g3 != 0 || this.f73916i3) {
            this.f73913h3 = true;
        } else {
            super.requestLayout();
        }
    }

    public void s(@NonNull y yVar) {
        androidx.core.util.t.b(yVar != null, "'listener' arg cannot be null.");
        this.f73936s.add(yVar);
    }

    public int s0(@NonNull View view) {
        g0 g0VarX0 = x0(view);
        if (g0VarX0 != null) {
            return g0VarX0.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        p pVar = this.f73926n;
        if (pVar == null || this.f73916i3) {
            return;
        }
        boolean zS = pVar.s();
        boolean zT = this.f73926n.t();
        if (zS || zT) {
            if (!zS) {
                i10 = 0;
            }
            if (!zT) {
                i11 = 0;
            }
            K1(i10, i11, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (Q1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@p0 androidx.recyclerview.widget.b0 b0Var) {
        this.W3 = b0Var;
        u1.G1(this, b0Var);
    }

    public void setAdapter(@p0 h hVar) {
        setLayoutFrozen(false);
        N1(hVar, false, true);
        p1(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@p0 k kVar) {
        if (kVar == this.X3) {
            return;
        }
        this.X3 = kVar;
        setChildrenDrawingOrderEnabled(kVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.f73912h) {
            N0();
        }
        this.f73912h = z10;
        super.setClipToPadding(z10);
        if (this.f73932p2) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull l lVar) {
        androidx.core.util.t.l(lVar);
        this.f73937s3 = lVar;
        N0();
    }

    public void setHasFixedSize(boolean z10) {
        this.f73931p1 = z10;
    }

    public void setItemAnimator(@p0 m mVar) {
        m mVar2 = this.f73945x3;
        if (mVar2 != null) {
            mVar2.l();
            this.f73945x3.A(null);
        }
        this.f73945x3 = mVar;
        if (mVar != null) {
            mVar.A(this.U3);
        }
    }

    public void setItemViewCacheSize(int i10) {
        this.f73901c.M(i10);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(@p0 p pVar) {
        if (pVar == this.f73926n) {
            return;
        }
        Z1();
        if (this.f73926n != null) {
            m mVar = this.f73945x3;
            if (mVar != null) {
                mVar.l();
            }
            this.f73926n.H1(this.f73901c);
            this.f73926n.I1(this.f73901c);
            this.f73901c.d();
            if (this.f73930p0) {
                this.f73926n.L(this, this.f73901c);
            }
            this.f73926n.f2(null);
            this.f73926n = null;
        } else {
            this.f73901c.d();
        }
        this.f73907f.o();
        this.f73926n = pVar;
        if (pVar != null) {
            if (pVar.f74024b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f74024b.b0());
            }
            pVar.f2(this);
            if (this.f73930p0) {
                this.f73926n.K(this);
            }
        }
        this.f73901c.Q();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View, androidx.core.view.v0
    public void setNestedScrollingEnabled(boolean z10) {
        getScrollingChildHelper().p(z10);
    }

    public void setOnFlingListener(@p0 s sVar) {
        this.G3 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(@p0 u uVar) {
        this.Q3 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.L3 = z10;
    }

    public void setRecycledViewPool(@p0 w wVar) {
        this.f73901c.K(wVar);
    }

    @Deprecated
    public void setRecyclerListener(@p0 y yVar) {
        this.f73928o = yVar;
    }

    void setScrollState(int i10) {
        if (i10 == this.f73946y3) {
            return;
        }
        this.f73946y3 = i10;
        if (i10 != 2) {
            a2();
        }
        T(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 == 0 || i10 != 1) {
            this.F3 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.F3 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(@p0 e0 e0Var) {
        this.f73901c.L(e0Var);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().r(i10);
    }

    @Override // android.view.View, androidx.core.view.v0
    public void stopNestedScroll() {
        getScrollingChildHelper().t();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.f73916i3) {
            x("Do not suppressLayout in layout or scroll");
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f73916i3 = true;
                this.f73919j3 = true;
                Z1();
                return;
            }
            this.f73916i3 = false;
            if (this.f73913h3 && this.f73926n != null && this.f73924m != null) {
                requestLayout();
            }
            this.f73913h3 = false;
        }
    }

    void t(@NonNull g0 g0Var, @p0 m.d dVar, @NonNull m.d dVar2) {
        g0Var.setIsRecyclable(false);
        if (this.f73945x3.a(g0Var, dVar, dVar2)) {
            m1();
        }
    }

    public long t0(@NonNull View view) {
        g0 g0VarX0;
        h hVar = this.f73924m;
        if (hVar == null || !hVar.hasStableIds() || (g0VarX0 = x0(view)) == null) {
            return -1L;
        }
        return g0VarX0.getItemId();
    }

    public int u0(@NonNull View view) {
        g0 g0VarX0 = x0(view);
        if (g0VarX0 != null) {
            return g0VarX0.getLayoutPosition();
        }
        return -1;
    }

    void v(@NonNull g0 g0Var, @NonNull m.d dVar, @p0 m.d dVar2) {
        m(g0Var);
        g0Var.setIsRecyclable(false);
        if (this.f73945x3.c(g0Var, dVar, dVar2)) {
            m1();
        }
    }

    @Deprecated
    public int v0(@NonNull View view) {
        return s0(view);
    }

    void w(String str) {
        if (R0()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + b0());
        }
        throw new IllegalStateException(str + b0());
    }

    public g0 w0(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return x0(view);
    }

    void w1() {
        m mVar = this.f73945x3;
        if (mVar != null) {
            mVar.l();
        }
        p pVar = this.f73926n;
        if (pVar != null) {
            pVar.H1(this.f73901c);
            this.f73926n.I1(this.f73901c);
        }
        this.f73901c.d();
    }

    void x(String str) {
        if (R0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + b0());
        }
        if (this.f73935r3 > 0) {
            new IllegalStateException("" + b0());
        }
    }

    boolean x1(View view) {
        W1();
        boolean zR = this.f73907f.r(view);
        if (zR) {
            g0 g0VarX0 = x0(view);
            this.f73901c.P(g0VarX0);
            this.f73901c.I(g0VarX0);
        }
        Y1(!zR);
        return zR;
    }

    boolean y(g0 g0Var) {
        m mVar = this.f73945x3;
        return mVar == null || mVar.g(g0Var, g0Var.getUnmodifiedPayloads());
    }

    public void y0(@NonNull View view, @NonNull Rect rect) {
        z0(view, rect);
    }

    public void y1(@NonNull o oVar) {
        p pVar = this.f73926n;
        if (pVar != null) {
            pVar.n("Cannot remove item decoration during a scroll  or layout");
        }
        this.f73938t.remove(oVar);
        if (this.f73938t.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        V0();
        requestLayout();
    }

    public void z1(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            y1(D0(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public RecyclerView(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, p3.a.C2455a.f340746g);
    }

    @b1({b1.a.LIBRARY})
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Parcelable f73948c;

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

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f73948c = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        void b(SavedState savedState) {
            this.f73948c = savedState.f73948c;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeParcelable(this.f73948c, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f73899b = new z();
        this.f73901c = new x();
        this.f73909g = new l0();
        this.f73915i = new a();
        this.f73918j = new Rect();
        this.f73920k = new Rect();
        this.f73922l = new RectF();
        this.f73936s = new ArrayList();
        this.f73938t = new ArrayList<>();
        this.f73941v = new ArrayList<>();
        this.f73910g3 = 0;
        this.f73929o3 = false;
        this.f73933p3 = false;
        this.f73934q3 = 0;
        this.f73935r3 = 0;
        this.f73937s3 = X4;
        this.f73945x3 = new androidx.recyclerview.widget.j();
        this.f73946y3 = 0;
        this.f73947z3 = -1;
        this.J3 = Float.MIN_VALUE;
        this.K3 = Float.MIN_VALUE;
        this.L3 = true;
        this.M3 = new f0();
        this.O3 = f73890t4 ? new androidx.recyclerview.widget.n.b() : null;
        this.P3 = new c0();
        this.S3 = false;
        this.T3 = false;
        this.U3 = new n();
        this.V3 = false;
        this.Y3 = new int[2];
        this.f73898a4 = new int[2];
        this.f73900b4 = new int[2];
        this.f73902c4 = new int[2];
        this.f73904d4 = new ArrayList();
        this.f73906e4 = new b();
        this.f73911g4 = 0;
        this.f73914h4 = 0;
        this.f73917i4 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.F3 = viewConfiguration.getScaledTouchSlop();
        this.J3 = y1.f(viewConfiguration, context);
        this.K3 = y1.k(viewConfiguration, context);
        this.H3 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.I3 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f73897a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f73945x3.A(this.U3);
        J0();
        L0();
        K0();
        if (u1.X(this) == 0) {
            u1.Y1(this, 1);
        }
        this.f73925m3 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.b0(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p3.a.d.f340757a, i10, 0);
        u1.E1(this, context, p3.a.d.f340757a, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        String string = typedArrayObtainStyledAttributes.getString(p3.a.d.f340766j);
        if (typedArrayObtainStyledAttributes.getInt(p3.a.d.f340760d, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f73912h = typedArrayObtainStyledAttributes.getBoolean(p3.a.d.f340759c, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(p3.a.d.f340761e, false);
        this.H1 = z10;
        if (z10) {
            M0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(p3.a.d.f340764h), typedArrayObtainStyledAttributes.getDrawable(p3.a.d.f340765i), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(p3.a.d.f340762f), typedArrayObtainStyledAttributes.getDrawable(p3.a.d.f340763g));
        }
        typedArrayObtainStyledAttributes.recycle();
        J(context, string, attributeSet, i10, 0);
        int[] iArr = f73883m4;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        u1.E1(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i10, 0);
        boolean z11 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        androidx.customview.poolingcontainer.a.h(this, true);
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g0 f74047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Rect f74048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f74049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f74050d;

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f74048b = new Rect();
            this.f74049c = true;
            this.f74050d = false;
        }

        public int a() {
            return this.f74047a.getAbsoluteAdapterPosition();
        }

        public int b() {
            return this.f74047a.getBindingAdapterPosition();
        }

        @Deprecated
        public int c() {
            return this.f74047a.getBindingAdapterPosition();
        }

        public int d() {
            return this.f74047a.getLayoutPosition();
        }

        @Deprecated
        public int e() {
            return this.f74047a.getPosition();
        }

        public boolean f() {
            return this.f74047a.isUpdated();
        }

        public boolean g() {
            return this.f74047a.isRemoved();
        }

        public boolean h() {
            return this.f74047a.isInvalid();
        }

        public boolean i() {
            return this.f74047a.needsUpdate();
        }

        public q(int i10, int i11) {
            super(i10, i11);
            this.f74048b = new Rect();
            this.f74049c = true;
            this.f74050d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f74048b = new Rect();
            this.f74049c = true;
            this.f74050d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f74048b = new Rect();
            this.f74049c = true;
            this.f74050d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f74048b = new Rect();
            this.f74049c = true;
            this.f74050d = false;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.f73926n;
        if (pVar != null) {
            return pVar.R(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + b0());
    }
}
