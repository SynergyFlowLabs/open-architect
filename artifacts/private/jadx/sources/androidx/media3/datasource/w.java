package androidx.media3.datasource;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public final class w {
    private w() {
    }

    public static void a(@androidx.annotation.p0 p pVar) {
        if (pVar != null) {
            try {
                pVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] b(p pVar, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = pVar.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new IllegalStateException("Not enough data could be read: " + i11 + " < " + i10);
            }
            i11 += i12;
        }
        return bArr;
    }

    public static byte[] c(p pVar) throws IOException {
        byte[] bArrCopyOf = new byte[1024];
        int i10 = 0;
        int i11 = 0;
        while (i10 != -1) {
            if (i11 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i10 = pVar.read(bArrCopyOf, i11, bArrCopyOf.length - i11);
            if (i10 != -1) {
                i11 += i10;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i11);
    }
}
