package kotlinx.coroutines.rx2;

import kotlin.Unit;
import kotlin.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.f2;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nRxFlowable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RxFlowable.kt\nkotlinx/coroutines/rx2/RxFlowableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n1#2:53\n*E\n"})
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Function2<Throwable, CoroutineContext, Unit> f315406a = a.f315407a;

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function2<Throwable, CoroutineContext, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f315407a = new a();

        a() {
            super(2, j.class, "handleUndeliverableException", "handleUndeliverableException(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", 1);
        }

        public final void X(Throwable th2, CoroutineContext coroutineContext) {
            j.a(th2, coroutineContext);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2, CoroutineContext coroutineContext) {
            X(th2, coroutineContext);
            return Unit.f312394a;
        }
    }

    @NotNull
    public static final <T> io.reactivex.l<T> a(@NotNull CoroutineContext coroutineContext, @kotlin.b @NotNull Function2<? super l0<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        if (coroutineContext.get(p2.M2) == null) {
            return io.reactivex.l.Y2(kotlinx.coroutines.reactive.l.h(f2.f314023a, coroutineContext, f315406a, function2));
        }
        throw new IllegalArgumentException(("Flowable context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + coroutineContext).toString());
    }

    @kotlin.internal.h
    @kotlin.l(level = kotlin.n.HIDDEN, message = "CoroutineScope.rxFlowable is deprecated in favour of top-level rxFlowable", replaceWith = @b1(expression = "rxFlowable(context, block)", imports = {}))
    public static final /* synthetic */ io.reactivex.l b(s0 s0Var, CoroutineContext coroutineContext, @kotlin.b Function2 function2) {
        return io.reactivex.l.Y2(kotlinx.coroutines.reactive.l.h(s0Var, coroutineContext, f315406a, function2));
    }

    public static /* synthetic */ io.reactivex.l c(CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return a(coroutineContext, function2);
    }

    public static /* synthetic */ io.reactivex.l d(s0 s0Var, CoroutineContext coroutineContext, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return b(s0Var, coroutineContext, function2);
    }
}
