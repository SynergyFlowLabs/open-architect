package androidx.compose.foundation.layout;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.k7
final class m4 implements v6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v6 f16224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16225c;

    public /* synthetic */ m4(v6 v6Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(v6Var, i10);
    }

    @Override // androidx.compose.foundation.layout.v6
    public int a(@NotNull androidx.compose.ui.unit.d dVar) {
        if (v7.q(this.f16225c, v7.f16497b.k())) {
            return this.f16224b.a(dVar);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int b(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        if (v7.q(this.f16225c, wVar == androidx.compose.ui.unit.w.Ltr ? v7.f16497b.c() : v7.f16497b.d())) {
            return this.f16224b.b(dVar, wVar);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int c(@NotNull androidx.compose.ui.unit.d dVar) {
        if (v7.q(this.f16225c, v7.f16497b.e())) {
            return this.f16224b.c(dVar);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int d(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        if (v7.q(this.f16225c, wVar == androidx.compose.ui.unit.w.Ltr ? v7.f16497b.a() : v7.f16497b.b())) {
            return this.f16224b.d(dVar, wVar);
        }
        return 0;
    }

    @NotNull
    public final v6 e() {
        return this.f16224b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj;
        return Intrinsics.areEqual(this.f16224b, m4Var.f16224b) && v7.p(this.f16225c, m4Var.f16225c);
    }

    public final int f() {
        return this.f16225c;
    }

    public int hashCode() {
        return (this.f16224b.hashCode() * 31) + v7.r(this.f16225c);
    }

    @NotNull
    public String toString() {
        return '(' + this.f16224b + " only " + ((Object) v7.t(this.f16225c)) + ')';
    }

    private m4(v6 v6Var, int i10) {
        this.f16224b = v6Var;
        this.f16225c = i10;
    }
}
