package kotlinx.coroutines;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 {

    public static final class a extends kotlin.coroutines.a implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<CoroutineContext, Throwable, Unit> f315192a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super CoroutineContext, ? super Throwable, Unit> function2, o0.b bVar) {
            super(bVar);
            this.f315192a = function2;
        }

        @Override // kotlinx.coroutines.o0
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            this.f315192a.invoke(coroutineContext, th2);
        }
    }

    @NotNull
    public static final o0 a(@NotNull Function2<? super CoroutineContext, ? super Throwable, Unit> function2) {
        return new a(function2, o0.L2);
    }

    @k2
    public static final void b(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        if (th2 instanceof g1) {
            th2 = ((g1) th2).getCause();
        }
        try {
            o0 o0Var = (o0) coroutineContext.get(o0.L2);
            if (o0Var != null) {
                o0Var.handleException(coroutineContext, th2);
            } else {
                kotlinx.coroutines.internal.j.a(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            kotlinx.coroutines.internal.j.a(coroutineContext, c(th2, th3));
        }
    }

    @NotNull
    public static final Throwable c(@NotNull Throwable th2, @NotNull Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        kotlin.p.a(runtimeException, th2);
        return runtimeException;
    }
}
