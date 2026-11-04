package kotlinx.coroutines.internal;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nCoroutineExceptionHandlerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandlerImpl.kt\nkotlinx/coroutines/internal/CoroutineExceptionHandlerImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n1#2:51\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Collection<kotlinx.coroutines.o0> f315076a = kotlin.sequences.o.c3(kotlin.sequences.o.e(ServiceLoader.load(kotlinx.coroutines.o0.class, kotlinx.coroutines.o0.class.getClassLoader()).iterator()));

    public static final void a(@NotNull kotlinx.coroutines.o0 o0Var) {
        if (!f315076a.contains(o0Var)) {
            throw new IllegalStateException("Exception handler was not found via a ServiceLoader");
        }
    }

    @NotNull
    public static final Collection<kotlinx.coroutines.o0> b() {
        return f315076a;
    }

    public static final void c(@NotNull Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }
}
