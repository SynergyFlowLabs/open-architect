package androidx.compose.animation.core;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.o2
public final class g2<T> implements y0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12971e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final k0<T> f12973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f2 f12974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12975d;

    public /* synthetic */ g2(int i10, k0 k0Var, f2 f2Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, k0Var, f2Var, j10);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof g2) {
            g2 g2Var = (g2) obj;
            if (g2Var.f12972a == this.f12972a && Intrinsics.areEqual(g2Var.f12973b, this.f12973b) && g2Var.f12974c == this.f12974c && t2.f(g2Var.f12975d, this.f12975d)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final k0<T> h() {
        return this.f12973b;
    }

    public int hashCode() {
        return (((((this.f12972a * 31) + this.f12973b.hashCode()) * 31) + this.f12974c.hashCode()) * 31) + t2.i(this.f12975d);
    }

    public final long i() {
        return this.f12975d;
    }

    public final int j() {
        return this.f12972a;
    }

    @NotNull
    public final f2 k() {
        return this.f12974c;
    }

    private g2(int i10, k0<T> k0Var, f2 f2Var, long j10) {
        this.f12972a = i10;
        this.f12973b = k0Var;
        this.f12974c = f2Var;
        this.f12975d = j10;
    }

    @Override // androidx.compose.animation.core.o
    @NotNull
    public <V extends w> y4<V> a(@NotNull z3<T, V> z3Var) {
        return new f5(this.f12972a, this.f12973b.a((z3) z3Var), this.f12974c, this.f12975d, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ g2(int i10, k0 k0Var, f2 f2Var, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, k0Var, (i11 & 4) != 0 ? f2.Restart : f2Var, (i11 & 8) != 0 ? t2.d(0, 0, 2, null) : j10, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ g2(int i10, k0 k0Var, f2 f2Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, k0Var, (i11 & 4) != 0 ? f2.Restart : f2Var);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "This constructor has been deprecated")
    public /* synthetic */ g2(int i10, k0 k0Var, f2 f2Var) {
        this(i10, k0Var, f2Var, t2.d(0, 0, 2, null), (DefaultConstructorMarker) null);
    }
}
