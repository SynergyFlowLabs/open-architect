package androidx.compose.runtime;

import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class z2<T> implements z7<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36864b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f36865a;

    public z2(@NotNull Function0<? extends T> function0) {
        this.f36865a = kotlin.g0.c(function0);
    }

    private final T c() {
        return (T) this.f36865a.getValue();
    }

    @Override // androidx.compose.runtime.z7
    @NotNull
    public n4<T> a(@NotNull u0<T> u0Var) {
        m0.z("Cannot produce a provider from a lazy value holder");
        throw new kotlin.a0();
    }

    @Override // androidx.compose.runtime.z7
    public T b(@NotNull e4 e4Var) {
        return c();
    }
}
