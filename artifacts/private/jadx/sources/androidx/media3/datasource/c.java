package androidx.media3.datasource;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Cipher f62296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f62298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f62299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f62300e;

    public c(int i10, byte[] bArr, @androidx.annotation.p0 String str, long j10) {
        this(i10, bArr, a(str), j10);
    }

    private static long a(@androidx.annotation.p0 String str) {
        long j10 = 0;
        if (str == null) {
            return 0L;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            long jCharAt = j10 ^ ((long) str.charAt(i10));
            j10 = jCharAt + (jCharAt << 1) + (jCharAt << 4) + (jCharAt << 5) + (jCharAt << 7) + (jCharAt << 8) + (jCharAt << 40);
        }
        return j10;
    }

    private byte[] b(long j10, long j11) {
        return ByteBuffer.allocate(16).putLong(j10).putLong(j11).array();
    }

    private int c(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        try {
            return this.f62296a.update(bArr, i10, i11, bArr2, i12);
        } catch (ShortBufferException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void d(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        do {
            int i13 = this.f62300e;
            if (i13 <= 0) {
                int iC = c(bArr, i10, i11, bArr2, i12);
                if (i11 == iC) {
                    return;
                }
                int i14 = i11 - iC;
                int i15 = 0;
                androidx.media3.common.util.a.i(i14 < this.f62297b);
                int i16 = i12 + iC;
                int i17 = this.f62297b - i14;
                this.f62300e = i17;
                androidx.media3.common.util.a.i(c(this.f62298c, 0, i17, this.f62299d, 0) == this.f62297b);
                while (i15 < i14) {
                    bArr2[i16] = this.f62299d[i15];
                    i15++;
                    i16++;
                }
                return;
            }
            bArr2[i12] = (byte) (bArr[i10] ^ this.f62299d[this.f62297b - i13]);
            i12++;
            i10++;
            this.f62300e = i13 - 1;
            i11--;
        } while (i11 != 0);
    }

    public void e(byte[] bArr, int i10, int i11) {
        d(bArr, i10, i11, bArr, i10);
    }

    public c(int i10, byte[] bArr, long j10, long j11) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.f62296a = cipher;
            int blockSize = cipher.getBlockSize();
            this.f62297b = blockSize;
            this.f62298c = new byte[blockSize];
            this.f62299d = new byte[blockSize];
            long j12 = j11 / ((long) blockSize);
            int i11 = (int) (j11 % ((long) blockSize));
            cipher.init(i10, new SecretKeySpec(bArr, androidx.media3.common.util.k1.m2(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(b(j10, j12)));
            if (i11 != 0) {
                e(new byte[i11], 0, i11);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }
}
