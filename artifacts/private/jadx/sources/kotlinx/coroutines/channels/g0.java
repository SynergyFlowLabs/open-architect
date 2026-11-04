package kotlinx.coroutines.channels;

import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class g0<E> extends kotlinx.coroutines.channels.a<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private kotlin.coroutines.d<? super Unit> f313770e;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements pj.n<g0<?>, kotlinx.coroutines.selects.n<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f313771a = new a();

        a() {
            super(3, g0.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void X(g0<?> g0Var, kotlinx.coroutines.selects.n<?> nVar, Object obj) throws Throwable {
            g0Var.l2(nVar, obj);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(g0<?> g0Var, kotlinx.coroutines.selects.n<?> nVar, Object obj) throws Throwable {
            X(g0Var, nVar, obj);
            return Unit.f312394a;
        }
    }

    public g0(@NotNull CoroutineContext coroutineContext, @NotNull p<E> pVar, @NotNull Function2<? super c<E>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, pVar, false);
        this.f313770e = kotlin.coroutines.intrinsics.b.c(function2, this, this);
    }

    public static /* synthetic */ void k2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l2(kotlinx.coroutines.selects.n<?> nVar, Object obj) throws Throwable {
        K1();
        super.i().c().invoke(this, nVar, obj);
    }

    @Override // kotlinx.coroutines.channels.q, kotlinx.coroutines.channels.o0
    public boolean F(@Nullable Throwable th2) {
        boolean zF = super.F(th2);
        start();
        return zF;
    }

    @Override // kotlinx.coroutines.channels.q, kotlinx.coroutines.channels.o0
    @Nullable
    public Object G(E e10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        start();
        Object objG = super.G(e10, dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Override // kotlinx.coroutines.w2
    protected void K1() throws Throwable {
        bk.a.c(this.f313770e, this);
    }

    @Override // kotlinx.coroutines.channels.q, kotlinx.coroutines.channels.o0
    @NotNull
    public kotlinx.coroutines.selects.j<E, o0<E>> i() {
        a aVar = a.f313771a;
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new kotlinx.coroutines.selects.k(this, (pj.n) r1.q(aVar, 3), super.i().b(), null, 8, null);
    }

    @Override // kotlinx.coroutines.channels.q, kotlinx.coroutines.channels.o0
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @b1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e10) {
        start();
        return super.offer(e10);
    }

    @Override // kotlinx.coroutines.channels.q, kotlinx.coroutines.channels.o0
    @NotNull
    public Object p(E e10) {
        start();
        return super.p(e10);
    }
}
