package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class y3<T> implements k0<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f13396d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final l0 f13399c;

    public y3() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof y3) {
            y3 y3Var = (y3) obj;
            if (y3Var.f13397a == this.f13397a && y3Var.f13398b == this.f13398b && Intrinsics.areEqual(y3Var.f13399c, this.f13399c)) {
                return true;
            }
        }
        return false;
    }

    public final int h() {
        return this.f13398b;
    }

    public int hashCode() {
        return (((this.f13397a * 31) + this.f13399c.hashCode()) * 31) + this.f13398b;
    }

    public final int i() {
        return this.f13397a;
    }

    @NotNull
    public final l0 j() {
        return this.f13399c;
    }

    @Override // androidx.compose.animation.core.y0, androidx.compose.animation.core.o
    @NotNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public <V extends w> i5<V> a(@NotNull z3<T, V> z3Var) {
        return new i5<>(this.f13397a, this.f13398b, this.f13399c);
    }

    public y3(int i10, int i11, @NotNull l0 l0Var) {
        this.f13397a = i10;
        this.f13398b = i11;
        this.f13399c = l0Var;
    }

    public /* synthetic */ y3(int i10, int i11, l0 l0Var, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 300 : i10, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? u0.d() : l0Var);
    }
}
