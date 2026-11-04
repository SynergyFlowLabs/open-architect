package kotlinx.coroutines.flow.internal;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.l0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public abstract class h<S, T> extends e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    protected final kotlinx.coroutines.flow.i<S> f314520d;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {com.planner5d.library.engine.input.f.b.G1}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.flow.j<? super T>, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f314521a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314522b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h<S, T> f314523c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h<S, T> hVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f314523c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f314523c, dVar);
            aVar.f314522b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f314521a;
            if (i10 == 0) {
                ResultKt.m(obj);
                kotlinx.coroutines.flow.j<? super T> jVar = (kotlinx.coroutines.flow.j) this.f314522b;
                h<S, T> hVar = this.f314523c;
                this.f314521a = 1;
                if (hVar.r(jVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@NotNull kotlinx.coroutines.flow.i<? extends S> iVar, @NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        super(coroutineContext, i10, jVar);
        this.f314520d = iVar;
    }

    static /* synthetic */ <S, T> Object o(h<S, T> hVar, kotlinx.coroutines.flow.j<? super T> jVar, kotlin.coroutines.d<? super Unit> dVar) {
        int i10 = 2 | (-3);
        if (hVar.f314496b == -3) {
            CoroutineContext context = dVar.getContext();
            CoroutineContext coroutineContextJ = l0.j(context, hVar.f314495a);
            if (Intrinsics.areEqual(coroutineContextJ, context)) {
                Object objR = hVar.r(jVar, dVar);
                return objR == kotlin.coroutines.intrinsics.b.l() ? objR : Unit.f312394a;
            }
            kotlin.coroutines.e.b bVar = kotlin.coroutines.e.K2;
            if (Intrinsics.areEqual(coroutineContextJ.get(bVar), context.get(bVar))) {
                Object objQ = hVar.q(jVar, coroutineContextJ, dVar);
                return objQ == kotlin.coroutines.intrinsics.b.l() ? objQ : Unit.f312394a;
            }
        }
        Object objCollect = super.collect(jVar, dVar);
        return objCollect == kotlin.coroutines.intrinsics.b.l() ? objCollect : Unit.f312394a;
    }

    static /* synthetic */ <S, T> Object p(h<S, T> hVar, kotlinx.coroutines.channels.l0<? super T> l0Var, kotlin.coroutines.d<? super Unit> dVar) {
        Object objR = hVar.r(new a0(l0Var), dVar);
        return objR == kotlin.coroutines.intrinsics.b.l() ? objR : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(kotlinx.coroutines.flow.j<? super T> jVar, CoroutineContext coroutineContext, kotlin.coroutines.d<? super Unit> dVar) {
        return f.d(coroutineContext, f.e(jVar, dVar.getContext()), null, new a(this, null), dVar, 4, null);
    }

    @Override // kotlinx.coroutines.flow.internal.e, kotlinx.coroutines.flow.i
    @Nullable
    public Object collect(@NotNull kotlinx.coroutines.flow.j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return o(this, jVar, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.e
    @Nullable
    protected Object g(@NotNull kotlinx.coroutines.channels.l0<? super T> l0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return p(this, l0Var, dVar);
    }

    @Nullable
    protected abstract Object r(@NotNull kotlinx.coroutines.flow.j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Unit> dVar);

    @Override // kotlinx.coroutines.flow.internal.e
    @NotNull
    public String toString() {
        return this.f314520d + " -> " + super.toString();
    }
}
