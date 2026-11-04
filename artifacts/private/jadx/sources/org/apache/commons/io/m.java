package org.apache.commons.io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f336714a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f336715b = {org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338161k, org.locationtech.jts.geom.l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', org.locationtech.jts.geom.l.f338157g};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f336716c = {28, 24, 20, 16, 12, 8, 4, 0};

    private static StringBuilder a(StringBuilder sb2, byte b10) {
        for (int i10 = 0; i10 < 2; i10++) {
            sb2.append(f336715b[(b10 >> f336716c[i10 + 6]) & 15]);
        }
        return sb2;
    }

    private static StringBuilder b(StringBuilder sb2, long j10) {
        for (int i10 = 0; i10 < 8; i10++) {
            sb2.append(f336715b[((int) (j10 >> f336716c[i10])) & 15]);
        }
        return sb2;
    }

    public static void c(byte[] bArr, long j10, OutputStream outputStream, int i10) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (i10 < 0 || i10 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException("illegal index: " + i10 + " into array of length " + bArr.length);
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("cannot write to nullstream");
        }
        long j11 = j10 + ((long) i10);
        StringBuilder sb2 = new StringBuilder(74);
        while (i10 < bArr.length) {
            int length = bArr.length - i10;
            if (length > 16) {
                length = 16;
            }
            b(sb2, j11).append(' ');
            for (int i11 = 0; i11 < 16; i11++) {
                if (i11 < length) {
                    a(sb2, bArr[i11 + i10]);
                } else {
                    sb2.append("  ");
                }
                sb2.append(' ');
            }
            for (int i12 = 0; i12 < length; i12++) {
                byte b10 = bArr[i12 + i10];
                if (b10 < 32 || b10 >= 127) {
                    sb2.append('.');
                } else {
                    sb2.append((char) b10);
                }
            }
            sb2.append(f336714a);
            outputStream.write(sb2.toString().getBytes(Charset.defaultCharset()));
            outputStream.flush();
            sb2.setLength(0);
            j11 += (long) length;
            i10 += 16;
        }
    }
}
