package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
final class a implements v6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v6 f15837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v6 f15838c;

    public a(@NotNull v6 v6Var, @NotNull v6 v6Var2) {
        this.f15837b = v6Var;
        this.f15838c = v6Var2;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int a(@NotNull androidx.compose.ui.unit.d dVar) {
        return this.f15837b.a(dVar) + this.f15838c.a(dVar);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int b(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return this.f15837b.b(dVar, wVar) + this.f15838c.b(dVar, wVar);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int c(@NotNull androidx.compose.ui.unit.d dVar) {
        return this.f15837b.c(dVar) + this.f15838c.c(dVar);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int d(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return this.f15837b.d(dVar, wVar) + this.f15838c.d(dVar, wVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(aVar.f15837b, this.f15837b) && Intrinsics.areEqual(aVar.f15838c, this.f15838c);
    }

    public int hashCode() {
        return this.f15837b.hashCode() + (this.f15838c.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return '(' + this.f15837b + " + " + this.f15838c + ')';
    }
}
