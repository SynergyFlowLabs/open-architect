package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
final class s2<V extends w> implements u4<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final u4<V> f13283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f13284b;

    public s2(@NotNull u4<V> u4Var, long j10) {
        this.f13283a = u4Var;
        this.f13284b = j10;
    }

    @Override // androidx.compose.animation.core.u4
    public boolean b() {
        return this.f13283a.b();
    }

    @Override // androidx.compose.animation.core.u4
    public long c(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return this.f13283a.c(v10, v11, v12) + this.f13284b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return s2Var.f13284b == this.f13284b && Intrinsics.areEqual(s2Var.f13283a, this.f13283a);
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V g(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        long j11 = this.f13284b;
        return j10 < j11 ? v12 : (V) this.f13283a.g(j10 - j11, v10, v11, v12);
    }

    public int hashCode() {
        return (this.f13283a.hashCode() * 31) + Long.hashCode(this.f13284b);
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V i(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        long j11 = this.f13284b;
        return j10 < j11 ? v10 : (V) this.f13283a.i(j10 - j11, v10, v11, v12);
    }

    public final long n() {
        return this.f13284b;
    }

    @NotNull
    public final u4<V> o() {
        return this.f13283a;
    }
}
