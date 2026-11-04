package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/PaddingValuesInsets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,715:1\n1#2:716\n*E\n"})
final class j5 implements v6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final g5 f16153b;

    public j5(@NotNull g5 g5Var) {
        this.f16153b = g5Var;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int a(@NotNull androidx.compose.ui.unit.d dVar) {
        return dVar.g6(this.f16153b.d());
    }

    @Override // androidx.compose.foundation.layout.v6
    public int b(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return dVar.g6(this.f16153b.c(wVar));
    }

    @Override // androidx.compose.foundation.layout.v6
    public int c(@NotNull androidx.compose.ui.unit.d dVar) {
        return dVar.g6(this.f16153b.a());
    }

    @Override // androidx.compose.foundation.layout.v6
    public int d(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return dVar.g6(this.f16153b.b(wVar));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j5) {
            return Intrinsics.areEqual(((j5) obj).f16153b, this.f16153b);
        }
        return false;
    }

    public int hashCode() {
        return this.f16153b.hashCode();
    }

    @NotNull
    public String toString() {
        androidx.compose.ui.unit.w wVar = androidx.compose.ui.unit.w.Ltr;
        return "PaddingValues(" + ((Object) androidx.compose.ui.unit.h.M(this.f16153b.b(wVar))) + ", " + ((Object) androidx.compose.ui.unit.h.M(this.f16153b.d())) + ", " + ((Object) androidx.compose.ui.unit.h.M(this.f16153b.c(wVar))) + ", " + ((Object) androidx.compose.ui.unit.h.M(this.f16153b.a())) + ')';
    }
}
