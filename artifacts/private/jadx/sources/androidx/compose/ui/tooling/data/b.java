package androidx.compose.ui.tooling.data;

import androidx.compose.ui.layout.l0;
import androidx.compose.ui.unit.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@n
@SourceDebugExtension({"SMAP\nSlotTree.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/CompositionCallStack\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,660:1\n1863#2,2:661\n1#3:663\n381#4,7:664\n*S KotlinDebug\n*F\n+ 1 SlotTree.jvm.kt\nandroidx/compose/ui/tooling/data/CompositionCallStack\n*L\n327#1:661,2\n394#1:664,7\n*E\n"})
final class b<T> implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final pj.n<androidx.compose.runtime.tooling.m, k, List<? extends T>, T> f42505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f42506b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42508d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<androidx.compose.runtime.tooling.m> f42507c = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private s f42509e = j.m();

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull pj.n<? super androidx.compose.runtime.tooling.m, ? super k, ? super List<? extends T>, ? extends T> nVar, @NotNull Map<String, Object> map) {
        this.f42505a = nVar;
        this.f42506b = map;
    }

    private final l a(String str) {
        Map<String, Object> map = this.f42506b;
        Object objU = map.get(str);
        if (objU == null) {
            objU = j.u(str, null, 2, null);
            map.put(str, objU);
        }
        if (objU instanceof l) {
            return (l) objU;
        }
        return null;
    }

    private final androidx.compose.runtime.tooling.m c() {
        return this.f42507c.last();
    }

    private final boolean d(androidx.compose.runtime.tooling.m mVar) {
        String strU1 = mVar.U1();
        if (strU1 != null) {
            return StringsKt.u2(strU1, "C", false, 2, null);
        }
        return false;
    }

    private final androidx.compose.runtime.tooling.m e(int i10) {
        if (this.f42507c.size() <= i10) {
            return null;
        }
        ArrayDeque<androidx.compose.runtime.tooling.m> arrayDeque = this.f42507c;
        return arrayDeque.get((arrayDeque.size() - i10) - 1);
    }

    private final androidx.compose.runtime.tooling.m f() {
        return this.f42507c.removeLast();
    }

    private final void g(androidx.compose.runtime.tooling.m mVar) {
        this.f42507c.addLast(mVar);
    }

    @NotNull
    public final s b(@NotNull androidx.compose.runtime.tooling.m mVar, int i10, @NotNull List<T> list) {
        s sVarE;
        ArrayList arrayList = new ArrayList();
        s sVarM = j.m();
        g(mVar);
        int i11 = 0;
        for (androidx.compose.runtime.tooling.m mVar2 : mVar.i()) {
            sVarM = j.v(sVarM, b(mVar2, i11, arrayList));
            if (d(mVar2)) {
                i11++;
            }
        }
        Object objW = mVar.w();
        l0 l0Var = objW instanceof l0 ? (l0) objW : null;
        if (l0Var != null && (sVarE = j.e(l0Var)) != null) {
            sVarM = sVarE;
        }
        this.f42508d = i10;
        this.f42509e = sVarM;
        T tInvoke = this.f42505a.invoke(mVar, this, arrayList);
        if (tInvoke != null) {
            list.add(tInvoke);
        }
        f();
        return sVarM;
    }

    @Override // androidx.compose.ui.tooling.data.k
    @NotNull
    public s getBounds() {
        return this.f42509e;
    }

    @Override // androidx.compose.ui.tooling.data.k
    public int getDepth() {
        return this.f42507c.size();
    }

    @Override // androidx.compose.ui.tooling.data.k
    @Nullable
    public m getLocation() {
        String strU1;
        l lVarA;
        String strU2;
        androidx.compose.runtime.tooling.m mVarE = e(1);
        if (mVarE != null && (strU1 = mVarE.U1()) != null && (lVarA = a(strU1)) != null) {
            int i10 = 2;
            l lVarA2 = lVarA;
            while (i10 < this.f42507c.size()) {
                if ((lVarA2 != null ? lVarA2.f() : null) != null) {
                    break;
                }
                int i11 = i10 + 1;
                androidx.compose.runtime.tooling.m mVarE2 = e(i10);
                lVarA2 = (mVarE2 == null || (strU2 = mVarE2.U1()) == null) ? null : a(strU2);
                i10 = i11;
            }
            return lVarA.j(this.f42508d, lVarA2);
        }
        return null;
    }

    @Override // androidx.compose.ui.tooling.data.k
    @Nullable
    public String getName() {
        int i10;
        String strU1 = c().U1();
        String strSubstring = null;
        if (strU1 == null) {
            return null;
        }
        if (!StringsKt.u2(strU1, "CC(", false, 2, null)) {
            if (StringsKt.u2(strU1, "C(", false, 2, null)) {
                i10 = 2;
            }
            return strSubstring;
        }
        i10 = 3;
        int iQ3 = StringsKt.q3(strU1, ')', 0, false, 6, null);
        if (iQ3 > 2) {
            strSubstring = strU1.substring(i10, iQ3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        return strSubstring;
    }

    @Override // androidx.compose.ui.tooling.data.k
    @NotNull
    public List<h> getParameters() {
        l lVarA;
        androidx.compose.runtime.tooling.m mVarC = c();
        String strU1 = mVarC.U1();
        if (strU1 != null && (lVarA = a(strU1)) != null) {
            ArrayList arrayList = new ArrayList();
            CollectionsKt.addAll(arrayList, mVarC.getData());
            return j.i(arrayList, lVarA);
        }
        return CollectionsKt.emptyList();
    }

    @Override // androidx.compose.ui.tooling.data.k
    public boolean isInline() {
        String strU1 = c().U1();
        return strU1 != null && StringsKt.u2(strU1, "CC", false, 2, null);
    }
}
