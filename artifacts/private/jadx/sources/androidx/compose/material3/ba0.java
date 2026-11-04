package androidx.compose.material3;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,3517:1\n563#2,2:3518\n34#2,6:3520\n565#2:3526\n563#2,2:3527\n34#2,6:3529\n565#2:3535\n563#2,2:3536\n34#2,6:3538\n565#2:3544\n133#2,3:3545\n34#2,6:3548\n136#2:3554\n320#2,8:3555\n133#2,3:3563\n34#2,6:3566\n136#2:3572\n320#2,8:3573\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material3/TopAppBarMeasurePolicy\n*L\n3085#1:3518,2\n3085#1:3520,6\n3085#1:3526\n3089#1:3527,2\n3089#1:3529,6\n3089#1:3535\n3101#1:3536,2\n3101#1:3538,6\n3101#1:3544\n3139#1:3545,3\n3139#1:3548,6\n3139#1:3554\n3147#1:3555,8\n3154#1:3563,3\n3154#1:3566,6\n3154#1:3572\n3162#1:3573,8\n*E\n"})
final class ba0 implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.o2 f26254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.layout.q.m f26255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e.b f26256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f26257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f26258e;

    public /* synthetic */ ba0(androidx.compose.material3.internal.o2 o2Var, androidx.compose.foundation.layout.q.m mVar, androidx.compose.ui.e.b bVar, int i10, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o2Var, mVar, bVar, i10, f10);
    }

    private final androidx.compose.ui.layout.b1 l(final androidx.compose.ui.layout.c1 c1Var, final long j10, final int i10, final int i11, final androidx.compose.ui.layout.i2 i2Var, final androidx.compose.ui.layout.i2 i2Var2, final androidx.compose.ui.layout.i2 i2Var3, final int i12) {
        return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.p(j10), i10, null, new Function1() { // from class: androidx.compose.material3.aa0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ba0.n(i2Var, i10, i2Var2, i2Var3, j10, c1Var, this, i12, i11, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x006b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0075  */
    /* JADX WARN: Code duplicated, block: B:16:0x0080  */
    /* JADX WARN: Code duplicated, block: B:18:0x0084  */
    /* JADX WARN: Code duplicated, block: B:19:0x008b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    public static final Unit n(androidx.compose.ui.layout.i2 i2Var, int i10, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.i2 i2Var3, long j10, androidx.compose.ui.layout.c1 c1Var, ba0 ba0Var, int i11, int i12, androidx.compose.ui.layout.i2.a aVar) {
        int iP;
        androidx.compose.foundation.layout.q.m mVar;
        androidx.compose.foundation.layout.q qVar;
        boolean zAreEqual;
        int i13;
        int i14;
        int iC1;
        int iC2;
        int iC3;
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, (i10 - i2Var.c1()) / 2, 0.0f, 4, null);
        int iMax = Math.max(c1Var.g6(o1.f31230k), i2Var.h1());
        int iH1 = i2Var3.h1();
        int iA = ba0Var.f26256c.a(i2Var2.h1(), androidx.compose.ui.unit.b.p(j10), androidx.compose.ui.unit.w.Ltr);
        if (iA >= iMax) {
            if (i2Var2.h1() + iA > androidx.compose.ui.unit.b.p(j10) - iH1) {
                iP = (androidx.compose.ui.unit.b.p(j10) - iH1) - (i2Var2.h1() + iA);
            }
            int i15 = iA;
            mVar = ba0Var.f26255b;
            qVar = androidx.compose.foundation.layout.q.f16330a;
            if (Intrinsics.areEqual(mVar, qVar.m())) {
                zAreEqual = Intrinsics.areEqual(mVar, qVar.k());
                i13 = 0;
                if (zAreEqual) {
                    i14 = ba0Var.f26257d;
                    if (i14 == 0) {
                        iC3 = i10 - i2Var2.c1();
                    } else {
                        iC1 = i14 - (i2Var2.c1() - i11);
                        iC2 = i2Var2.c1() + iC1;
                        if (iC2 > i12) {
                            iC1 -= iC2 - i12;
                        }
                        iC3 = (i10 - i2Var2.c1()) - Math.max(0, iC1);
                    }
                }
                androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i15, i13, 0.0f, 4, null);
                androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, androidx.compose.ui.unit.b.p(j10) - i2Var3.h1(), (i10 - i2Var3.c1()) / 2, 0.0f, 4, null);
                return Unit.f312394a;
            }
            iC3 = (i10 - i2Var2.c1()) / 2;
            i13 = iC3;
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i15, i13, 0.0f, 4, null);
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, androidx.compose.ui.unit.b.p(j10) - i2Var3.h1(), (i10 - i2Var3.c1()) / 2, 0.0f, 4, null);
            return Unit.f312394a;
        }
        iP = iMax - iA;
        iA += iP;
        int i16 = iA;
        mVar = ba0Var.f26255b;
        qVar = androidx.compose.foundation.layout.q.f16330a;
        if (Intrinsics.areEqual(mVar, qVar.m())) {
            zAreEqual = Intrinsics.areEqual(mVar, qVar.k());
            i13 = 0;
            if (zAreEqual) {
                i14 = ba0Var.f26257d;
                if (i14 == 0) {
                    iC3 = i10 - i2Var2.c1();
                } else {
                    iC1 = i14 - (i2Var2.c1() - i11);
                    iC2 = i2Var2.c1() + iC1;
                    if (iC2 > i12) {
                        iC1 -= iC2 - i12;
                    }
                    iC3 = (i10 - i2Var2.c1()) - Math.max(0, iC1);
                }
            }
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i16, i13, 0.0f, 4, null);
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, androidx.compose.ui.unit.b.p(j10) - i2Var3.h1(), (i10 - i2Var3.c1()) / 2, 0.0f, 4, null);
            return Unit.f312394a;
        }
        iC3 = (i10 - i2Var2.c1()) / 2;
        i13 = iC3;
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i16, i13, 0.0f, 4, null);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, androidx.compose.ui.unit.b.p(j10) - i2Var3.h1(), (i10 - i2Var3.c1()) / 2, 0.0f, 4, null);
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.layout.z0 z0Var = list.get(i10);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "navigationIcon")) {
                androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 14, null));
                List<? extends androidx.compose.ui.layout.z0> list2 = list;
                int size2 = list2.size();
                int i11 = 0;
                while (i11 < size2) {
                    androidx.compose.ui.layout.z0 z0Var2 = list.get(i11);
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), "actionIcons")) {
                        androidx.compose.ui.layout.i2 i2VarP1 = z0Var2.P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 14, null));
                        int iP = androidx.compose.ui.unit.b.p(j10) == Integer.MAX_VALUE ? androidx.compose.ui.unit.b.p(j10) : kotlin.ranges.r.u((androidx.compose.ui.unit.b.p(j10) - i2VarP0.h1()) - i2VarP1.h1(), 0);
                        int size3 = list2.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            androidx.compose.ui.layout.z0 z0Var3 = list.get(i12);
                            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var3), "title")) {
                                androidx.compose.ui.layout.i2 i2VarP2 = z0Var3.P0(androidx.compose.ui.unit.b.d(j10, 0, iP, 0, 0, 12, null));
                                int iM = i2VarP2.M(androidx.compose.ui.layout.b.b()) != Integer.MIN_VALUE ? i2VarP2.M(androidx.compose.ui.layout.b.b()) : 0;
                                float fInvoke = this.f26254a.invoke();
                                int iL0 = Float.isNaN(fInvoke) ? 0 : kotlin.math.b.L0(fInvoke);
                                int iMax = Math.max(c1Var.g6(this.f26258e), i2VarP2.c1());
                                if (androidx.compose.ui.unit.b.o(j10) != Integer.MAX_VALUE) {
                                    iMax = kotlin.ranges.r.u(iL0 + iMax, 0);
                                }
                                return this.l(c1Var, j10, iMax, iMax, i2VarP0, i2VarP2, i2VarP1, iM);
                            }
                            i12++;
                            this = this;
                        }
                        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                        throw new kotlin.a0();
                    }
                    i11++;
                    this = this;
                }
                androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                throw new kotlin.a0();
            }
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    @Override // androidx.compose.ui.layout.a1
    public int b(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        Integer numValueOf;
        int iG6 = zVar.g6(this.f26258e);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).D0(i10));
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).D0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iG6, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // androidx.compose.ui.layout.a1
    public int c(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        int size = list.size();
        int iL0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iL0 += list.get(i11).L0(i10);
        }
        return iL0;
    }

    @Override // androidx.compose.ui.layout.a1
    public int d(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        Integer numValueOf;
        int iG6 = zVar.g6(this.f26258e);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).p0(i10));
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).p0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iG6, numValueOf != null ? numValueOf.intValue() : 0);
    }

    @Override // androidx.compose.ui.layout.a1
    public int e(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        int size = list.size();
        int iM0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iM0 += list.get(i11).M0(i10);
        }
        return iM0;
    }

    public final float g() {
        return this.f26258e;
    }

    @NotNull
    public final androidx.compose.material3.internal.o2 h() {
        return this.f26254a;
    }

    public final int i() {
        return this.f26257d;
    }

    @NotNull
    public final androidx.compose.ui.e.b j() {
        return this.f26256c;
    }

    @NotNull
    public final androidx.compose.foundation.layout.q.m k() {
        return this.f26255b;
    }

    private ba0(androidx.compose.material3.internal.o2 o2Var, androidx.compose.foundation.layout.q.m mVar, androidx.compose.ui.e.b bVar, int i10, float f10) {
        this.f26254a = o2Var;
        this.f26255b = mVar;
        this.f26256c = bVar;
        this.f26257d = i10;
        this.f26258e = f10;
    }
}
