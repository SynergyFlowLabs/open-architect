package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class g {

    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<T, Comparable<?>> f312414a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super T, ? extends Comparable<?>> function1) {
            this.f312414a = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Function1<T, Comparable<?>> function1 = this.f312414a;
            return g.l(function1.invoke(t10), function1.invoke(t11));
        }
    }

    public static final class b<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f312415a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<T, K> f312416b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Comparator<? super K> comparator, Function1<? super T, ? extends K> function1) {
            this.f312415a = comparator;
            this.f312416b = function1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Comparator<? super K> comparator = this.f312415a;
            Function1<T, K> function1 = this.f312416b;
            return comparator.compare((Object) function1.invoke(t10), (Object) function1.invoke(t11));
        }
    }

    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<T, Comparable<?>> f312417a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super T, ? extends Comparable<?>> function1) {
            this.f312417a = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Function1<T, Comparable<?>> function1 = this.f312417a;
            return g.l(function1.invoke(t11), function1.invoke(t10));
        }
    }

    public static final class d<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f312418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<T, K> f312419b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Comparator<? super K> comparator, Function1<? super T, ? extends K> function1) {
            this.f312418a = comparator;
            this.f312419b = function1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Comparator<? super K> comparator = this.f312418a;
            Function1<T, K> function1 = this.f312419b;
            return comparator.compare((Object) function1.invoke(t11), (Object) function1.invoke(t10));
        }
    }

    public static final class e<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f312420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<T, Comparable<?>> f312421b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Comparator<T> comparator, Function1<? super T, ? extends Comparable<?>> function1) {
            this.f312420a = comparator;
            this.f312421b = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f312420a.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            Function1<T, Comparable<?>> function1 = this.f312421b;
            return g.l(function1.invoke(t10), function1.invoke(t11));
        }
    }

    public static final class f<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f312422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f312423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<T, K> f312424c;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Comparator<T> comparator, Comparator<? super K> comparator2, Function1<? super T, ? extends K> function1) {
            this.f312422a = comparator;
            this.f312423b = comparator2;
            this.f312424c = function1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f312422a.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f312423b;
            Function1<T, K> function1 = this.f312424c;
            return comparator.compare((Object) function1.invoke(t10), (Object) function1.invoke(t11));
        }
    }

    /* JADX INFO: renamed from: kotlin.comparisons.g$g, reason: collision with other inner class name */
    public static final class C2249g<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f312425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<T, Comparable<?>> f312426b;

        /* JADX WARN: Multi-variable type inference failed */
        public C2249g(Comparator<T> comparator, Function1<? super T, ? extends Comparable<?>> function1) {
            this.f312425a = comparator;
            this.f312426b = function1;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f312425a.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            Function1<T, Comparable<?>> function1 = this.f312426b;
            return g.l(function1.invoke(t11), function1.invoke(t10));
        }
    }

    public static final class h<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f312427a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Comparator<? super K> f312428b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<T, K> f312429c;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Comparator<T> comparator, Comparator<? super K> comparator2, Function1<? super T, ? extends K> function1) {
            this.f312427a = comparator;
            this.f312428b = comparator2;
            this.f312429c = function1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f312427a.compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f312428b;
            Function1<T, K> function1 = this.f312429c;
            return comparator.compare((Object) function1.invoke(t11), (Object) function1.invoke(t10));
        }
    }

    public static final class i<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator<T> f312430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<T, T, Integer> f312431b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Comparator<T> comparator, Function2<? super T, ? super T, Integer> function2) {
            this.f312430a = comparator;
            this.f312431b = function2;
        }

        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int iCompare = this.f312430a.compare(t10, t11);
            return iCompare != 0 ? iCompare : this.f312431b.invoke(t10, t11).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> B(Comparator<T> comparator, Comparator<? super K> comparator2, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new f(comparator, comparator2, selector);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> C(Comparator<T> comparator, Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new e(comparator, selector);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> D(Comparator<T> comparator, Comparator<? super K> comparator2, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new h(comparator, comparator2, selector);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> E(Comparator<T> comparator, Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new C2249g(comparator, selector);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> F(Comparator<T> comparator, Function2<? super T, ? super T, Integer> comparison) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        return new i(comparator, comparison);
    }

    @NotNull
    public static final <T> Comparator<T> G(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.H(comparator, comparator2, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj2, obj);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> f(Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new b(comparator, selector);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> g(Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new a(selector);
    }

    @NotNull
    public static <T> Comparator<T> h(@NotNull final Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: kotlin.comparisons.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return g.i(selectors, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(Function1[] function1Arr, Object obj, Object obj2) {
        return p(obj, obj2, function1Arr);
    }

    @kotlin.internal.f
    private static final <T, K> Comparator<T> j(Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new d(comparator, selector);
    }

    @kotlin.internal.f
    private static final <T> Comparator<T> k(Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return new c(selector);
    }

    public static <T extends Comparable<?>> int l(@Nullable T t10, @Nullable T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    @kotlin.internal.f
    private static final <T, K> int m(T t10, T t11, Comparator<? super K> comparator, Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(selector, "selector");
        return comparator.compare(selector.invoke(t10), selector.invoke(t11));
    }

    @kotlin.internal.f
    private static final <T> int n(T t10, T t11, Function1<? super T, ? extends Comparable<?>> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        return l(selector.invoke(t10), selector.invoke(t11));
    }

    public static <T> int o(T t10, T t11, @NotNull Function1<? super T, ? extends Comparable<?>>... selectors) {
        Intrinsics.checkNotNullParameter(selectors, "selectors");
        if (selectors.length > 0) {
            return p(t10, t11, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    private static final <T> int p(T t10, T t11, Function1<? super T, ? extends Comparable<?>>[] function1Arr) {
        for (Function1<? super T, ? extends Comparable<?>> function1 : function1Arr) {
            int iL = l(function1.invoke(t10), function1.invoke(t11));
            if (iL != 0) {
                return iL;
            }
        }
        return 0;
    }

    @NotNull
    public static <T extends Comparable<? super T>> Comparator<T> q() {
        j jVar = j.f312432a;
        Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return jVar;
    }

    @kotlin.internal.f
    private static final <T extends Comparable<? super T>> Comparator<T> r() {
        return s(q());
    }

    @NotNull
    public static final <T> Comparator<T> s(@NotNull final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.t(comparator, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @kotlin.internal.f
    private static final <T extends Comparable<? super T>> Comparator<T> u() {
        return v(q());
    }

    @NotNull
    public static <T> Comparator<T> v(@NotNull final Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.w(comparator, obj, obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @NotNull
    public static <T extends Comparable<? super T>> Comparator<T> x() {
        k kVar = k.f312433a;
        Intrinsics.checkNotNull(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return kVar;
    }

    @NotNull
    public static final <T> Comparator<T> y(@NotNull Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        if (comparator instanceof l) {
            return ((l) comparator).a();
        }
        j jVar = j.f312432a;
        if (Intrinsics.areEqual(comparator, jVar)) {
            k kVar = k.f312433a;
            Intrinsics.checkNotNull(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return kVar;
        }
        if (!Intrinsics.areEqual(comparator, k.f312433a)) {
            return new l(comparator);
        }
        Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        return jVar;
    }

    @NotNull
    public static final <T> Comparator<T> z(@NotNull final Comparator<T> comparator, @NotNull final Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new Comparator() { // from class: kotlin.comparisons.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return g.A(comparator, comparator2, obj, obj2);
            }
        };
    }
}
