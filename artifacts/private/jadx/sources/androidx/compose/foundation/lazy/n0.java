package androidx.compose.foundation.lazy;

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
@SourceDebugExtension({"SMAP\nLazyListMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,268:1\n264#1:292\n264#1:299\n35#2,5:269\n71#2,3:274\n75#2:287\n109#3,5:277\n109#3,5:282\n97#3,4:295\n32#4:288\n32#4:290\n32#4:293\n32#4:300\n32#4:302\n80#5:289\n80#5:291\n80#5:294\n80#5:301\n80#5:303\n*S KotlinDebug\n*F\n+ 1 LazyListMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyListMeasuredItem\n*L\n187#1:292\n233#1:299\n97#1:269,5\n129#1:274,3\n129#1:287\n133#1:277,5\n142#1:282,5\n195#1:295,4\n164#1:288\n166#1:290\n187#1:293\n233#1:300\n264#1:302\n164#1:289\n166#1:291\n187#1:294\n233#1:301\n264#1:303\n*E\n"})
public final class n0 implements v, androidx.compose.foundation.lazy.layout.y0 {
    public static final int D = 8;
    private int A;
    private int B;

    @NotNull
    private final int[] C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<i2> f17660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f17661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.e.b f17662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final androidx.compose.ui.e.c f17663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.w f17664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f17665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f17666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f17667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f17668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f17669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final Object f17670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    private final Object f17671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final LazyLayoutItemAnimator<n0> f17672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final long f17673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f17674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f17675t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f17676u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int f17677v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f17678w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f17679x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f17680y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f17681z;

