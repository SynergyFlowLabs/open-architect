package androidx.media2.exoplayer.external.decoder;

import android.media.MediaCodec;
import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f53764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f53765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f53767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f53768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f53769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f53770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f53771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MediaCodec.CryptoInfo f53772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C0505b f53773j;

    /* JADX INFO: renamed from: androidx.media2.exoplayer.external.decoder.b$b, reason: collision with other inner class name */
    @e.b(24)
    private static final class C0505b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MediaCodec.CryptoInfo f53774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f53775b;

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int encryptedBlocks, int clearBlocks) {
            this.f53775b.set(encryptedBlocks, clearBlocks);
            this.f53774a.setPattern(this.f53775b);
        }

        private C0505b(MediaCodec.CryptoInfo frameworkCryptoInfo) {
            this.f53774a = frameworkCryptoInfo;
            this.f53775b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f53772i = cryptoInfo;
        this.f53773j = q0.f57626a >= 24 ? new C0505b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f53772i;
    }

    @Deprecated
    public MediaCodec.CryptoInfo b() {
        return a();
    }

    public void c(int numSubSamples, int[] numBytesOfClearData, int[] numBytesOfEncryptedData, byte[] key, byte[] iv, int mode, int encryptedBlocks, int clearBlocks) {
        this.f53769f = numSubSamples;
        this.f53767d = numBytesOfClearData;
        this.f53768e = numBytesOfEncryptedData;
        this.f53765b = key;
        this.f53764a = iv;
        this.f53766c = mode;
        this.f53770g = encryptedBlocks;
        this.f53771h = clearBlocks;
        MediaCodec.CryptoInfo cryptoInfo = this.f53772i;
        cryptoInfo.numSubSamples = numSubSamples;
        cryptoInfo.numBytesOfClearData = numBytesOfClearData;
        cryptoInfo.numBytesOfEncryptedData = numBytesOfEncryptedData;
        cryptoInfo.key = key;
        cryptoInfo.iv = iv;
        cryptoInfo.mode = mode;
        if (q0.f57626a >= 24) {
            this.f53773j.b(encryptedBlocks, clearBlocks);
        }
    }
}
