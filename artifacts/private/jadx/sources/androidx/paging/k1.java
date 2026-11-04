package androidx.paging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPageFetcherSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n1#2:397\n*E\n"})
public final class k1<Key, Value> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final w1 f72311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<h2.b.c<Key, Value>> f72312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<h2.b.c<Key, Value>> f72313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f72314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f72315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f72316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f72317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f72318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<Integer> f72319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.channels.p<Integer> f72320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final Map<a1, j3> f72321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private e1 f72322l;

    @SourceDebugExtension({"SMAP\nPageFetcherSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,396:1\n120#2,10:397\n*S KotlinDebug\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder\n*L\n390#1:397,10\n*E\n"})
    public static final class a<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final w1 f72323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final kotlinx.coroutines.sync.a f72324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final k1<Key, Value> f72325c;

        /* JADX INFO: renamed from: androidx.paging.k1$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshotState$Holder", f = "PageFetcherSnapshotState.kt", i = {0, 0, 0}, l = {402}, m = "withLock", n = {"this", "block", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
        @SourceDebugExtension({"SMAP\nPageFetcherSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageFetcherSnapshotState.kt\nandroidx/paging/PageFetcherSnapshotState$Holder$withLock$1\n*L\n1#1,396:1\n*E\n"})
        static final class C0674a<T> extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f72326a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f72327b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f72328c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f72329d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a<Key, Value> f72330e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f72331f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0674a(a<Key, Value> aVar, kotlin.coroutines.d<? super C0674a> dVar) {
                super(dVar);
                this.f72330e = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f72329d = obj;
                this.f72331f |= Integer.MIN_VALUE;
                int i10 = 2 >> 0;
                return this.f72330e.c(null, this);
            }
        }

        public a(@NotNull w1 config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f72323a = config;
            this.f72324b = kotlinx.coroutines.sync.g.b(false, 1, null);
            this.f72325c = new k1<>(config, null);
        }

        private final <T> Object d(Function1<? super k1<Key, Value>, ? extends T> function1, kotlin.coroutines.d<? super T> dVar) {
            kotlinx.coroutines.sync.a aVar = this.f72324b;
            kotlin.jvm.internal.h0.e(0);
            aVar.h(null, dVar);
            kotlin.jvm.internal.h0.e(1);
            try {
                T tInvoke = function1.invoke(this.f72325c);
                kotlin.jvm.internal.h0.d(1);
                aVar.i(null);
                kotlin.jvm.internal.h0.c(1);
                return tInvoke;
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                aVar.i(null);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        @Nullable
        public final <T> Object c(@NotNull Function1<? super k1<Key, Value>, ? extends T> function1, @NotNull kotlin.coroutines.d<? super T> dVar) {
            C0674a c0674a;
            kotlinx.coroutines.sync.a aVar;
            if (dVar instanceof C0674a) {
                c0674a = (C0674a) dVar;
                int i10 = c0674a.f72331f;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0674a.f72331f = i10 - Integer.MIN_VALUE;
                } else {
                    c0674a = new C0674a(this, dVar);
                }
            } else {
                c0674a = new C0674a(this, dVar);
            }
            Object obj = c0674a.f72329d;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i11 = c0674a.f72331f;
            if (i11 == 0) {
                ResultKt.m(obj);
                aVar = this.f72324b;
                c0674a.f72326a = this;
                c0674a.f72327b = function1;
                c0674a.f72328c = aVar;
                c0674a.f72331f = 1;
                if (aVar.h(null, c0674a) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) c0674a.f72328c;
                function1 = (Function1) c0674a.f72327b;
                a<Key, Value> aVar3 = (a) c0674a.f72326a;
                ResultKt.m(obj);
                aVar = aVar2;
                this = aVar3;
            }
            try {
                T tInvoke = function1.invoke(this.f72325c);
                kotlin.jvm.internal.h0.d(1);
                aVar.i(null);
                kotlin.jvm.internal.h0.c(1);
                return tInvoke;
            } catch (Throwable th2) {
                kotlin.jvm.internal.h0.d(1);
                aVar.i(null);
                kotlin.jvm.internal.h0.c(1);
                throw th2;
            }
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72332a;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                iArr[a1.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a1.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f72332a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super Integer>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1<Key, Value> f72334b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k1<Key, Value> k1Var, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f72334b = k1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new c(this.f72334b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f72333a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((k1) this.f72334b).f72320j.p(kotlin.coroutines.jvm.internal.b.f(((k1) this.f72334b).f72318h));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super Integer> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super Integer>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k1<Key, Value> f72336b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k1<Key, Value> k1Var, kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
            this.f72336b = k1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new d(this.f72336b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f72335a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            ((k1) this.f72336b).f72319i.p(kotlin.coroutines.jvm.internal.b.f(((k1) this.f72336b).f72317g));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.flow.j<? super Integer> jVar, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ k1(w1 w1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(w1Var);
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<Integer> e() {
        return kotlinx.coroutines.flow.k.o1(kotlinx.coroutines.flow.k.Z(this.f72320j), new c(this, null));
    }

    @NotNull
    public final kotlinx.coroutines.flow.i<Integer> f() {
        return kotlinx.coroutines.flow.k.o1(kotlinx.coroutines.flow.k.Z(this.f72319i), new d(this, null));
    }

    @NotNull
    public final j2<Key, Value> g(@Nullable j3.a aVar) {
        Integer numValueOf;
        List list = CollectionsKt.toList(this.f72313c);
        if (aVar != null) {
            int iO = o();
            int i10 = -this.f72314d;
            int lastIndex = CollectionsKt.getLastIndex(this.f72313c) - this.f72314d;
            int iG = aVar.g();
            int i11 = i10;
            while (i11 < iG) {
                iO += i11 > lastIndex ? this.f72311a.f72683a : this.f72313c.get(this.f72314d + i11).t().size();
                i11++;
            }
            int iF = iO + aVar.f();
            if (aVar.g() < i10) {
                iF -= this.f72311a.f72683a;
            }
            numValueOf = Integer.valueOf(iF);
        } else {
            numValueOf = null;
        }
        return new j2<>(list, numValueOf, this.f72311a, o());
    }

    public final void h(@NotNull g1.a<Value> event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.p() > this.f72313c.size()) {
            throw new IllegalStateException(("invalid drop count. have " + this.f72313c.size() + " but wanted to drop " + event.p()).toString());
        }
        this.f72321k.remove(event.m());
        this.f72322l.f(event.m(), x0.c.f72693b.b());
        int i10 = b.f72332a[event.m().ordinal()];
        if (i10 == 2) {
            int iP = event.p();
            for (int i11 = 0; i11 < iP; i11++) {
                this.f72312b.remove(0);
            }
            this.f72314d -= event.p();
            t(event.q());
            int i12 = this.f72317g + 1;
            this.f72317g = i12;
            this.f72319i.p(Integer.valueOf(i12));
            return;
        }
        if (i10 != 3) {
            throw new IllegalArgumentException("cannot drop " + event.m());
        }
        int iP2 = event.p();
        for (int i13 = 0; i13 < iP2; i13++) {
            this.f72312b.remove(this.f72313c.size() - 1);
        }
        s(event.q());
        int i14 = this.f72318h + 1;
        this.f72318h = i14;
        this.f72320j.p(Integer.valueOf(i14));
    }

    @Nullable
    public final g1.a<Value> i(@NotNull a1 loadType, @NotNull j3 hint) {
        int size;
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (this.f72311a.f72687e == Integer.MAX_VALUE || this.f72313c.size() <= 2 || q() <= this.f72311a.f72687e) {
            return null;
        }
        if (loadType == a1.REFRESH) {
            throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + loadType).toString());
        }
        int iO = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.f72313c.size() && q() - i11 > this.f72311a.f72687e) {
            int[] iArr = b.f72332a;
            if (iArr[loadType.ordinal()] == 2) {
                size = this.f72313c.get(i10).t().size();
            } else {
                List<h2.b.c<Key, Value>> list = this.f72313c;
                size = list.get(CollectionsKt.getLastIndex(list) - i10).t().size();
            }
            if (((iArr[loadType.ordinal()] == 2 ? hint.d() : hint.c()) - i11) - size < this.f72311a.f72684b) {
                break;
            }
            i11 += size;
            i10++;
        }
        if (i10 == 0) {
            return null;
        }
        int[] iArr2 = b.f72332a;
        int lastIndex = iArr2[loadType.ordinal()] == 2 ? -this.f72314d : (CollectionsKt.getLastIndex(this.f72313c) - this.f72314d) - (i10 - 1);
        int lastIndex2 = iArr2[loadType.ordinal()] == 2 ? (i10 - 1) - this.f72314d : CollectionsKt.getLastIndex(this.f72313c) - this.f72314d;
        if (this.f72311a.f72685c) {
            iO = (loadType == a1.PREPEND ? o() : n()) + i11;
        }
        return new g1.a<>(loadType, lastIndex, lastIndex2, iO);
    }

    public final int j(@NotNull a1 loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i10 = b.f72332a[loadType.ordinal()];
        if (i10 == 1) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (i10 == 2) {
            return this.f72317g;
        }
        if (i10 == 3) {
            return this.f72318h;
        }
        throw new kotlin.k0();
    }

    @NotNull
    public final Map<a1, j3> k() {
        return this.f72321k;
    }

    public final int l() {
        return this.f72314d;
    }

    @NotNull
    public final List<h2.b.c<Key, Value>> m() {
        return this.f72313c;
    }

    public final int n() {
        if (this.f72311a.f72685c) {
            return this.f72316f;
        }
        return 0;
    }

    public final int o() {
        if (this.f72311a.f72685c) {
            return this.f72315e;
        }
        return 0;
    }

    @NotNull
    public final e1 p() {
        return this.f72322l;
    }

    public final int q() {
        Iterator<T> it = this.f72313c.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((h2.b.c) it.next()).t().size();
        }
        return size;
    }

    @androidx.annotation.j
    public final boolean r(int i10, @NotNull a1 loadType, @NotNull h2.b.c<Key, Value> page) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(page, "page");
        int i11 = b.f72332a[loadType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    if (this.f72313c.isEmpty()) {
                        throw new IllegalStateException("should've received an init before append");
                    }
                    if (i10 != this.f72318h) {
                        return false;
                    }
                    this.f72312b.add(page);
                    s(page.u() == Integer.MIN_VALUE ? kotlin.ranges.r.u(n() - page.t().size(), 0) : page.u());
                    this.f72321k.remove(a1.APPEND);
                }
            } else {
                if (this.f72313c.isEmpty()) {
                    throw new IllegalStateException("should've received an init before prepend");
                }
                if (i10 != this.f72317g) {
                    return false;
                }
                this.f72312b.add(0, page);
                this.f72314d++;
                t(page.v() == Integer.MIN_VALUE ? kotlin.ranges.r.u(o() - page.t().size(), 0) : page.v());
                this.f72321k.remove(a1.PREPEND);
            }
        } else {
            if (!this.f72313c.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls");
            }
            if (i10 != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0");
            }
            this.f72312b.add(page);
            this.f72314d = 0;
            s(page.u());
            t(page.v());
        }
        return true;
    }

    public final void s(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this.f72316f = i10;
    }

    public final void t(int i10) {
        if (i10 == Integer.MIN_VALUE) {
            i10 = 0;
        }
        this.f72315e = i10;
    }

    @NotNull
    public final g1<Value> u(@NotNull h2.b.c<Key, Value> cVar, @NotNull a1 loadType) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int[] iArr = b.f72332a;
        int i10 = iArr[loadType.ordinal()];
        int size = 0;
        if (i10 != 1) {
            if (i10 == 2) {
                size = 0 - this.f72314d;
            } else {
                if (i10 != 3) {
                    throw new kotlin.k0();
                }
                size = (this.f72313c.size() - this.f72314d) - 1;
            }
        }
        List listListOf = CollectionsKt.listOf(new g3(size, cVar.t()));
        int i11 = iArr[loadType.ordinal()];
        if (i11 == 1) {
            return g1.b.f71933g.e(listListOf, o(), n(), this.f72322l.j(), null);
        }
        if (i11 == 2) {
            return g1.b.f71933g.c(listListOf, o(), this.f72322l.j(), null);
        }
        if (i11 == 3) {
            return g1.b.f71933g.a(listListOf, n(), this.f72322l.j(), null);
        }
        throw new kotlin.k0();
    }

    private k1(w1 w1Var) {
        this.f72311a = w1Var;
        ArrayList arrayList = new ArrayList();
        this.f72312b = arrayList;
        this.f72313c = arrayList;
        int i10 = (-1) << 6;
        this.f72319i = kotlinx.coroutines.channels.s.d(-1, null, null, 6, null);
        this.f72320j = kotlinx.coroutines.channels.s.d(-1, null, null, 6, null);
        this.f72321k = new LinkedHashMap();
        e1 e1Var = new e1();
        e1Var.f(a1.REFRESH, x0.b.f72692b);
        this.f72322l = e1Var;
    }
}
