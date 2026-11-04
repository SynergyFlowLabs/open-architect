package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class u {
    private u() {
    }

    @xl.d
    public static void a(boolean z10, @androidx.annotation.p0 String str) throws androidx.media3.common.v0 {
        if (!z10) {
            throw androidx.media3.common.v0.a(str, null);
        }
    }

    public static boolean b(s sVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return sVar.k(bArr, i10, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static int c(s sVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int iR = sVar.r(bArr, i10 + i12, i11 - i12);
            if (iR == -1) {
                break;
            }
            i12 += iR;
        }
        return i12;
    }

    public static boolean d(s sVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            sVar.readFully(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(s sVar, int i10) throws IOException {
        try {
            sVar.o(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
