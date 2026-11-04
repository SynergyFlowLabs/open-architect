package kotlin.time;

import kotlin.e1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.m2;

/* JADX INFO: loaded from: classes11.dex */
@m2(markerClass = {j.class})
@e1(version = "1.9")
@SourceDebugExtension({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,199:1\n80#2:200\n80#2:201\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/TestTimeSource\n*L\n173#1:200\n180#1:201\n*E\n"})
public final class o extends AbstractLongTimeSource {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f313431d;

    public o() {
        super(f.NANOSECONDS);
        a();
    }

    private final void g(long j10) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.f313431d + i.h(d()) + " is advanced by " + ((Object) c.N0(j10)) + '.');
    }

    @Override // kotlin.time.AbstractLongTimeSource
    protected long f() {
        return this.f313431d;
    }

    public final void h(long j10) {
        long jK0 = c.K0(j10, d());
        if (((jK0 - 1) | 1) != Long.MAX_VALUE) {
            long j11 = this.f313431d;
            long j12 = j11 + jK0;
            if ((jK0 ^ j11) >= 0 && (j11 ^ j12) < 0) {
                g(j10);
            }
            this.f313431d = j12;
            return;
        }
        long jX = c.x(j10, 2);
        if ((1 | (c.K0(jX, d()) - 1)) == Long.MAX_VALUE) {
            g(j10);
            return;
        }
        long j13 = this.f313431d;
        try {
            h(jX);
            h(c.z0(j10, jX));
        } catch (IllegalStateException e10) {
            this.f313431d = j13;
            throw e10;
        }
    }
}
