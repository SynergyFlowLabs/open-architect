package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.ui.layout.i2;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,1474:1\n1460#1:1504\n1463#1:1505\n1460#1:1506\n1463#1:1510\n1463#1:1513\n345#2,7:1475\n345#2,7:1482\n71#2,3:1501\n75#2:1509\n30#3:1489\n30#3:1491\n80#4:1490\n80#4:1492\n80#4:1494\n80#4:1496\n80#4:1508\n80#4:1512\n80#4:1515\n80#4:1517\n32#5:1493\n32#5:1495\n32#5:1507\n32#5:1511\n32#5:1514\n32#5:1516\n97#6,4:1497\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem\n*L\n1378#1:1504\n1415#1:1505\n1416#1:1506\n1445#1:1510\n1450#1:1513\n1315#1:1475,7\n1322#1:1482,7\n1377#1:1501,3\n1377#1:1509\n1336#1:1489\n1338#1:1491\n1336#1:1490\n1338#1:1492\n1351#1:1494\n1353#1:1496\n1415#1:1508\n1445#1:1512\n1450#1:1515\n1463#1:1517\n1351#1:1493\n1353#1:1495\n1415#1:1507\n1445#1:1511\n1450#1:1514\n1463#1:1516\n1375#1:1497,4\n*E\n"})
public final class n0 implements q, androidx.compose.foundation.lazy.layout.y0 {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f17961y = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f17963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<i2> f17964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f17965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f17966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f17967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f17968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f17969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    private final Object f17970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final LazyLayoutItemAnimator<n0> f17971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f17972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f17973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f17974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f17975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f17976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f17977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f17978t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f17979u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f17980v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final long f17981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f17982x;

