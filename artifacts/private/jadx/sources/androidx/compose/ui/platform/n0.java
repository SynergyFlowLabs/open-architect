package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,59:1\n318#2,11:60\n*S KotlinDebug\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n*L\n35#1:60,11\n*E\n"})
public final class n0 implements androidx.compose.runtime.c3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f40657c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Choreographer f40658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final l0 f40659b;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0 f40660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f40661b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l0 l0Var, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f40660a = l0Var;
            this.f40661b = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            this.f40660a.J1(this.f40661b);
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f40663b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f40663b = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f312394a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            n0.this.a().removeFrameCallback(this.f40663b);
        }
    }

    @SourceDebugExtension({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock$withFrameNanos$2$callback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
    static final class c implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.n<R> f40664a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0 f40665b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f40666c;

        /* JADX WARN: Multi-variable type inference failed */
        c(kotlinx.coroutines.n<? super R> nVar, n0 n0Var, Function1<? super Long, ? extends R> function1) {
            this.f40664a = nVar;
            this.f40665b = n0Var;
            this.f40666c = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objM785constructorimpl;
            kotlin.coroutines.d dVar = this.f40664a;
            Function1<Long, R> function1 = this.f40666c;
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

    public n0(@NotNull Choreographer choreographer, @Nullable l0 l0Var) {
        this.f40658a = choreographer;
        this.f40659b = l0Var;
    }

    @NotNull
    public final Choreographer a() {
        return this.f40658a;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r10, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) androidx.compose.runtime.c3.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.b<E> bVar) {
        return (E) androidx.compose.runtime.c3.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.b<?> bVar) {
        return androidx.compose.runtime.c3.a.d(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return androidx.compose.runtime.c3.a.e(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.c3
    @Nullable
    public <R> Object y(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        l0 l0Var = this.f40659b;
        if (l0Var == null) {
            CoroutineContext.Element element = dVar.getContext().get(kotlin.coroutines.e.K2);
            l0Var = element instanceof l0 ? (l0) element : null;
        }
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(dVar), 1);
        pVar.p0();
        c cVar = new c(pVar, this, function1);
        if (l0Var == null || !Intrinsics.areEqual(l0Var.j1(), a())) {
            a().postFrameCallback(cVar);
            pVar.e0(new b(cVar));
        } else {
            l0Var.E1(cVar);
            pVar.e0(new a(l0Var, cVar));
        }
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return objU;
    }

    public n0(@NotNull Choreographer choreographer) {
        this(choreographer, null);
    }
}
