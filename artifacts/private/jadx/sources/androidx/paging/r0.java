package androidx.paging;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class r0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.s0 f72524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q1.e f72525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final h2<K, V> f72526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.n0 f72527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.n0 f72528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final b<V> f72529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final a<K> f72530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f72531h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private q1.f f72532i;

    public interface a<K> {
        @Nullable
        K l();

        @Nullable
        K m();
    }

    public interface b<V> {
        boolean d(@NotNull a1 a1Var, @NotNull h2.b.c<?, V> cVar);

        void k(@NotNull a1 a1Var, @NotNull x0 x0Var);
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72533a;

        static {
            int[] iArr = new int[a1.values().length];
            try {
                iArr[a1.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a1.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f72533a = iArr;
        }
    }

    public static final class d extends q1.f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ r0<K, V> f72534d;

        d(r0<K, V> r0Var) {
            this.f72534d = r0Var;
        }

        @Override // androidx.paging.q1.f
        public void e(@NotNull a1 type, @NotNull x0 state) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(state, "state");
            this.f72534d.i().k(type, state);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", f = "LegacyPageFetcher.jvm.kt", i = {0}, l = {53}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f72535a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f72536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ r0<K, V> f72537c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h2.a<K> f72538d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a1 f72539e;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", f = "LegacyPageFetcher.jvm.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f72540a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h2.b<K, V> f72541b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ r0<K, V> f72542c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a1 f72543d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h2.b<K, V> bVar, r0<K, V> r0Var, a1 a1Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f72541b = bVar;
                this.f72542c = r0Var;
                this.f72543d = a1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
                return new a(this.f72541b, this.f72542c, this.f72543d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f72540a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                h2.b<K, V> bVar = this.f72541b;
                if (bVar instanceof h2.b.c) {
                    this.f72542c.n(this.f72543d, (h2.b.c) bVar);
                } else if (bVar instanceof h2.b.a) {
                    this.f72542c.l(this.f72543d, ((h2.b.a) bVar).k());
                } else if (bVar instanceof h2.b.C0663b) {
                    this.f72542c.m();
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(r0<K, V> r0Var, h2.a<K> aVar, a1 a1Var, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f72537c = r0Var;
            this.f72538d = aVar;
            this.f72539e = a1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@Nullable Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            e eVar = new e(this.f72537c, this.f72538d, this.f72539e, dVar);
            eVar.f72536b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlinx.coroutines.s0 s0Var;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f72535a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.s0 s0Var2 = (kotlinx.coroutines.s0) this.f72536b;
                h2<K, V> h2VarJ = this.f72537c.j();
                h2.a<K> aVar = this.f72538d;
                this.f72536b = s0Var2;
                this.f72535a = 1;
                Object objLoad = h2VarJ.load(aVar, this);
                if (objLoad == objL) {
                    return objL;
                }
                s0Var = s0Var2;
                obj = objLoad;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s0Var = (kotlinx.coroutines.s0) this.f72536b;
                ResultKt.m(obj);
            }
            h2.b bVar = (h2.b) obj;
            if (this.f72537c.j().getInvalid()) {
                this.f72537c.e();
                return Unit.f312394a;
            }
            kotlinx.coroutines.k.f(s0Var, ((r0) this.f72537c).f72527d, null, new a(bVar, this.f72537c, this.f72539e, null), 2, null);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull kotlinx.coroutines.s0 s0Var, @Nullable kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public r0(@NotNull kotlinx.coroutines.s0 pagedListScope, @NotNull q1.e config, @NotNull h2<K, V> source, @NotNull kotlinx.coroutines.n0 notifyDispatcher, @NotNull kotlinx.coroutines.n0 fetchDispatcher, @NotNull b<V> pageConsumer, @NotNull a<K> keyProvider) {
        Intrinsics.checkNotNullParameter(pagedListScope, "pagedListScope");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        Intrinsics.checkNotNullParameter(pageConsumer, "pageConsumer");
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
        this.f72524a = pagedListScope;
        this.f72525b = config;
        this.f72526c = source;
        this.f72527d = notifyDispatcher;
        this.f72528e = fetchDispatcher;
        this.f72529f = pageConsumer;
        this.f72530g = keyProvider;
        this.f72531h = new AtomicBoolean(false);
        this.f72532i = new d(this);
    }

    public static /* synthetic */ void h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(a1 a1Var, Throwable th2) {
        if (k()) {
            return;
        }
        this.f72532i.i(a1Var, new x0.a(th2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        this.f72526c.invalidate();
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(a1 a1Var, h2.b.c<K, V> cVar) {
        if (k()) {
            return;
        }
        if (!this.f72529f.d(a1Var, cVar)) {
            this.f72532i.i(a1Var, cVar.t().isEmpty() ? x0.c.f72693b.a() : x0.c.f72693b.b());
            return;
        }
        int i10 = c.f72533a[a1Var.ordinal()];
        if (i10 == 1) {
            r();
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Can only fetch more during append/prepend");
            }
            p();
        }
    }

    private final void p() {
        K kL = this.f72530g.l();
        if (kL == null) {
            n(a1.APPEND, h2.b.c.f72100f.a());
            return;
        }
        q1.f fVar = this.f72532i;
        a1 a1Var = a1.APPEND;
        fVar.i(a1Var, x0.b.f72692b);
        q1.e eVar = this.f72525b;
        q(a1Var, new h2.a.C0661a(kL, eVar.f72466a, eVar.f72468c));
    }

    private final void q(a1 a1Var, h2.a<K> aVar) {
        kotlinx.coroutines.k.f(this.f72524a, this.f72528e, null, new e(this, aVar, a1Var, null), 2, null);
    }

    private final void r() {
        K kM = this.f72530g.m();
        if (kM == null) {
            n(a1.PREPEND, h2.b.c.f72100f.a());
            return;
        }
        q1.f fVar = this.f72532i;
        a1 a1Var = a1.PREPEND;
        fVar.i(a1Var, x0.b.f72692b);
        q1.e eVar = this.f72525b;
        q(a1Var, new h2.a.c(kM, eVar.f72466a, eVar.f72468c));
    }

    public final void e() {
        this.f72531h.set(true);
    }

    @NotNull
    public final q1.e f() {
        return this.f72525b;
    }

    @NotNull
    public final q1.f g() {
        return this.f72532i;
    }

    @NotNull
    public final b<V> i() {
        return this.f72529f;
    }

    @NotNull
    public final h2<K, V> j() {
        return this.f72526c;
    }

    public final boolean k() {
        return this.f72531h.get();
    }

    public final void o() {
        if (this.f72532i.d() instanceof x0.a) {
            r();
        }
        if (this.f72532i.b() instanceof x0.a) {
            p();
        }
    }

    public final void s(@NotNull q1.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        this.f72532i = fVar;
    }

    public final void t() {
        x0 x0VarB = this.f72532i.b();
        if (!(x0VarB instanceof x0.c) || x0VarB.a()) {
            return;
        }
        p();
    }

    public final void u() {
        x0 x0VarD = this.f72532i.d();
        if (!(x0VarD instanceof x0.c) || x0VarD.a()) {
            return;
        }
        r();
    }
}
