package androidx.compose.foundation.layout;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
final class z1 implements v6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f16610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f16611e;

    public z1(int i10, int i11, int i12, int i13) {
        this.f16608b = i10;
        this.f16609c = i11;
        this.f16610d = i12;
        this.f16611e = i13;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int a(@NotNull androidx.compose.ui.unit.d dVar) {
        return this.f16609c;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int b(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return this.f16610d;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int c(@NotNull androidx.compose.ui.unit.d dVar) {
        return this.f16611e;
    }

    @Override // androidx.compose.foundation.layout.v6
    public int d(@NotNull androidx.compose.ui.unit.d dVar, @NotNull androidx.compose.ui.unit.w wVar) {
        return this.f16608b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.f16608b == z1Var.f16608b && this.f16609c == z1Var.f16609c && this.f16610d == z1Var.f16610d && this.f16611e == z1Var.f16611e;
    }

    public int hashCode() {
        return (((((this.f16608b * 31) + this.f16609c) * 31) + this.f16610d) * 31) + this.f16611e;
    }

    @NotNull
    public String toString() {
        return "Insets(left=" + this.f16608b + ", top=" + this.f16609c + ", right=" + this.f16610d + ", bottom=" + this.f16611e + ')';
    }
}
