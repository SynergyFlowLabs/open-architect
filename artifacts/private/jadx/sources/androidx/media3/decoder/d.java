package androidx.media3.decoder;

import android.media.MediaCodec;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.media3.common.util.b1;
import androidx.media3.common.util.k1;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    public byte[] f62683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public byte[] f62684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f62685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    public int[] f62686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    public int[] f62687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f62688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f62689g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f62690h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f62691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private final b f62692j;

    @w0(24)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f62693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f62694b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f62694b.set(i10, i11);
            this.f62693a.setPattern(this.f62694b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f62693a = cryptoInfo;
            this.f62694b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f62691i = cryptoInfo;
        this.f62692j = k1.f61540a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f62691i;
    }

    public void b(int i10) {
        if (i10 == 0) {
            return;
        }
        if (this.f62686d == null) {
            int[] iArr = new int[1];
            this.f62686d = iArr;
            this.f62691i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.f62686d;
        iArr2[0] = iArr2[0] + i10;
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f62688f = i10;
        this.f62686d = iArr;
        this.f62687e = iArr2;
        this.f62684b = bArr;
        this.f62683a = bArr2;
        this.f62685c = i11;
        this.f62689g = i12;
        this.f62690h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f62691i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (k1.f61540a >= 24) {
            ((b) androidx.media3.common.util.a.g(this.f62692j)).b(i12, i13);
        }
    }
}
