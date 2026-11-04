package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
final class p6 implements v6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v6 f16276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v6 f16277c;

    public p6(@NotNull v6 v6Var, @NotNull v6 v6Var2) {
        this.f16276b = v6Var;
        this.f16277c = v6Var2;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int a(@NotNull androidx.compose.ui.unit.d dVar) {
        return Math.max(this.f16276b.a(dVar), this.f16277c.a(dVar));
    }

    @Override // androidx.compose.foundation.layout.v6
    public int b(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return Math.max(this.f16276b.b(dVar, wVar), this.f16277c.b(dVar, wVar));
    }

    @Override // androidx.compose.foundation.layout.v6
    public int c(@NotNull androidx.compose.ui.unit.d dVar) {
        return Math.max(this.f16276b.c(dVar), this.f16277c.c(dVar));
    }

    @Override // androidx.compose.foundation.layout.v6
    public int d(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return Math.max(this.f16276b.d(dVar, wVar), this.f16277c.d(dVar, wVar));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return Intrinsics.areEqual(p6Var.f16276b, this.f16276b) && Intrinsics.areEqual(p6Var.f16277c, this.f16277c);
    }

    public int hashCode() {
        return this.f16276b.hashCode() + (this.f16277c.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return '(' + this.f16276b + " ∪ " + this.f16277c + ')';
    }
}
