package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@kotlin.a1
public final class k1 implements CoroutineContext.b<j1<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ThreadLocal<?> f315087a;

    public k1(@NotNull ThreadLocal<?> threadLocal) {
        this.f315087a = threadLocal;
    }

    private final ThreadLocal<?> a() {
        return this.f315087a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k1 c(k1 k1Var, ThreadLocal threadLocal, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            threadLocal = k1Var.f315087a;
        }
        return k1Var.b(threadLocal);
    }

    @NotNull
    public final k1 b(@NotNull ThreadLocal<?> threadLocal) {
        return new k1(threadLocal);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && Intrinsics.areEqual(this.f315087a, ((k1) obj).f315087a);
    }

    public int hashCode() {
        return this.f315087a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f315087a + ')';
    }
}
