package androidx.compose.ui.semantics;

import androidx.collection.k0;
import androidx.collection.t1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSemanticsSort.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsSort.kt\nandroidx/compose/ui/semantics/SemanticsSortKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,270:1\n35#2,5:271\n35#2,5:276\n35#2,5:281\n*S KotlinDebug\n*F\n+ 1 SemanticsSort.kt\nandroidx/compose/ui/semantics/SemanticsSortKt\n*L\n47#1:271,5\n78#1:276,5\n125#1:281,5\n*E\n"})
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Comparator<u>[] f41114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Function2<u, u, Integer> f41115b;

    static final class a extends l0 implements Function2<u, u, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41116a = new a();

        /* JADX INFO: renamed from: androidx.compose.ui.semantics.i0$a$a, reason: collision with other inner class name */
        static final class C0330a extends l0 implements Function0<Float> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0330a f41117a = new C0330a();

            C0330a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        static final class b extends l0 implements Function0<Float> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f41118a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(u uVar, u uVar2) {
            SemanticsConfiguration semanticsConfigurationF = uVar.F();
            z zVar = z.f41190a;
            return Integer.valueOf(Float.compare(((Number) semanticsConfigurationF.p(zVar.P(), C0330a.f41117a)).floatValue(), ((Number) uVar2.F().p(zVar.P(), b.f41118a)).floatValue()));
        }
    }

    static final class b extends l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f41119a = new b();

        b() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static final class c extends l0 implements Function1<u, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f41120a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(u uVar) {
            return Boolean.FALSE;
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n+ 2 SemanticsSort.kt\nandroidx/compose/ui/semantics/SemanticsSortKt\n*L\n1#1,158:1\n206#2:159\n*E\n"})
    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f41121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator f41122b;

        public d(Comparator comparator, Comparator comparator2) {
            this.f41121a = comparator;
            this.f41122b = comparator2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f41121a.compare(t10, t11);
            return iCompare != 0 ? iCompare : this.f41122b.compare(((u) t10).u(), ((u) t11).u());
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 SemanticsSort.kt\nandroidx/compose/ui/semantics/SemanticsSortKt\n*L\n1#1,145:1\n208#2:146\n*E\n"})
    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f41123a;

        public e(Comparator comparator) {
            this.f41123a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f41123a.compare(t10, t11);
            return iCompare != 0 ? iCompare : kotlin.comparisons.a.l(Integer.valueOf(((u) t10).s()), Integer.valueOf(((u) t11).s()));
        }
    }

    static {
        Comparator<u>[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            comparatorArr[i10] = new e(new d(i10 == 0 ? k.f41136a : h.f41106a, androidx.compose.ui.node.l0.f39845y3.d()));
            i10++;
        }
        f41114a = comparatorArr;
        f41115b = a.f41116a;
    }

    private static final void b(u uVar, ArrayList<u> arrayList, Function1<? super u, Boolean> function1, Function1<? super u, Boolean> function2, t1<List<u>> t1Var) {
        boolean zBooleanValue = ((Boolean) uVar.F().p(z.f41190a.y(), b.f41119a)).booleanValue();
        if ((zBooleanValue || function2.invoke(uVar).booleanValue()) && function1.invoke(uVar).booleanValue()) {
            arrayList.add(uVar);
        }
        if (zBooleanValue) {
            t1Var.j0(uVar.s(), g(uVar, function1, function2, uVar.o()));
            return;
        }
        List<u> listO = uVar.o();
        int size = listO.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(listO.get(i10), arrayList, function1, function2, t1Var);
        }
    }

    private static final boolean c(ArrayList<Pair<n0.j, List<u>>> arrayList, u uVar) {
        float fB = uVar.n().B();
        float fJ = uVar.n().j();
        boolean z10 = fB >= fJ;
        int lastIndex = CollectionsKt.getLastIndex(arrayList);
        if (lastIndex >= 0) {
            int i10 = 0;
            while (true) {
                n0.j first = arrayList.get(i10).getFirst();
                boolean z11 = first.B() >= first.j();
                if (!z10 && !z11 && Math.max(fB, first.B()) < Math.min(fJ, first.j())) {
                    arrayList.set(i10, new Pair<>(first.J(0.0f, fB, Float.POSITIVE_INFINITY, fJ), arrayList.get(i10).getSecond()));
                    arrayList.get(i10).getSecond().add(uVar);
                    return true;
                }
                if (i10 != lastIndex) {
                    i10++;
                }
            }
        }
        return false;
    }

    @NotNull
    public static final List<u> d(@NotNull u uVar, @NotNull List<u> list, @NotNull Function1<? super u, Boolean> function1, @NotNull androidx.collection.j0<List<u>> j0Var) {
        int size = 0;
        int i10 = 2 | 0;
        char c10 = uVar.t().getLayoutDirection() == androidx.compose.ui.unit.w.Rtl ? (char) 1 : (char) 0;
        ArrayList arrayList = new ArrayList(list.size() / 2);
        int lastIndex = CollectionsKt.getLastIndex(list);
        if (lastIndex >= 0) {
            int i11 = 0;
            while (true) {
                u uVar2 = list.get(i11);
                if (i11 == 0 || !c(arrayList, uVar2)) {
                    arrayList.add(new Pair(uVar2.n(), CollectionsKt.mutableListOf(uVar2)));
                }
                if (i11 == lastIndex) {
                    break;
                }
                i11++;
            }
        }
        CollectionsKt.sortWith(arrayList, j0.f41135a);
        ArrayList arrayList2 = new ArrayList();
        Comparator<u> comparator = f41114a[c10 ^ 1];
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Pair pair = (Pair) arrayList.get(i12);
            CollectionsKt.sortWith((List) pair.getSecond(), comparator);
            arrayList2.addAll((Collection) pair.getSecond());
        }
        final Function2<u, u, Integer> function2 = f41115b;
        CollectionsKt.sortWith(arrayList2, new Comparator() { // from class: androidx.compose.ui.semantics.h0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return i0.f(function2, obj, obj2);
            }
        });
        while (size <= CollectionsKt.getLastIndex(arrayList2)) {
            List<u> listN = j0Var.n(((u) arrayList2.get(size)).s());
            if (listN != null) {
                if (function1.invoke(arrayList2.get(size)).booleanValue()) {
                    size++;
                } else {
                    arrayList2.remove(size);
                }
                arrayList2.addAll(size, listN);
                size += listN.size();
            } else {
                size++;
            }
        }
        return arrayList2;
    }

    public static /* synthetic */ List e(u uVar, List list, Function1 function1, androidx.collection.j0 j0Var, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = c.f41120a;
        }
        if ((i10 & 4) != 0) {
            j0Var = k0.d();
        }
        return d(uVar, list, function1, j0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    @NotNull
    public static final List<u> g(@NotNull u uVar, @NotNull Function1<? super u, Boolean> function1, @NotNull Function1<? super u, Boolean> function2, @NotNull List<u> list) {
        t1 t1VarJ = k0.j();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b(list.get(i10), arrayList, function1, function2, t1VarJ);
        }
        return d(uVar, arrayList, function2, t1VarJ);
    }
}
