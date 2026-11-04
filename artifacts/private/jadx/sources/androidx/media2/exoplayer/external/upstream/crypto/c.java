package androidx.media2.exoplayer.external.upstream.crypto;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.util.q0;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cipher f57262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f57263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f57264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f57265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f57266e;

    public c(int mode, byte[] secretKey, long nonce, long offset) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.f57262a = cipher;
            int blockSize = cipher.getBlockSize();
            this.f57263b = blockSize;
            this.f57264c = new byte[blockSize];
            this.f57265d = new byte[blockSize];
            long j10 = offset / ((long) blockSize);
            int i10 = (int) (offset % ((long) blockSize));
            cipher.init(mode, new SecretKeySpec(secretKey, q0.P0(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(a(nonce, j10)));
            if (i10 != 0) {
                d(new byte[i10], 0, i10);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    private byte[] a(long nonce, long counter) {
        return ByteBuffer.allocate(16).putLong(nonce).putLong(counter).array();
    }

    private int b(byte[] in, int inOffset, int length, byte[] out, int outOffset) {
        try {
            return this.f57262a.update(in, inOffset, length, out, outOffset);
        } catch (ShortBufferException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void c(byte[] in, int inOffset, int length, byte[] out, int outOffset) {
        do {
            int i10 = this.f57266e;
            if (i10 <= 0) {
                int iB = b(in, inOffset, length, out, outOffset);
                if (length == iB) {
                    return;
                }
                int i11 = length - iB;
                int i12 = 0;
                androidx.media2.exoplayer.external.util.a.i(i11 < this.f57263b);
                int i13 = outOffset + iB;
                int i14 = this.f57263b - i11;
                this.f57266e = i14;
                androidx.media2.exoplayer.external.util.a.i(b(this.f57264c, 0, i14, this.f57265d, 0) == this.f57263b);
                while (i12 < i11) {
                    out[i13] = this.f57265d[i12];
                    i12++;
                    i13++;
                }
                return;
            }
            out[outOffset] = (byte) (in[inOffset] ^ this.f57265d[this.f57263b - i10]);
            outOffset++;
            inOffset++;
            this.f57266e = i10 - 1;
            length--;
        } while (length != 0);
    }

    public void d(byte[] data, int offset, int length) {
        c(data, offset, length, data, offset);
    }
}
