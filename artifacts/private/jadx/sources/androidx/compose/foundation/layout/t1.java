package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
final class t1 implements v6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v6 f16425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v6 f16426c;

    public t1(@NotNull v6 v6Var, @NotNull v6 v6Var2) {
        this.f16425b = v6Var;
        this.f16426c = v6Var2;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int a(@NotNull androidx.compose.ui.unit.d dVar) {
        return kotlin.ranges.r.u(this.f16425b.a(dVar) - this.f16426c.a(dVar), 0);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int b(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return kotlin.ranges.r.u(this.f16425b.b(dVar, wVar) - this.f16426c.b(dVar, wVar), 0);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int c(@NotNull androidx.compose.ui.unit.d dVar) {
        return kotlin.ranges.r.u(this.f16425b.c(dVar) - this.f16426c.c(dVar), 0);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int d(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return kotlin.ranges.r.u(this.f16425b.d(dVar, wVar) - this.f16426c.d(dVar, wVar), 0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return Intrinsics.areEqual(t1Var.f16425b, this.f16425b) && Intrinsics.areEqual(t1Var.f16426c, this.f16426c);
    }

    public int hashCode() {
        return (this.f16425b.hashCode() * 31) + this.f16426c.hashCode();
    }

    @NotNull
    public String toString() {
        return '(' + this.f16425b + " - " + this.f16426c + ')';
    }
}
