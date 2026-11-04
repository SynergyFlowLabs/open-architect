package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class o extends a implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336518c = -547733176983104172L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f336519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f336520b;

    public o(byte[] bArr) {
        this(bArr, 0L);
    }

    @Override // org.apache.commons.io.filefilter.a, org.apache.commons.io.filefilter.n, java.io.FileFilter
    public boolean accept(File file) throws Throwable {
        if (file != null && file.isFile() && file.canRead()) {
            RandomAccessFile randomAccessFile = null;
            try {
                byte[] bArr = new byte[this.f336519a.length];
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    randomAccessFile2.seek(this.f336520b);
                    int i10 = randomAccessFile2.read(bArr);
                    byte[] bArr2 = this.f336519a;
                    if (i10 != bArr2.length) {
                        org.apache.commons.io.p.j(randomAccessFile2);
                        return false;
                    }
                    boolean zEquals = Arrays.equals(bArr2, bArr);
                    org.apache.commons.io.p.j(randomAccessFile2);
                    return zEquals;
                } catch (IOException unused) {
                    randomAccessFile = randomAccessFile2;
                    org.apache.commons.io.p.j(randomAccessFile);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = randomAccessFile2;
                    org.apache.commons.io.p.j(randomAccessFile);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return false;
    }

    @Override // org.apache.commons.io.filefilter.a
    public String toString() {
        return super.toString() + "(" + new String(this.f336519a, Charset.defaultCharset()) + "," + this.f336520b + ")";
    }

    public o(String str) {
        this(str, 0L);
    }

    public o(String str, long j10) {
        if (str != null) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("The magic number must contain at least one byte");
            }
            if (j10 < 0) {
                throw new IllegalArgumentException("The offset cannot be negative");
            }
            this.f336519a = str.getBytes(Charset.defaultCharset());
            this.f336520b = j10;
            return;
        }
        throw new IllegalArgumentException("The magic number cannot be null");
    }

    public o(byte[] bArr, long j10) {
        if (bArr == null) {
            throw new IllegalArgumentException("The magic number cannot be null");
        }
        if (bArr.length == 0) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (j10 >= 0) {
            byte[] bArr2 = new byte[bArr.length];
            this.f336519a = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.f336520b = j10;
            return;
        }
        throw new IllegalArgumentException("The offset cannot be negative");
    }
}
