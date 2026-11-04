package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f315173a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f315174b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f315175c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f315176d = 3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a<T> extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super T>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f315177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f315178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<T> f315179c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function0<? extends T> function0, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f315179c = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f315179c, dVar);
            aVar.f315178b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f315177a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            return m2.d(((s0) this.f315178b).getCoroutineContext(), this.f315179c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super T> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @Nullable
    public static final <T> Object b(@NotNull CoroutineContext coroutineContext, @NotNull Function0<? extends T> function0, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return i.h(coroutineContext, new a(function0, null), dVar);
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Function0 function0, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = kotlin.coroutines.h.f312451a;
        }
        return b(coroutineContext, function0, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T d(CoroutineContext coroutineContext, Function0<? extends T> function0) throws Throwable {
        try {
            y3 y3Var = new y3();
            y3Var.M(s2.A(coroutineContext));
            try {
                return function0.invoke();
            } finally {
                y3Var.G();
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
