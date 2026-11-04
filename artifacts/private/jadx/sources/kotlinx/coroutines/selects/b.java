package kotlinx.coroutines.selects;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.d1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f315511a;

    /* synthetic */ class a extends g0 implements pj.n<b, n<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f315512a = new a();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
            int i10 = 0 >> 3;
        }

        public final void X(b bVar, n<?> nVar, Object obj) {
            bVar.e(nVar, obj);
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(b bVar, n<?> nVar, Object obj) {
            X(bVar, nVar, obj);
            return Unit.f312394a;
        }
    }

    public b(long j10) {
        this.f315511a = j10;
    }

    public static /* synthetic */ void d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(final n<?> nVar, Object obj) {
        if (this.f315511a <= 0) {
            nVar.f(Unit.f312394a);
            return;
        }
        Runnable runnable = new Runnable() { // from class: kotlinx.coroutines.selects.a
            @Override // java.lang.Runnable
            public final void run() {
                b.f(nVar, this);
            }
        };
        Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        m mVar = (m) nVar;
        CoroutineContext context = mVar.getContext();
        mVar.g(d1.d(context).d(this.f315511a, runnable, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(n nVar, b bVar) {
        nVar.i(bVar, Unit.f312394a);
    }

    @NotNull
    public final f c() {
        a aVar = a.f315512a;
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new g(this, (pj.n) r1.q(aVar, 3), null, 4, null);
    }
}
