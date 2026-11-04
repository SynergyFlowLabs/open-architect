package androidx.compose.foundation.lazy.grid;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.b2
@SourceDebugExtension({"SMAP\nLazyGridCacheWindowStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridCacheWindowStrategy.kt\nandroidx/compose/foundation/lazy/grid/LazyGridCacheWindowScope\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n231#2,2:165\n35#2,5:167\n233#2:172\n35#2,5:173\n1#3:178\n*S KotlinDebug\n*F\n+ 1 LazyGridCacheWindowStrategy.kt\nandroidx/compose/foundation/lazy/grid/LazyGridCacheWindowScope\n*L\n131#1:165,2\n131#1:167,5\n131#1:172\n132#1:173,5\n*E\n"})
final class i implements androidx.compose.foundation.lazy.layout.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0 f16812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c1 f16813b;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function2 function2, int i10, a1 a1Var) {
        int iC = a1Var.c();
        int iT = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < iC; i11++) {
            iT = kotlin.comparisons.a.T(a1Var.a(i11), new int[0]);
        }
        if (iT != Integer.MIN_VALUE) {
            function2.invoke(Integer.valueOf(i10), Integer.valueOf(iT));
        }
        return Unit.f312394a;
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public boolean b() {
        return !o().h().isEmpty();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int c() {
        return o().c();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @NotNull
    public List<androidx.compose.foundation.lazy.layout.i1.b> d(final int i10, @NotNull final Function2<? super Integer, ? super Integer, Unit> function2) {
        return q().a(i10, new Function1() { // from class: androidx.compose.foundation.lazy.grid.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.r(function2, i10, (a1) obj);
            }
        });
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int e(int i10) {
        int iH = i10 + h();
        List<x> listH = o().h();
        ArrayList arrayList = new ArrayList(listH.size());
        int size = listH.size();
        for (int i11 = 0; i11 < size; i11++) {
            x xVar = listH.get(i11);
            if (p(xVar) == iH) {
                arrayList.add(xVar);
            }
        }
        int size2 = arrayList.size();
        int iMax = 0;
        for (int i12 = 0; i12 < size2; i12++) {
            iMax = Math.max(androidx.compose.foundation.gestures.snapping.e.f((x) arrayList.get(i12), o().getOrientation()), iMax);
        }
        return iMax;
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int f() {
        return o0.a(o());
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int g() {
        n0 n0VarO = o();
        u0 u0Var = n0VarO instanceof u0 ? (u0) n0VarO : null;
        if (u0Var == null || c() == 0) {
            return -1;
        }
        return u0Var.t().invoke(Integer.valueOf(c() - 1)).intValue();
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    @Nullable
    public androidx.compose.ui.unit.d getDensity() {
        n0 n0VarO = o();
        u0 u0Var = n0VarO instanceof u0 ? (u0) n0VarO : null;
        if (u0Var != null) {
            return u0Var.q();
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int h() {
        return p((x) CollectionsKt.first((List) o().h()));
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int i(int i10) {
        return h() + i10;
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int j() {
        return (l() - h()) + 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int k(int i10) {
        n0 n0VarO = o();
        u0 u0Var = n0VarO instanceof u0 ? (u0) n0VarO : null;
        if (u0Var == null) {
            return -1;
        }
        List<Pair<Integer, androidx.compose.ui.unit.b>> listInvoke = u0Var.u().invoke(Integer.valueOf(i10));
        if (listInvoke.isEmpty()) {
            return -1;
        }
        return (((Number) ((Pair) CollectionsKt.first((List) listInvoke)).getFirst()).intValue() + listInvoke.size()) - 1;
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int l() {
        return p((x) CollectionsKt.last((List) o().h()));
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int m() {
        return Math.abs(kotlin.ranges.r.B(androidx.compose.foundation.gestures.snapping.e.d((x) CollectionsKt.first((List) o().h()), o().getOrientation()) + o().f(), 0));
    }

    @Override // androidx.compose.foundation.lazy.layout.i
    public int n() {
        x xVar = (x) CollectionsKt.last((List) o().h());
        return Math.abs(((androidx.compose.foundation.gestures.snapping.e.d(xVar, o().getOrientation()) + androidx.compose.foundation.gestures.snapping.e.f(xVar, o().getOrientation())) + o().g()) - o().e());
    }

    @NotNull
    public final n0 o() {
        n0 n0Var = this.f16812a;
        if (n0Var != null) {
            return n0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layoutInfo");
        return null;
    }

    public final int p(@NotNull x xVar) {
        return y.a(xVar, o().getOrientation());
    }

    @NotNull
    public final c1 q() {
        c1 c1Var = this.f16813b;
        if (c1Var != null) {
            return c1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("prefetchScope");
        return null;
    }

    public final void s(@NotNull n0 n0Var) {
        this.f16812a = n0Var;
    }

    public final void t(@NotNull c1 c1Var) {
        this.f16813b = c1Var;
    }
}