    public /* synthetic */ n0(int i10, Object obj, List list, boolean z10, int i11, int i12, int i13, int i14, int i15, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, obj, list, z10, i11, i12, i13, i14, i15, obj2, lazyLayoutItemAnimator, j10);
    }

    private final long l(long j10, Function1<? super Integer, Integer> function1) {
        return androidx.compose.ui.unit.q.f((((long) (j() ? androidx.compose.ui.unit.q.n(j10) : function1.invoke(Integer.valueOf(androidx.compose.ui.unit.q.n(j10))).intValue())) << 32) | (((long) (j() ? function1.invoke(Integer.valueOf(androidx.compose.ui.unit.q.p(j10))).intValue() : androidx.compose.ui.unit.q.p(j10))) & com.rabbitmq.client.k0.f265952a));
    }

    private final int q(long j10) {
        return j() ? androidx.compose.ui.unit.q.p(j10) : androidx.compose.ui.unit.q.n(j10);
    }

    private final int t(i2 i2Var) {
        return j() ? i2Var.c1() : i2Var.h1();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.q
    public long a() {
        return this.f17981w;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public int b() {
        return this.f17964f.size();
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.q, androidx.compose.foundation.lazy.layout.y0
    public int c() {
        return this.f17966h;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public void d(boolean z10) {
        this.f17980v = z10;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public int e() {
        return this.f17967i;
    }

    public final void f(int i10, boolean z10) {
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
        this.f17982x = androidx.compose.ui.unit.q.f((((long) iN) << 32) | (((long) iP) & com.rabbitmq.client.k0.f265952a));
        if (z10) {
            int iB = b();
            for (int i11 = 0; i11 < iB; i11++) {
                androidx.compose.foundation.lazy.layout.a0 a0VarE = this.f17971m.e(getKey(), i11);
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

    @Override // androidx.compose.foundation.lazy.staggeredgrid.q
    public long g() {
        return this.f17982x;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.q
    @Nullable
    public Object getContentType() {
        return this.f17970l;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.q, androidx.compose.foundation.lazy.layout.y0
    public int getIndex() {
        return this.f17962d;
    }

    @Override // androidx.compose.foundation.lazy.staggeredgrid.q, androidx.compose.foundation.lazy.layout.y0
    @NotNull
    public Object getKey() {
        return this.f17963e;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public long h() {
        return this.f17972n;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public boolean i() {
        return this.f17980v;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public boolean j() {
        return this.f17965g;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public void k(int i10, int i11, int i12, int i13) {
        if (j()) {
            i12 = i13;
        }
        w(i10, i11, i12);
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public int m() {
        return this.f17975q;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    @Nullable
    public Object n(int i10) {
        return this.f17964f.get(i10).c();
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public long o(int i10) {
        return g();
    }

    public final int p() {
        return this.f17976r;
    }

    public final int r() {
        return !j() ? androidx.compose.ui.unit.q.n(g()) : androidx.compose.ui.unit.q.p(g());
    }

    public final int s() {
        return this.f17974p;
    }

    @NotNull
    public String toString() {
        return super.toString();
    }

    public final boolean u() {
        return this.f17973o;
    }

    public final void v(@NotNull i2.a aVar, @NotNull d0 d0Var, boolean z10) {
        androidx.compose.ui.graphics.layer.c cVarT;
        if (!(this.f17977s != Integer.MIN_VALUE)) {
            androidx.compose.foundation.internal.e.g("position() should be called first");
        }
        List<i2> list = this.f17964f;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            i2 i2Var = list.get(i10);
            int iC1 = this.f17978t - (j() ? i2Var.c1() : i2Var.h1());
            int i11 = this.f17979u;
            long jG = g();
            androidx.compose.foundation.lazy.layout.a0 a0VarE = this.f17971m.e(getKey(), i10);
            if (a0VarE != null) {
                if (z10) {
                    a0VarE.K(jG);
                } else {
                    long jS = androidx.compose.ui.unit.q.s(!androidx.compose.ui.unit.q.k(a0VarE.u(), androidx.compose.foundation.lazy.layout.a0.f17266s.a()) ? a0VarE.u() : jG, a0VarE.v());
                    if ((q(jG) <= iC1 && q(jS) <= iC1) || (q(jG) >= i11 && q(jS) >= i11)) {
                        a0VarE.p();
                    }
                    jG = jS;
                }
                cVarT = a0VarE.t();
            } else {
                cVarT = null;
            }
            if (d0Var.r()) {
                int iN = j() ? androidx.compose.ui.unit.q.n(jG) : (this.f17977s - androidx.compose.ui.unit.q.n(jG)) - (j() ? i2Var.c1() : i2Var.h1());
                jG = androidx.compose.ui.unit.q.f((((long) (j() ? (this.f17977s - androidx.compose.ui.unit.q.p(jG)) - (j() ? i2Var.c1() : i2Var.h1()) : androidx.compose.ui.unit.q.p(jG))) & com.rabbitmq.client.k0.f265952a) | (((long) iN) << 32));
            }
            long jS2 = androidx.compose.ui.unit.q.s(jG, d0Var.e());
            if (!z10 && a0VarE != null) {
                a0VarE.J(jS2);
            }
            if (cVarT != null) {
                i2.a.v0(aVar, i2Var, jS2, cVarT, 0.0f, 4, null);
            } else {
                i2.a.t0(aVar, i2Var, jS2, 0.0f, null, 6, null);
            }
        }
    }

    public final void w(int i10, int i11, int i12) {
        long jF;
        this.f17977s = i12;
        this.f17978t = -this.f17968j;
        this.f17979u = i12 + this.f17969k;
        if (j()) {
            jF = androidx.compose.ui.unit.q.f((((long) i11) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) i10)));
        } else {
            jF = androidx.compose.ui.unit.q.f((((long) i11) & com.rabbitmq.client.k0.f265952a) | (((long) i10) << 32));
        }
        this.f17982x = jF;
    }

    public final void x(boolean z10) {
        this.f17973o = z10;
    }

    public final void y(int i10) {
        this.f17977s = i10;
        this.f17979u = i10 + this.f17969k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n0(int i10, Object obj, List<? extends i2> list, boolean z10, int i11, int i12, int i13, int i14, int i15, Object obj2, LazyLayoutItemAnimator<n0> lazyLayoutItemAnimator, long j10) {
        int iC1;
        this.f17962d = i10;
        this.f17963e = obj;
        this.f17964f = list;
        this.f17965g = z10;
        this.f17966h = i12;
        this.f17967i = i13;
        this.f17968j = i14;
        this.f17969k = i15;
        this.f17970l = obj2;
        this.f17971m = lazyLayoutItemAnimator;
        this.f17972n = j10;
        int i16 = 1;
        this.f17973o = true;
        int i17 = 0;
        if (!list.isEmpty()) {
            i2 i2Var = (i2) list.get(0);
            iC1 = j() ? i2Var.c1() : i2Var.h1();
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex) {
                int i18 = 1;
                while (true) {
                    i2 i2Var2 = (i2) list.get(i18);
                    int iC2 = j() ? i2Var2.c1() : i2Var2.h1();
                    iC1 = iC2 > iC1 ? iC2 : iC1;
                    if (i18 == lastIndex) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
        } else {
            iC1 = 0;
        }
        this.f17974p = iC1;
        this.f17975q = kotlin.ranges.r.u(iC1 + i11, 0);
        List<i2> list2 = this.f17964f;
        if (!list2.isEmpty()) {
            i2 i2Var3 = list2.get(0);
            int iH1 = j() ? i2Var3.h1() : i2Var3.c1();
            int lastIndex2 = CollectionsKt.getLastIndex(list2);
            if (1 <= lastIndex2) {
                while (true) {
                    i2 i2Var4 = list2.get(i16);
                    int iH2 = j() ? i2Var4.h1() : i2Var4.c1();
                    iH1 = iH2 > iH1 ? iH2 : iH1;
                    if (i16 == lastIndex2) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            i17 = iH1;
        }
        this.f17976r = i17;
        this.f17977s = Integer.MIN_VALUE;
        this.f17981w = j() ? androidx.compose.ui.unit.u.e((((long) this.f17974p) & com.rabbitmq.client.k0.f265952a) | (((long) i17) << 32)) : androidx.compose.ui.unit.u.e((((long) i17) & com.rabbitmq.client.k0.f265952a) | (((long) this.f17974p) << 32));
        this.f17982x = androidx.compose.ui.unit.q.f42709b.b();
    }
}
