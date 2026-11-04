package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class b<T> extends f<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<kotlinx.coroutines.channels.l0<? super T>, kotlin.coroutines.d<? super Unit>, Object> f314060e;

    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {330}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f314061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f314062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b<T> f314063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f314064d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b<T> bVar, kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
            this.f314063c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f314062b = obj;
            this.f314064d |= Integer.MIN_VALUE;
            return this.f314063c.g(null, this);
        }
    }

    public /* synthetic */ b(Function2 function2, CoroutineContext coroutineContext, int i10, kotlinx.coroutines.channels.j jVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i11 & 2) != 0 ? kotlin.coroutines.h.f312451a : coroutineContext, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? kotlinx.coroutines.channels.j.SUSPEND : jVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.internal.e
    @Nullable
    protected Object g(@NotNull kotlinx.coroutines.channels.l0<? super T> l0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f314064d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f314064d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, dVar);
            }
        } else {
            aVar = new a(this, dVar);
        }
        Object obj = aVar.f314062b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f314064d;
        if (i11 == 0) {
            ResultKt.m(obj);
            aVar.f314061a = l0Var;
            aVar.f314064d = 1;
            if (super.g(l0Var, aVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l0Var = (kotlinx.coroutines.channels.l0) aVar.f314061a;
            ResultKt.m(obj);
        }
        if (l0Var.B()) {
            return Unit.f312394a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // kotlinx.coroutines.flow.f, kotlinx.coroutines.flow.internal.e
    @NotNull
    protected kotlinx.coroutines.flow.internal.e<T> h(@NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        return new b(this.f314060e, coroutineContext, i10, jVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@NotNull Function2<? super kotlinx.coroutines.channels.l0<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        super(function2, coroutineContext, i10, jVar);
        this.f314060e = function2;
    }
}
