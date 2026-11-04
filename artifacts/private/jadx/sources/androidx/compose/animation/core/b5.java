package androidx.compose.animation.core;

import androidx.compose.animation.core.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
public final class b5<V extends w> implements u4<V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12805e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final x4<V> f12806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final f2 f12807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f12808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f12809d;

    public /* synthetic */ b5(x4 x4Var, f2 f2Var, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(x4Var, f2Var, j10);
    }

    private final long o(long j10) {
        long j11 = this.f12809d;
        if (j10 + j11 <= 0) {
            return 0L;
        }
        long j12 = j10 + j11;
        long j13 = this.f12808c;
        long j14 = j12 / j13;
        return (this.f12807b == f2.Restart || j14 % ((long) 2) == 0) ? j12 - (j14 * j13) : ((j14 + 1) * j13) - j12;
    }

    private final V p(long j10, V v10, V v11, V v12) {
        long j11 = this.f12809d;
        long j12 = j10 + j11;
        long j13 = this.f12808c;
        return j12 > j13 ? this.f12806a.g(j13 - j11, v10, v12, v11) : v11;
    }

    @Override // androidx.compose.animation.core.u4
    public boolean b() {
        return true;
    }

    @Override // androidx.compose.animation.core.u4
    public long c(@NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return Long.MAX_VALUE;
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V g(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return this.f12806a.g(o(j10), v10, v11, p(j10, v10, v12, v11));
    }

    @Override // androidx.compose.animation.core.u4
    @NotNull
    public V i(long j10, @NotNull V v10, @NotNull V v11, @NotNull V v12) {
        return this.f12806a.i(o(j10), v10, v11, p(j10, v10, v12, v11));
    }

    public final long n() {
        return this.f12808c;
    }

    private b5(x4<V> x4Var, f2 f2Var, long j10) {
        this.f12806a = x4Var;
        this.f12807b = f2Var;
        this.f12808c = ((long) (x4Var.k() + x4Var.a())) * 1000000;
        this.f12809d = j10 * 1000000;
    }

    public /* synthetic */ b5(x4 x4Var, f2 f2Var, long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(x4Var, (i10 & 2) != 0 ? f2.Restart : f2Var, (i10 & 4) != 0 ? t2.d(0, 0, 2, null) : j10, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ b5(x4 x4Var, f2 f2Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(x4Var, (i10 & 2) != 0 ? f2.Restart : f2Var);
    }

    @kotlin.l(level = kotlin.n.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ b5(x4 x4Var, f2 f2Var) {
        this(x4Var, f2Var, t2.d(0, 0, 2, null), (DefaultConstructorMarker) null);
    }
}
