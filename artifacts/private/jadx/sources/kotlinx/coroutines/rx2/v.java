package kotlinx.coroutines.rx2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.channels.o0;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nRxObservable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxObservable.kt\nkotlinx/coroutines/rx2/RxObservableCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,217:1\n1#2:218\n159#3:219\n*S KotlinDebug\n*F\n+ 1 RxObservable.kt\nkotlinx/coroutines/rx2/RxObservableCoroutine\n*L\n165#1:219\n*E\n"})
final class v<T> extends kotlinx.coroutines.a<Unit> implements l0<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315412f = AtomicIntegerFieldUpdater.newUpdater(v.class, "_signal$volatile");
    private volatile /* synthetic */ int _signal$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final io.reactivex.d0<T> f315413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f315414e;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements pj.n<v<?>, kotlinx.coroutines.selects.n<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f315415a = new a();

        a() {
            super(3, v.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void X(v<?> vVar, kotlinx.coroutines.selects.n<?> nVar, Object obj) {
            vVar.t2(nVar, obj);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(v<?> vVar, kotlinx.coroutines.selects.n<?> nVar, Object obj) {
            X(vVar, nVar, obj);
            return Unit.f312394a;
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.g0 implements pj.n<v<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f315416a = new b();

        b() {
            super(3, v.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // pj.n
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object invoke(v<?> vVar, Object obj, Object obj2) {
            return vVar.s2(obj, obj2);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxObservableCoroutine$registerSelectForSend$1", f = "RxObservable.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f315417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v<T> f315418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.selects.n<?> f315419c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(v<T> vVar, kotlinx.coroutines.selects.n<?> nVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f315418b = vVar;
            this.f315419c = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f315418b, this.f315419c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f315417a;
            int i11 = 1 >> 1;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.sync.a aVar = ((v) this.f315418b).f315414e;
                this.f315417a = 1;
                if (kotlinx.coroutines.sync.a.C2318a.b(aVar, null, this, 1, null) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            kotlinx.coroutines.selects.n<?> nVar = this.f315419c;
            v<T> vVar = this.f315418b;
            Unit unit = Unit.f312394a;
            if (!nVar.i(vVar, unit)) {
                kotlinx.coroutines.sync.a.C2318a.d(((v) this.f315418b).f315414e, null, 1, null);
            }
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.rx2.RxObservableCoroutine", f = "RxObservable.kt", i = {0, 0}, l = {113}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f315420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f315421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f315422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ v<T> f315423d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f315424e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(v<T> vVar, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f315423d = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f315422c = obj;
            this.f315424e |= Integer.MIN_VALUE;
            return this.f315423d.G(null, this);
        }
    }

    public v(@NotNull CoroutineContext coroutineContext, @NotNull io.reactivex.d0<T> d0Var) {
        super(coroutineContext, false, true);
        this.f315413d = d0Var;
        this.f315414e = kotlinx.coroutines.sync.g.b(false, 1, null);
    }

    private final Throwable l2(T t10) {
        if (!isActive()) {
            m2(K0(), L0());
            return y0();
        }
        try {
            this.f315413d.onNext(t10);
            w2();
            return null;
        } catch (Throwable th2) {
            io.reactivex.exceptions.f fVar = new io.reactivex.exceptions.f(th2);
            boolean zF = F(fVar);
            w2();
            if (zF) {
                return fVar;
            }
            j.a(fVar, getContext());
            return y0();
        }
    }

    private final void m2(Throwable th2, boolean z10) {
        try {
            if (f315412f.get(this) != -2) {
                f315412f.set(this, -2);
                Throwable th3 = th2 != null ? th2 : null;
                if (th3 == null) {
                    try {
                        this.f315413d.onComplete();
                    } catch (Exception e10) {
                        j.a(e10, getContext());
                    }
                } else if ((th3 instanceof io.reactivex.exceptions.f) && !z10) {
                    j.a(th2, getContext());
                } else if (th3 != y0() || !this.f315413d.k()) {
                    try {
                        this.f315413d.onError(th2);
                    } catch (Exception e11) {
                        kotlin.p.a(th2, e11);
                        j.a(th2, getContext());
                    }
                }
            }
        } finally {
            kotlinx.coroutines.sync.a.C2318a.d(this.f315414e, null, 1, null);
        }
    }

    public static /* synthetic */ void n2() {
    }

    private final /* synthetic */ int o2() {
        return this._signal$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object s2(Object obj, Object obj2) throws Throwable {
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlinx.coroutines.rx2.RxObservableCoroutine");
        Throwable thL2 = l2(obj);
        if (thL2 == null) {
            return this;
        }
        throw thL2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t2(kotlinx.coroutines.selects.n<?> nVar, Object obj) {
        if (kotlinx.coroutines.sync.a.C2318a.c(this.f315414e, null, 1, null)) {
            nVar.f(Unit.f312394a);
        } else {
            kotlinx.coroutines.k.f(this, null, null, new c(this, nVar, null), 3, null);
        }
    }

    private final /* synthetic */ void u2(int i10) {
        this._signal$volatile = i10;
    }

    private final void v2(Throwable th2, boolean z10) {
        if (f315412f.compareAndSet(this, 0, -1) && kotlinx.coroutines.sync.a.C2318a.c(this.f315414e, null, 1, null)) {
            m2(th2, z10);
        }
    }

    private final void w2() {
        int i10 = 7 ^ 1;
        kotlinx.coroutines.sync.a.C2318a.d(this.f315414e, null, 1, null);
        if (isActive() || !kotlinx.coroutines.sync.a.C2318a.c(this.f315414e, null, 1, null)) {
            return;
        }
        m2(K0(), L0());
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean B() {
        return !isActive();
    }

    @Override // kotlinx.coroutines.channels.o0
    public boolean F(@Nullable Throwable th2) {
        return m0(th2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // kotlinx.coroutines.channels.o0
    @Nullable
    public Object G(@NotNull T t10, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws Throwable {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f315424e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f315424e = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(this, dVar);
            }
        } else {
            dVar2 = new d(this, dVar);
        }
        Object obj = dVar2.f315422c;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f315424e;
        if (i11 == 0) {
            ResultKt.m(obj);
            kotlinx.coroutines.sync.a aVar = this.f315414e;
            dVar2.f315420a = this;
            dVar2.f315421b = t10;
            dVar2.f315424e = 1;
            if (kotlinx.coroutines.sync.a.C2318a.b(aVar, null, dVar2, 1, null) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t10 = (T) dVar2.f315421b;
            this = (v) dVar2.f315420a;
            ResultKt.m(obj);
        }
        Throwable thL2 = this.l2(t10);
        if (thL2 == null) {
            return Unit.f312394a;
        }
        throw thL2;
    }

    @Override // kotlinx.coroutines.a
    protected void f2(@NotNull Throwable th2, boolean z10) {
        v2(th2, z10);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    public kotlinx.coroutines.selects.j<T, o0<T>> i() {
        a aVar = a.f315415a;
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        pj.n nVar = (pj.n) r1.q(aVar, 3);
        b bVar = b.f315416a;
        Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kotlinx.coroutines.selects.k(this, nVar, (pj.n) r1.q(bVar, 3), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.o0
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(@NotNull T t10) {
        return l0.a.a(this, t10);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    public Object p(@NotNull T t10) {
        if (!kotlinx.coroutines.sync.a.C2318a.c(this.f315414e, null, 1, null)) {
            return kotlinx.coroutines.channels.t.f313893b.b();
        }
        Throwable thL2 = l2(t10);
        return thL2 == null ? kotlinx.coroutines.channels.t.f313893b.c(Unit.f312394a) : kotlinx.coroutines.channels.t.f313893b.a(thL2);
    }

    @Override // kotlinx.coroutines.channels.o0
    @NotNull
    /* JADX INFO: renamed from: q2, reason: merged with bridge method [inline-methods] */
    public Void n(@NotNull Function1<? super Throwable, Unit> function1) {
        throw new UnsupportedOperationException("RxObservableCoroutine doesn't support invokeOnClose");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.a
    /* JADX INFO: renamed from: r2, reason: merged with bridge method [inline-methods] */
    public void g2(@NotNull Unit unit) {
        v2(null, false);
    }

    @Override // kotlinx.coroutines.channels.l0
    @NotNull
    public o0<T> s() {
        return this;
    }
}
