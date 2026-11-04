package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.common.util.o0 f67377a = new androidx.media3.common.util.o0(10);

    @androidx.annotation.p0
    public androidx.media3.common.r0 a(s sVar, @androidx.annotation.p0 androidx.media3.extractor.metadata.id3.h.a aVar) throws Throwable {
        androidx.media3.common.r0 r0VarE = null;
        int i10 = 0;
        while (true) {
            try {
                sVar.i(this.f67377a.e(), 0, 10);
                this.f67377a.a0(0);
                if (this.f67377a.O() != 4801587) {
                    break;
                }
                this.f67377a.b0(3);
                int iK = this.f67377a.K();
                int i11 = iK + 10;
                if (r0VarE == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f67377a.e(), 0, bArr, 0, 10);
                    sVar.i(bArr, 10, iK);
                    r0VarE = new androidx.media3.extractor.metadata.id3.h(aVar).e(bArr, i11);
                } else {
                    sVar.n(iK);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        sVar.l();
        sVar.n(i10);
        return r0VarE;
    }
}
