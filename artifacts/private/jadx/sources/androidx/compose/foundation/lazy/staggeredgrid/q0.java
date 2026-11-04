package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.e6;
import androidx.compose.runtime.l3;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nLazyStaggeredGridScrollPosition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,170:1\n78#2:171\n111#2,2:172\n78#2:174\n111#2,2:175\n13430#3,2:177\n118#4:179\n35#4,5:180\n119#4:185\n604#5,7:186\n604#5,7:193\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridScrollPosition.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition\n*L\n37#1:171\n37#1:172,2\n44#1:174\n44#1:175,2\n49#1:177,2\n86#1:179\n86#1:180,5\n86#1:185\n93#1:186,7\n145#1:193,7\n*E\n"})
public final class q0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f17989i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function2<Integer, Integer, int[]> f17990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private int[] f17991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l3 f17992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private int[] f17993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final l3 f17994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f17995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private Object f17996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.lazy.layout.c1 f17997h;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(@NotNull int[] iArr, @NotNull int[] iArr2, @NotNull Function2<? super Integer, ? super Integer, int[]> function2) {
        this.f17990a = function2;
        this.f17991b = iArr;
        this.f17992c = e6.b(a(iArr));
        this.f17993d = iArr2;
        this.f17994e = e6.b(b(iArr, iArr2));
        Integer numMinOrNull = ArraysKt.minOrNull(iArr);
        this.f17997h = new androidx.compose.foundation.lazy.layout.c1(numMinOrNull != null ? numMinOrNull.intValue() : 0, 90, 200);
    }

    private final int a(int[] iArr) {
        int i10 = Integer.MAX_VALUE;
        for (int i11 : iArr) {
            if (i11 <= 0) {
                return 0;
            }
            if (i10 > i11) {
                i10 = i11;
            }
        }
        if (i10 == Integer.MAX_VALUE) {
            return 0;
        }
        return i10;
    }

    private final int b(int[] iArr, int[] iArr2) {
        int iA = a(iArr);
        int length = iArr2.length;
        int iMin = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < length; i10++) {
            if (iArr[i10] == iA) {
                iMin = Math.min(iMin, iArr2[i10]);
            }
        }
        if (iMin == Integer.MAX_VALUE) {
            return 0;
        }
        return iMin;
    }

    private final void i(int i10) {
        this.f17992c.j(i10);
    }

    private final void j(int i10) {
        this.f17994e.j(i10);
    }

    private final void k(int[] iArr, int[] iArr2) {
        this.f17991b = iArr;
        i(a(iArr));
        this.f17993d = iArr2;
        j(b(iArr, iArr2));
    }

    public final int c() {
        return this.f17992c.m1();
    }

    @NotNull
    public final int[] d() {
        return this.f17991b;
    }

    @NotNull
    public final androidx.compose.foundation.lazy.layout.c1 e() {
        return this.f17997h;
    }

    public final int f() {
        return this.f17994e.m1();
    }

    @NotNull
    public final int[] g() {
        return this.f17993d;
    }

    public final void h(int i10, int i11) {
        int[] iArrInvoke = this.f17990a.invoke(Integer.valueOf(i10), Integer.valueOf(this.f17991b.length));
        int length = iArrInvoke.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = i11;
        }
        k(iArrInvoke, iArr);
        this.f17997h.d(i10);
        this.f17996g = null;
    }

    public final void l(@NotNull k0 k0Var) {
        n0 n0Var;
        int iA = a(k0Var.p());
        List<n0> listH = k0Var.h();
        int size = listH.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                n0Var = null;
                break;
            }
            n0Var = listH.get(i10);
            if (n0Var.getIndex() == iA) {
                break;
            } else {
                i10++;
            }
        }
        n0 n0Var2 = n0Var;
        this.f17996g = n0Var2 != null ? n0Var2.getKey() : null;
        this.f17997h.d(iA);
        if (!this.f17995f && k0Var.c() <= 0) {
            return;
        }
        this.f17995f = true;
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            k(k0Var.p(), k0Var.q());
            Unit unit = Unit.f312394a;
        } finally {
            aVar.x(mVarG, mVarM, function1L);
        }
    }

    public final void m(@NotNull int[] iArr) {
        this.f17993d = iArr;
        j(b(this.f17991b, iArr));
    }

    @NotNull
    public final int[] n(@NotNull androidx.compose.foundation.lazy.layout.l0 l0Var, @NotNull int[] iArr) {
        Object obj = this.f17996g;
        Integer orNull = ArraysKt.getOrNull(iArr, 0);
        int iA = androidx.compose.foundation.lazy.layout.m0.a(l0Var, obj, orNull != null ? orNull.intValue() : 0);
        if (ArraysKt.contains(iArr, iA)) {
            return iArr;
        }
        this.f17997h.d(iA);
        androidx.compose.runtime.snapshots.m.a aVar = androidx.compose.runtime.snapshots.m.f36535e;
        androidx.compose.runtime.snapshots.m mVarG = aVar.g();
        Function1<Object, Unit> function1L = mVarG != null ? mVarG.l() : null;
        androidx.compose.runtime.snapshots.m mVarM = aVar.m(mVarG);
        try {
            int[] iArrInvoke = this.f17990a.invoke(Integer.valueOf(iA), Integer.valueOf(iArr.length));
            aVar.x(mVarG, mVarM, function1L);
            this.f17991b = iArrInvoke;
            i(a(iArrInvoke));
            return iArrInvoke;
        } catch (Throwable th2) {
            aVar.x(mVarG, mVarM, function1L);
            throw th2;
        }
    }
}
