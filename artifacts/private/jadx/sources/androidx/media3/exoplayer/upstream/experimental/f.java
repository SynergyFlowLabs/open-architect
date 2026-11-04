package androidx.media3.exoplayer.upstream.experimental;

import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public class f implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f65908c = 0.9999d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f65909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f65910b;

    public f() {
        this(0.9999d);
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.b
    public void a(long j10, long j11) {
        long j12 = (8000000 * j10) / j11;
        if (this.f65910b == Long.MIN_VALUE) {
            this.f65910b = j12;
        } else {
            double dPow = Math.pow(this.f65909a, Math.sqrt(j10));
            this.f65910b = (long) ((this.f65910b * dPow) + ((1.0d - dPow) * j12));
        }
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.b
    public long b() {
        return this.f65910b;
    }

    @Override // androidx.media3.exoplayer.upstream.experimental.b
    public void reset() {
        this.f65910b = Long.MIN_VALUE;
    }

    public f(double d10) {
        this.f65909a = d10;
        this.f65910b = Long.MIN_VALUE;
    }
}
