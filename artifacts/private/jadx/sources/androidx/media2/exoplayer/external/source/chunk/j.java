package androidx.media2.exoplayer.external.source.chunk;

import androidx.annotation.b1;
import androidx.media2.exoplayer.external.Format;
import androidx.media2.exoplayer.external.util.q0;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY_GROUP})
public abstract class j extends d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f55833k = 16384;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private byte[] f55834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f55835j;

    public j(androidx.media2.exoplayer.external.upstream.l dataSource, androidx.media2.exoplayer.external.upstream.o dataSpec, int type, Format trackFormat, int trackSelectionReason, Object trackSelectionData, byte[] data) {
        super(dataSource, dataSpec, type, trackFormat, trackSelectionReason, trackSelectionData, -9223372036854775807L, -9223372036854775807L);
        this.f55834i = data;
    }

    private void i(int limit) {
        byte[] bArr = this.f55834i;
        if (bArr == null) {
            this.f55834i = new byte[16384];
        } else if (bArr.length < limit + 16384) {
            this.f55834i = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.e
    public final void a() throws InterruptedException, IOException {
        try {
            this.f55781h.b(this.f55774a);
            int i10 = 0;
            int i11 = 0;
            while (i10 != -1 && !this.f55835j) {
                i(i11);
                i10 = this.f55781h.read(this.f55834i, i11, 16384);
                if (i10 != -1) {
                    i11 += i10;
                }
            }
            if (!this.f55835j) {
                g(this.f55834i, i11);
            }
            q0.n(this.f55781h);
        } catch (Throwable th2) {
            q0.n(this.f55781h);
            throw th2;
        }
    }

    @Override // androidx.media2.exoplayer.external.upstream.g0.e
    public final void b() {
        this.f55835j = true;
    }

    protected abstract void g(byte[] data, int limit) throws IOException;

    public byte[] h() {
        return this.f55834i;
    }
}
