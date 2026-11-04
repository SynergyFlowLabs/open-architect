package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.i2;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyGridMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,259:1\n255#1:273\n255#1:276\n255#1:283\n35#2,5:260\n30#3:265\n30#3:267\n80#4:266\n80#4:268\n80#4:270\n80#4:272\n80#4:275\n80#4:278\n80#4:285\n80#4:287\n32#5:269\n32#5:271\n32#5:274\n32#5:277\n32#5:284\n32#5:286\n97#6,4:279\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasuredItem.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasuredItem\n*L\n173#1:273\n178#1:276\n224#1:283\n78#1:260,5\n87#1:265\n89#1:267\n87#1:266\n89#1:268\n150#1:270\n152#1:272\n173#1:275\n178#1:278\n224#1:285\n255#1:287\n150#1:269\n152#1:271\n173#1:274\n178#1:277\n224#1:284\n255#1:286\n186#1:279,4\n*E\n"})
public final class v0 implements x, androidx.compose.foundation.lazy.layout.y0 {
    public static final int C = 8;
    private int A;
    private boolean B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f17017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f17018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f17019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f17020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.w f17021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f17022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f17023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final List<i2> f17024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f17025m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private final Object f17026n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final LazyLayoutItemAnimator<v0> f17027o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final long f17028p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f17029q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f17030r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f17031s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f17032t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f17033u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f17034v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f17035w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final long f17036x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f17037y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f17038z;

