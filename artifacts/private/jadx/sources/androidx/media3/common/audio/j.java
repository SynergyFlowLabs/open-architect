package androidx.media3.common.audio;

import android.util.SparseArray;
import androidx.media3.common.util.b1;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class j extends i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray<k> f60345i = new SparseArray<>();

    @Override // androidx.media3.common.audio.g
    public void b(ByteBuffer byteBuffer) {
        k kVar = (k) androidx.media3.common.util.a.k(this.f60345i.get(this.f60338b.f60334b));
        int iRemaining = byteBuffer.remaining() / this.f60338b.f60336d;
        ByteBuffer byteBufferL = l(this.f60339c.f60336d * iRemaining);
        int i10 = 7 | 1;
        e.f(byteBuffer, this.f60338b, byteBufferL, this.f60339c, kVar, iRemaining, false, true);
        byteBufferL.flip();
    }

    @Override // androidx.media3.common.audio.i
    protected g.a h(g.a aVar) throws g.b {
        if (aVar.f60335c != 2) {
            throw new g.b(aVar);
        }
        k kVar = this.f60345i.get(aVar.f60334b);
        if (kVar != null) {
            return kVar.m() ? g.a.f60332e : new g.a(aVar.f60333a, kVar.j(), 2);
        }
        throw new g.b("No mixing matrix for input channel count", aVar);
    }

    public void m(k kVar) {
        this.f60345i.put(kVar.h(), kVar);
    }
}