    public /* synthetic */ n0(int i10, List list, boolean z10, androidx.compose.ui.e.b bVar, androidx.compose.ui.e.c cVar, androidx.compose.ui.unit.w wVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, z10, bVar, cVar, wVar, z11, i11, i12, i13, j10, obj, obj2, lazyLayoutItemAnimator, j11);
    }

    private final long f(long j10, Function1<? super Integer, Integer> function1) {
        int iIntValue;
        int iP;
        if (j()) {
            iIntValue = androidx.compose.ui.unit.q.n(j10);
            iP = function1.invoke(Integer.valueOf(androidx.compose.ui.unit.q.p(j10))).intValue();
        } else {
            iIntValue = function1.invoke(Integer.valueOf(androidx.compose.ui.unit.q.n(j10))).intValue();
            iP = androidx.compose.ui.unit.q.p(j10);
        }
        return androidx.compose.ui.unit.q.f((((long) iP) & com.rabbitmq.client.k0.f265952a) | (((long) iIntValue) << 32));
    }

    private final int l(long j10) {
        return j() ? androidx.compose.ui.unit.q.p(j10) : androidx.compose.ui.unit.q.n(j10);
    }

    private final int p(i2 i2Var) {
        return j() ? i2Var.c1() : i2Var.h1();
    }

    public final void a(int i10, boolean z10) {
        int iIntValue;
        int iP;
        if (i()) {
            return;
        }
        this.f17674s = getOffset() + i10;
        int length = this.C.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 & 1;
            if ((j() && i12 != 0) || (!j() && i12 == 0)) {
                int[] iArr = this.C;
                iArr[i11] = iArr[i11] + i10;
            }
        }
        if (z10) {
            int iB = b();
            for (int i13 = 0; i13 < iB; i13++) {
                androidx.compose.foundation.lazy.layout.a0 a0VarE = this.f17672q.e(getKey(), i13);
                if (a0VarE != null) {
                    long jX = a0VarE.x();
                    if (j()) {
                        iIntValue = androidx.compose.ui.unit.q.n(jX);
                        iP = Integer.valueOf(androidx.compose.ui.unit.q.p(jX) + i10).intValue();
                    } else {
                        iIntValue = Integer.valueOf(androidx.compose.ui.unit.q.n(jX) + i10).intValue();
                        iP = androidx.compose.ui.unit.q.p(jX);
                    }
                    a0VarE.O(androidx.compose.ui.unit.q.f((((long) iIntValue) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) iP))));
                }
            }
        }
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public int b() {
        return this.f17660e.size();
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public int c() {
        return this.f17676u;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public void d(boolean z10) {
        this.f17680y = z10;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public int e() {
        return this.f17677v;
    }

    public final int g() {
        return this.f17679x;
    }

    @Override // androidx.compose.foundation.lazy.v
    @Nullable
    public Object getContentType() {
        return this.f17671p;
    }

    @Override // androidx.compose.foundation.lazy.v, androidx.compose.foundation.lazy.layout.y0
    public int getIndex() {
        return this.f17659d;
    }

    @Override // androidx.compose.foundation.lazy.v, androidx.compose.foundation.lazy.layout.y0
    @NotNull
    public Object getKey() {
        return this.f17670o;
    }

    @Override // androidx.compose.foundation.lazy.v
    public int getOffset() {
        return this.f17674s;
    }

    @Override // androidx.compose.foundation.lazy.v
    public int getSize() {
        return this.f17675t;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public long h() {
        return this.f17673r;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public boolean i() {
        return this.f17680y;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public boolean j() {
        return this.f17661f;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public void k(int i10, int i11, int i12, int i13) {
        r(i10, i12, i13);
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public int m() {
        return this.f17678w;
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    @Nullable
    public Object n(int i10) {
        return this.f17660e.get(i10).c();
    }

    @Override // androidx.compose.foundation.lazy.layout.y0
    public long o(int i10) {
        if (i10 != 0 || b() != 0) {
            int[] iArr = this.C;
            int i11 = i10 * 2;
            int i12 = iArr[i11];
            return androidx.compose.ui.unit.q.f((((long) iArr[i11 + 1]) & com.rabbitmq.client.k0.f265952a) | (((long) i12) << 32));
        }
        boolean zJ = j();
        int offset = getOffset();
        if (!zJ) {
            return androidx.compose.ui.unit.q.f((((long) offset) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) 0)));
        }
        return androidx.compose.ui.unit.q.f((((long) offset) & com.rabbitmq.client.k0.f265952a) | (((long) 0) << 32));
    }

    public final void q(@NotNull i2.a aVar, boolean z10) {
        androidx.compose.ui.graphics.layer.c cVarT;
        i2.a aVar2;
        long jN;
        int i10 = 0;
        if (!(this.f17681z != Integer.MIN_VALUE)) {
            androidx.compose.foundation.internal.e.g("position() should be called first");
        }
        int iB = b();
        while (i10 < iB) {
            i2 i2Var = this.f17660e.get(i10);
            int iP = this.A - p(i2Var);
            int i11 = this.B;
            long jO = o(i10);
            androidx.compose.foundation.lazy.layout.a0 a0VarE = this.f17672q.e(getKey(), i10);
            if (a0VarE != null) {
                if (z10) {
                    a0VarE.K(jO);
                } else {
                    if (!androidx.compose.ui.unit.q.k(a0VarE.u(), androidx.compose.foundation.lazy.layout.a0.f17266s.a())) {
                        jO = a0VarE.u();
                    }
                    long jS = androidx.compose.ui.unit.q.s(jO, a0VarE.v());
                    if ((l(jO) <= iP && l(jS) <= iP) || (l(jO) >= i11 && l(jS) >= i11)) {
                        a0VarE.p();
                    }
                    jO = jS;
                }
                cVarT = a0VarE.t();
            } else {
                cVarT = null;
            }
            if (this.f17665j) {
                if (j()) {
                    jN = (((long) ((this.f17681z - androidx.compose.ui.unit.q.p(jO)) - p(i2Var))) & com.rabbitmq.client.k0.f265952a) | (((long) androidx.compose.ui.unit.q.n(jO)) << 32);
                } else {
                    jN = (((long) ((this.f17681z - androidx.compose.ui.unit.q.n(jO)) - p(i2Var))) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) androidx.compose.ui.unit.q.p(jO)));
                }
                jO = androidx.compose.ui.unit.q.f(jN);
            }
            long jS2 = androidx.compose.ui.unit.q.s(jO, this.f17669n);
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

    public final void r(int i10, int i11, int i12) {
        int iH1;
        this.f17674s = i10;
        this.f17681z = j() ? i12 : i11;
        List<i2> list = this.f17660e;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            i2 i2Var = list.get(i13);
            int i14 = i13 * 2;
            if (j()) {
                int[] iArr = this.C;
                androidx.compose.ui.e.b bVar = this.f17662g;
                if (bVar == null) {
                    androidx.compose.foundation.internal.e.h("null horizontalAlignment when isVertical == true");
                    throw new kotlin.a0();
                }
                iArr[i14] = bVar.a(i2Var.h1(), i11, this.f17664i);
                this.C[i14 + 1] = i10;
                iH1 = i2Var.c1();
            } else {
                int[] iArr2 = this.C;
                iArr2[i14] = i10;
                int i15 = i14 + 1;
                androidx.compose.ui.e.c cVar = this.f17663h;
                if (cVar == null) {
                    androidx.compose.foundation.internal.e.h("null verticalAlignment when isVertical == false");
                    throw new kotlin.a0();
                }
                iArr2[i15] = cVar.a(i2Var.c1(), i12);
                iH1 = i2Var.h1();
            }
            i10 += iH1;
        }
        this.A = -this.f17666k;
        this.B = this.f17681z + this.f17667l;
    }

    public final void s(int i10) {
        this.f17681z = i10;
        this.B = i10 + this.f17667l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n0(int i10, List<? extends i2> list, boolean z10, androidx.compose.ui.e.b bVar, androidx.compose.ui.e.c cVar, androidx.compose.ui.unit.w wVar, boolean z11, int i11, int i12, int i13, long j10, Object obj, Object obj2, LazyLayoutItemAnimator<n0> lazyLayoutItemAnimator, long j11) {
        this.f17659d = i10;
        this.f17660e = list;
        this.f17661f = z10;
        this.f17662g = bVar;
        this.f17663h = cVar;
        this.f17664i = wVar;
        this.f17665j = z11;
        this.f17666k = i11;
        this.f17667l = i12;
        this.f17668m = i13;
        this.f17669n = j10;
        this.f17670o = obj;
        this.f17671p = obj2;
        this.f17672q = lazyLayoutItemAnimator;
        this.f17673r = j11;
        this.f17677v = 1;
        this.f17681z = Integer.MIN_VALUE;
        int size = list.size();
        int iC1 = 0;
        int iMax = 0;
        for (int i14 = 0; i14 < size; i14++) {
            i2 i2Var = (i2) list.get(i14);
            iC1 += j() ? i2Var.c1() : i2Var.h1();
            iMax = Math.max(iMax, !j() ? i2Var.c1() : i2Var.h1());
        }
        this.f17675t = iC1;
        this.f17678w = kotlin.ranges.r.u(getSize() + this.f17668m, 0);
        this.f17679x = iMax;
        this.C = new int[this.f17660e.size() * 2];
    }
}
