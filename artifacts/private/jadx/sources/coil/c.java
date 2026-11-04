package coil;

import coil.request.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nComponentRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentRegistry.kt\ncoil/ComponentRegistry\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n12#2,2:178\n15#2:181\n12#2,4:182\n1#3:180\n*S KotlinDebug\n*F\n+ 1 ComponentRegistry.kt\ncoil/ComponentRegistry\n*L\n38#1:178,2\n38#1:181\n52#1:182,4\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<coil.intercept.b> f86934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Pair<o4.d<? extends Object, ? extends Object>, Class<? extends Object>>> f86935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Pair<n4.b<? extends Object>, Class<? extends Object>>> f86936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Pair<coil.fetch.h.a<? extends Object>, Class<? extends Object>>> f86937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<coil.decode.h.a> f86938e;

    public /* synthetic */ c(List list, List list2, List list3, List list4, List list5, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, list5);
    }

    public static /* synthetic */ Pair k(c cVar, coil.fetch.m mVar, n nVar, j jVar, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return cVar.j(mVar, nVar, jVar, i10);
    }

    public static /* synthetic */ Pair n(c cVar, Object obj, n nVar, j jVar, int i10, int i11, Object obj2) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return cVar.m(obj, nVar, jVar, i10);
    }

    @NotNull
    public final List<coil.decode.h.a> a() {
        return this.f86938e;
    }

    @NotNull
    public final List<Pair<coil.fetch.h.a<? extends Object>, Class<? extends Object>>> b() {
        return this.f86937d;
    }

    @NotNull
    public final List<coil.intercept.b> c() {
        return this.f86934a;
    }

    @NotNull
    public final List<Pair<n4.b<? extends Object>, Class<? extends Object>>> d() {
        return this.f86936c;
    }

    @NotNull
    public final List<Pair<o4.d<? extends Object, ? extends Object>, Class<? extends Object>>> e() {
        return this.f86935b;
    }

    @Nullable
    public final String f(@NotNull Object obj, @NotNull n nVar) {
        List<Pair<n4.b<? extends Object>, Class<? extends Object>>> list = this.f86936c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<n4.b<? extends Object>, Class<? extends Object>> pair = list.get(i10);
            n4.b<? extends Object> bVarComponent1 = pair.component1();
            if (pair.component2().isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(bVarComponent1, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                String strA = bVarComponent1.a(obj, nVar);
                if (strA != null) {
                    return strA;
                }
            }
        }
        return null;
    }

    @NotNull
    public final Object g(@NotNull Object obj, @NotNull n nVar) {
        List<Pair<o4.d<? extends Object, ? extends Object>, Class<? extends Object>>> list = this.f86935b;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Pair<o4.d<? extends Object, ? extends Object>, Class<? extends Object>> pair = list.get(i10);
            o4.d<? extends Object, ? extends Object> dVarComponent1 = pair.component1();
            if (pair.component2().isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(dVarComponent1, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                Object objA = dVarComponent1.a(obj, nVar);
                if (objA != null) {
                    obj = objA;
                }
            }
        }
        return obj;
    }

    @NotNull
    public final a h() {
        return new a(this);
    }

    @oj.j
    @Nullable
    public final Pair<coil.decode.h, Integer> i(@NotNull coil.fetch.m mVar, @NotNull n nVar, @NotNull j jVar) {
        return k(this, mVar, nVar, jVar, 0, 8, null);
    }

    @oj.j
    @Nullable
    public final Pair<coil.decode.h, Integer> j(@NotNull coil.fetch.m mVar, @NotNull n nVar, @NotNull j jVar, int i10) {
        int size = this.f86938e.size();
        while (i10 < size) {
            coil.decode.h hVarCreate = this.f86938e.get(i10).create(mVar, nVar, jVar);
            if (hVarCreate != null) {
                return TuplesKt.to(hVarCreate, Integer.valueOf(i10));
            }
            i10++;
        }
        return null;
    }

    @oj.j
    @Nullable
    public final Pair<coil.fetch.h, Integer> l(@NotNull Object obj, @NotNull n nVar, @NotNull j jVar) {
        return n(this, obj, nVar, jVar, 0, 8, null);
    }

    @oj.j
    @Nullable
    public final Pair<coil.fetch.h, Integer> m(@NotNull Object obj, @NotNull n nVar, @NotNull j jVar, int i10) {
        int size = this.f86937d.size();
        while (i10 < size) {
            Pair<coil.fetch.h.a<? extends Object>, Class<? extends Object>> pair = this.f86937d.get(i10);
            coil.fetch.h.a<? extends Object> aVarComponent1 = pair.component1();
            if (pair.component2().isAssignableFrom(obj.getClass())) {
                Intrinsics.checkNotNull(aVarComponent1, "null cannot be cast to non-null type coil.fetch.Fetcher.Factory<kotlin.Any>");
                coil.fetch.h hVarA = aVarComponent1.a(obj, nVar, jVar);
                if (hVarA != null) {
                    return TuplesKt.to(hVarA, Integer.valueOf(i10));
                }
            }
            i10++;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private c(List<? extends coil.intercept.b> list, List<? extends Pair<? extends o4.d<? extends Object, ? extends Object>, ? extends Class<? extends Object>>> list2, List<? extends Pair<? extends n4.b<? extends Object>, ? extends Class<? extends Object>>> list3, List<? extends Pair<? extends coil.fetch.h.a<? extends Object>, ? extends Class<? extends Object>>> list4, List<? extends coil.decode.h.a> list5) {
        this.f86934a = list;
        this.f86935b = list2;
        this.f86936c = list3;
        this.f86937d = list4;
        this.f86938e = list5;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final List<coil.intercept.b> f86939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final List<Pair<o4.d<? extends Object, ?>, Class<? extends Object>>> f86940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<Pair<n4.b<? extends Object>, Class<? extends Object>>> f86941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final List<Pair<coil.fetch.h.a<? extends Object>, Class<? extends Object>>> f86942d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private final List<coil.decode.h.a> f86943e;

        public a() {
            this.f86939a = new ArrayList();
            this.f86940b = new ArrayList();
            this.f86941c = new ArrayList();
            this.f86942d = new ArrayList();
            this.f86943e = new ArrayList();
        }

        @NotNull
        public final a a(@NotNull coil.decode.h.a aVar) {
            this.f86943e.add(aVar);
            return this;
        }

        public final /* synthetic */ <T> a b(coil.fetch.h.a<T> aVar) {
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            return c(aVar, Object.class);
        }

        @NotNull
        public final <T> a c(@NotNull coil.fetch.h.a<T> aVar, @NotNull Class<T> cls) {
            this.f86942d.add(TuplesKt.to(aVar, cls));
            return this;
        }

        @NotNull
        public final a d(@NotNull coil.intercept.b bVar) {
            this.f86939a.add(bVar);
            return this;
        }

        public final /* synthetic */ <T> a e(n4.b<T> bVar) {
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            return f(bVar, Object.class);
        }

        @NotNull
        public final <T> a f(@NotNull n4.b<T> bVar, @NotNull Class<T> cls) {
            this.f86941c.add(TuplesKt.to(bVar, cls));
            return this;
        }

        public final /* synthetic */ <T> a g(o4.d<T, ?> dVar) {
            Intrinsics.reifiedOperationMarker(4, androidx.exifinterface.media.a.f51379e5);
            return h(dVar, Object.class);
        }

        @NotNull
        public final <T> a h(@NotNull o4.d<T, ?> dVar, @NotNull Class<T> cls) {
            this.f86940b.add(TuplesKt.to(dVar, cls));
            return this;
        }

        @NotNull
        public final c i() {
            return new c(coil.util.c.g(this.f86939a), coil.util.c.g(this.f86940b), coil.util.c.g(this.f86941c), coil.util.c.g(this.f86942d), coil.util.c.g(this.f86943e), null);
        }

        @NotNull
        public final List<coil.decode.h.a> j() {
            return this.f86943e;
        }

        @NotNull
        public final List<Pair<coil.fetch.h.a<? extends Object>, Class<? extends Object>>> k() {
            return this.f86942d;
        }

        @NotNull
        public final List<coil.intercept.b> l() {
            return this.f86939a;
        }

        @NotNull
        public final List<Pair<n4.b<? extends Object>, Class<? extends Object>>> m() {
            return this.f86941c;
        }

        @NotNull
        public final List<Pair<o4.d<? extends Object, ?>, Class<? extends Object>>> n() {
            return this.f86940b;
        }

        public a(@NotNull c cVar) {
            this.f86939a = CollectionsKt.toMutableList((Collection) cVar.c());
            this.f86940b = CollectionsKt.toMutableList((Collection) cVar.e());
            this.f86941c = CollectionsKt.toMutableList((Collection) cVar.d());
            this.f86942d = CollectionsKt.toMutableList((Collection) cVar.b());
            this.f86943e = CollectionsKt.toMutableList((Collection) cVar.a());
        }
    }

    public c() {
        this(CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), CollectionsKt.emptyList());
    }
}
