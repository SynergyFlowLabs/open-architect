package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u<Key, Value> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f72617e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f72618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k0<d> f72619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f72620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f72621d;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final <A, B> List<B> a(@NotNull n.a<List<A>, List<B>> function, @NotNull List<? extends A> source) {
            Intrinsics.checkNotNullParameter(function, "function");
            Intrinsics.checkNotNullParameter(source, "source");
            List<B> dest = function.apply(source);
            if (dest.size() == source.size()) {
                Intrinsics.checkNotNullExpressionValue(dest, "dest");
                return dest;
            }
            throw new IllegalStateException("Invalid Function " + function + " changed return size. This is not supported.");
        }

        private b() {
        }
    }

    @SourceDebugExtension({"SMAP\nDataSource.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataSource.jvm.kt\nandroidx/paging/DataSource$Factory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,525:1\n1549#2:526\n1620#2,3:527\n1549#2:530\n1620#2,3:531\n*S KotlinDebug\n*F\n+ 1 DataSource.jvm.kt\nandroidx/paging/DataSource$Factory\n*L\n173#1:526\n173#1:527,3\n194#1:530\n194#1:531,3\n*E\n"})
    public static abstract class c<Key, Value> {

        static final class a extends kotlin.jvm.internal.l0 implements Function0<h2<Key, Value>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.n0 f72628a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c<Key, Value> f72629b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlinx.coroutines.n0 n0Var, c<Key, Value> cVar) {
                super(0);
                this.f72628a = n0Var;
                this.f72629b = cVar;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final h2<Key, Value> invoke() {
                return new s0(this.f72628a, this.f72629b.g());
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ToValue] */
        public static final class b<ToValue> extends c<Key, ToValue> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c<Key, Value> f72630a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n.a<List<Value>, List<ToValue>> f72631b;

            b(c<Key, Value> cVar, n.a<List<Value>, List<ToValue>> aVar) {
                this.f72630a = cVar;
                this.f72631b = aVar;
            }

            @Override // androidx.paging.u.c
            @NotNull
            public u<Key, ToValue> g() {
                return this.f72630a.g().p(this.f72631b);
            }
        }

        public static /* synthetic */ Function0 f(c cVar, kotlinx.coroutines.n0 n0Var, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asPagingSourceFactory");
            }
            if ((i10 & 1) != 0) {
                n0Var = kotlinx.coroutines.l1.c();
            }
            return cVar.e(n0Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List j(n.a function, List list) {
            Intrinsics.checkNotNullParameter(function, "$function");
            Intrinsics.checkNotNullExpressionValue(list, "list");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(function.apply(it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List k(Function1 function, List list) {
            Intrinsics.checkNotNullParameter(function, "$function");
            Intrinsics.checkNotNullExpressionValue(list, "list");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(function.invoke(it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List n(Function1 function, List it) {
            Intrinsics.checkNotNullParameter(function, "$function");
            Intrinsics.checkNotNullExpressionValue(it, "it");
            return (List) function.invoke(it);
        }

        @oj.j
        @NotNull
        public final Function0<h2<Key, Value>> d() {
            return f(this, null, 1, null);
        }

        @oj.j
        @NotNull
        public final Function0<h2<Key, Value>> e(@NotNull kotlinx.coroutines.n0 fetchDispatcher) {
            Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
            return new e3(fetchDispatcher, new a(fetchDispatcher, this));
        }

        @NotNull
        public abstract u<Key, Value> g();

        public /* synthetic */ c h(final Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return m(new n.a() { // from class: androidx.paging.w
                @Override // n.a
                public final Object apply(Object obj) {
                    return u.c.k(function, (List) obj);
                }
            });
        }

        @NotNull
        public <ToValue> c<Key, ToValue> i(@NotNull final n.a<Value, ToValue> function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return m(new n.a() { // from class: androidx.paging.v
                @Override // n.a
                public final Object apply(Object obj) {
                    return u.c.j(function, (List) obj);
                }
            });
        }

        public /* synthetic */ c l(final Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return m(new n.a() { // from class: androidx.paging.x
                @Override // n.a
                public final Object apply(Object obj) {
                    return u.c.n(function, (List) obj);
                }
            });
        }

        @NotNull
        public <ToValue> c<Key, ToValue> m(@NotNull n.a<List<Value>, List<ToValue>> function) {
            Intrinsics.checkNotNullParameter(function, "function");
            return new b(this, function);
        }
    }

    public interface d {
        @androidx.annotation.d
        void a();
    }

    public enum e {
        POSITIONAL,
        PAGE_KEYED,
        ITEM_KEYED
    }

    public static final class f<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final a1 f72636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final K f72637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f72638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f72639d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f72640e;

        public f(@NotNull a1 type, @Nullable K k10, int i10, boolean z10, int i11) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f72636a = type;
            this.f72637b = k10;
            this.f72638c = i10;
            this.f72639d = z10;
            this.f72640e = i11;
            if (type != a1.REFRESH && k10 == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }

        public final int a() {
            return this.f72638c;
        }

        @Nullable
        public final K b() {
            return this.f72637b;
        }

        public final int c() {
            return this.f72640e;
        }

        public final boolean d() {
            return this.f72639d;
        }

        @NotNull
        public final a1 e() {
            return this.f72636a;
        }
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function1<d, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f72641a = new g();

        g() {
            super(1);
        }

        public final void c(@NotNull d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
            c(dVar);
            return Unit.f312394a;
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u<Key, Value> f72642a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(u<Key, Value> uVar) {
            super(0);
            this.f72642a = uVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.valueOf(this.f72642a.j());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [ToValue] */
    @SourceDebugExtension({"SMAP\nDataSource.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataSource.jvm.kt\nandroidx/paging/DataSource$map$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,525:1\n1549#2:526\n1620#2,3:527\n*S KotlinDebug\n*F\n+ 1 DataSource.jvm.kt\nandroidx/paging/DataSource$map$1\n*L\n306#1:526\n306#1:527,3\n*E\n"})
    static final class i<ToValue> extends kotlin.jvm.internal.l0 implements Function1<List<? extends Value>, List<? extends ToValue>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n.a<Value, ToValue> f72643a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(n.a<Value, ToValue> aVar) {
            super(1);
            this.f72643a = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<ToValue> invoke(@NotNull List<? extends Value> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            List<? extends Value> list2 = list;
            n.a<Value, ToValue> aVar = this.f72643a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(aVar.apply((Value) it.next()));
            }
            return arrayList;
        }
    }

    public u(@NotNull e type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f72618a = type;
        this.f72619b = new k0<>(g.f72641a, new h(this));
        this.f72620c = true;
        this.f72621d = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object n(Function1 function, Object it) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return function.invoke(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List q(Function1 function, List it) {
        Intrinsics.checkNotNullParameter(function, "$function");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        return (List) function.invoke(it);
    }

    @androidx.annotation.d
    public void c(@NotNull d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f72619b.d(onInvalidatedCallback);
    }

    @androidx.annotation.l1
    public final int d() {
        return this.f72619b.a();
    }

    @NotNull
    public abstract Key e(@NotNull Value value);

    public boolean f() {
        return this.f72621d;
    }

    @NotNull
    public final e g() {
        return this.f72618a;
    }

    @androidx.annotation.d
    public void h() {
        this.f72619b.c();
    }

    public boolean i() {
        return this.f72620c;
    }

    @androidx.annotation.m1
    public boolean j() {
        return this.f72619b.b();
    }

    @Nullable
    public abstract Object k(@NotNull f<Key> fVar, @NotNull kotlin.coroutines.d<? super a<Value>> dVar);

    public /* synthetic */ u l(final Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return m(new n.a() { // from class: androidx.paging.s
            @Override // n.a
            public final Object apply(Object obj) {
                return u.n(function, obj);
            }
        });
    }

    @NotNull
    public <ToValue> u<Key, ToValue> m(@NotNull n.a<Value, ToValue> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return o(new i(function));
    }

    public /* synthetic */ u o(final Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return p(new n.a() { // from class: androidx.paging.t
            @Override // n.a
            public final Object apply(Object obj) {
                return u.q(function, (List) obj);
            }
        });
    }

    @NotNull
    public <ToValue> u<Key, ToValue> p(@NotNull n.a<List<Value>, List<ToValue>> function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new k3(this, function);
    }

    @androidx.annotation.d
    public void r(@NotNull d onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f72619b.e(onInvalidatedCallback);
    }

    public static final class a<Value> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final C0683a f72622f = new C0683a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final List<Value> f72623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private final Object f72624b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final Object f72625c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f72626d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f72627e;

        /* JADX INFO: renamed from: androidx.paging.u$a$a, reason: collision with other inner class name */
        public static final class C0683a {
            public /* synthetic */ C0683a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final <ToValue, Value> a<Value> a(@NotNull a<ToValue> result, @NotNull n.a<List<ToValue>, List<Value>> function) {
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(function, "function");
                return new a<>(u.f72617e.a(function, result.f72623a), result.d(), result.c(), result.b(), result.a());
            }

            @NotNull
            public final <T> a<T> b() {
                return new a<>(CollectionsKt.emptyList(), null, null, 0, 0);
            }

            private C0683a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull List<? extends Value> data, @Nullable Object obj, @Nullable Object obj2, int i10, int i11) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f72623a = data;
            this.f72624b = obj;
            this.f72625c = obj2;
            this.f72626d = i10;
            this.f72627e = i11;
            if (i10 < 0 && i10 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Position must be non-negative");
            }
            if (data.isEmpty() && (i10 > 0 || i11 > 0)) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
            if (i11 < 0 && i11 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
        }

        public final int a() {
            return this.f72627e;
        }

        public final int b() {
            return this.f72626d;
        }

        @Nullable
        public final Object c() {
            return this.f72625c;
        }

        @Nullable
        public final Object d() {
            return this.f72624b;
        }

        public final void e(int i10) {
            int i11;
            if (this.f72626d == Integer.MIN_VALUE || (i11 = this.f72627e) == Integer.MIN_VALUE) {
                throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
            }
            if (i11 <= 0 || this.f72623a.size() % i10 == 0) {
                if (this.f72626d % i10 == 0) {
                    return;
                }
                throw new IllegalArgumentException("Initial load must be pageSize aligned.Position = " + this.f72626d + ", pageSize = " + i10);
            }
            throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + this.f72623a.size() + ", position " + this.f72626d + ", totalCount " + (this.f72626d + this.f72623a.size() + this.f72627e) + ", pageSize " + i10);
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (Intrinsics.areEqual(this.f72623a, aVar.f72623a) && Intrinsics.areEqual(this.f72624b, aVar.f72624b) && Intrinsics.areEqual(this.f72625c, aVar.f72625c) && this.f72626d == aVar.f72626d && this.f72627e == aVar.f72627e) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ a(List list, Object obj, Object obj2, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, obj, obj2, (i12 & 8) != 0 ? Integer.MIN_VALUE : i10, (i12 & 16) != 0 ? Integer.MIN_VALUE : i11);
        }
    }
}
