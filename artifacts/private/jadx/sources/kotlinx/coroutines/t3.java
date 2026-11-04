package kotlinx.coroutines;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/ThreadLocalEventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final t3 f315643a = new t3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final ThreadLocal<s1> f315644b = kotlinx.coroutines.internal.l1.a(new kotlinx.coroutines.internal.z0("ThreadLocalEventLoop"));

    private t3() {
    }

    @Nullable
    public final s1 a() {
        return f315644b.get();
    }

    @NotNull
    public final s1 b() {
        ThreadLocal<s1> threadLocal = f315644b;
        s1 s1Var = threadLocal.get();
        if (s1Var != null) {
            return s1Var;
        }
        s1 s1VarA = v1.a();
        threadLocal.set(s1VarA);
        return s1VarA;
    }

    public final void c() {
        f315644b.set(null);
    }

    public final void d(@NotNull s1 s1Var) {
        f315644b.set(s1Var);
    }
}
