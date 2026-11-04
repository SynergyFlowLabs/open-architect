package androidx.media3.extractor;

import androidx.media3.common.util.b1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class s0 implements p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f68305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f68306e;

    public s0(long j10) {
        this(j10, 0L);
    }

    @Override // androidx.media3.extractor.p0
    public long Q1() {
        return this.f68305d;
    }

    @Override // androidx.media3.extractor.p0
    public p0.a R1(long j10) {
        return new p0.a(new q0(j10, this.f68306e));
    }

    @Override // androidx.media3.extractor.p0
    public boolean S1() {
        return true;
    }

    public s0(long j10, long j11) {
        this.f68305d = j10;
        this.f68306e = j11;
    }
}
