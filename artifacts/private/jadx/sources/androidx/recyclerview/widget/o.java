package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.u1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o extends RecyclerView.o implements RecyclerView.r {
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 4;
    public static final int H = 8;
    public static final int I = 16;
    public static final int J = 32;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = 2;
    public static final int O = 4;
    public static final int P = 8;
    private static final String Q = "ItemTouchHelper";
    private static final boolean R = false;
    private static final int S = -1;
    static final int T = 8;
    private static final int U = 255;
    static final int V = 65280;
    static final int W = 16711680;
    private static final int X = 1000;
    private g A;
    private Rect C;
    private long D;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f74471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f74472e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f74473f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f74474g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f74475h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f74476i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f74477j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f74478k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    f f74480m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f74482o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f74484q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    RecyclerView f74485r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    VelocityTracker f74487t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<RecyclerView.g0> f74488u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<Integer> f74489v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    GestureDetectorCompat f74493z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List<View> f74468a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f74469b = new float[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    RecyclerView.g0 f74470c = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f74479l = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f74481n = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @l1
    List<h> f74483p = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final Runnable f74486s = new a();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private RecyclerView.k f74490w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    View f74491x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f74492y = -1;
    private final RecyclerView.t B = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o oVar = o.this;
            if (oVar.f74470c == null || !oVar.y()) {
                return;
            }
            o oVar2 = o.this;
            RecyclerView.g0 g0Var = oVar2.f74470c;
            if (g0Var != null) {
                oVar2.t(g0Var);
            }
            o oVar3 = o.this;
            oVar3.f74485r.removeCallbacks(oVar3.f74486s);
            u1.u1(o.this.f74485r, this);
        }
    }

    class b implements RecyclerView.t {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            o.this.f74493z.b(motionEvent);
            VelocityTracker velocityTracker = o.this.f74487t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (o.this.f74479l != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int iFindPointerIndex = motionEvent.findPointerIndex(o.this.f74479l);
                if (iFindPointerIndex >= 0) {
                    o.this.i(actionMasked, motionEvent, iFindPointerIndex);
                }
                o oVar = o.this;
                RecyclerView.g0 g0Var = oVar.f74470c;
                if (g0Var != null) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = oVar.f74487t;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                o oVar2 = o.this;
                                if (pointerId == oVar2.f74479l) {
                                    oVar2.f74479l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    o oVar3 = o.this;
                                    oVar3.G(motionEvent, oVar3.f74482o, actionIndex);
                                    return;
                                }
                            }
                        } else if (iFindPointerIndex >= 0) {
                            oVar.G(motionEvent, oVar.f74482o, iFindPointerIndex);
                            o.this.t(g0Var);
                            o oVar4 = o.this;
                            oVar4.f74485r.removeCallbacks(oVar4.f74486s);
                            o.this.f74486s.run();
                            o.this.f74485r.invalidate();
                        }
                    }
                    o.this.z(null, 0);
                    o.this.f74479l = -1;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public boolean c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            int iFindPointerIndex;
            h hVarM;
            o.this.f74493z.b(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                o.this.f74479l = motionEvent.getPointerId(0);
                o.this.f74471d = motionEvent.getX();
                o.this.f74472e = motionEvent.getY();
                o.this.u();
                o oVar = o.this;
                if (oVar.f74470c == null && (hVarM = oVar.m(motionEvent)) != null) {
                    o oVar2 = o.this;
                    oVar2.f74471d -= hVarM.f74522j;
                    oVar2.f74472e -= hVarM.f74523k;
                    oVar2.l(hVarM.f74517e, true);
                    if (o.this.f74468a.remove(hVarM.f74517e.itemView)) {
                        o oVar3 = o.this;
                        oVar3.f74480m.c(oVar3.f74485r, hVarM.f74517e);
                    }
                    o.this.z(hVarM.f74517e, hVarM.f74518f);
                    o oVar4 = o.this;
                    oVar4.G(motionEvent, oVar4.f74482o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                o oVar5 = o.this;
                oVar5.f74479l = -1;
                oVar5.z(null, 0);
            } else {
                int i10 = o.this.f74479l;
                if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) >= 0) {
                    o.this.i(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = o.this.f74487t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return o.this.f74470c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void e(boolean z10) {
            if (z10) {
                o.this.z(null, 0);
            }
        }
    }

    class c extends h {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f74496o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ RecyclerView.g0 f74497p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RecyclerView.g0 g0Var, int i10, int i11, float f10, float f11, float f12, float f13, int i12, RecyclerView.g0 g0Var2) {
            super(g0Var, i10, i11, f10, f11, f12, f13);
            this.f74496o = i12;
            this.f74497p = g0Var2;
        }

        @Override // androidx.recyclerview.widget.o.h, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f74524l) {
                return;
            }
            if (this.f74496o <= 0) {
                o oVar = o.this;
                oVar.f74480m.c(oVar.f74485r, this.f74497p);
            } else {
                o.this.f74468a.add(this.f74497p.itemView);
                this.f74521i = true;
                int i10 = this.f74496o;
                if (i10 > 0) {
                    o.this.v(this, i10);
                }
            }
            o oVar2 = o.this;
            View view = oVar2.f74491x;
            View view2 = this.f74497p.itemView;
            if (view == view2) {
                oVar2.x(view2);
            }
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f74499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f74500b;

        d(h hVar, int i10) {
            this.f74499a = hVar;
            this.f74500b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = o.this.f74485r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            h hVar = this.f74499a;
            if (hVar.f74524l || hVar.f74517e.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.m itemAnimator = o.this.f74485r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.r(null)) && !o.this.r()) {
                o.this.f74480m.D(this.f74499a.f74517e, this.f74500b);
            } else {
                o.this.f74485r.post(this);
            }
        }
    }

    class e implements RecyclerView.k {
        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public int a(int i10, int i11) {
            o oVar = o.this;
            View view = oVar.f74491x;
            if (view != null) {
                int iIndexOfChild = oVar.f74492y;
                if (iIndexOfChild == -1) {
                    iIndexOfChild = oVar.f74485r.indexOfChild(view);
                    o.this.f74492y = iIndexOfChild;
                }
                if (i11 == i10 - 1) {
                    return iIndexOfChild;
                }
                if (i11 >= iIndexOfChild) {
                    return i11 + 1;
                }
            }
            return i11;
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f74503b = 200;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f74504c = 250;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final int f74505d = 3158064;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f74506e = 789516;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Interpolator f74507f = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Interpolator f74508g = new b();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final long f74509h = 2000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f74510a = -1;

        class a implements Interpolator {
            a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                return f10 * f10 * f10 * f10 * f10;
            }
        }

        class b implements Interpolator {
            b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f10) {
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
            }
        }

        public static int e(int i10, int i11) {
            int i12;
            int i13 = i10 & f74506e;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 << 2;
            } else {
                int i15 = i13 << 1;
                i14 |= (-789517) & i15;
                i12 = (i15 & f74506e) << 2;
            }
            return i14 | i12;
        }

        @NonNull
        public static p i() {
            return q.f74530a;
        }

        private int j(RecyclerView recyclerView) {
            if (this.f74510a == -1) {
                this.f74510a = recyclerView.getResources().getDimensionPixelSize(p3.a.b.f340753d);
            }
            return this.f74510a;
        }

        public static int u(int i10, int i11) {
            return i11 << (i10 * 8);
        }

        public static int v(int i10, int i11) {
            return u(2, i10) | u(1, i11) | u(0, i11 | i10);
        }

        public abstract boolean A(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var, @NonNull RecyclerView.g0 g0Var2);

        /* JADX WARN: Multi-variable type inference failed */
        public void B(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var, int i10, @NonNull RecyclerView.g0 g0Var2, int i11, int i12, int i13) {
            RecyclerView.p layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof j) {
                ((j) layoutManager).e(g0Var.itemView, g0Var2.itemView, i12, i13);
                return;
            }
            if (layoutManager.s()) {
                if (layoutManager.d0(g0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.M1(i11);
                }
                if (layoutManager.g0(g0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.M1(i11);
                }
            }
            if (layoutManager.t()) {
                if (layoutManager.h0(g0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.M1(i11);
                }
                if (layoutManager.b0(g0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.M1(i11);
                }
            }
        }

        public void C(@p0 RecyclerView.g0 g0Var, int i10) {
            if (g0Var != null) {
                q.f74530a.a(g0Var.itemView);
            }
        }

        public abstract void D(@NonNull RecyclerView.g0 g0Var, int i10);

        public boolean a(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var, @NonNull RecyclerView.g0 g0Var2) {
            return true;
        }

        @e.a({"UnknownNullness"})
        public RecyclerView.g0 b(@NonNull RecyclerView.g0 g0Var, @NonNull List<RecyclerView.g0> list, int i10, int i11) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = g0Var.itemView.getWidth() + i10;
            int height = g0Var.itemView.getHeight() + i11;
            int left2 = i10 - g0Var.itemView.getLeft();
            int top2 = i11 - g0Var.itemView.getTop();
            int size = list.size();
            RecyclerView.g0 g0Var2 = null;
            int i12 = -1;
            for (int i13 = 0; i13 < size; i13++) {
                RecyclerView.g0 g0Var3 = list.get(i13);
                if (left2 > 0 && (right = g0Var3.itemView.getRight() - width) < 0 && g0Var3.itemView.getRight() > g0Var.itemView.getRight() && (iAbs4 = Math.abs(right)) > i12) {
                    g0Var2 = g0Var3;
                    i12 = iAbs4;
                }
                if (left2 < 0 && (left = g0Var3.itemView.getLeft() - i10) > 0 && g0Var3.itemView.getLeft() < g0Var.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i12) {
                    g0Var2 = g0Var3;
                    i12 = iAbs3;
                }
                if (top2 < 0 && (top = g0Var3.itemView.getTop() - i11) > 0 && g0Var3.itemView.getTop() < g0Var.itemView.getTop() && (iAbs2 = Math.abs(top)) > i12) {
                    g0Var2 = g0Var3;
                    i12 = iAbs2;
                }
                if (top2 > 0 && (bottom = g0Var3.itemView.getBottom() - height) < 0 && g0Var3.itemView.getBottom() > g0Var.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i12) {
                    g0Var2 = g0Var3;
                    i12 = iAbs;
                }
            }
            return g0Var2;
        }

        public void c(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var) {
            q.f74530a.c(g0Var.itemView);
        }

        public int d(int i10, int i11) {
            int i12;
            int i13 = i10 & f74505d;
            if (i13 == 0) {
                return i10;
            }
            int i14 = i10 & (~i13);
            if (i11 == 0) {
                i12 = i13 >> 2;
            } else {
                int i15 = i13 >> 1;
                i14 |= (-3158065) & i15;
                i12 = (f74505d & i15) >> 2;
            }
            return i12 | i14;
        }

        final int f(RecyclerView recyclerView, RecyclerView.g0 g0Var) {
            return d(l(recyclerView, g0Var), u1.c0(recyclerView));
        }

        public long g(@NonNull RecyclerView recyclerView, int i10, float f10, float f11) {
            RecyclerView.m itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i10 == 8 ? 200L : 250L;
            }
            return i10 == 8 ? itemAnimator.o() : itemAnimator.p();
        }

        public int h() {
            return 0;
        }

        public float k(@NonNull RecyclerView.g0 g0Var) {
            return 0.5f;
        }

        public abstract int l(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var);

        public float m(float f10) {
            return f10;
        }

        public float n(@NonNull RecyclerView.g0 g0Var) {
            return 0.5f;
        }

        public float o(float f10) {
            return f10;
        }

        boolean p(RecyclerView recyclerView, RecyclerView.g0 g0Var) {
            return (f(recyclerView, g0Var) & o.W) != 0;
        }

        boolean q(RecyclerView recyclerView, RecyclerView.g0 g0Var) {
            return (f(recyclerView, g0Var) & 65280) != 0;
        }

        public int r(@NonNull RecyclerView recyclerView, int i10, int i11, int i12, long j10) {
            int iSignum = (int) (((int) (((int) Math.signum(i11)) * j(recyclerView) * f74508g.getInterpolation(Math.min(1.0f, (Math.abs(i11) * 1.0f) / i10)))) * f74507f.getInterpolation(j10 <= 2000 ? j10 / 2000.0f : 1.0f));
            if (iSignum == 0) {
                return i11 > 0 ? 1 : -1;
            }
            return iSignum;
        }

        public boolean s() {
            return true;
        }

        public boolean t() {
            return true;
        }

        public void w(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var, float f10, float f11, int i10, boolean z10) {
            q.f74530a.b(canvas, recyclerView, g0Var.itemView, f10, f11, i10, z10);
        }

        public void x(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @e.a({"UnknownNullness"}) RecyclerView.g0 g0Var, float f10, float f11, int i10, boolean z10) {
            q.f74530a.d(canvas, recyclerView, g0Var.itemView, f10, f11, i10, z10);
        }

        void y(Canvas canvas, RecyclerView recyclerView, RecyclerView.g0 g0Var, List<h> list, int i10, float f10, float f11) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = list.get(i11);
                hVar.e();
                int iSave = canvas.save();
                w(canvas, recyclerView, hVar.f74517e, hVar.f74522j, hVar.f74523k, hVar.f74518f, false);
                canvas.restoreToCount(iSave);
            }
            if (g0Var != null) {
                int iSave2 = canvas.save();
                w(canvas, recyclerView, g0Var, f10, f11, i10, true);
                canvas.restoreToCount(iSave2);
            }
        }

        void z(Canvas canvas, RecyclerView recyclerView, RecyclerView.g0 g0Var, List<h> list, int i10, float f10, float f11) {
            int size = list.size();
            boolean z10 = false;
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = list.get(i11);
                int iSave = canvas.save();
                x(canvas, recyclerView, hVar.f74517e, hVar.f74522j, hVar.f74523k, hVar.f74518f, false);
                canvas.restoreToCount(iSave);
            }
            if (g0Var != null) {
                int iSave2 = canvas.save();
                x(canvas, recyclerView, g0Var, f10, f11, i10, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i12 = size - 1; i12 >= 0; i12--) {
                h hVar2 = list.get(i12);
                boolean z11 = hVar2.f74525m;
                if (z11 && !hVar2.f74521i) {
                    list.remove(i12);
                } else if (!z11) {
                    z10 = true;
                }
            }
            if (z10) {
                recyclerView.invalidate();
            }
        }
    }

    private class g extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f74511a = true;

        g() {
        }

        void a() {
            this.f74511a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewN;
            RecyclerView.g0 g0VarW0;
            if (!this.f74511a || (viewN = o.this.n(motionEvent)) == null || (g0VarW0 = o.this.f74485r.w0(viewN)) == null) {
                return;
            }
            o oVar = o.this;
            if (oVar.f74480m.p(oVar.f74485r, g0VarW0)) {
                int pointerId = motionEvent.getPointerId(0);
                int i10 = o.this.f74479l;
                if (pointerId == i10) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                    float x10 = motionEvent.getX(iFindPointerIndex);
                    float y10 = motionEvent.getY(iFindPointerIndex);
                    o oVar2 = o.this;
                    oVar2.f74471d = x10;
                    oVar2.f74472e = y10;
                    oVar2.f74476i = 0.0f;
                    oVar2.f74475h = 0.0f;
                    if (oVar2.f74480m.t()) {
                        o.this.z(g0VarW0, 2);
                    }
                }
            }
        }
    }

    @l1
    static class h implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final float f74513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f74514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f74515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final float f74516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final RecyclerView.g0 f74517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f74518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @l1
        final ValueAnimator f74519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f74520h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        boolean f74521i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f74522j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f74523k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        boolean f74524l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f74525m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f74526n;

        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                h.this.c(valueAnimator.getAnimatedFraction());
            }
        }

        h(RecyclerView.g0 g0Var, int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f74518f = i11;
            this.f74520h = i10;
            this.f74517e = g0Var;
            this.f74513a = f10;
            this.f74514b = f11;
            this.f74515c = f12;
            this.f74516d = f13;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f74519g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.setTarget(g0Var.itemView);
            valueAnimatorOfFloat.addListener(this);
            c(0.0f);
        }

        public void a() {
            this.f74519g.cancel();
        }

        public void b(long j10) {
            this.f74519g.setDuration(j10);
        }

        public void c(float f10) {
            this.f74526n = f10;
        }

        public void d() {
            this.f74517e.setIsRecyclable(false);
            this.f74519g.start();
        }

        public void e() {
            float f10 = this.f74513a;
            float f11 = this.f74515c;
            if (f10 == f11) {
                this.f74522j = this.f74517e.itemView.getTranslationX();
            } else {
                this.f74522j = f10 + (this.f74526n * (f11 - f10));
            }
            float f12 = this.f74514b;
            float f13 = this.f74516d;
            if (f12 == f13) {
                this.f74523k = this.f74517e.itemView.getTranslationY();
            } else {
                this.f74523k = f12 + (this.f74526n * (f13 - f12));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f74525m) {
                this.f74517e.setIsRecyclable(true);
            }
            this.f74525m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public static abstract class i extends f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f74528i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f74529j;

        public i(int i10, int i11) {
            this.f74528i = i11;
            this.f74529j = i10;
        }

        public int E(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var) {
            return this.f74529j;
        }

        public int F(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var) {
            return this.f74528i;
        }

        public void G(int i10) {
            this.f74529j = i10;
        }

        public void H(int i10) {
            this.f74528i = i10;
        }

        @Override // androidx.recyclerview.widget.o.f
        public int l(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.g0 g0Var) {
            return f.v(E(recyclerView, g0Var), F(recyclerView, g0Var));
        }
    }

    public interface j {
        void e(@NonNull View view, @NonNull View view2, int i10, int i11);
    }

    public o(@NonNull f fVar) {
        this.f74480m = fVar;
    }

    private void A() {
        this.f74484q = ViewConfiguration.get(this.f74485r.getContext()).getScaledTouchSlop();
        this.f74485r.n(this);
        this.f74485r.q(this.B);
        this.f74485r.p(this);
        C();
    }

    private void C() {
        this.A = new g();
        this.f74493z = new GestureDetectorCompat(this.f74485r.getContext(), this.A);
    }

    private void E() {
        g gVar = this.A;
        if (gVar != null) {
            gVar.a();
            this.A = null;
        }
        if (this.f74493z != null) {
            this.f74493z = null;
        }
    }

    private int F(RecyclerView.g0 g0Var) {
        if (this.f74481n == 2) {
            return 0;
        }
        int iL = this.f74480m.l(this.f74485r, g0Var);
        int iD = (this.f74480m.d(iL, u1.c0(this.f74485r)) & 65280) >> 8;
        if (iD == 0) {
            return 0;
        }
        int i10 = (iL & 65280) >> 8;
        if (Math.abs(this.f74475h) > Math.abs(this.f74476i)) {
            int iH = h(g0Var, iD);
            if (iH > 0) {
                return (i10 & iH) == 0 ? f.e(iH, u1.c0(this.f74485r)) : iH;
            }
            int iJ = j(g0Var, iD);
            if (iJ > 0) {
                return iJ;
            }
        } else {
            int iJ2 = j(g0Var, iD);
            if (iJ2 > 0) {
                return iJ2;
            }
            int iH2 = h(g0Var, iD);
            if (iH2 > 0) {
                return (i10 & iH2) == 0 ? f.e(iH2, u1.c0(this.f74485r)) : iH2;
            }
        }
        return 0;
    }

    private void f() {
    }

    private int h(RecyclerView.g0 g0Var, int i10) {
        if ((i10 & 12) == 0) {
            return 0;
        }
        int i11 = 0 << 0;
        int i12 = this.f74475h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f74487t;
        if (velocityTracker != null && this.f74479l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f74480m.o(this.f74474g));
            float xVelocity = this.f74487t.getXVelocity(this.f74479l);
            float yVelocity = this.f74487t.getYVelocity(this.f74479l);
            int i13 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i13 & i10) != 0 && i12 == i13 && fAbs >= this.f74480m.m(this.f74473f) && fAbs > Math.abs(yVelocity)) {
                return i13;
            }
        }
        float width = this.f74485r.getWidth() * this.f74480m.n(g0Var);
        if ((i10 & i12) == 0 || Math.abs(this.f74475h) <= width) {
            return 0;
        }
        return i12;
    }

    private int j(RecyclerView.g0 g0Var, int i10) {
        if ((i10 & 3) == 0) {
            return 0;
        }
        int i11 = this.f74476i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f74487t;
        if (velocityTracker != null && this.f74479l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f74480m.o(this.f74474g));
            float xVelocity = this.f74487t.getXVelocity(this.f74479l);
            float yVelocity = this.f74487t.getYVelocity(this.f74479l);
            int i12 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i12 & i10) != 0 && i12 == i11 && fAbs >= this.f74480m.m(this.f74473f) && fAbs > Math.abs(xVelocity)) {
                return i12;
            }
        }
        float height = this.f74485r.getHeight() * this.f74480m.n(g0Var);
        if ((i10 & i11) == 0 || Math.abs(this.f74476i) <= height) {
            return 0;
        }
        return i11;
    }

    private void k() {
        this.f74485r.y1(this);
        this.f74485r.B1(this.B);
        this.f74485r.A1(this);
        int size = this.f74483p.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f74483p.clear();
                this.f74491x = null;
                this.f74492y = -1;
                w();
                E();
                return;
            }
            h hVar = this.f74483p.get(0);
            hVar.a();
            this.f74480m.c(this.f74485r, hVar.f74517e);
        }
    }

    private List<RecyclerView.g0> o(RecyclerView.g0 g0Var) {
        RecyclerView.g0 g0Var2 = g0Var;
        List<RecyclerView.g0> list = this.f74488u;
        if (list == null) {
            this.f74488u = new ArrayList();
            this.f74489v = new ArrayList();
        } else {
            list.clear();
            this.f74489v.clear();
        }
        int iH = this.f74480m.h();
        int iRound = Math.round(this.f74477j + this.f74475h) - iH;
        int iRound2 = Math.round(this.f74478k + this.f74476i) - iH;
        int i10 = iH * 2;
        int width = g0Var2.itemView.getWidth() + iRound + i10;
        int height = g0Var2.itemView.getHeight() + iRound2 + i10;
        int i11 = (iRound + width) / 2;
        int i12 = (iRound2 + height) / 2;
        RecyclerView.p layoutManager = this.f74485r.getLayoutManager();
        int iV = layoutManager.V();
        int i13 = 0;
        while (i13 < iV) {
            View viewU = layoutManager.U(i13);
            if (viewU != g0Var2.itemView && viewU.getBottom() >= iRound2 && viewU.getTop() <= height && viewU.getRight() >= iRound && viewU.getLeft() <= width) {
                RecyclerView.g0 g0VarW0 = this.f74485r.w0(viewU);
                if (this.f74480m.a(this.f74485r, this.f74470c, g0VarW0)) {
                    int iAbs = Math.abs(i11 - ((viewU.getLeft() + viewU.getRight()) / 2));
                    int iAbs2 = Math.abs(i12 - ((viewU.getTop() + viewU.getBottom()) / 2));
                    int i14 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.f74488u.size();
                    int i15 = 0;
                    for (int i16 = 0; i16 < size && i14 > this.f74489v.get(i16).intValue(); i16++) {
                        i15++;
                    }
                    this.f74488u.add(i15, g0VarW0);
                    this.f74489v.add(i15, Integer.valueOf(i14));
                }
            }
            i13++;
            g0Var2 = g0Var;
        }
        return this.f74488u;
    }

    private RecyclerView.g0 p(MotionEvent motionEvent) {
        View viewN;
        RecyclerView.p layoutManager = this.f74485r.getLayoutManager();
        int i10 = this.f74479l;
        if (i10 == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        float x10 = motionEvent.getX(iFindPointerIndex) - this.f74471d;
        float y10 = motionEvent.getY(iFindPointerIndex) - this.f74472e;
        float fAbs = Math.abs(x10);
        float fAbs2 = Math.abs(y10);
        int i11 = this.f74484q;
        if (fAbs < i11 && fAbs2 < i11) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.s()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.t()) && (viewN = n(motionEvent)) != null) {
            return this.f74485r.w0(viewN);
        }
        return null;
    }

    private void q(float[] fArr) {
        if ((this.f74482o & 12) != 0) {
            fArr[0] = (this.f74477j + this.f74475h) - this.f74470c.itemView.getLeft();
        } else {
            fArr[0] = this.f74470c.itemView.getTranslationX();
        }
        if ((this.f74482o & 3) != 0) {
            fArr[1] = (this.f74478k + this.f74476i) - this.f74470c.itemView.getTop();
        } else {
            fArr[1] = this.f74470c.itemView.getTranslationY();
        }
    }

    private static boolean s(View view, float f10, float f11, float f12, float f13) {
        return f10 >= f12 && f10 <= f12 + ((float) view.getWidth()) && f11 >= f13 && f11 <= f13 + ((float) view.getHeight());
    }

    private void w() {
        VelocityTracker velocityTracker = this.f74487t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f74487t = null;
        }
    }

    public void B(@NonNull RecyclerView.g0 g0Var) {
        if (this.f74480m.p(this.f74485r, g0Var) && g0Var.itemView.getParent() == this.f74485r) {
            u();
            this.f74476i = 0.0f;
            this.f74475h = 0.0f;
            z(g0Var, 2);
        }
    }

    public void D(@NonNull RecyclerView.g0 g0Var) {
        if (this.f74480m.q(this.f74485r, g0Var) && g0Var.itemView.getParent() == this.f74485r) {
            u();
            this.f74476i = 0.0f;
            this.f74475h = 0.0f;
            z(g0Var, 1);
        }
    }

    void G(MotionEvent motionEvent, int i10, int i11) {
        float x10 = motionEvent.getX(i11);
        float y10 = motionEvent.getY(i11);
        float f10 = x10 - this.f74471d;
        this.f74475h = f10;
        this.f74476i = y10 - this.f74472e;
        if ((i10 & 4) == 0) {
            this.f74475h = Math.max(0.0f, f10);
        }
        if ((i10 & 8) == 0) {
            this.f74475h = Math.min(0.0f, this.f74475h);
        }
        if ((i10 & 1) == 0) {
            this.f74476i = Math.max(0.0f, this.f74476i);
        }
        if ((i10 & 2) == 0) {
            this.f74476i = Math.min(0.0f, this.f74476i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(@NonNull View view) {
        x(view);
        RecyclerView.g0 g0VarW0 = this.f74485r.w0(view);
        if (g0VarW0 == null) {
            return;
        }
        RecyclerView.g0 g0Var = this.f74470c;
        if (g0Var != null && g0VarW0 == g0Var) {
            z(null, 0);
            return;
        }
        l(g0VarW0, false);
        if (this.f74468a.remove(g0VarW0.itemView)) {
            this.f74480m.c(this.f74485r, g0VarW0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void d(@NonNull View view) {
    }

    public void g(@p0 RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f74485r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            k();
        }
        this.f74485r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f74473f = resources.getDimension(p3.a.b.f340755f);
            this.f74474g = resources.getDimension(p3.a.b.f340754e);
            A();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @e.a({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        rect.setEmpty();
    }

    void i(int i10, MotionEvent motionEvent, int i11) {
        RecyclerView.g0 g0VarP;
        int iF;
        if (this.f74470c == null && i10 == 2 && this.f74481n != 2 && this.f74480m.s() && this.f74485r.getScrollState() != 1 && (g0VarP = p(motionEvent)) != null && (iF = (this.f74480m.f(this.f74485r, g0VarP) & 65280) >> 8) != 0) {
            float x10 = motionEvent.getX(i11);
            float y10 = motionEvent.getY(i11);
            float f10 = x10 - this.f74471d;
            float f11 = y10 - this.f74472e;
            float fAbs = Math.abs(f10);
            float fAbs2 = Math.abs(f11);
            int i12 = this.f74484q;
            if (fAbs >= i12 || fAbs2 >= i12) {
                if (fAbs > fAbs2) {
                    if (f10 < 0.0f && (iF & 4) == 0) {
                        return;
                    }
                    if (f10 > 0.0f && (iF & 8) == 0) {
                        return;
                    }
                } else {
                    if (f11 < 0.0f && (iF & 1) == 0) {
                        return;
                    }
                    if (f11 > 0.0f && (iF & 2) == 0) {
                        return;
                    }
                }
                this.f74476i = 0.0f;
                this.f74475h = 0.0f;
                this.f74479l = motionEvent.getPointerId(0);
                z(g0VarP, 1);
            }
        }
    }

    void l(RecyclerView.g0 g0Var, boolean z10) {
        for (int size = this.f74483p.size() - 1; size >= 0; size--) {
            h hVar = this.f74483p.get(size);
            if (hVar.f74517e == g0Var) {
                hVar.f74524l |= z10;
                if (!hVar.f74525m) {
                    hVar.a();
                }
                this.f74483p.remove(size);
                return;
            }
        }
    }

    h m(MotionEvent motionEvent) {
        if (this.f74483p.isEmpty()) {
            return null;
        }
        View viewN = n(motionEvent);
        for (int size = this.f74483p.size() - 1; size >= 0; size--) {
            h hVar = this.f74483p.get(size);
            if (hVar.f74517e.itemView == viewN) {
                return hVar;
            }
        }
        return null;
    }

    View n(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        RecyclerView.g0 g0Var = this.f74470c;
        if (g0Var != null) {
            View view = g0Var.itemView;
            if (s(view, x10, y10, this.f74477j + this.f74475h, this.f74478k + this.f74476i)) {
                return view;
            }
        }
        for (int size = this.f74483p.size() - 1; size >= 0; size--) {
            h hVar = this.f74483p.get(size);
            View view2 = hVar.f74517e.itemView;
            if (s(view2, x10, y10, hVar.f74522j, hVar.f74523k)) {
                return view2;
            }
        }
        return this.f74485r.d0(x10, y10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @e.a({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        float f10;
        float f11;
        this.f74492y = -1;
        if (this.f74470c != null) {
            q(this.f74469b);
            float[] fArr = this.f74469b;
            float f12 = fArr[0];
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f74480m.y(canvas, recyclerView, this.f74470c, this.f74483p, this.f74481n, f10, f11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.c0 c0Var) {
        float f10;
        float f11;
        if (this.f74470c != null) {
            q(this.f74469b);
            float[] fArr = this.f74469b;
            float f12 = fArr[0];
            int i10 = 1 << 1;
            f11 = fArr[1];
            f10 = f12;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        this.f74480m.z(canvas, recyclerView, this.f74470c, this.f74483p, this.f74481n, f10, f11);
    }

    boolean r() {
        int size = this.f74483p.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f74483p.get(i10).f74525m) {
                return true;
            }
        }
        return false;
    }

    void t(RecyclerView.g0 g0Var) {
        if (!this.f74485r.isLayoutRequested() && this.f74481n == 2) {
            float fK = this.f74480m.k(g0Var);
            int i10 = (int) (this.f74477j + this.f74475h);
            int i11 = (int) (this.f74478k + this.f74476i);
            if (Math.abs(i11 - g0Var.itemView.getTop()) >= g0Var.itemView.getHeight() * fK || Math.abs(i10 - g0Var.itemView.getLeft()) >= g0Var.itemView.getWidth() * fK) {
                List<RecyclerView.g0> listO = o(g0Var);
                if (listO.size() == 0) {
                    return;
                }
                RecyclerView.g0 g0VarB = this.f74480m.b(g0Var, listO, i10, i11);
                if (g0VarB == null) {
                    this.f74488u.clear();
                    this.f74489v.clear();
                    return;
                }
                int absoluteAdapterPosition = g0VarB.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = g0Var.getAbsoluteAdapterPosition();
                if (this.f74480m.A(this.f74485r, g0Var, g0VarB)) {
                    this.f74480m.B(this.f74485r, g0Var, absoluteAdapterPosition2, g0VarB, absoluteAdapterPosition, i10, i11);
                }
            }
        }
    }

    void u() {
        VelocityTracker velocityTracker = this.f74487t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f74487t = VelocityTracker.obtain();
    }

    void v(h hVar, int i10) {
        this.f74485r.post(new d(hVar, i10));
    }

    void x(View view) {
        if (view == this.f74491x) {
            this.f74491x = null;
            if (this.f74490w != null) {
                this.f74485r.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c6  */
    boolean y() {
        int iR;
        int iR2;
        if (this.f74470c == null) {
            this.D = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.D;
        long j11 = j10 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j10;
        RecyclerView.p layoutManager = this.f74485r.getLayoutManager();
        if (this.C == null) {
            this.C = new Rect();
        }
        layoutManager.r(this.f74470c.itemView, this.C);
        if (layoutManager.s()) {
            int i10 = (int) (this.f74477j + this.f74475h);
            int paddingLeft = (i10 - this.C.left) - this.f74485r.getPaddingLeft();
            float f10 = this.f74475h;
            if ((f10 >= 0.0f || paddingLeft >= 0) && (f10 <= 0.0f || (paddingLeft = ((i10 + this.f74470c.itemView.getWidth()) + this.C.right) - (this.f74485r.getWidth() - this.f74485r.getPaddingRight())) <= 0)) {
                iR = 0;
            } else {
                iR = paddingLeft;
            }
        } else {
            iR = 0;
        }
        if (layoutManager.t()) {
            int i11 = (int) (this.f74478k + this.f74476i);
            iR2 = (i11 - this.C.top) - this.f74485r.getPaddingTop();
            float f11 = this.f74476i;
            if ((f11 >= 0.0f || iR2 >= 0) && (f11 <= 0.0f || (iR2 = ((i11 + this.f74470c.itemView.getHeight()) + this.C.bottom) - (this.f74485r.getHeight() - this.f74485r.getPaddingBottom())) <= 0)) {
                iR2 = 0;
            }
        } else {
            iR2 = 0;
        }
        if (iR != 0) {
            iR = this.f74480m.r(this.f74485r, this.f74470c.itemView.getWidth(), iR, this.f74485r.getWidth(), j11);
        }
        int i12 = iR;
        if (iR2 != 0) {
            iR2 = this.f74480m.r(this.f74485r, this.f74470c.itemView.getHeight(), iR2, this.f74485r.getHeight(), j11);
        }
        if (i12 == 0 && iR2 == 0) {
            this.D = Long.MIN_VALUE;
            return false;
        }
        if (this.D == Long.MIN_VALUE) {
            this.D = jCurrentTimeMillis;
        }
        this.f74485r.scrollBy(i12, iR2);
        return true;
    }

    void z(@p0 RecyclerView.g0 g0Var, int i10) {
        boolean z10;
        float fSignum;
        float fSignum2;
        if (g0Var == this.f74470c && i10 == this.f74481n) {
            return;
        }
        this.D = Long.MIN_VALUE;
        int i11 = this.f74481n;
        l(g0Var, true);
        this.f74481n = i10;
        if (i10 == 2) {
            if (g0Var == null) {
                throw new IllegalArgumentException("Must pass a ViewHolder when dragging");
            }
            this.f74491x = g0Var.itemView;
            f();
        }
        int i12 = (1 << ((i10 * 8) + 8)) - 1;
        RecyclerView.g0 g0Var2 = this.f74470c;
        boolean z11 = false;
        if (g0Var2 != null) {
            if (g0Var2.itemView.getParent() != null) {
                int iF = i11 == 2 ? 0 : F(g0Var2);
                w();
                int i13 = 4;
                if (iF == 1 || iF == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f74476i) * this.f74485r.getHeight();
                } else if (iF == 4 || iF == 8 || iF == 16 || iF == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f74475h) * this.f74485r.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i11 == 2) {
                    i13 = 8;
                } else if (iF > 0) {
                    i13 = 2;
                }
                q(this.f74469b);
                float[] fArr = this.f74469b;
                float f10 = fArr[0];
                float f11 = fArr[1];
                z10 = false;
                c cVar = new c(g0Var2, i13, i11, f10, f11, fSignum, fSignum2, iF, g0Var2);
                cVar.b(this.f74480m.g(this.f74485r, i13, fSignum - f10, fSignum2 - f11));
                this.f74483p.add(cVar);
                cVar.d();
                z11 = true;
            } else {
                z10 = false;
                x(g0Var2.itemView);
                this.f74480m.c(this.f74485r, g0Var2);
                z11 = false;
            }
            this.f74470c = null;
        } else {
            z10 = false;
        }
        if (g0Var != null) {
            this.f74482o = (this.f74480m.f(this.f74485r, g0Var) & i12) >> (this.f74481n * 8);
            this.f74477j = g0Var.itemView.getLeft();
            this.f74478k = g0Var.itemView.getTop();
            this.f74470c = g0Var;
            if (i10 == 2) {
                g0Var.itemView.performHapticFeedback(z10 ? 1 : 0);
            }
        }
        ViewParent parent = this.f74485r.getParent();
        if (parent != null) {
            if (this.f74470c != null) {
                z10 = true;
            }
            parent.requestDisallowInterceptTouchEvent(z10);
        }
        if (!z11) {
            this.f74485r.getLayoutManager().S1();
        }
        this.f74480m.C(this.f74470c, this.f74481n);
        this.f74485r.invalidate();
    }
}
