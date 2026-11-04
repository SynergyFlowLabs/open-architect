package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class m implements u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f67466d = new byte[4096];

    @Override // androidx.media3.extractor.u0
    public void a(androidx.media3.common.util.o0 o0Var, int i10, int i11) {
        o0Var.b0(i10);
    }

    @Override // androidx.media3.extractor.u0
    public int d(androidx.media3.common.l lVar, int i10, boolean z10, int i11) throws IOException {
        int i12 = lVar.read(this.f67466d, 0, Math.min(this.f67466d.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // androidx.media3.extractor.u0
    public void e(androidx.media3.common.w wVar) {
    }

    @Override // androidx.media3.extractor.u0
    public void g(long j10, int i10, int i11, int i12, @androidx.annotation.p0 u0.a aVar) {
    }
}
