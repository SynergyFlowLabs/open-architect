package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
@w0
public final class z<T> implements k0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f13400e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final l0 f13404d;

    public /* synthetic */ z(int i10, int i11, int i12, l0 l0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, l0Var);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (a0.g(this.f13401a, zVar.f13401a) && this.f13402b == zVar.f13402b && this.f13403c == zVar.f13403c) {
            return Intrinsics.areEqual(this.f13404d, zVar.f13404d);
        }
        return false;
    }

    public final int h() {
        return this.f13403c;
    }

    public int hashCode() {
        return (((((a0.h(this.f13401a) * 31) + this.f13402b) * 31) + this.f13403c) * 31) + this.f13404d.hashCode();
    }

    public final int i() {
        return this.f13402b;
    }

    @NotNull
    public final l0 j() {
        return this.f13404d;
    }

    public final int k() {
        return this.f13401a;
    }

    private z(int i10, int i11, int i12, l0 l0Var) {
        this.f13401a = i10;
        this.f13402b = i11;
        this.f13403c = i12;
        this.f13404d = l0Var;
    }

    @Override // androidx.compose.animation.core.y0, androidx.compose.animation.core.o
    @NotNull
    public <V extends w> x4<V> a(@NotNull z3<T, V> z3Var) {
        return new d5(androidx.collection.g0.f(0, this.f13402b), androidx.collection.k0.c(), this.f13402b, this.f13403c, this.f13404d, this.f13401a, null);
    }

    public /* synthetic */ z(int i10, int i11, int i12, l0 l0Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? a0.f12738b.b() : i10, (i13 & 2) != 0 ? 300 : i11, (i13 & 4) != 0 ? 0 : i12, (i13 & 8) != 0 ? u0.d() : l0Var, null);
    }
}
