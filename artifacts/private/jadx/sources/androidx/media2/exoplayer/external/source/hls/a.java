package androidx.media2.exoplayer.external.source.hls;

import android.net.Uri;
import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.upstream.q0;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
class a implements androidx.media2.exoplayer.external.upstream.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.media2.exoplayer.external.upstream.l f55940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f55941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f55942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private CipherInputStream f55943e;

    public a(androidx.media2.exoplayer.external.upstream.l upstream, byte[] encryptionKey, byte[] encryptionIv) {
        this.f55940b = upstream;
        this.f55941c = encryptionKey;
        this.f55942d = encryptionIv;
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public final Map<String, List<String>> a() {
        return this.f55940b.a();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public final long b(androidx.media2.exoplayer.external.upstream.o dataSpec) throws IOException {
        try {
            Cipher cipherD = d();
            try {
                cipherD.init(2, new SecretKeySpec(this.f55941c, "AES"), new IvParameterSpec(this.f55942d));
                androidx.media2.exoplayer.external.upstream.n nVar = new androidx.media2.exoplayer.external.upstream.n(this.f55940b, dataSpec);
                this.f55943e = new CipherInputStream(nVar, cipherD);
                nVar.c();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public final void c(q0 transferListener) {
        this.f55940b.c(transferListener);
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public void close() throws IOException {
        if (this.f55943e != null) {
            this.f55943e = null;
            this.f55940b.close();
        }
    }

    protected Cipher d() throws NoSuchPaddingException, NoSuchAlgorithmException {
        return Cipher.getInstance("AES/CBC/PKCS7Padding");
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    @p0
    public final Uri getUri() {
        return this.f55940b.getUri();
    }

    @Override // androidx.media2.exoplayer.external.upstream.l
    public final int read(byte[] buffer, int offset, int readLength) throws IOException {
        androidx.media2.exoplayer.external.util.a.g(this.f55943e);
        int i10 = this.f55943e.read(buffer, offset, readLength);
        if (i10 >= 0) {
            return i10;
        }
        int i11 = 0 ^ (-1);
        return -1;
    }
}
