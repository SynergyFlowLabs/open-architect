package androidx.compose.runtime;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
public final class p7<T> implements z7<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36318b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f36319a;

    public p7(T t10) {
        this.f36319a = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ p7 e(p7 p7Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = p7Var.f36319a;
        }
        return p7Var.d(obj);
    }

    @Override // androidx.compose.runtime.z7
    @NotNull
    public n4<T> a(@NotNull u0<T> u0Var) {
        T t10 = this.f36319a;
        return new n4<>(u0Var, t10, t10 == null, null, null, null, false);
    }

    @Override // androidx.compose.runtime.z7
    public T b(@NotNull e4 e4Var) {
        return this.f36319a;
    }

    public final T c() {
        return this.f36319a;
    }

    @NotNull
    public final p7<T> d(T t10) {
        return new p7<>(t10);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p7) && Intrinsics.areEqual(this.f36319a, ((p7) obj).f36319a);
    }

    public final T f() {
        return this.f36319a;
    }

    public int hashCode() {
        T t10 = this.f36319a;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    @NotNull
    public String toString() {
        return "StaticValueHolder(value=" + this.f36319a + ')';
    }
}
