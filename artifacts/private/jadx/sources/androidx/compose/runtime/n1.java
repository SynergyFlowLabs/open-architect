package androidx.compose.runtime;

import android.view.Choreographer;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nMonotonicFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,75:1\n318#2,11:76\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n*L\n50#1:76,11\n*E\n"})
final class n1 implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n1 f36261a = new n1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Choreographer f36262b = (Choreographer) kotlinx.coroutines.i.f(kotlinx.coroutines.l1.e().R0(), new a(null));

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "MonotonicFrameClock.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Choreographer>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f36263a;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f36263a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return Choreographer.getInstance();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Choreographer> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    static final class b implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f36264a;

        b(Choreographer.FrameCallback frameCallback) {
            this.f36264a = frameCallback;
        }

        public final void c(Throwable th2) {
            n1.f36262b.removeFrameCallback(this.f36264a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            c(th2);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nMonotonicFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
    static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<R> f36265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f36266b;

        /* JADX WARN: Multi-variable type inference failed */
        c(kotlinx.coroutines.n<? super R> nVar, Function1<? super Long, ? extends R> function1) {
            this.f36265a = nVar;
            this.f36266b = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objM785constructorimpl;
            kotlin.coroutines.d dVar = this.f36265a;
            n1 n1Var = n1.f36261a;
            Function1<Long, R> function1 = this.f36266b;
            try {
                Result.a aVar = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(function1.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM785constructorimpl = Result.m785constructorimpl(ResultKt.createFailure(th2));
            }
            dVar.resumeWith(objM785constructorimpl);
        }
    }

    private n1() {
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) c3.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) c3.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return c3.a.d(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return c3.a.e(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.c3
    @Nullable
    public <R> Object y(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        c cVar = new c(pVar, function1);
        f36262b.postFrameCallback(cVar);
        pVar.e0(new b(cVar));
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }
}
