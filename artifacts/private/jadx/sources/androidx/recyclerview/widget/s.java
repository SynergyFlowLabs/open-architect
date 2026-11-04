package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public class s extends RecyclerView.b0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final boolean f74545q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final float f74546r = 25.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f74547s = 10000;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f74548t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f74549u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f74550v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final float f74551w = 1.2f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @e.a({"UnknownNullness"})
    protected PointF f74554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f74555l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f74557n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f74552i = new LinearInterpolator();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f74553j = new DecelerateInterpolator();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f74556m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f74558o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f74559p = 0;

    @e.a({"UnknownNullness"})
    public s(Context context) {
        this.f74555l = context.getResources().getDisplayMetrics();
    }

    private float B() {
        if (!this.f74556m) {
            this.f74557n = w(this.f74555l);
            this.f74556m = true;
        }
        return this.f74557n;
    }

    private int z(int i10, int i11) {
        int i12 = i10 - i11;
        if (i10 * i12 <= 0) {
            return 0;
        }
        return i12;
    }

    protected int A() {
        PointF pointF = this.f74554k;
        if (pointF != null) {
            float f10 = pointF.x;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected int C() {
        PointF pointF = this.f74554k;
        if (pointF != null) {
            float f10 = pointF.y;
            if (f10 != 0.0f) {
                return f10 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    @e.a({"UnknownNullness"})
    protected void D(RecyclerView.b0.a aVar) {
        PointF pointFA = a(f());
        if (pointFA == null || (pointFA.x == 0.0f && pointFA.y == 0.0f)) {
            aVar.f(f());
            s();
            return;
        }
        j(pointFA);
        this.f74554k = pointFA;
        this.f74558o = (int) (pointFA.x * 10000.0f);
        this.f74559p = (int) (pointFA.y * 10000.0f);
        aVar.l((int) (this.f74558o * f74551w), (int) (this.f74559p * f74551w), (int) (y(10000) * f74551w), this.f74552i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    @e.a({"UnknownNullness"})
    protected void m(int i10, int i11, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
        if (c() == 0) {
            s();
            return;
        }
        this.f74558o = z(this.f74558o, i10);
        int iZ = z(this.f74559p, i11);
        this.f74559p = iZ;
        if (this.f74558o == 0 && iZ == 0) {
            D(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    protected void n() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    protected void o() {
        this.f74559p = 0;
        this.f74558o = 0;
        this.f74554k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0
    @e.a({"UnknownNullness"})
    protected void p(View view, RecyclerView.c0 c0Var, RecyclerView.b0.a aVar) {
        int iU = u(view, A());
        int iV = v(view, C());
        int iX = x((int) Math.sqrt((iU * iU) + (iV * iV)));
        if (iX > 0) {
            aVar.l(-iU, -iV, iX, this.f74553j);
        }
    }

    public int t(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                return i13 - i11;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i15 = i12 - i10;
        if (i15 > 0) {
            return i15;
        }
        int i16 = i13 - i11;
        if (i16 < 0) {
            return i16;
        }
        return 0;
    }

    @e.a({"UnknownNullness"})
    public int u(View view, int i10) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.s()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return t(pVarE.d0(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, pVarE.g0(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, pVarE.s0(), pVarE.D0() - pVarE.t0(), i10);
    }

    @e.a({"UnknownNullness"})
    public int v(View view, int i10) {
        RecyclerView.p pVarE = e();
        if (pVarE == null || !pVarE.t()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return t(pVarE.h0(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, pVarE.b0(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, pVarE.v0(), pVarE.j0() - pVarE.q0(), i10);
    }

    @e.a({"UnknownNullness"})
    protected float w(DisplayMetrics displayMetrics) {
        return f74546r / displayMetrics.densityDpi;
    }

    protected int x(int i10) {
        return (int) Math.ceil(((double) y(i10)) / 0.3356d);
    }

    protected int y(int i10) {
        return (int) Math.ceil(Math.abs(i10) * B());
    }
}
