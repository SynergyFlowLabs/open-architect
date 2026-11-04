package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 2)
public final class k1<T> implements z7<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36178b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<v0, T> f36179a;

    /* JADX WARN: Multi-variable type inference failed */
    public k1(@NotNull Function1<? super v0, ? extends T> function1) {
        this.f36179a = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ k1 e(k1 k1Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = k1Var.f36179a;
        }
        return k1Var.d(function1);
    }

    @Override // androidx.compose.runtime.z7
    @NotNull
    public n4<T> a(@NotNull u0<T> u0Var) {
        return new n4<>(u0Var, null, false, null, null, this.f36179a, false);
    }

    @Override // androidx.compose.runtime.z7
    public T b(@NotNull e4 e4Var) {
        return this.f36179a.invoke(e4Var);
    }

    @NotNull
    public final Function1<v0, T> c() {
        return this.f36179a;
    }

    @NotNull
    public final k1<T> d(@NotNull Function1<? super v0, ? extends T> function1) {
        return new k1<>(function1);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && Intrinsics.areEqual(this.f36179a, ((k1) obj).f36179a);
    }

    @NotNull
    public final Function1<v0, T> f() {
        return this.f36179a;
    }

    public int hashCode() {
        return this.f36179a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ComputedValueHolder(compute=" + this.f36179a + ')';
    }
}
