package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 2)
public final class z1<T> implements z7<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36862b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final n3<T> f36863a;

    public z1(@NotNull n3<T> n3Var) {
        this.f36863a = n3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ z1 e(z1 z1Var, n3 n3Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            n3Var = z1Var.f36863a;
        }
        return z1Var.d(n3Var);
    }

    @Override // androidx.compose.runtime.z7
    @NotNull
    public n4<T> a(@NotNull u0<T> u0Var) {
        return new n4<>(u0Var, null, false, null, this.f36863a, null, true);
    }

    @Override // androidx.compose.runtime.z7
    public T b(@NotNull e4 e4Var) {
        return this.f36863a.getValue();
    }

    @NotNull
    public final n3<T> c() {
        return this.f36863a;
    }

    @NotNull
    public final z1<T> d(@NotNull n3<T> n3Var) {
        return new z1<>(n3Var);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z1) && Intrinsics.areEqual(this.f36863a, ((z1) obj).f36863a);
    }

    @NotNull
    public final n3<T> f() {
        return this.f36863a;
    }

    public int hashCode() {
        return this.f36863a.hashCode();
    }

    @NotNull
    public String toString() {
        return "DynamicValueHolder(state=" + this.f36863a + ')';
    }
}
