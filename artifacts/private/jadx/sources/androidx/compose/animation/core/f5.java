package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class f5<V extends w> implements y4<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f12961f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final x4<V> f12963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final f2 f12964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f12966e;

    public /* synthetic */ f5(int i10, x4 x4Var, f2 f2Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, x4Var, f2Var, j10);
    }

    private final long o(long j10) {
        long j11 = this.f12966e;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long jMin = Math.min(j12 / this.f12965d, ((long) this.f12962a) - 1);
        if (this.f12964c != f2.Restart && jMin % ((long) 2) != 0) {
            return ((jMin + 1) * this.f12965d) - j12;
        }
        return j12 - (jMin * this.f12965d);
    }

    private final V p(long j10, V v10, V v11, V v12) {
        long j11 = this.f12966e;
        long j12 = j10 + j11;
        long j13 = this.f12965d;
        return j12 > j13 ? (V) g(j13 - j11, v10, v11, v12) : v11;
    }

    @Override // androidx.compose.animation.core.u4
    public long c(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return (((long) this.f12962a) * this.f12965d) - this.f12966e;
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V g(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return this.f12963b.g(o(j10), v10, v11, p(j10, v10, v12, v11));
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V i(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return this.f12963b.i(o(j10), v10, v11, p(j10, v10, v12, v11));
    }

    public final long n() {
        return this.f12965d;
    }

    private f5(int i10, x4<V> x4Var, f2 f2Var, long j10) {
        this.f12962a = i10;
        this.f12963b = x4Var;
        this.f12964c = f2Var;
        if (i10 < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.f12965d = ((long) (x4Var.k() + x4Var.a())) * 1000000;
        this.f12966e = j10 * 1000000;
    }

    public /* synthetic */ f5(int i10, x4 x4Var, f2 f2Var, long j10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, x4Var, (i11 & 4) != 0 ? f2.Restart : f2Var, (i11 & 8) != 0 ? t2.d(0, 0, 2, null) : j10, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ f5(int i10, x4 x4Var, f2 f2Var, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, x4Var, (i11 & 4) != 0 ? f2.Restart : f2Var);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ f5(int i10, x4 x4Var, f2 f2Var) {
        this(i10, x4Var, f2Var, t2.d(0, 0, 2, null), (DefaultConstructorMarker) null);
    }
}
