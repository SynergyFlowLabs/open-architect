package androidx.paging;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
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
@kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData")
@SourceDebugExtension({"SMAP\nPagedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagedList.kt\nandroidx/paging/PagedList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1290:1\n1855#2,2:1291\n1855#2,2:1293\n1855#2,2:1295\n*S KotlinDebug\n*F\n+ 1 PagedList.kt\nandroidx/paging/PagedList\n*L\n1229#1:1291,2\n1235#1:1293,2\n1241#1:1295,2\n*E\n"})
public abstract class q1<T> extends AbstractList<T> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final d f72442j = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final h2<?, T> f72443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f72444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.n0 f72445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final u1<T> f72446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final e f72447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Runnable f72448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f72449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<WeakReference<c>> f72450h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final List<WeakReference<Function2<a1, x0, Unit>>> f72451i;

    @androidx.annotation.l0
    public static abstract class a<T> {
        public void a(@NotNull T itemAtEnd) {
            Intrinsics.checkNotNullParameter(itemAtEnd, "itemAtEnd");
        }

        public void b(@NotNull T itemAtFront) {
            Intrinsics.checkNotNullParameter(itemAtFront, "itemAtFront");
        }

        public void c() {
        }
    }

    public static abstract class c {
        public abstract void a(int i10, int i11);

        public abstract void b(int i10, int i11);

        public abstract void c(int i10, int i11);
    }

    public static final class d {

        /* JADX INFO: Add missing generic type declarations: [K] */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", f = "PagedList.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
        static final class a<K> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super h2.b.c<K, T>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f72461a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h2<K, T> f72462b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ h2.a.d<K> f72463c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h2<K, T> h2Var, h2.a.d<K> dVar, kotlin.coroutines.d<? super a> dVar2) {
                super(2, dVar2);
                this.f72462b = h2Var;
                this.f72463c = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f72462b, this.f72463c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f72461a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    h2<K, T> h2Var = this.f72462b;
                    h2.a.d<K> dVar = this.f72463c;
                    this.f72461a = 1;
                    obj = h2Var.load(dVar, this);
                    if (obj == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                h2.b bVar = (h2.b) obj;
                if (bVar instanceof h2.b.c) {
                    return (h2.b.c) bVar;
                }
                if (bVar instanceof h2.b.a) {
                    throw ((h2.b.a) bVar).k();
                }
                if (bVar instanceof h2.b.C0663b) {
                    throw new IllegalStateException("Failed to create PagedList. The provided PagingSource returned LoadResult.Invalid, but a LoadResult.Page was expected. To use a PagingSource which supports invalidation, use a PagedList builder that accepts a factory method for PagingSource or DataSource.Factory, such as LivePagedList.");
                }
                throw new kotlin.k0();
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super h2.b.c<K, T>> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @oj.n
        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        @NotNull
        public final <K, T> q1<T> a(@NotNull h2<K, T> pagingSource, @Nullable h2.b.c<K, T> cVar, @NotNull kotlinx.coroutines.s0 coroutineScope, @NotNull kotlinx.coroutines.n0 notifyDispatcher, @NotNull kotlinx.coroutines.n0 fetchDispatcher, @Nullable a<T> aVar, @NotNull e config, @Nullable K k10) {
            K k11;
            Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
            Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
            Intrinsics.checkNotNullParameter(config, "config");
            if (cVar == null) {
                k11 = k10;
                cVar = (h2.b.c) kotlinx.coroutines.j.b(null, new a(pagingSource, new h2.a.d(k11, config.f72469d, config.f72468c), null), 1, null);
            } else {
                k11 = k10;
            }
            return new r(pagingSource, coroutineScope, notifyDispatcher, fetchDispatcher, aVar, config, cVar, k11);
        }

        public final void b(int i10, int i11, @NotNull c callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            boolean z10 = false | false;
            if (i11 < i10) {
                if (i11 > 0) {
                    callback.a(0, i11);
                }
                int i12 = i10 - i11;
                if (i12 > 0) {
                    callback.b(i11, i12);
                    return;
                }
                return;
            }
            if (i10 > 0) {
                callback.a(0, i10);
            }
            int i13 = i11 - i10;
            if (i13 != 0) {
                callback.c(i10, i13);
            }
        }

        private d() {
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final b f72464f = new b(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f72465g = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        public final int f72466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oj.f
        public final int f72467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        public final boolean f72468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oj.f
        public final int f72469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @oj.f
        public final int f72470e;

        public static final class a {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            @NotNull
            public static final C0679a f72471f = new C0679a(null);

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f72472g = 3;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f72473a = -1;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f72474b = -1;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f72475c = -1;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f72476d = true;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f72477e = Integer.MAX_VALUE;

            /* JADX INFO: renamed from: androidx.paging.q1$e$a$a, reason: collision with other inner class name */
            public static final class C0679a {
                public /* synthetic */ C0679a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private C0679a() {
                }
            }

            @NotNull
            public final e a() {
                if (this.f72474b < 0) {
                    this.f72474b = this.f72473a;
                }
                if (this.f72475c < 0) {
                    this.f72475c = this.f72473a * 3;
                }
                if (!this.f72476d && this.f72474b == 0) {
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                int i10 = this.f72477e;
                if (i10 == Integer.MAX_VALUE || i10 >= this.f72473a + (this.f72474b * 2)) {
                    return new e(this.f72473a, this.f72474b, this.f72476d, this.f72475c, this.f72477e);
                }
                throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.f72473a + ", prefetchDist=" + this.f72474b + ", maxSize=" + this.f72477e);
            }

            @NotNull
            public final a b(boolean z10) {
                this.f72476d = z10;
                return this;
            }

            @NotNull
            public final a c(@androidx.annotation.g0(from = 1) int i10) {
                this.f72475c = i10;
                return this;
            }

            @NotNull
            public final a d(@androidx.annotation.g0(from = 2) int i10) {
                this.f72477e = i10;
                return this;
            }

            @NotNull
            public final a e(@androidx.annotation.g0(from = 1) int i10) {
                if (i10 < 1) {
                    throw new IllegalArgumentException("Page size must be a positive number");
                }
                this.f72473a = i10;
                return this;
            }

            @NotNull
            public final a f(@androidx.annotation.g0(from = 0) int i10) {
                this.f72474b = i10;
                return this;
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ void a() {
            }

            private b() {
            }
        }

        public e(int i10, int i11, boolean z10, int i12, int i13) {
            this.f72466a = i10;
            this.f72467b = i11;
            this.f72468c = z10;
            this.f72469d = i12;
            this.f72470e = i13;
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private x0 f72478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private x0 f72479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private x0 f72480c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f72481a;

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
                f72481a = iArr;
            }
        }

        public f() {
            x0.c.a aVar = x0.c.f72693b;
            this.f72478a = aVar.b();
            this.f72479b = aVar.b();
            this.f72480c = aVar.b();
        }

        public final void a(@NotNull Function2<? super a1, ? super x0, Unit> callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            callback.invoke(a1.REFRESH, this.f72478a);
            callback.invoke(a1.PREPEND, this.f72479b);
            callback.invoke(a1.APPEND, this.f72480c);
        }

        @NotNull
        public final x0 b() {
            return this.f72480c;
        }

        @NotNull
        public final x0 c() {
            return this.f72478a;
        }

        @NotNull
        public final x0 d() {
            return this.f72479b;
        }

        @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
        public abstract void e(@NotNull a1 a1Var, @NotNull x0 x0Var);

        public final void f(@NotNull x0 x0Var) {
            Intrinsics.checkNotNullParameter(x0Var, "<set-?>");
            this.f72480c = x0Var;
        }

        public final void g(@NotNull x0 x0Var) {
            Intrinsics.checkNotNullParameter(x0Var, "<set-?>");
            this.f72478a = x0Var;
        }

        public final void h(@NotNull x0 x0Var) {
            Intrinsics.checkNotNullParameter(x0Var, "<set-?>");
            this.f72479b = x0Var;
        }

        public final void i(@NotNull a1 type, @NotNull x0 state) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            int i10 = a.f72481a[type.ordinal()];
            if (i10 == 1) {
                if (!Intrinsics.areEqual(this.f72478a, state)) {
                    this.f72478a = state;
                    e(type, state);
                }
                return;
            }
            if (i10 == 2) {
                if (!Intrinsics.areEqual(this.f72479b, state)) {
                    this.f72479b = state;
                    e(type, state);
                }
                return;
            }
            if (i10 == 3) {
                if (!Intrinsics.areEqual(this.f72480c, state)) {
                    this.f72480c = state;
                }
                return;
            }
            e(type, state);
        }
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function1<WeakReference<c>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f72482a = new g();

        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull WeakReference<c> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.get() == null);
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function1<WeakReference<Function2<? super a1, ? super x0, ? extends Unit>>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f72483a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull WeakReference<Function2<a1, x0, Unit>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.get() == null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", f = "PagedList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nPagedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagedList.kt\nandroidx/paging/PagedList$dispatchStateChangeAsync$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1290:1\n1855#2,2:1291\n*S KotlinDebug\n*F\n+ 1 PagedList.kt\nandroidx/paging/PagedList$dispatchStateChangeAsync$1\n*L\n1091#1:1291,2\n*E\n"})
    static final class i extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q1<T> f72485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a1 f72486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x0 f72487d;

        static final class a extends kotlin.jvm.internal.l0 implements Function1<WeakReference<Function2<? super a1, ? super x0, ? extends Unit>>, Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f72488a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@NotNull WeakReference<Function2<a1, x0, Unit>> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.get() == null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(q1<T> q1Var, a1 a1Var, x0 x0Var, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.f72485b = q1Var;
            this.f72486c = a1Var;
            this.f72487d = x0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            return new i(this.f72485b, this.f72486c, this.f72487d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f72484a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            CollectionsKt.removeAll(((q1) this.f72485b).f72451i, (Function1) a.f72488a);
            List list = ((q1) this.f72485b).f72451i;
            a1 a1Var = this.f72486c;
            x0 x0Var = this.f72487d;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Function2 function2 = (Function2) ((WeakReference) it.next()).get();
                if (function2 != null) {
                    function2.invoke(a1Var, x0Var);
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((i) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class j extends kotlin.jvm.internal.l0 implements Function1<WeakReference<c>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f72489a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(1);
            this.f72489a = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull WeakReference<c> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.get() == null || it.get() == this.f72489a);
        }
    }

    static final class k extends kotlin.jvm.internal.l0 implements Function1<WeakReference<Function2<? super a1, ? super x0, ? extends Unit>>, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<a1, x0, Unit> f72490a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        k(Function2<? super a1, ? super x0, Unit> function2) {
            super(1);
            this.f72490a = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull WeakReference<Function2<a1, x0, Unit>> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.get() == null || it.get() == this.f72490a);
        }
    }

    public q1(@NotNull h2<?, T> pagingSource, @NotNull kotlinx.coroutines.s0 coroutineScope, @NotNull kotlinx.coroutines.n0 notifyDispatcher, @NotNull u1<T> storage, @NotNull e config) {
        Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f72443a = pagingSource;
        this.f72444b = coroutineScope;
        this.f72445c = notifyDispatcher;
        this.f72446d = storage;
        this.f72447e = config;
        this.f72449g = (config.f72467b * 2) + config.f72466a;
        this.f72450h = new ArrayList();
        this.f72451i = new ArrayList();
    }

    @kotlin.l(message = "DataSource is deprecated and has been replaced by PagingSource. PagedList offers indirect ways of controlling fetch ('loadAround()', 'retry()') so that you should not need to access the DataSource/PagingSource.")
    public static /* synthetic */ void F() {
    }

    @oj.n
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public static final <K, T> q1<T> u(@NotNull h2<K, T> h2Var, @Nullable h2.b.c<K, T> cVar, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull kotlinx.coroutines.n0 n0Var, @NotNull kotlinx.coroutines.n0 n0Var2, @Nullable a<T> aVar, @NotNull e eVar, @Nullable K k10) {
        return f72442j.a(h2Var, cVar, s0Var, n0Var, n0Var2, aVar, eVar, k10);
    }

    public final void A(@NotNull a1 type, @NotNull x0 state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        kotlinx.coroutines.k.f(this.f72444b, this.f72445c, null, new i(this, type, state, null), 2, null);
    }

    @NotNull
    public final e B() {
        return this.f72447e;
    }

    @NotNull
    public final kotlinx.coroutines.s0 C() {
        return this.f72444b;
    }

    @NotNull
    public final u<?, T> D() {
        h2<?, T> h2VarL = L();
        if (h2VarL instanceof s0) {
            u<?, T> uVarB = ((s0) h2VarL).b();
            Intrinsics.checkNotNull(uVarB, "null cannot be cast to non-null type androidx.paging.DataSource<*, T of androidx.paging.PagedList>");
            return uVarB;
        }
        throw new IllegalStateException("Attempt to access dataSource on a PagedList that was instantiated with a " + h2VarL.getClass().getSimpleName() + " instead of a DataSource");
    }

    @Nullable
    public abstract Object G();

    public final int J() {
        return this.f72446d.c();
    }

    @NotNull
    public final kotlinx.coroutines.n0 K() {
        return this.f72445c;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public h2<?, T> L() {
        return this.f72443a;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    @NotNull
    public final l2<T> M() {
        return this.f72446d;
    }

    public final int N() {
        return this.f72446d.u();
    }

    @Nullable
    public final Runnable O() {
        return this.f72448f;
    }

    public final int P() {
        return this.f72449g;
    }

    public int Q() {
        return this.f72446d.size();
    }

    @NotNull
    public final u1<T> R() {
        return this.f72446d;
    }

    public abstract boolean S();

    public boolean T() {
        return S();
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public final int U() {
        return this.f72446d.r();
    }

    public final void V(int i10) {
        if (i10 >= 0 && i10 < size()) {
            this.f72446d.L(i10);
            W(i10);
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + size());
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public abstract void W(int i10);

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public final void Y(int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt.reversed(this.f72450h).iterator();
        while (it.hasNext()) {
            c cVar = (c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.a(i10, i11);
            }
        }
    }

    public final void Z(int i10, int i11) {
        if (i11 != 0) {
            Iterator<T> it = CollectionsKt.reversed(this.f72450h).iterator();
            while (it.hasNext()) {
                c cVar = (c) ((WeakReference) it.next()).get();
                if (cVar != null) {
                    cVar.b(i10, i11);
                }
            }
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public final void a0(int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        Iterator<T> it = CollectionsKt.reversed(this.f72450h).iterator();
        while (it.hasNext()) {
            c cVar = (c) ((WeakReference) it.next()).get();
            if (cVar != null) {
                cVar.c(i10, i11);
            }
        }
    }

    public /* bridge */ Object b0(int i10) {
        return super.remove(i10);
    }

    public final void c0(@NotNull c callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CollectionsKt.removeAll((List) this.f72450h, (Function1) new j(callback));
    }

    public final void e0(@NotNull Function2<? super a1, ? super x0, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CollectionsKt.removeAll((List) this.f72451i, (Function1) new k(listener));
    }

    @Override // java.util.AbstractList, java.util.List
    @Nullable
    public T get(int i10) {
        return this.f72446d.get(i10);
    }

    public void h0() {
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP})
    public void i0(@NotNull a1 loadType, @NotNull x0 loadState) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        Intrinsics.checkNotNullParameter(loadState, "loadState");
    }

    public final void l0(@Nullable Runnable runnable) {
        this.f72448f = runnable;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public final void m0(@Nullable Runnable runnable) {
        this.f72448f = runnable;
    }

    @NotNull
    public final List<T> n0() {
        return T() ? this : new d3(this);
    }

    public final void r(@NotNull c callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CollectionsKt.removeAll((List) this.f72450h, (Function1) g.f72482a);
        this.f72450h.add(new WeakReference<>(callback));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i10) {
        return (T) b0(i10);
    }

    @kotlin.l(message = "Dispatching a diff since snapshot created is behavior that can be instead tracked by attaching a Callback to the PagedList that is mutating, and tracking changes since calling PagedList.snapshot().")
    public final void s(@Nullable List<? extends T> list, @NotNull c callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (list != null && list != this) {
            f72442j.b(size(), list.size(), callback);
        }
        r(callback);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return Q();
    }

    public final void t(@NotNull Function2<? super a1, ? super x0, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        CollectionsKt.removeAll((List) this.f72451i, (Function1) h.f72483a);
        this.f72451i.add(new WeakReference<>(listener));
        w(listener);
    }

    public abstract void v();

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    public abstract void w(@NotNull Function2<? super a1, ? super x0, Unit> function2);

    @kotlin.l(message = "PagedList is deprecated and has been replaced by PagingData, which no longer supports constructing snapshots of loaded data manually.", replaceWith = @kotlin.b1(expression = "Pager.flow", imports = {"androidx.paging.Pager"}))
    public static final class b<Key, Value> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private final h2<Key, Value> f72452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private u<Key, Value> f72453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private final h2.b.c<Key, Value> f72454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        private final e f72455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private kotlinx.coroutines.s0 f72456e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private kotlinx.coroutines.n0 f72457f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private kotlinx.coroutines.n0 f72458g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private a<Value> f72459h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private Key f72460i;

        public b(@NotNull u<Key, Value> dataSource, @NotNull e config) {
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
            Intrinsics.checkNotNullParameter(config, "config");
            this.f72456e = kotlinx.coroutines.f2.f314023a;
            this.f72452a = null;
            this.f72453b = dataSource;
            this.f72454c = null;
            this.f72455d = config;
        }

        private static /* synthetic */ void b() {
        }

        @NotNull
        public final q1<Value> a() {
            kotlinx.coroutines.n0 n0VarC = this.f72458g;
            if (n0VarC == null) {
                n0VarC = kotlinx.coroutines.l1.c();
            }
            kotlinx.coroutines.n0 n0Var = n0VarC;
            h2<Key, Value> s0Var = this.f72452a;
            if (s0Var == null) {
                u<Key, Value> uVar = this.f72453b;
                s0Var = uVar != null ? new s0(n0Var, uVar) : null;
            }
            h2<Key, Value> h2Var = s0Var;
            if (h2Var instanceof s0) {
                ((s0) h2Var).a(this.f72455d.f72466a);
            }
            if (h2Var == null) {
                throw new IllegalStateException("PagedList cannot be built without a PagingSource or DataSource");
            }
            d dVar = q1.f72442j;
            h2.b.c<Key, Value> cVar = this.f72454c;
            kotlinx.coroutines.s0 s0Var2 = this.f72456e;
            kotlinx.coroutines.n0 n0VarR0 = this.f72457f;
            if (n0VarR0 == null) {
                n0VarR0 = kotlinx.coroutines.l1.e().R0();
            }
            return dVar.a(h2Var, cVar, s0Var2, n0VarR0, n0Var, this.f72459h, this.f72455d, this.f72460i);
        }

        @NotNull
        public final b<Key, Value> c(@Nullable a<Value> aVar) {
            this.f72459h = aVar;
            return this;
        }

        @NotNull
        public final b<Key, Value> d(@NotNull kotlinx.coroutines.s0 coroutineScope) {
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            this.f72456e = coroutineScope;
            return this;
        }

        @NotNull
        public final b<Key, Value> e(@NotNull kotlinx.coroutines.n0 fetchDispatcher) {
            Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
            this.f72458g = fetchDispatcher;
            return this;
        }

        @kotlin.l(message = "Passing an executor will cause it get wrapped as a CoroutineDispatcher, consider passing a CoroutineDispatcher directly", replaceWith = @kotlin.b1(expression = "setFetchDispatcher(fetchExecutor.asCoroutineDispatcher())", imports = {"kotlinx.coroutines.asCoroutineDispatcher"}))
        @NotNull
        public final b<Key, Value> f(@NotNull Executor fetchExecutor) {
            Intrinsics.checkNotNullParameter(fetchExecutor, "fetchExecutor");
            this.f72458g = kotlinx.coroutines.b2.c(fetchExecutor);
            return this;
        }

        @NotNull
        public final b<Key, Value> g(@Nullable Key key) {
            this.f72460i = key;
            return this;
        }

        @NotNull
        public final b<Key, Value> h(@NotNull kotlinx.coroutines.n0 notifyDispatcher) {
            Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
            this.f72457f = notifyDispatcher;
            return this;
        }

        @kotlin.l(message = "Passing an executor will cause it get wrapped as a CoroutineDispatcher, consider passing a CoroutineDispatcher directly", replaceWith = @kotlin.b1(expression = "setNotifyDispatcher(fetchExecutor.asCoroutineDispatcher())", imports = {"kotlinx.coroutines.asCoroutineDispatcher"}))
        @NotNull
        public final b<Key, Value> i(@NotNull Executor notifyExecutor) {
            Intrinsics.checkNotNullParameter(notifyExecutor, "notifyExecutor");
            this.f72457f = kotlinx.coroutines.b2.c(notifyExecutor);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NotNull u<Key, Value> dataSource, int i10) {
            this(dataSource, s1.b(i10, 0, false, 0, 0, 30, null));
            Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        }

        public b(@NotNull h2<Key, Value> pagingSource, @NotNull h2.b.c<Key, Value> initialPage, @NotNull e config) {
            Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
            Intrinsics.checkNotNullParameter(initialPage, "initialPage");
            Intrinsics.checkNotNullParameter(config, "config");
            this.f72456e = kotlinx.coroutines.f2.f314023a;
            this.f72452a = pagingSource;
            this.f72453b = null;
            this.f72454c = initialPage;
            this.f72455d = config;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NotNull h2<Key, Value> pagingSource, @NotNull h2.b.c<Key, Value> initialPage, int i10) {
            this(pagingSource, initialPage, s1.b(i10, 0, false, 0, 0, 30, null));
            Intrinsics.checkNotNullParameter(pagingSource, "pagingSource");
            Intrinsics.checkNotNullParameter(initialPage, "initialPage");
        }
    }
}