    public /* synthetic */ v0(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, androidx.compose.ui.unit.w wVar, int i13, int i14, List list, long j10, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, int i15, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, obj, z10, i11, i12, z11, wVar, i13, i14, list, j10, obj2, lazyLayoutItemAnimator, j11, i15, i16);
    }

    private final long q(long j10, Function1<? super Integer, Integer> function1) {
        return androidx.compose.ui.unit.q.f((((long) (j() ? androidx.compose.ui.unit.q.n(j10) : function1.invoke(Integer.valueOf(androidx.compose.ui.unit.q.n(j10))).intValue())) << 32) | (((long) (j() ? function1.invoke(Integer.valueOf(androidx.compose.ui.unit.q.p(j10))).intValue() : androidx.compose.ui.unit.q.p(j10))) & com.rabbitmq.client.k0.f265952a));
    }

    private final int s(long j10) {
        return j() ? androidx.compose.ui.unit.q.p(j10) : androidx.compose.ui.unit.q.n(j10);
    }

    private final int u(i2 i2Var) {
        return j() ? i2Var.c1() : i2Var.h1();
    }

    @Override // androidx.compose.foundation.lazy.grid.x
    public long a() {
        return this.f17036x;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public int b() {
        return this.f17024l.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public int c() {
        return this.f17029q;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public void d(boolean z10) {
        this.B = z10;
    }

    @Override // androidx.compose.foundation.lazy.grid.x, androidx.compose.foundation.lazy.layout.y0
    public int e() {
        return this.f17030r;
    }

    @Override // androidx.compose.foundation.lazy.grid.x
    public int f() {
        return this.A;
    }

    @Override // androidx.compose.foundation.lazy.grid.x
    public long g() {
        return this.f17037y;
    }

    @Override // androidx.compose.foundation.lazy.grid.x
    @Nullable
    public Object getContentType() {
        return this.f17026n;
    }

    @Override // androidx.compose.foundation.lazy.grid.x, androidx.compose.foundation.lazy.layout.y0
    public int getIndex() {
        return this.f17016d;
    }

    @Override // androidx.compose.foundation.lazy.grid.x, androidx.compose.foundation.lazy.layout.y0
    @NotNull
    public Object getKey() {
        return this.f17017e;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public long h() {
        return this.f17028p;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public boolean i() {
        return this.B;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public boolean j() {
        return this.f17018f;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public void k(int i10, int i11, int i12, int i13) {
        w(i10, i11, i12, i13, -1, -1);
    }

    @Override // androidx.compose.foundation.lazy.grid.x
    public int l() {
        return this.f17038z;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public int m() {
        return this.f17032t;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    @Nullable
    public Object n(int i10) {
        return this.f17024l.get(i10).c();
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public long o(int i10) {
        return g();
    }

    public final void p(int i10, boolean z10) {
        if (i()) {
            return;
        }
        long jG = g();
        int iN = j() ? androidx.compose.ui.unit.q.n(jG) : androidx.compose.ui.unit.q.n(jG) + i10;
        boolean zJ = j();
        int iP = androidx.compose.ui.unit.q.p(jG);
        if (zJ) {
            iP += i10;
        }
        this.f17037y = androidx.compose.ui.unit.q.f((((long) iN) << 32) | (((long) iP) & com.rabbitmq.client.k0.f265952a));
        if (z10) {
            int iB = b();
            for (int i11 = 0; i11 < iB; i11++) {
                androidx.compose.foundation.lazy.layout.a0 a0VarE = this.f17027o.e(getKey(), i11);
                if (a0VarE != null) {
                    long jX = a0VarE.x();
                    int iN2 = j() ? androidx.compose.ui.unit.q.n(jX) : Integer.valueOf(androidx.compose.ui.unit.q.n(jX) + i10).intValue();
                    boolean zJ2 = j();
                    int iP2 = androidx.compose.ui.unit.q.p(jX);
                    if (zJ2) {
                        iP2 = Integer.valueOf(iP2 + i10).intValue();
                    }
                    a0VarE.O(androidx.compose.ui.unit.q.f((((long) iP2) & com.rabbitmq.client.k0.f265952a) | (((long) iN2) << 32)));
                }
            }
        }
    }

    public final int r() {
        return this.f17019g;
    }

    public final int t() {
        return this.f17031s;
    }

    public final void v(@NotNull i2.a aVar, boolean z10) {
        androidx.compose.ui.graphics.layer.c cVarT;
        i2.a aVar2;
        int iN;
        int iP;
        int i10 = 0;
        if (!(this.f17033u != Integer.MIN_VALUE)) {
            androidx.compose.foundation.internal.e.g("position() should be called first");
        }
        int iB = b();
        while (i10 < iB) {
            i2 i2Var = this.f17024l.get(i10);
            int iU = this.f17034v - u(i2Var);
            int i11 = this.f17035w;
            long jG = g();
            androidx.compose.foundation.lazy.layout.a0 a0VarE = this.f17027o.e(getKey(), i10);
            if (a0VarE != null) {
                if (z10) {
                    a0VarE.K(jG);
                } else {
                    long jS = androidx.compose.ui.unit.q.s(!androidx.compose.ui.unit.q.k(a0VarE.u(), androidx.compose.foundation.lazy.layout.a0.f17266s.a()) ? a0VarE.u() : jG, a0VarE.v());
                    if ((s(jG) <= iU && s(jS) <= iU) || (s(jG) >= i11 && s(jS) >= i11)) {
                        a0VarE.p();
                    }
                    jG = jS;
                }
                cVarT = a0VarE.t();
            } else {
                cVarT = null;
            }
            if (this.f17020h) {
                if (j()) {
                    iN = androidx.compose.ui.unit.q.n(jG);
                } else {
                    iN = (this.f17033u - androidx.compose.ui.unit.q.n(jG)) - u(i2Var);
                }
                if (j()) {
                    iP = (this.f17033u - androidx.compose.ui.unit.q.p(jG)) - u(i2Var);
                } else {
                    iP = androidx.compose.ui.unit.q.p(jG);
                }
                jG = androidx.compose.ui.unit.q.f((((long) iP) & com.rabbitmq.client.k0.f265952a) | (((long) iN) << 32));
            }
            long jS2 = androidx.compose.ui.unit.q.s(jG, this.f17025m);
            if (!z10 && a0VarE != null) {
                a0VarE.J(jS2);
            }
            if (!j()) {
                aVar2 = aVar;
                androidx.compose.ui.graphics.layer.c cVar = cVarT;
                if (cVar != null) {
                    i2.a.v0(aVar2, i2Var, jS2, cVar, 0.0f, 4, null);
                } else {
                    i2.a.t0(aVar2, i2Var, jS2, 0.0f, null, 6, null);
                }
            } else if (cVarT != null) {
                aVar2 = aVar;
                i2.a.J0(aVar2, i2Var, jS2, cVarT, 0.0f, 4, null);
            } else {
                aVar2 = aVar;
                i2.a.H0(aVar2, i2Var, jS2, 0.0f, null, 6, null);
            }
            i10++;
            aVar = aVar2;
        }
    }

    public final void w(int i10, int i11, int i12, int i13, int i14, int i15) {
        long jF;
        this.f17033u = j() ? i13 : i12;
        if (!j()) {
            i12 = i13;
        }
        if (j() && this.f17021i == androidx.compose.ui.unit.w.Rtl) {
            i11 = (i12 - i11) - this.f17019g;
        }
        if (j()) {
            jF = androidx.compose.ui.unit.q.f((((long) i11) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) i10)));
        } else {
            jF = androidx.compose.ui.unit.q.f((((long) i11) & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32));
        }
        this.f17037y = jF;
        this.f17038z = i14;
        this.A = i15;
        this.f17034v = -this.f17022j;
        this.f17035w = this.f17033u + this.f17023k;
    }

    public final void x(int i10) {
        this.f17033u = i10;
        this.f17035w = i10 + this.f17023k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private v0(int i10, Object obj, boolean z10, int i11, int i12, boolean z11, androidx.compose.ui.unit.w wVar, int i13, int i14, List<? extends i2> list, long j10, Object obj2, LazyLayoutItemAnimator<v0> lazyLayoutItemAnimator, long j11, int i15, int i16) {
        this.f17016d = i10;
        this.f17017e = obj;
        this.f17018f = z10;
        this.f17019g = i11;
        this.f17020h = z11;
        this.f17021i = wVar;
        this.f17022j = i13;
        this.f17023k = i14;
        this.f17024l = list;
        this.f17025m = j10;
        this.f17026n = obj2;
        this.f17027o = lazyLayoutItemAnimator;
        this.f17028p = j11;
        this.f17029q = i15;
        this.f17030r = i16;
        this.f17033u = Integer.MIN_VALUE;
        int size = list.size();
        int iMax = 0;
        for (int i17 = 0; i17 < size; i17++) {
            i2 i2Var = (i2) list.get(i17);
            iMax = Math.max(iMax, j() ? i2Var.c1() : i2Var.h1());
        }
        this.f17031s = iMax;
        this.f17032t = kotlin.ranges.r.u(i12 + iMax, 0);
        this.f17036x = j() ? androidx.compose.ui.unit.u.e((((long) iMax) & com.rabbitmq.client.k0.f265952a) | (((long) this.f17019g) << 32)) : androidx.compose.ui.unit.u.e((((long) this.f17019g) & com.rabbitmq.client.k0.f265952a) | (((long) iMax) << 32));
        this.f17037y = androidx.compose.ui.unit.q.f42709b.b();
        this.f17038z = -1;
        this.A = -1;
    }
}
