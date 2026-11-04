package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
final class h5 extends v3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g5 f16078b;

    public h5(@NotNull g5 g5Var) {
        super(null);
        this.f16078b = g5Var;
    }

    @Override // androidx.compose.foundation.layout.v3
    @NotNull
    public v6 a(@NotNull v6 v6Var) {
        return b7.f(b7.g(this.f16078b), v6Var);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h5) {
            return Intrinsics.areEqual(((h5) obj).f16078b, this.f16078b);
        }
        return false;
    }

    public int hashCode() {
        return this.f16078b.hashCode();
    }
}
