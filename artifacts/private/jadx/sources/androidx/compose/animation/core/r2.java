package androidx.compose.animation.core;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
final class r2<T> implements o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final o<T> f13248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13249b;

    public r2(@NotNull o<T> oVar, long j10) {
        this.f13248a = oVar;
        this.f13249b = j10;
    }

    @Override // androidx.compose.animation.core.o
    @NotNull
    public <V extends w> u4<V> a(@NotNull z3<T, V> z3Var) {
        return new s2(this.f13248a.a(z3Var), this.f13249b);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return r2Var.f13249b == this.f13249b && Intrinsics.areEqual(r2Var.f13248a, this.f13248a);
    }

    @NotNull
    public final o<T> h() {
        return this.f13248a;
    }

    public int hashCode() {
        return (this.f13248a.hashCode() * 31) + Long.hashCode(this.f13249b);
    }

    public final long i() {
        return this.f13249b;
    }
}
