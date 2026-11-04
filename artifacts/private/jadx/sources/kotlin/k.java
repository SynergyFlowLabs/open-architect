package kotlin;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
final class k<T, R> extends j<T, R> implements kotlin.coroutines.d<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private pj.n<? super j<?, ?>, Object, ? super kotlin.coroutines.d<Object>, ? extends Object> f312843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Object f312844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private kotlin.coroutines.d<Object> f312845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private Object f312846d;

    @SourceDebugExtension({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 DeepRecursive.kt\nkotlin/DeepRecursiveScopeImpl\n*L\n1#1,71:1\n182#2,6:72\n*E\n"})
    public static final class a implements kotlin.coroutines.d<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f312847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f312848b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n f312849c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.d f312850d;

        public a(CoroutineContext coroutineContext, k kVar, pj.n nVar, kotlin.coroutines.d dVar) {
            this.f312847a = coroutineContext;
            this.f312848b = kVar;
            this.f312849c = nVar;
            this.f312850d = dVar;
        }

        @Override // kotlin.coroutines.d
        public CoroutineContext getContext() {
            return this.f312847a;
        }

        @Override // kotlin.coroutines.d
        public void resumeWith(Object obj) {
            this.f312848b.f312843a = this.f312849c;
            this.f312848b.f312845c = this.f312850d;
            this.f312848b.f312846d = obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(@NotNull pj.n<? super j<T, R>, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> block, T t10) {
        super(null);
        Intrinsics.checkNotNullParameter(block, "block");
        this.f312843a = block;
        this.f312844b = t10;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f312845c = this;
        this.f312846d = i.f312505a;
    }

    private final kotlin.coroutines.d<Object> h(pj.n<? super j<?, ?>, Object, ? super kotlin.coroutines.d<Object>, ? extends Object> nVar, kotlin.coroutines.d<Object> dVar) {
        return new a(kotlin.coroutines.h.f312451a, this, nVar, dVar);
    }

    @Override // kotlin.j
    @Nullable
    public Object a(T t10, @NotNull kotlin.coroutines.d<? super R> dVar) {
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f312845c = dVar;
        this.f312844b = t10;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        if (objL == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objL;
    }

    @Override // kotlin.j
    @Nullable
    public <U, S> Object b(@NotNull h<U, S> hVar, U u10, @NotNull kotlin.coroutines.d<? super S> dVar) {
        pj.n<j<U, S>, U, kotlin.coroutines.d<? super S>, Object> nVarA = hVar.a();
        Intrinsics.checkNotNull(nVarA, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        pj.n<? super j<?, ?>, Object, ? super kotlin.coroutines.d<Object>, ? extends Object> nVar = this.f312843a;
        if (nVarA != nVar) {
            this.f312843a = nVarA;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f312845c = h(nVar, dVar);
        } else {
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f312845c = dVar;
        }
        this.f312844b = u10;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        if (objL == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objL;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        return kotlin.coroutines.h.f312451a;
    }

    public final R i() {
        while (true) {
            R r10 = (R) this.f312846d;
            kotlin.coroutines.d<Object> dVar = this.f312845c;
            if (dVar == null) {
                ResultKt.m(r10);
                return r10;
            }
            if (Result.c(i.f312505a, r10)) {
                try {
                    pj.n<? super j<?, ?>, Object, ? super kotlin.coroutines.d<Object>, ? extends Object> nVar = this.f312843a;
                    Object obj = this.f312844b;
                    Object objK = !(nVar instanceof kotlin.coroutines.jvm.internal.a) ? kotlin.coroutines.intrinsics.b.k(nVar, this, obj, dVar) : ((pj.n) kotlin.jvm.internal.r1.q(nVar, 3)).invoke(this, obj, dVar);
                    if (objK != kotlin.coroutines.intrinsics.b.l()) {
                        Result.a aVar = Result.Companion;
                        dVar.resumeWith(Result.m785constructorimpl(objK));
                    }
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    dVar.resumeWith(Result.m785constructorimpl(ResultKt.createFailure(th2)));
                }
            } else {
                this.f312846d = i.f312505a;
                dVar.resumeWith(r10);
            }
        }
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@NotNull Object obj) {
        this.f312845c = null;
        this.f312846d = obj;
    }
}
