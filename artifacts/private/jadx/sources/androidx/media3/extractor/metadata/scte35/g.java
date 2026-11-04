package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;
import androidx.media3.common.util.w0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class g extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67648b;

    private g(long j10, long j11) {
        this.f67647a = j10;
        this.f67648b = j11;
    }

    static g b(o0 o0Var, long j10, w0 w0Var) {
        long jC = c(o0Var, j10);
        return new g(jC, w0Var.b(jC));
    }

    static long c(o0 o0Var, long j10) {
        long jL = o0Var.L();
        if ((128 & jL) != 0) {
            return 8589934591L & ((((jL & 1) << 32) | o0Var.N()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.metadata.scte35.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f67647a + ", playbackPositionUs= " + this.f67648b + " }";
    }
}
