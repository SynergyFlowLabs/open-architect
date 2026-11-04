package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/InsetsPaddingValues\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,715:1\n1#2:716\n*E\n"})
final class z3 implements g5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v6 f16617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.unit.d f16618c;

    public z3(@NotNull v6 v6Var, @NotNull androidx.compose.ui.unit.d dVar) {
        this.f16617b = v6Var;
        this.f16618c = dVar;
    }

    @Override // androidx.compose.foundation.layout.g5
    public float a() {
        androidx.compose.ui.unit.d dVar = this.f16618c;
        return dVar.D3(this.f16617b.c(dVar));
    }

    @Override // androidx.compose.foundation.layout.g5
    public float b(@NotNull androidx.compose.ui.unit.w wVar) {
        androidx.compose.ui.unit.d dVar = this.f16618c;
        return dVar.D3(this.f16617b.d(dVar, wVar));
    }

    @Override // androidx.compose.foundation.layout.g5
    public float c(@NotNull androidx.compose.ui.unit.w wVar) {
        androidx.compose.ui.unit.d dVar = this.f16618c;
        return dVar.D3(this.f16617b.b(dVar, wVar));
    }

    @Override // androidx.compose.foundation.layout.g5
    public float d() {
        androidx.compose.ui.unit.d dVar = this.f16618c;
        return dVar.D3(this.f16617b.a(dVar));
    }

    @NotNull
    public final v6 e() {
        return this.f16617b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return Intrinsics.areEqual(this.f16617b, z3Var.f16617b) && Intrinsics.areEqual(this.f16618c, z3Var.f16618c);
    }

    public int hashCode() {
        return (this.f16617b.hashCode() * 31) + this.f16618c.hashCode();
    }

    @NotNull
    public String toString() {
        return "InsetsPaddingValues(insets=" + this.f16617b + ", density=" + this.f16618c + ')';
    }
}
