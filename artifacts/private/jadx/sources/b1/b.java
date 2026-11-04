package b1;

import androidx.compose.animation.core.l3;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.runtime.internal.w0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAnimatedVisibilityClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibilityClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1557#2:94\n1628#2,3:95\n1053#2:98\n774#2:99\n865#2,2:100\n1611#2,9:102\n1863#2:111\n1864#2:113\n1620#2:114\n1053#2:115\n774#2:116\n865#2,2:117\n1#3:112\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibilityClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n*L\n70#1:94\n70#1:95,3\n71#1:98\n72#1:99\n72#1:100,2\n81#1:102,9\n81#1:111\n81#1:113\n81#1:114\n84#1:115\n85#1:116\n85#1:117,2\n81#1:112\n*E\n"})
public final class b implements c<androidx.compose.ui.tooling.animation.c, c1.a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f77508c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.tooling.animation.c f77509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private String f77510b;

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnimatedVisibilityClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n*L\n1#1,102:1\n84#2:103\n*E\n"})
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(((ComposeAnimatedProperty) t10).getLabel(), ((ComposeAnimatedProperty) t11).getLabel());
        }
    }

    /* JADX INFO: renamed from: b1.b$b, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnimatedVisibilityClock.android.kt\nandroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock\n*L\n1#1,102:1\n71#2:103\n*E\n"})
    public static final class C0795b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return kotlin.comparisons.a.l(((TransitionInfo) t10).getLabel(), ((TransitionInfo) t11).getLabel());
        }
    }

    public b(@NotNull androidx.compose.ui.tooling.animation.c cVar) {
        this.f77509a = cVar;
        this.f77510b = i().b().p().booleanValue() ? c1.a.f82371b.b() : c1.a.f82371b.a();
    }

    private final Pair<Boolean, Boolean> m(String str) {
        Boolean bool;
        Boolean bool2;
        if (c1.a.f(str, c1.a.f82371b.a())) {
            bool = Boolean.FALSE;
            bool2 = Boolean.TRUE;
        } else {
            bool = Boolean.TRUE;
            bool2 = Boolean.FALSE;
        }
        return TuplesKt.to(bool, bool2);
    }

    @Override // b1.c
    public void a(long j10) {
        l3<Boolean> l3VarB = i().b();
        Pair<Boolean, Boolean> pairM = m(k());
        Boolean boolComponent1 = pairM.component1();
        boolComponent1.booleanValue();
        Boolean boolComponent2 = pairM.component2();
        boolComponent2.booleanValue();
        l3VarB.P(boolComponent1, boolComponent2, j10);
    }

    @Override // b1.c
    public long b() {
        l3<Object> l3VarC = i().c();
        if (l3VarC != null) {
            return j.s(l3VarC.z());
        }
        return 0L;
    }

    @Override // b1.c
    @NotNull
    public List<ComposeAnimatedProperty> c() {
        l3<Object> l3VarC = i().c();
        if (l3VarC == null) {
            return CollectionsKt.emptyList();
        }
        List<l3<?>.d<?, ?>> listD = j.d(l3VarC);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            l3.d dVar = (l3.d) it.next();
            String strP = dVar.p();
            Object value = dVar.getValue();
            ComposeAnimatedProperty composeAnimatedProperty = value == null ? null : new ComposeAnimatedProperty(strP, value);
            if (composeAnimatedProperty != null) {
                arrayList.add(composeAnimatedProperty);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new a());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listSortedWith) {
            if (!j.q().contains(((ComposeAnimatedProperty) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // b1.c
    @NotNull
    public List<TransitionInfo> d(long j10) {
        l3<Object> l3VarC = i().c();
        if (l3VarC == null) {
            return CollectionsKt.emptyList();
        }
        List<l3<?>.d<?, ?>> listD = j.d(l3VarC);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(j.g((l3.d) it.next(), j10));
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, new C0795b());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listSortedWith) {
            if (!j.q().contains(((TransitionInfo) obj).getLabel())) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // b1.c
    public void e(@NotNull Object obj, @Nullable Object obj2) {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState");
        l(((c1.a) obj).j());
    }

    @Override // b1.c
    public /* bridge */ /* synthetic */ void g(c1.b bVar) {
        l(((c1.a) bVar).j());
    }

    @Override // b1.c
    public /* bridge */ /* synthetic */ c1.b getState() {
        return c1.a.c(k());
    }

    @Override // b1.c
    public long h() {
        l3<Object> l3VarC = i().c();
        if (l3VarC != null) {
            return j.s(l3VarC.z());
        }
        return 0L;
    }

    @Override // b1.c
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public androidx.compose.ui.tooling.animation.c i() {
        return this.f77509a;
    }

    @NotNull
    public String k() {
        return this.f77510b;
    }

    public void l(@NotNull String str) {
        this.f77510b = str;
        a(0L);
    }
}
