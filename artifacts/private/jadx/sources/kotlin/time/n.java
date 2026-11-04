package kotlin.time;

import kotlin.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@e1(version = "1.3")
public final class n implements p.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final n f313429b = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f313430c = System.nanoTime();

    private n() {
    }

    private final long f() {
        return System.nanoTime() - f313430c;
    }

    @Override // kotlin.time.p.c, kotlin.time.p
    public /* bridge */ /* synthetic */ b a() {
        return p.b.a.b(e());
    }

    public final long b(long j10, long j11) {
        return p.b.a.e(k.d(j10, f.NANOSECONDS, j11));
    }

    public final long c(long j10, long j11) {
        return k.h(j10, j11, f.NANOSECONDS);
    }

    public final long d(long j10) {
        return k.f(f(), j10, f.NANOSECONDS);
    }

    public long e() {
        return p.b.a.e(f());
    }

    @NotNull
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    @Override // kotlin.time.p
    public /* bridge */ /* synthetic */ TimeMark a() {
        return p.b.a.b(e());
    }
}
