package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.b1;
import androidx.media3.common.util.o0;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f67606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f67607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f67608c;

    private a(long j10, byte[] bArr, long j11) {
        this.f67606a = j11;
        this.f67607b = j10;
        this.f67608c = bArr;
    }

    static a b(o0 o0Var, int i10, long j10) {
        long jN = o0Var.N();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        o0Var.n(bArr, 0, i11);
        return new a(jN, bArr, j10);
    }

    @Override // androidx.media3.extractor.metadata.scte35.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f67606a + ", identifier= " + this.f67607b + " }";
    }
}
