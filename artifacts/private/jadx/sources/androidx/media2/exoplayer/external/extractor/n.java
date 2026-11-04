package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.metadata.Metadata;
import androidx.media2.exoplayer.external.util.x;
import java.io.EOFException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x f54558a = new x(10);

    @p0
    public Metadata a(j input, @p0 androidx.media2.exoplayer.external.metadata.id3.b.a id3FramePredicate) throws Throwable {
        Metadata metadataC = null;
        int i10 = 0;
        while (true) {
            try {
                input.i(this.f54558a.f57720a, 0, 10);
                this.f54558a.Q(0);
                if (this.f54558a.G() != 4801587) {
                    break;
                }
                this.f54558a.R(3);
                int iC = this.f54558a.C();
                int i11 = iC + 10;
                if (metadataC == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f54558a.f57720a, 0, bArr, 0, 10);
                    input.i(bArr, 10, iC);
                    metadataC = new androidx.media2.exoplayer.external.metadata.id3.b(id3FramePredicate).c(bArr, i11);
                } else {
                    input.n(iC);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        input.l();
        input.n(i10);
        return metadataC;
    }
}
