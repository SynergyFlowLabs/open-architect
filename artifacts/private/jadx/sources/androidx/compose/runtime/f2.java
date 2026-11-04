package androidx.compose.runtime;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class f2 implements c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f2 f35770a = new f2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f35771b = 16;

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.FallbackFrameClock$withFrameNanos$2", f = "MonotonicFrameClock.android.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    static final class a<R> extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super R>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f35773b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Long, ? extends R> function1, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f35773b = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f35773b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f35772a;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.f35772a = 1;
                if (kotlinx.coroutines.d1.b(16L, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return this.f35773b.invoke(kotlin.coroutines.jvm.internal.b.g(System.nanoTime()));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super R> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    private f2() {
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
        return kotlinx.coroutines.i.h(kotlinx.coroutines.l1.e(), new a(function1, null), dVar);
    }
}
