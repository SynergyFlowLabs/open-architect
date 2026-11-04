package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
final class q6 extends v3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v6 f16365b;

    public q6(@NotNull v6 v6Var) {
        super(null);
        this.f16365b = v6Var;
    }

    @Override // androidx.compose.foundation.layout.v3
    @NotNull
    public v6 a(@NotNull v6 v6Var) {
        return b7.l(this.f16365b, v6Var);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q6) {
            return Intrinsics.areEqual(((q6) obj).f16365b, this.f16365b);
        }
        return false;
    }

    public int hashCode() {
        return this.f16365b.hashCode();
    }
}
