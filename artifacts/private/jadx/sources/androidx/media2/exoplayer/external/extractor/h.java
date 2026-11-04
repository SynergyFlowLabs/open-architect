package androidx.media2.exoplayer.external.extractor;

import androidx.annotation.b1;
import androidx.annotation.p0;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.util.x;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public final class h implements s {
    @Override // androidx.media2.exoplayer.external.extractor.s
    public int a(j input, int length, boolean allowEndOfInput) throws InterruptedException, IOException {
        int iB = input.b(length);
        if (iB != -1) {
            return iB;
        }
        if (allowEndOfInput) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media2.exoplayer.external.extractor.s
    public void b(long timeUs, int flags, int size, int offset, @p0 s.a cryptoData) {
    }

    @Override // androidx.media2.exoplayer.external.extractor.s
    public void c(Format format) {
    }

    @Override // androidx.media2.exoplayer.external.extractor.s
    public void d(x data, int length) {
        data.R(length);
    }
}
