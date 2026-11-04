package kotlinx.coroutines.reactive;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.o0;
import kotlinx.coroutines.channels.t;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.reactivestreams.v;
import org.reactivestreams.w;

/* JADX INFO: loaded from: classes12.dex */
@k2
@SourceDebugExtension({"SMAP\nPublish.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Publish.kt\nkotlinx/coroutines/reactive/PublisherCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
public final class n<T> extends kotlinx.coroutines.a<Unit> implements l0<T>, w {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f315281g = AtomicLongFieldUpdater.newUpdater(n.class, "_nRequested$volatile");
    private volatile /* synthetic */ long _nRequested$volatile;
    private volatile boolean cancelled;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final v<T> f315282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<Throwable, CoroutineContext, Unit> f315283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f315284f;

    /* synthetic */ class a extends g0 implements pj.n<n<?>, kotlinx.coroutines.selects.n<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f315285a = new a();

        a() {
            super(3, n.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void X(n<?> nVar, kotlinx.coroutines.selects.n<?> nVar2, Object obj) {
            nVar.t2(nVar2, obj);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(n<?> nVar, kotlinx.coroutines.selects.n<?> nVar2, Object obj) {
            X(nVar, nVar2, obj);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class b extends g0 implements pj.n<n<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f315286a = new b();

        b() {
            super(3, n.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n<?> nVar, Object obj, Object obj2) {
            return nVar.s2(obj, obj2);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.reactive.PublisherCoroutine$registerSelectForSend$1", f = "Publish.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f315287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n<T> f315288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.selects.n<?> f315289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(n<? super T> nVar, kotlinx.coroutines.selects.n<?> nVar2, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f315288b = nVar;
            this.f315289c = nVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f315288b, this.f315289c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f315287a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.sync.a aVar = ((n) this.f315288b).f315284f;
                this.f315287a = 1;
                if (kotlinx.coroutines.sync.a.C2318a.b(aVar, null, this, 1, null) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            kotlinx.coroutines.selects.n<?> nVar = this.f315289c;
            n<T> nVar2 = this.f315288b;
            Unit unit = Unit.f312394a;
            if (!nVar.i(nVar2, unit)) {
                kotlinx.coroutines.sync.a.C2318a.d(((n) this.f315288b).f315284f, null, 1, null);
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.reactive.PublisherCoroutine", f = "Publish.kt", i = {0, 0}, l = {128}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f315291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f315292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n<T> f315293d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f315294e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(n<? super T> nVar, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f315293d = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315292c = obj;
            this.f315294e |= Integer.MIN_VALUE;
            return this.f315293d.G(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(@NotNull CoroutineContext coroutineContext, @NotNull v<T> vVar, @NotNull Function2<? super Throwable, ? super CoroutineContext, Unit> function2) {
        super(coroutineContext, false, true);
        this.f315282d = vVar;
        this.f315283e = function2;
        this.f315284f = kotlinx.coroutines.sync.g.a(true);
    }

    private final Throwable l2(T t10) {
        n<T> nVar;
        if (t10 == null) {
            w2();
            throw new NullPointerException("Attempted to emit `null` inside a reactive publisher");
        }
        if (!isActive()) {
            w2();
            return y0();
        }
        try {
            this.f315282d.onNext(t10);
            while (true) {
                long j10 = f315281g.get(this);
                if (j10 < 0 || j10 == Long.MAX_VALUE) {
                    break;
                }
                long j11 = j10 - 1;
                nVar = this;
                if (!f315281g.compareAndSet(nVar, j10, j11)) {
                    this = nVar;
                } else if (j11 == 0) {
                    return null;
                }
                nVar.w2();
                return null;
            }
            nVar = this;
            nVar.w2();
            return null;
        } catch (Throwable th2) {
            this.cancelled = true;
            boolean zF = F(th2);
            w2();
            if (zF) {
                return th2;
            }
            this.f315283e.invoke(th2, getContext());
            return y0();
        }
    }

    private final void m2(Throwable th2, boolean z10) {
        try {
            if (f315281g.get(this) != -2) {
                f315281g.set(this, -2L);
                if (this.cancelled) {
                    if (th2 != null && !z10) {
                        this.f315283e.invoke(th2, getContext());
                    }
                } else if (th2 == null) {
                    try {
                        this.f315282d.onComplete();
                    } catch (Throwable th3) {
                        p0.b(getContext(), th3);
                    }
                } else {
                    try {
                        this.f315282d.onError(th2);
                    } catch (Throwable th4) {
                        if (th4 != th2) {
                            kotlin.p.a(th2, th4);
                        }
                        p0.b(getContext(), th2);
                    }
                }
            }
            kotlinx.coroutines.sync.a.C2318a.d(this.f315284f, null, 1, null);
        } catch (Throwable th5) {
            kotlinx.coroutines.sync.a.C2318a.d(this.f315284f, null, 1, null);
            throw th5;
        }
    }

    public static /* synthetic */ void n2() {
    }

    private final /* synthetic */ long o2() {
        return this._nRequested$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object s2(Object obj, Object obj2) throws Throwable {
        Throwable thL2 = l2(obj);
        if (thL2 == null) {
            return this;
        }
        throw thL2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t2(kotlinx.coroutines.selects.n<?> nVar, Object obj) {
        if (kotlinx.coroutines.sync.a.C2318a.c(this.f315284f, null, 1, null)) {
            nVar.f(Unit.f312394a);
        } else {
            kotlinx.coroutines.k.f(this, null, null, new c(this, nVar, null), 3, null);
        }
    }

    private final /* synthetic */ void u2(long j10) {
        this._nRequested$volatile = j10;
    }

    private final void v2(Throwable th2, boolean z10) {
        while (true) {
            long j10 = f315281g.get(this);
            if (j10 == -2) {
                return;
            }
            if (j10 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            n<T> nVar = this;
            if (f315281g.compareAndSet(nVar, j10, -1L)) {
                if (j10 == 0) {
                    nVar.m2(th2, z10);
                    return;
                } else {
                    if (kotlinx.coroutines.sync.a.C2318a.c(nVar.f315284f, null, 1, null)) {
                        nVar.m2(th2, z10);
                        return;
                    }
                    return;
                }
            }
            this = nVar;
        }
    }

    private final void w2() {
        kotlinx.coroutines.sync.a.C2318a.d(this.f315284f, null, 1, null);
        if (x() && kotlinx.coroutines.sync.a.C2318a.c(this.f315284f, null, 1, null)) {
            m2(K0(), L0());
        }
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean B() {
        return !isActive();
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean F(@Nullable Throwable th2) {
        return m0(th2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlinx.coroutines.channels.o0
    @Nullable
    public Object G(T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f315294e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f315294e = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(this, dVar);
            }
        } else {
            dVar2 = new d(this, dVar);
        }
        Object obj = dVar2.f315292c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f315294e;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlinx.coroutines.sync.a aVar = this.f315284f;
            dVar2.f315290a = this;
            dVar2.f315291b = t10;
            dVar2.f315294e = 1;
            if (kotlinx.coroutines.sync.a.C2318a.b(aVar, null, dVar2, 1, null) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t10 = (T) dVar2.f315291b;
            this = (n) dVar2.f315290a;
            ResultKt.m(obj);
        }
        Throwable thL2 = this.l2(t10);
        if (thL2 == null) {
            return Unit.f312394a;
        }
        throw thL2;
    }

    @Override // kotlinx.coroutines.w2, kotlinx.coroutines.p2
    public void cancel() throws Throwable {
        this.cancelled = true;
        super.e(null);
    }

    @Override // kotlinx.coroutines.a
    protected void f2(@NotNull Throwable th2, boolean z10) {
        v2(th2, z10);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    public kotlinx.coroutines.selects.j<T, o0<T>> i() {
        a aVar = a.f315285a;
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        pj.n nVar = (pj.n) r1.q(aVar, 3);
        b bVar = b.f315286a;
        Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.k(this, nVar, (pj.n) r1.q(bVar, 3), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.o0
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(T t10) {
        return l0.a.a(this, t10);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    public Object p(T t10) {
        if (!kotlinx.coroutines.sync.a.C2318a.c(this.f315284f, null, 1, null)) {
            return t.f313893b.b();
        }
        Throwable thL2 = l2(t10);
        return thL2 == null ? t.f313893b.c(Unit.f312394a) : t.f313893b.a(thL2);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    /* JADX INFO: renamed from: q2, reason: merged with bridge method [inline-methods] */
    public Void n(@NotNull Function1<? super Throwable, Unit> function1) {
        throw new UnsupportedOperationException("PublisherCoroutine doesn't support invokeOnClose");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* JADX INFO: renamed from: r2, reason: merged with bridge method [inline-methods] */
    public void g2(@NotNull Unit unit) {
        v2(null, false);
    }

    @Override // org.reactivestreams.w
    public void request(long j10) {
        if (j10 <= 0) {
            m0(new IllegalArgumentException("non-positive subscription request " + j10));
            return;
        }
        while (true) {
            long j11 = f315281g.get(this);
            if (j11 < 0) {
                break;
            }
            long j12 = j11 + j10;
            long j13 = (j12 < 0 || j10 == Long.MAX_VALUE) ? Long.MAX_VALUE : j12;
            if (j11 == j13) {
                break;
            }
            n<T> nVar = this;
            if (f315281g.compareAndSet(nVar, j11, j13)) {
                if (j11 != 0) {
                    break;
                }
                nVar.w2();
                break;
            }
            this = nVar;
        }
    }

    @Override // kotlinx.coroutines.channels.l0
    @NotNull
    public o0<T> s() {
        return this;
    }
}
