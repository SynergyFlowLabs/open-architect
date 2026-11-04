package androidx.compose.foundation.lazy.layout;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nCacheWindowLogic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheWindowLogic.kt\nandroidx/compose/foundation/lazy/layout/CacheWindowLogic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CacheWindowLogic.kt\nandroidx/compose/foundation/lazy/layout/CacheWindowLogicKt\n+ 4 IntObjectMap.kt\nandroidx/collection/MutableIntObjectMap\n+ 5 IntObjectMap.kt\nandroidx/collection/IntObjectMap\n+ 6 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 7 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 8 IntIntMap.kt\nandroidx/collection/IntIntMap\n+ 9 IntSet.kt\nandroidx/collection/IntSet\n*L\n1#1,469:1\n1#2:470\n1#2:472\n463#3:471\n464#3:473\n747#4:474\n749#4:488\n750#4,3:494\n753#4:503\n354#5,6:475\n364#5,3:482\n367#5,2:486\n370#5,6:497\n390#5,3:519\n354#5,6:522\n364#5,3:529\n367#5,9:533\n393#5:542\n1399#6:481\n1270#6:485\n1399#6:528\n1270#6:532\n1399#6:552\n1270#6:556\n1399#6:578\n1270#6:582\n35#7,5:489\n35#7,5:504\n35#7,5:509\n35#7,5:514\n35#7,5:585\n395#8,3:543\n359#8,6:546\n369#8,3:553\n372#8,9:557\n398#8:566\n255#9,4:567\n225#9,7:571\n236#9,3:579\n239#9,2:583\n242#9,6:590\n259#9:596\n*S KotlinDebug\n*F\n+ 1 CacheWindowLogic.kt\nandroidx/compose/foundation/lazy/layout/CacheWindowLogic\n*L\n126#1:472\n126#1:471\n126#1:473\n212#1:474\n212#1:488\n212#1:494,3\n212#1:503\n212#1:475,6\n212#1:482,3\n212#1:486,2\n212#1:497,6\n392#1:519,3\n392#1:522,6\n392#1:529,3\n392#1:533,9\n392#1:542\n212#1:481\n212#1:485\n392#1:528\n392#1:532\n394#1:552\n394#1:556\n396#1:578\n396#1:582\n213#1:489,5\n347#1:504,5\n355#1:509,5\n386#1:514,5\n397#1:585,5\n394#1:543,3\n394#1:546,6\n394#1:553,3\n394#1:557,9\n394#1:566\n396#1:567,4\n396#1:571,7\n396#1:579,3\n396#1:583,2\n396#1:590,6\n396#1:596\n*E\n"})
public abstract class g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f17389n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w f17390a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f17394e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17396g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f17399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f17400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f17401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f17402m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.collection.t1<List<i1.b>> f17391b = androidx.collection.k0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.collection.u1 f17392c = androidx.collection.m0.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.collection.q1 f17393d = androidx.collection.d0.j();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f17395f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f17397h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f17398i = Integer.MIN_VALUE;

    public g(@NotNull w wVar) {
        this.f17390a = wVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002e  */
    private final void A(final i iVar) {
        int i10;
        if (Math.signum(this.f17394e) <= 0.0f) {
            if (this.f17400k > 0) {
                i10 = this.f17398i + 1;
            } else {
                i10 = -1;
            }
        } else if (Math.signum(this.f17394e) <= 0.0f || this.f17399j <= 0) {
            i10 = -1;
        } else {
            i10 = this.f17397h - 1;
        }
        if (i10 > 0 && iVar.k(i10) != -1 && iVar.k(i10) < this.f17402m) {
            this.f17391b.j0(i10, iVar.d(i10, new Function2() { // from class: androidx.compose.foundation.lazy.layout.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.B(this.f17379a, iVar, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(g gVar, i iVar, int i10, int i11) {
        gVar.s(iVar, i10, i11);
        return Unit.f312394a;
    }

    private final void C() {
        androidx.compose.ui.util.a.b("prefetchWindowStartExtraSpace", this.f17399j);
        androidx.compose.ui.util.a.b("prefetchWindowEndExtraSpace", this.f17400k);
        androidx.compose.ui.util.a.b("prefetchWindowStartIndex", this.f17397h);
        androidx.compose.ui.util.a.b("prefetchWindowEndIndex", this.f17398i);
    }

    private final void j(int i10, int i11) {
        this.f17393d.k0(i10, i11);
        if (i10 > this.f17398i) {
            this.f17398i = i10;
            this.f17400k -= i11;
        } else if (i10 < this.f17397h) {
            this.f17397h = i10;
            this.f17399j -= i11;
        }
    }

    private final void k(int i10, int i11) {
        if (this.f17393d.e(i10) && this.f17393d.n(i10) != i11) {
            this.f17401l = true;
        }
        this.f17393d.k0(i10, i11);
        this.f17397h = Math.min(this.f17397h, i10);
        this.f17398i = Math.max(this.f17398i, i10);
        List<i1.b> listE0 = this.f17391b.e0(i10);
        if (listE0 != null) {
            int size = listE0.size();
            for (int i12 = 0; i12 < size; i12++) {
                listE0.get(i12).cancel();
            }
        }
    }

    private final void l(i iVar, float f10) {
        if (iVar.b()) {
            int iF = iVar.f();
            w wVar = this.f17390a;
            androidx.compose.ui.unit.d density = iVar.getDensity();
            int iA = density != null ? wVar.a(density, iF) : 0;
            this.f17402m = iVar.c();
            t(iVar.h(), iVar.l(), iVar.n(), iVar.m(), iA, f10, iVar.c());
        }
    }

    private final void m(i iVar, float f10) {
        if (iVar.b()) {
            int iF = iVar.f();
            w wVar = this.f17390a;
            androidx.compose.ui.unit.d density = iVar.getDensity();
            int iB = density != null ? wVar.b(density, iF) : 0;
            u(iVar, iVar.h(), iVar.l(), iB, iVar.n(), iVar.m(), f10, f10 <= 0.0f);
        }
    }

    private final int n(final i iVar, int i10, boolean z10) {
        List<i1.b> listN;
        List<i1.b> listN2;
        if (this.f17393d.e(i10)) {
            return this.f17393d.n(i10);
        }
        int i11 = 0;
        if (this.f17391b.e(i10)) {
            if (z10 && (listN2 = this.f17391b.n(i10)) != null) {
                int size = listN2.size();
                while (i11 < size) {
                    listN2.get(i11).c();
                    i11++;
                }
            }
            return -1;
        }
        this.f17391b.j0(i10, iVar.d(i10, new Function2() { // from class: androidx.compose.foundation.lazy.layout.e
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return g.o(this.f17369a, iVar, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }));
        if (z10 && (listN = this.f17391b.n(i10)) != null) {
            int size2 = listN.size();
            while (i11 < size2) {
                listN.get(i11).c();
                i11++;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(g gVar, i iVar, int i10, int i11) {
        gVar.s(iVar, i10, i11);
        return Unit.f312394a;
    }

    private final void s(i iVar, int i10, int i11) {
        j(i10, i11);
        A(iVar);
        C();
    }

    private final void t(int i10, int i11, int i12, int i13, int i14, float f10, int i15) {
        int i16;
        int i17;
        if (f10 <= 0.0f) {
            this.f17399j = i14 - i13;
            this.f17397h = i10;
            while (this.f17399j > 0 && (i17 = this.f17397h) > 0 && this.f17393d.e(i17 - 1)) {
                int iN = this.f17393d.n(this.f17397h - 1);
                this.f17397h--;
                this.f17399j -= iN;
            }
            y(0, this.f17397h - 1);
            return;
        }
        this.f17400k = i14 - i12;
        this.f17398i = i11;
        while (this.f17400k > 0 && (i16 = this.f17398i) < i15 - 1 && this.f17393d.e(i16 + 1)) {
            int iN2 = this.f17393d.n(this.f17398i + 1);
            this.f17398i++;
            this.f17400k -= iN2;
        }
        y(this.f17398i + 1, i15 - 1);
    }

    private final void u(i iVar, int i10, int i11, int i12, int i13, int i14, float f10, boolean z10) {
        int i15;
        boolean z11 = Math.signum(f10) == Math.signum(this.f17394e);
        if (!z10) {
            if (!z11 || this.f17401l) {
                this.f17399j = i12 - i14;
                this.f17397h = i10;
            } else {
                this.f17399j += kotlin.math.b.L0(Math.abs(f10));
            }
            while (this.f17399j > 0 && (i15 = this.f17397h) > 0) {
                int iN = n(iVar, this.f17397h - 1, i15 + (-1) == i10 + (-1) && Math.abs(f10) >= ((float) i14));
                if (iN == -1) {
                    return;
                }
                this.f17397h--;
                this.f17399j -= iN;
            }
            return;
        }
        if (!z11 || this.f17401l) {
            this.f17400k = i12 - i13;
            this.f17398i = i11;
        } else {
            this.f17400k += kotlin.math.b.L0(Math.abs(f10));
        }
        while (this.f17400k > 0 && iVar.k(this.f17398i) != -1 && iVar.k(this.f17398i) < this.f17402m - 1) {
            int iN2 = n(iVar, this.f17398i + 1, this.f17398i + 1 == i11 + 1 && Math.abs(f10) >= ((float) i13));
            if (iN2 == -1) {
                return;
            }
            this.f17398i++;
            this.f17400k -= iN2;
        }
    }

    private final void x(i iVar, boolean z10) {
        if (iVar.b()) {
            int iF = iVar.f();
            w wVar = this.f17390a;
            androidx.compose.ui.unit.d density = iVar.getDensity();
            u(iVar, iVar.h(), iVar.l(), density != null ? wVar.b(density, iF) : 0, iVar.n(), iVar.m(), 0.0f, z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6 A[LOOP:2: B:28:0x0094->B:41:0x00c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9 A[EDGE_INSN: B:68:0x00c9->B:42:0x00c9 BREAK  A[LOOP:2: B:28:0x0094->B:41:0x00c6], SYNTHETIC] */
    private final void y(int i10, int i11) {
        char c10;
        long j10;
        long j11;
        long j12;
        int i12;
        char c11;
        this.f17392c.K();
        androidx.collection.t1<List<i1.b>> t1Var = this.f17391b;
        int[] iArr = t1Var.f12302b;
        long[] jArr = t1Var.f12301a;
        int length = jArr.length - 2;
        char c12 = 7;
        long j13 = -9187201950435737472L;
        if (length >= 0) {
            int i13 = 0;
            j11 = 128;
            while (true) {
                long j14 = jArr[i13];
                j12 = 255;
                if ((((~j14) << c12) & j14 & j13) != j13) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j14 & 255) < 128) {
                            c11 = c12;
                            int i16 = iArr[(i13 << 3) + i15];
                            if (i10 <= i16 && i16 <= i11) {
                                this.f17392c.G(i16);
                            }
                            j14 >>= 8;
                            i15++;
                            c12 = c11;
                            j13 = j13;
                        } else {
                            c11 = c12;
                        }
                        j14 >>= 8;
                        i15++;
                        c12 = c11;
                        j13 = j13;
                    }
                    c10 = c12;
                    j10 = j13;
                    if (i14 != 8) {
                        break;
                    }
                } else {
                    c10 = c12;
                    j10 = j13;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                c12 = c10;
                j13 = j10;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 128;
            j12 = 255;
        }
        androidx.collection.q1 q1Var = this.f17393d;
        int[] iArr2 = q1Var.f12158b;
        long[] jArr2 = q1Var.f12157a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i17 = 0;
            while (true) {
                long j15 = jArr2[i17];
                if ((((~j15) << c10) & j15 & j10) == j10) {
                    if (i17 != length2) {
                        break;
                        break;
                    }
                    i17++;
                } else {
                    int i18 = 8 - ((~(i17 - length2)) >>> 31);
                    for (int i19 = 0; i19 < i18; i19++) {
                        if ((j15 & j12) < j11 && i10 <= (i12 = iArr2[(i17 << 3) + i19]) && i12 <= i11) {
                            this.f17392c.G(i12);
                        }
                        j15 >>= 8;
                    }
                    if (i18 != 8) {
                        break;
                    } else if (i17 != length2) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        }
        androidx.collection.u1 u1Var = this.f17392c;
        int[] iArr3 = u1Var.f12340b;
        long[] jArr3 = u1Var.f12339a;
        int length3 = jArr3.length - 2;
        if (length3 < 0) {
            return;
        }
        int i20 = 0;
        while (true) {
            long j16 = jArr3[i20];
            if ((((~j16) << c10) & j16 & j10) != j10) {
                int i21 = 8 - ((~(i20 - length3)) >>> 31);
                for (int i22 = 0; i22 < i21; i22++) {
                    if ((j16 & j12) < j11) {
                        int i23 = iArr3[(i20 << 3) + i22];
                        List<i1.b> listE0 = this.f17391b.e0(i23);
                        if (listE0 != null) {
                            int size = listE0.size();
                            for (int i24 = 0; i24 < size; i24++) {
                                listE0.get(i24).cancel();
                            }
                        }
                        this.f17393d.f0(i23);
                    }
                    j16 >>= 8;
                }
                if (i21 != 8) {
                    return;
                }
            }
            if (i20 == length3) {
                return;
            } else {
                i20++;
            }
        }
    }

    public final int p() {
        return this.f17398i;
    }

    public final int q() {
        return this.f17397h;
    }

    public final boolean r() {
        if (this.f17397h == Integer.MAX_VALUE || this.f17398i == Integer.MIN_VALUE) {
            return false;
        }
        int i10 = 0 << 1;
        return true;
    }

    public final void v(@NotNull i iVar, float f10) {
        C();
        l(iVar, f10);
        m(iVar, f10);
        this.f17394e = f10;
        C();
    }

    public final void w(@NotNull i iVar) {
        boolean z10 = true;
        if (!this.f17396g) {
            w wVar = this.f17390a;
            androidx.compose.ui.unit.d density = iVar.getDensity();
            if ((density != null ? wVar.b(density, iVar.f()) : 0) != 0) {
                this.f17401l = true;
            }
            this.f17396g = true;
        }
        int i10 = this.f17395f;
        if (i10 != -1 && i10 != iVar.c()) {
            this.f17401l = true;
            this.f17397h = kotlin.ranges.r.u(this.f17397h, 0);
            int iG = iVar.g();
            if (iG != -1) {
                this.f17398i = kotlin.ranges.r.B(this.f17398i, iG);
            }
        }
        this.f17402m = iVar.c();
        if (iVar.b()) {
            int iJ = iVar.j();
            for (int i11 = 0; i11 < iJ; i11++) {
                k(iVar.i(i11), iVar.e(i11));
            }
            if (this.f17401l) {
                if (this.f17394e > 0.0f) {
                    z10 = false;
                }
                x(iVar, z10);
                this.f17401l = false;
            }
        } else {
            z();
        }
        this.f17395f = iVar.c();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0083 A[LOOP:0: B:5:0x0023->B:19:0x0083, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0088 A[EDGE_INSN: B:23:0x0088->B:20:0x0088 BREAK  A[LOOP:0: B:5:0x0023->B:19:0x0083], SYNTHETIC] */
    public final void z() {
        this.f17397h = Integer.MAX_VALUE;
        this.f17398i = Integer.MIN_VALUE;
        this.f17399j = 0;
        this.f17400k = 0;
        this.f17401l = false;
        this.f17393d.P();
        androidx.collection.t1<List<i1.b>> t1Var = this.f17391b;
        long[] jArr = t1Var.f12301a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            int i14 = t1Var.f12302b[i13];
                            List list = (List) t1Var.f12303c[i13];
                            int size = list.size();
                            for (int i15 = 0; i15 < size; i15++) {
                                ((i1.b) list.get(i15)).cancel();
                            }
                            t1Var.h0(i13);
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    } else if (i10 != length) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
        }
    }
}
