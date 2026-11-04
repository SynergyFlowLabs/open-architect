package androidx.media3.extractor.wav;

import androidx.media3.common.util.k1;
import androidx.media3.extractor.p0;
import androidx.media3.extractor.q0;

/* JADX INFO: loaded from: classes3.dex */
final class e implements p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f69621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f69622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f69623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f69624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f69625h;

    public e(c cVar, int i10, long j10, long j11) {
        this.f69621d = cVar;
        this.f69622e = i10;
        this.f69623f = j10;
        long j12 = (j11 - j10) / ((long) cVar.f69614e);
        this.f69624g = j12;
        this.f69625h = a(j12);
    }

    private long a(long j10) {
        return k1.X1(j10 * ((long) this.f69622e), 1000000L, this.f69621d.f69612c);
    }

    @Override // androidx.media3.extractor.p0
    public long Q1() {
        return this.f69625h;
    }

    @Override // androidx.media3.extractor.p0
    public p0.a R1(long j10) {
        long jX = k1.x((((long) this.f69621d.f69612c) * j10) / (((long) this.f69622e) * 1000000), 0L, this.f69624g - 1);
        long j11 = this.f69623f + (((long) this.f69621d.f69614e) * jX);
        long jA = a(jX);
        q0 q0Var = new q0(jA, j11);
        if (jA < j10 && jX != this.f69624g - 1) {
            long j12 = jX + 1;
            return new p0.a(q0Var, new q0(a(j12), this.f69623f + (((long) this.f69621d.f69614e) * j12)));
        }
        return new p0.a(q0Var);
    }

    @Override // androidx.media3.extractor.p0
    public boolean S1() {
        return true;
    }
}
